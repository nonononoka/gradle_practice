rootProject.name = "lib-build"

include("common")
include("utils")

pluginManagement{
    includeBuild("../build-logic")
}

dependencyResolutionManagement{
    versionCatalogs{
        create("libs"){
            from(files("../gradle/libs.versions.toml"))
        }
    }
}