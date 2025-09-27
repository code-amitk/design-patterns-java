package org.example.patterns.abstract_factory_design.concrete_classes;

import org.example.patterns.abstract_factory_design.abstract_classes.BackendDeveloper;

public class PythonDeveloper implements BackendDeveloper {
    @Override
    public void backendDeveloper() {
        System.out.println("PYTHON-DEVELOPER");
    }
}
