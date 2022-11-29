object Versions {
    const val AGP = "7.3.1"
    const val kotlin = "1.7.20"
    const val roomVersion = "2.4.3"
    const val navigation = "2.5.3"
    const val androidCore = "1.7.0"
    const val appCompat = "1.5.1"
    const val material = "1.6.1"
    const val lifecycle = "2.5.1"
    const val coroutines = "1.6.4"
    const val hilt = "2.44.2"
    const val viewBindingDelegate = "1.5.6"
    const val constraint = "2.1.4"
    const val jUnit = "4.13.2"
    const val jUnitTest = "1.1.3"
    const val espresso = "3.4.0"
    const val fragment = "1.5.4"
    const val gson = "2.10"
}


object Dependencies {

    object Navigation {
        const val navigation = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
        const val navigationUI = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    }

    object Room {
        const val runtime = "androidx.room:room-runtime:${Versions.roomVersion}"
        const val room = "androidx.room:room-ktx:${Versions.roomVersion}"
        const val compiler = "androidx.room:room-compiler:${Versions.roomVersion}"
    }

    object UIComponents {
        const val androidCore = "androidx.core:core-ktx:${Versions.androidCore}"
        const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
        const val material = "com.google.android.material:material:${Versions.material}"
        const val constraint = "androidx.constraintlayout:constraintlayout:${Versions.constraint}"
        const val jUnit = "junit:junit:${Versions.jUnit}"
        const val jUnitTest = "androidx.test.ext:junit:${Versions.jUnitTest}"
        const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
        const val fragment = "androidx.fragment:fragment-ktx:${Versions.fragment}"
        const val gson = "com.google.code.gson:gson:${Versions.gson}"
    }

    object Livecycle {
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
        const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    }

    object Coroutines {
        const val coroutine =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    }

    object Hilt {
        const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
        const val hiltKart = "com.google.dagger:hilt-compiler:${Versions.hilt}"
    }

    object ViewBindingDelegate {
        const val bindingDelegate =
            ("com.github.kirich1409:viewbindingpropertydelegate-noreflection:${Versions.viewBindingDelegate}")
    }

    object Inject {
        const val inject = ("javax.inject:javax.inject:1")
    }

}

object Plugins {
    object AGP {
        const val application = "com.android.application"
        const val library = "com.android.library"
    }

    object Kotlin {
        const val kapt = "kotlin-kapt"
        const val kotlin = "org.jetbrains.kotlin.android"
    }

    object DaggerHilt {
        const val hilt = "com.google.dagger.hilt.android"
    }

}