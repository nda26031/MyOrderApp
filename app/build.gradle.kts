plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id ("kotlin-parcelize")
    id ("androidx.navigation.safeargs")
    id ("dagger.hilt.android.plugin")
    id ("com.google.gms.google-services")
    id("kotlin-kapt")
}

android {
    namespace = "com.example.myorderapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.myorderapp"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)


    //Navigation component
    implementation (libs.androidx.navigation.fragment.ktx)
    implementation (libs.androidx.navigation.ui.ktx)

    //loading button
    implementation (libs.loadingbuttonlibrary)
//
//    //Glide
    implementation (libs.glide)
//
//    //circular image
    implementation (libs.circleimageview)
//
    //viewpager2 indicatior
    implementation (libs.viewpagerindicator)

    //stepView
    implementation (libs.stepview)

    //Android Ktx
    implementation (libs.androidx.navigation.fragment.ktx.v242)

    //Dagger hilt
    implementation (libs.hilt.android)
    kapt (libs.hilt.compiler)

    //Firebase
    implementation (libs.firebase.auth)

    //Coroutines with firebase
    implementation (libs.kotlinx.coroutines.play.services)
}