package com.packy.designpattern.mediator.components;

import com.packy.designpattern.mediator.mediator.Mediator;
import com.packy.designpattern.mediator.mediator.Note;

import javax.swing.*;

public class List extends JList<Note> implements Component {
    private Mediator mediator;
    private final DefaultListModel<Note> listModel;

    public List(DefaultListModel<Note> listModel) {
        super(listModel);
        this.listModel = listModel;
        setModel(listModel);
        this.setLayoutOrientation(JList.VERTICAL);
        Thread thread = new Thread(new Hide(this));
        thread.start();
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void addElement(Note note) {
        listModel.addElement(note);
        int index = listModel.size() - 1;
        setSelectedIndex(index);
        ensureIndexIsVisible(index);
        mediator.sendToFilter(listModel);
    }

    public void deleteElement() {
        int index = this.getSelectedIndex();
        try {
            listModel.remove(index);
            mediator.sendToFilter(listModel);
        } catch (ArrayIndexOutOfBoundsException ignored) {
        }
    }

    public Note getCurrentElement() {
        return (Note) getSelectedValue();
    }

    @Override
    public String getName() {
        return "List";
    }

    private class Hide implements Runnable {
        private final List list;

        Hide(List list) {
            this.list = list;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(300);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                if (list.isSelectionEmpty()) {
                    mediator.hideElements(true);
                } else {
                    mediator.hideElements(false);
                }
            }
        }
    }
}
