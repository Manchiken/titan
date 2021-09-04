plugins {
    kotlin("jvm") version "1.5.30"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
val kotestVersion = "4.6.2"
dependencies {
    implementation(kotlin("stdlib"))
    // https://mvnrepository.com/artifact/io.kotest/kotest-runner-junit5-jvm
    testImplementation("io.kotest:kotest-runner-junit5-jvm:$kotestVersion")
    // https://mvnrepository.com/artifact/io.kotest/kotest-assertions-core-jvm
    runtimeOnly("io.kotest:kotest-assertions-core-jvm:$kotestVersion")
    // https://mvnrepository.com/artifact/io.kotest/kotest-property-jvm
    implementation("io.kotest:kotest-property-jvm:$kotestVersion")
}

tasks.withType<Test> {
    useJUnitPlatform()
}