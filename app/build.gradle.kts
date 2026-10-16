plugins {
    application
    kotlin("jvm")
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2")
}

application {
    mainClass = "me.gimmesomepeace.app.AppKt"
}
repositories {
    mavenCentral()
}
kotlin {
    jvmToolchain(21)
}