import org.gradle.api.JavaVersion

object Config {
    val minSdk = 23
    val compileSdk = 29
    val targetSdk = 29
    val javaVersion = JavaVersion.VERSION_1_8
    val buildTools = "28.0.3"
}

object Versions {
    val androidx_core = "1.0.1"
    val androidx_recyclerview = "1.0.0"
    val androidx_navigation = "2.0.0"
    val androidx_constraintLayout = "1.1.3"
    val material = "1.1.0-alpha04"

    val junit = "4.12"
    val androidx_espresso = "3.1.0"
    val androidx_testing = "1.1.1"

    val gradleandroid = "3.5.0"
    val kotlin = "1.3.20"
    val gradleversions = "0.21.0"
}

object Deps {
    val androidx_core = "androidx.core:core-ktx:${Versions.androidx_core}"


}

