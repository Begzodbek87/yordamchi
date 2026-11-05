pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "JarvisAITalker"

// Pure-Kotlin domain layer (agent loop, protocol, voice text, parsers). Also builds standalone.
includeBuild("core")
include(":app")
