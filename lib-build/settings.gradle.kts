rootProject.name = "lib-build"

include("common")
include("utils")

pluginManagement{
    includeBuild("../build-logic")
}