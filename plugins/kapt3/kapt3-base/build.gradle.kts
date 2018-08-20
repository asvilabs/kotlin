plugins {
    kotlin("jvm")
    id("jps-compatible")
}

dependencies {
    compile(projectDist(":kotlin-stdlib"))
    compile(files("${System.getProperty("java.home")}/../lib/tools.jar"))
    testCompile(commonDep("junit:junit"))
}

sourceSets {
    "main" { projectDefault(project) }
    "test" { projectDefault(project) }
}

testsJar {}

projectTest {
    workingDir = rootDir
    dependsOn(":dist")
}