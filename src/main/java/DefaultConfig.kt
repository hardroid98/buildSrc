data class DefaultConfig(
    val applicationId: String = "dev.nakamas.mobdev",
    val minSdkVersion: Int = 21,
    val targetSdkVersion: Int = 29,
    val compileSdk: Int = 29,
    val buildTools: String = "29.0.0",
    val testInstrumentation: String = "androidx.test.runner.AndroidJUnitRunner"
)