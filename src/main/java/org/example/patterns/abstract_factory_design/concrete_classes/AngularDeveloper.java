package org.example.patterns.abstract_factory_design.concrete_classes;

import org.example.patterns.abstract_factory_design.abstract_classes.FrontendDeveloper;

public class AngularDeveloper implements FrontendDeveloper {
    @Override
    public void frontendDeveloper() {
        System.out.println("ANGULAR-DEVELOPER");
    }
}
