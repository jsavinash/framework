plugins {
    id("java")
}


group = "com.spring_framework"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework:spring-context:6.1.10")
    implementation("org.springframework:spring-core:6.1.10")
    implementation("org.springframework:spring-aop:6.1.10")
    implementation("org.aspectj:aspectjtools:1.9.22.1")
    runtimeOnly("org.aspectj:aspectjrt:1.9.22.1")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}