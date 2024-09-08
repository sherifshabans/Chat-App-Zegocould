pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://storage.zego.im/maven")  // <- Correct syntax for Kotlin
        }
        maven {
            url = uri("https://www.jitpack.io")  // <- Correct syntax for Kotlin
        }

    }
}

rootProject.name = "ChatApp"
include(":app")
 