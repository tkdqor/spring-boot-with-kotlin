plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "spring-boot-with-kotlin"
include("http-app")
include("statistics-domain")
