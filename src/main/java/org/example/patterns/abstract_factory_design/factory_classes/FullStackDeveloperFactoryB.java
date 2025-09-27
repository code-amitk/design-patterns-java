package org.example.patterns.abstract_factory_design.factory_classes;

import org.example.patterns.abstract_factory_design.concrete_classes.AngularDeveloper;
import org.example.patterns.abstract_factory_design.concrete_classes.PythonDeveloper;
import org.example.patterns.abstract_factory_design.abstract_classes.AbstractDeveloperFactory;
import org.example.patterns.abstract_factory_design.abstract_classes.BackendDeveloper;
import org.example.patterns.abstract_factory_design.abstract_classes.FrontendDeveloper;

public class FullStackDeveloperFactoryB implements AbstractDeveloperFactory {
    @Override
    public FrontendDeveloper createFrontendDeveloper() {
        return new AngularDeveloper();
    }

    @Override
    public BackendDeveloper createBackendDeveloper() {
        return new PythonDeveloper();
    }
}
