/*
 * This file contains build instructions for this Kotlin project.
 */

plugins {
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin
    id("org.jetbrains.kotlin.jvm") version "1.9.0"

    // Apply the application plugin to add support for building a CLI application in Java
    application
}

repositories {
    // Use Maven Central for resolving dependencies
    mavenCentral()
}

dependencies {
    // Use the Kotlin JUnit 5 integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")

    // Use the JUnit 5 integration.
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.9.3")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

application {
    // Define the main class for the application
    mainClass.set("com.mbti.codingtask.MainKt")
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests
    useJUnitPlatform()
}
