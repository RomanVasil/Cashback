plugins {
    java
}

group = "ru.netology"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    testImplementation 'org.testng:testng:7.6.0'

}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}