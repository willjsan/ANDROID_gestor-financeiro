<h1 align="center">
<br>
TrackBill's App 
<br>
<br>

<p align="center">Projeto da criação de uma app de gestão financeira como parte do projeto de mentoria no desenvolvimento de aplicações Android no CESAR</p>

<div align="center">
<br>
<h5><b>Demo</b></h5>
  <img src="rdm/demo.gif" alt="demo" height="425">
</div>

##   Features  
#### <font color=#9C9C9A> UI</font> 
- :iphone: Home 
- :iphone: Tela de login
- :iphone: Tela de cadastro
- :iphone: Sobre

####  <font color=#9C9C9A>  API's e libs usadas no projeto:</font>

- :accept: **Android Jetpack**

- :accept: **Fragment**

  
## Getting started

#### <font color=#9C9C9A> Setup:</font>  

* **Android Studio (bumblebee)**

* **Android API 28 (Android 9)**

* **Gradle 7.2**

  

#### <font color=#9C9C9A> Dependências:</font> 

* (gradle.app)

~~~ dependencies {
dependencies {
    implementation 'androidx.legacy:legacy-support-v4:1.0.0'
    def room_version = "2.4.2"
    def fragment_version = "1.4.1"
    def lifecycle_version = "2.4.1"
    def arch_version = "2.1.0"

    // Room components
    implementation "androidx.room:room-runtime:$room_version"
    implementation "androidx.room:room-rxjava2:$room_version"
    annotationProcessor "androidx.room:room-compiler:$room_version"
    androidTestImplementation "androidx.room:room-testing:$room_version"

    // Lifecycle components
    implementation "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
    implementation "androidx.lifecycle:lifecycle-common-java8:$lifecycle_version"
    implementation "androidx.lifecycle:lifecycle-process:$lifecycle_version"
    implementation "androidx.lifecycle:lifecycle-service:$lifecycle_version"
    implementation "androidx.lifecycle:lifecycle-viewmodel-savedstate:$lifecycle_version"
    implementation "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycle_version"

    //UI
    implementation "androidx.fragment:fragment:$fragment_version"
    implementation 'com.google.android.material:material:1.5.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.3'

    //Testing
    testImplementation 'junit:junit:'
    androidTestImplementation 'androidx.test.ext:junit:1.1.3'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'
    androidTestImplementation "androidx.arch.core:core-testing:$arch_version"
    implementation 'androidx.appcompat:appcompat:1.4.1'
} 
~~~