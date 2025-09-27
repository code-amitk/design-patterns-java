package org.example.patterns.abstract_factory_design.abstract_classes;

public interface AbstractDeveloperFactory {
    FrontendDeveloper createFrontendDeveloper();
    BackendDeveloper createBackendDeveloper();
}
