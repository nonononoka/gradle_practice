rootProject.name = "composite"

include("app")
include("core")
include("core2")

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