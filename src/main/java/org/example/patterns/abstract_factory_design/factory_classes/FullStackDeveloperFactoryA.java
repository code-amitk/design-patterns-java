package org.example.patterns.abstract_factory_design.factory_classes;

import org.example.patterns.abstract_factory_design.concrete_classes.JavaDeveloper;
import org.example.patterns.abstract_factory_design.concrete_classes.ReactDeveloper;
import org.example.patterns.abstract_factory_design.abstract_classes.AbstractDeveloperFactory;
import org.example.patterns.abstract_factory_design.abstract_classes.BackendDeveloper;
import org.example.patterns.abstract_factory_design.abstract_classes.FrontendDeveloper;

public class FullStackDeveloperFactoryA implements AbstractDeveloperFactory {
    @Override
    public FrontendDeveloper createFrontendDeveloper() {
        return new ReactDeveloper();
    }

    @Override
    public BackendDeveloper createBackendDeveloper() {
        return new JavaDeveloper();
    }
}
