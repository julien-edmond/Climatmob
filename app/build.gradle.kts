plugins {
    id("com.android.application")
    //DEBUT DE LA PARTIE A AJOUTER
    id("androidx.navigation.safeargs") version "2.5.0" apply true
    //FIN DE LA PARTIE A AJOUTER
}

android {
    namespace = "ap.mobile.climamob"
    compileSdk = 34

    defaultConfig {
        applicationId = "ap.mobile.climamob"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

 //DEBUT DE LA PARTIE A AJOUTER
        val nav_version = "2.8.0"

        // Jetpack Compose integration
        implementation("androidx.navigation:navigation-compose:$nav_version")

        // Views/Fragments integration
        implementation("androidx.navigation:navigation-fragment:$nav_version")
        implementation("androidx.navigation:navigation-ui:$nav_version")

        // Feature module support for Fragments
        implementation("androidx.navigation:navigation-dynamic-features-fragment:$nav_version")

        // Testing Navigation
        androidTestImplementation("androidx.navigation:navigation-testing:$nav_version")
        //FIN DE LA PARTIE A AJOUTER

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")
}
