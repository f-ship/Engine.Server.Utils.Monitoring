plugins {
    alias(libs.plugins.kotlinJvm)
    alias(libs.plugins.ktor)
    application
}

group = "ship.f.engine.server.utils"
version = "1.0.0"

application {
    mainClass.set("ship.f.engine.server.utils.monitoring.MonitoringKt")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=${extra["io.ktor.development"] ?: "false"}")
}

dependencies {
//    api(":Analytics")
//    api(":Crash")
//    api(":Error")
//    api(":Performance")

    implementation(libs.logback)
    implementation(libs.ktor.server.core)
    implementation(libs.ktor.server.netty)
    testImplementation(libs.ktor.server.tests.host)
    testImplementation(libs.kotlin.test.junit)
}
