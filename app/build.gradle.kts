plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.test01"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.test01"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation("com.google.android.gms:play-services-maps:18.1.0")
    implementation("com.google.android.gms:play-services-location:21.0.1")
    implementation("com.google.android.material:material:1.11.0") // ✅ Tambahkan ini

}
