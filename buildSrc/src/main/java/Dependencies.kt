object Dependencies {
    val coreKtx by lazy { "androidx.core:core-ktx:${Versions.coreKtxVersion}" }
    val lifecycleRuntimeKtx by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntimeKtxVersion}" }
    val activityCompose by lazy { "androidx.activity:activity-compose:${Versions.activityComposeVersion}" }
    val composeBom by lazy { "androidx.compose:compose-bom:${Versions.composeBomVersion}" }
    val composeUi by lazy { "androidx.compose.ui:ui" }
    val composeUiGraphics by lazy { "androidx.compose.ui:ui-graphics" }
    val composeUiToolingPreview by lazy { "androidx.compose.ui:ui-tooling-preview" }
    val material3 by lazy { "androidx.compose.material3:material3:${Versions.material3}" }
    val junit by lazy { "junit:junit:${Versions.junitVersion}" }
    val junitExt by lazy { "androidx.test.ext:junit:${Versions.junitExtVersion}" }
    val espressoCore by lazy { "androidx.test.espresso:espresso-core:${Versions.espressoCoreVersion}" }
    val composeUiTestJUnit4 by lazy { "androidx.compose.ui:ui-test-junit4" }
    val composeUiTooling by lazy { "androidx.compose.ui:ui-tooling" }
    val composeUiTestManifest by lazy { "androidx.compose.ui:ui-test-manifest" }
    val appCompact by lazy { "androidx.appcompat:appcompat:${Versions.appCompactVersion}" }
    val lifeCycleViewModelKtx by lazy { "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleVersion}" }

    val hiltAndroid by lazy { "com.google.dagger:hilt-android:${Versions.hilt}" }
    val hiltAndroidCompiler by lazy { "com.google.dagger:hilt-android-compiler:${Versions.hiltAndroidCompilerVersion}" }
    val hiltCompiler by lazy { "androidx.hilt:hilt-compiler:${Versions.hiltCompilerVersion}" }

    val hiltNavigationCompose by lazy { "androidx.hilt:hilt-navigation-compose:${Versions.hiltNavigationComposeVersion}" }

    val retrofit by lazy { "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}" }
    val okHttp by lazy { "com.squareup.okhttp3:okhttp:${Versions.okHttpVersion}" }
    val gsonConverter by lazy { "com.squareup.retrofit2:converter-gson:${Versions.gsonConverterVersion}" }
    val moshi by lazy { "com.squareup.moshi:moshi-kotlin:${Versions.moshiVersion}" }
    val moshiConverter by lazy { "com.squareup.retrofit2:converter-moshi:${Versions.moshiConverterVersion}" }
    val loggingInterceptors by lazy { "com.squareup.okhttp3:logging-interceptor:${Versions.loggingIntercepterVersion}" }

    val coroutineAndroid by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutineAndroidVersion}" }
    val coroutineCore by lazy {"org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutineCoreVersion}"}
}

object Modules {
    const val utilities = ":utilities"
}