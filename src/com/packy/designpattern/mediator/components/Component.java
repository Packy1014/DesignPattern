package com.packy.designpattern.mediator.components;

import com.packy.designpattern.mediator.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);

    String getName();
}
