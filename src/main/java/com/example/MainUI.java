package com.example;


import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

@SpringUI
public class MainUI extends UI {

    private static final long serialVersionUID = 1L;
    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setContent(new Label("Hello World from Vaadin!"));
    }
}