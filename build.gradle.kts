buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.21")
        classpath("com.android.tools.build:gradle:4.0.2")
        classpath("com.squareup.sqldelight:gradle-plugin:1.4.4")
    }
}

allprojects {
    repositories {
        mavenLocal()
        google()
        jcenter()
        mavenCentral()
        maven {
            name = "GitHub"
            url = java.net.URI("https://maven.pkg.github.com/pocmo/android-components")
            credentials {
                //Fetch these details from the properties file or from Environment variables
                username = "pocmo"
                password = "a31bda5ca2648e50ce72144887e3613b25547f3b"
            }
        }
    }
}