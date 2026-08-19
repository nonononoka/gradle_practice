rootProject.name = "composite"

include("app")
include("core")

pluginManagement{
    includeBuild("../build-logic")
}