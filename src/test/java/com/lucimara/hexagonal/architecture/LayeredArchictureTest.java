package com.lucimara.hexagonal.architecture;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

@AnalyzeClasses(packages = "com.lucimara.hexagonal")
public class LayeredArchictureTest {

    @ArchTest
    public static final ArchRule layered_aarchitecture_test = layeredArchitecture()
            .consideringAllDependencies()
            .layer("AdaptersIn").definedBy("com.lucimara.hexagonal.adapters.in..")
            .layer("AdaptersOut").definedBy("com.lucimara.hexagonal.adapters.out..")
            .layer("UseCase").definedBy("com.lucimara.hexagonal.application.core.usecase..")
            .layer("PortsIn").definedBy("com.lucimara.hexagonal.application.ports.in..")
            .layer("PostsOut").definedBy("com.lucimara.hexagonal.application.ports.out..")
            .layer("Config").definedBy("com.lucimara.hexagonal.config..")
            .whereLayer("AdaptersIn").mayOnlyBeAccessedByLayers("Config")
            .whereLayer("AdaptersOut").mayOnlyBeAccessedByLayers("Config")
            .whereLayer("UseCase").mayOnlyBeAccessedByLayers("Config")
            .whereLayer("PortsIn").mayOnlyBeAccessedByLayers("UseCase", "AdaptersIn")
            .whereLayer("PostsOut").mayOnlyBeAccessedByLayers("UseCase", "AdaptersOut")
            .whereLayer("Config").mayNotBeAccessedByAnyLayer();
}
