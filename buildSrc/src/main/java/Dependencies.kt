package dependencies

// Object that is used for dependency version
object Versions {

    //package
    const val applicationId = "com.enaz.chat.ui"

    const val jvmTarget = "1.8"

    //version
    const val versionCode = 1
    const val versionName = "1.0"

    // build
    const val minSdk = 23
    const val compileSdk = 29
    const val targetSdk = 29
    const val buildTools = "29.0.3"

    // kotlin
    const val kotlin_version = "1.3.72"

    // Android
    const val androidGradle = "4.0.0-beta05"
    const val navigation = "2.2.2"
    const val appcompat = "1.1.0"
    const val constraintLayout = "1.1.3"
    const val lifecycle = "2.2.0"
    const val coreKtx = "1.2.0"
    const val room = "2.2.3"
    const val legacySupportV4 = "1.0.0"
    const val recyclerview = "1.1.0"

    // google
    const val dagger = "2.25.3"

    //Test
    const val junit = "4.12"
    const val extjunit = "1.1.1"
    const val espressoCore = "3.2.0"
}

// Object that contains libraries needed by the app
object Libs {

    private object Android {
        const val androidGradle = "com.android.tools.build:gradle:${Versions.androidGradle}"
        const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin_version}"
        const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
        const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
        const val legacySupportV4 = "androidx.legacy:legacy-support-v4:${Versions.legacySupportV4}"
        const val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
        const val lifecycleViewmodelKtx = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
        const val recyclerview = "androidx.recyclerview:recyclerview:${Versions.recyclerview}"

        const val navigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
        const val navigationUIKtx = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"

        const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
        const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
        const val roomKtx = "androidx.room:room-ktx:${Versions.room}"
        const val roomRxJava = "androidx.room:room-rxjava2:${Versions.room}"
        const val roomGuava = "androidx.room:room-guava:${Versions.room}"
    }

    private object Kotlin {
        const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin_version}"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin_version}"
        const val navigationSafeArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}"
    }

    private object Dagger {
        const val core = "com.google.dagger:dagger:${Versions.dagger}"
        const val android = "com.google.dagger:dagger-android:${Versions.dagger}"
        const val androidSupport = "com.google.dagger:dagger-android-support:${Versions.dagger}"
        const val processor = "com.google.dagger:dagger-android-processor:${Versions.dagger}"
        const val compiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    }

    private object Test {
        const val junit = "junit:junit:${Versions.junit}"
        const val extjunit = "androidx.test.ext:junit:${Versions.extjunit}"
        const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
    }
}
