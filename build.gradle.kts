plugins {
    application
    kotlin("jvm") version "1.9.0"
    id("org.graalvm.buildtools.native") version "0.9.24"
}

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass = "MainKt"
}
