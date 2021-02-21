import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val mockkVersion = "1.10.6"
val junitVersion = "5.7.1"

plugins {
    kotlin("jvm") version "1.4.30"
}
group = "com.example"
version = "0.0.1-SNAPSHOT"

java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
}
dependencies {
    testImplementation(kotlin("test-junit5"))
    testImplementation("io.mockk:mockk:$mockkVersion")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
