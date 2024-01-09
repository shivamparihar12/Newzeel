plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.example.shortnews"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.shortnews"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(Dependencies.coreKtx)
    implementation(Dependencies.lifecycleRuntimeKtx)
    implementation(Dependencies.activityCompose)
    implementation(platform(Dependencies.composeBom))
    implementation(Dependencies.composeUi)
    implementation(Dependencies.composeUiGraphics)
    implementation(Dependencies.composeUiToolingPreview)
    implementation(Dependencies.material3)
    implementation(Dependencies.lifeCycleViewModelKtx)
    // including utility module
    implementation(project(Modules.utilities))

    testImplementation(Dependencies.junit)
    androidTestImplementation(Dependencies.junitExt)
    androidTestImplementation(Dependencies.espressoCore)
    androidTestImplementation(platform(Dependencies.composeBom))
    androidTestImplementation(Dependencies.composeUiTestJUnit4)

    debugImplementation(Dependencies.composeUiTooling)
    debugImplementation(Dependencies.composeUiTestManifest)

    //hilt
    implementation(Dependencies.hiltAndroid)
    kapt(Dependencies.hiltCompiler)
    kapt(Dependencies.hiltAndroidCompiler)

    implementation(Dependencies.hiltNavigationCompose)

    //retrofit
    implementation(Dependencies.retrofit)
    implementation(Dependencies.okHttp)
    implementation(Dependencies.gsonConverter)
    implementation(Dependencies.moshi)
    implementation(Dependencies.moshiConverter)
    implementation(Dependencies.loggingInterceptors)

    //coroutine
    implementation(Dependencies.coroutineCore)
    implementation(Dependencies.coroutineAndroid)


}

kapt {
    correctErrorTypes = true
}