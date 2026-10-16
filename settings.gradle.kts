pluginManagement {
    plugins {
        kotlin("jvm") version "2.4.21"
    }
}
dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        mavenCentral()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

include(":app")

rootProject.name = "laboratory"