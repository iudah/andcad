rootProject.name = "MobileEdaSuite"

pluginManagement {
    repositories {
        maven {
            url = uri("/storage/emulated/0/Jay/libs")
            isAllowInsecureProtocol = true
            // Prefer local files over any network repo.
            metadataSources {
                mavenPom()
                artifact()
            }
        }
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        maven {
            url = uri("/storage/emulated/0/Jay/libs")
            isAllowInsecureProtocol = true
            metadataSources {
                mavenPom()
                artifact()
            }
        }
        google()
        mavenCentral()
    }
}

include(":composeApp")
