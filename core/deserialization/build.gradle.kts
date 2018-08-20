plugins {
    kotlin("jvm")
    id("jps-compatible")
}

jvmTarget = "1.6"
javaHome = rootProject.extra["JDK_16"] as String

dependencies {
    compile(project(":core:metadata"))
    compile(project(":core:util.runtime"))
    compile(project(":core:descriptors"))
    compile(commonDep("javax.inject"))
}

sourceSets {
    "main" { projectDefault(project) }
    "test" {}
}

tasks.withType<JavaCompile> {
    sourceCompatibility = "1.6"
    targetCompatibility = "1.6"
}
