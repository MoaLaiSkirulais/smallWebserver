plugins {
    id("com.android.application")
}

android {
    namespace = "com.martinporto.smallwebserver"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.martinporto.smallwebserver"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation ("com.jakewharton.timber:timber:4.7.1")
    implementation ("org.nanohttpd:nanohttpd:2.3.1")
    implementation ("com.google.zxing:core:3.4.1")
    implementation("io.github.muddz:styleabletoast:2.4.0")
    //implementation("net.lingala.zip4j:2.11.5");
    //implementation ("com.android.support:support-v4:28.0.0")
    //implementation("com.android.support:appcompat-v7:28.0.0")
    //implementation("com.github.wwdablu:wZip:1.2.0");

}