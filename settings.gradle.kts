pluginManagement {
    repositories {
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
        maven("https://repo.papermc.io/repository/maven-public/")
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.9.0"
}

rootProject.name = "ASPaper"

include(":gradle:platform")
include(":api")
//include(":core")
//include(":importer")
//include(":loaders")
//include(":plugin")
include(":impl")
include(":impl:aspaper-api")
include(":impl:aspaper-server")
//include(":aspaper-api")
//include(":aspaper-server")
