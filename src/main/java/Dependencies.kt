object Dependencies {
    val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Version.kotlin}"
    val androidX = "androidx.appcompat:appcompat:${Version.androidX.appcompact}"
    val androidXCore = "androidx.core:core-ktx:${Version.androidX.core}"
    val contraintLayout =
        "androidx.constraintlayout:constraintlayout:${Version.androidX.contraintLayout}"
    val viewModel = "androidx.lifecycle:lifecycle-viewmodel:${Version.androidX.viewModel}"
    val lifeCycle = "androidx.lifecycle:lifecycle-extensions:${Version.androidX.lifeCycle}"
    val lifeCycleJava8 = "androidx.lifecycle:lifecycle-common-java8:${Version.androidX.lifeCycle}"
    val lifeCycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Version.androidX.lifeCycle}"
    val multidex = "androidx.multidex:multidex:${Version.multidex}"
    val sharedPreferences = "androidx.preference:preference-ktx:${Version.androidX.appcompact}"

    val retrofit = "com.squareup.retrofit2:retrofit:${Version.retrofit}"
    val retrofitGson = "com.squareup.retrofit2:converter-gson:${Version.retrofit}"
    val retrofitRxJava = "com.squareup.retrofit2:adapter-rxjava2:${Version.retrofit}"
    val retrofitAdapter = "com.jakewharton.retrofit:retrofit2-rxjava2-adapter:${Version.rx.adapter}"

    val okHttpInterceptor = "com.squareup.okhttp3:logging-interceptor:${Version.okHttp}"
    val okHttp = "com.squareup.okhttp3:okhttp:${Version.okHttp}"
    val gson = "com.google.code.gson:gson:${Version.gson}"

    //RX Java
    val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Version.rx.android}"
    val rxJava = "io.reactivex.rxjava2:rxjava:${Version.rx.java}"
    val rxKotlin = "io.reactivex.rxjava2:rxkotlin:${Version.rx.kotlin}"

    //Dagger
    val dagger = "com.google.dagger:dagger:${Version.dagger}"
    val daggerCompiler = "com.google.dagger:dagger-compiler:${Version.dagger}"
    val javaXAnnotation = "org.glassfish:javax.annotation:${Version.javaX}"
    val materialDialog = "com.afollestad.material-dialogs:core:${Version.materialDialog}"

    val jUnit = "junit:junit:${Version.jUnit}"
    val jUnitAndroidX = "androidx.test.ext:junit:${Version.androidX.jUnit}"
    val espresso = "androidx.test.espresso:espresso-core:${Version.androidX.espresso}"
}
