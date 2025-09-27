package org.example.patterns.abstract_factory_design.concrete_classes;

import org.example.patterns.abstract_factory_design.abstract_classes.BackendDeveloper;

public class JavaDeveloper implements BackendDeveloper {
    @Override
    public void backendDeveloper() {
        System.out.println("JAVA-DEVELOPER");
    }
}
