plugins {
	java
}

group = "com.eyz"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.liquibase:liquibase-core:4.29.1")
	implementation("mysql:mysql-connector-java:8.0.33")
	implementation("org.projectlombok:lombok:1.18.34")

	annotationProcessor("org.projectlombok:lombok:1.18.34")

	runtimeOnly("com.h2database:h2")
	runtimeOnly("com.mysql:mysql-connector-j:8.2.0")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
