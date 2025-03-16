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

	compileOnly("org.projectlombok:lombok:1.18.34")

	runtimeOnly("com.h2database:h2")
	runtimeOnly("com.mysql:mysql-connector-j:8.2.0")

	annotationProcessor("org.projectlombok:lombok")

	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
