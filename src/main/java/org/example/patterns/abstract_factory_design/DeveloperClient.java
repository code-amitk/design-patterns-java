package org.example.patterns.abstract_factory_design;

import org.example.patterns.abstract_factory_design.factory_classes.FullStackDeveloperFactoryA;
import org.example.patterns.abstract_factory_design.factory_classes.FullStackDeveloperFactoryB;
import org.example.patterns.abstract_factory_design.abstract_classes.AbstractDeveloperFactory;
import org.example.patterns.abstract_factory_design.abstract_classes.BackendDeveloper;
import org.example.patterns.abstract_factory_design.abstract_classes.FrontendDeveloper;

public class DeveloperClient {
    public static void main(String[] args) {

        AbstractDeveloperFactory adf = new FullStackDeveloperFactoryA();
        FrontendDeveloper frontendDeveloperA = adf.createFrontendDeveloper();
        BackendDeveloper backendDeveloperA = adf.createBackendDeveloper();
        frontendDeveloperA.frontendDeveloper();
        backendDeveloperA.backendDeveloper();

        AbstractDeveloperFactory adf1 = new FullStackDeveloperFactoryB();
        FrontendDeveloper frontendDeveloperB = adf1.createFrontendDeveloper();
        BackendDeveloper backendDeveloperB = adf1.createBackendDeveloper();
        frontendDeveloperB.frontendDeveloper();
        backendDeveloperB.backendDeveloper();

    }
}
