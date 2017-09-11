# Android-CustomToast

[**Android-CustomToast**](https://github.com/shivam301296/Android-CustomToast) :zap: is a powerful & easy to use Custom Toast library for Android. It runs on [API level 14](http://developer.android.com/guide/topics/manifest/uses-sdk-element.html#ApiLevels) and upwards. 
This library provides some predefined custom toast. Also you can coustomize the toast according to your need 

:zap:**A Single line of code can add a beautiful toast message in your app.** :zap:


| Code | Output |
| ------------- | ------------- |
| `CT.success(this, "Success");` | <img src="images/success.png" width="100%"></img>  |
| `CT.success2(this, "Success");` | <img src="images/success2.png" width="100%"></img>  |
| `CT.failed(this, "Failed");` | <img src="images/failed.png" width="100%"></img>  |
| `CT.failed2(this, "Failed");` | <img src="images/failed2.png" width="100%"></img>  |
| `CT.loading(this, "Loading...");` | <img src="images/loading.png" width="100%"></img>  |
| `CT.loading2(this, "Loading...");` | <img src="images/loading2.png" width="100%"></img>  |
| `CT.mute(this, "Silent mode");` | <img src="images/mute.png" width="100%"></img>  |
| `CT.mute2(this, "Silent mode");` | <img src="images/mute2.png" width="100%"></img>  |
| `CT.normal(this, "Normal Toast");`| <img src="images/normal.png" width="100%"></img>  |
| `CT.normal2(this, "Normal Toast");`| <img src="images/normal2.png" width="100%"></img>  |
| Custom Toast| <img src="images/custom.png" width="100%"></img>  
| Custom Toast2 | <img src="images/custom2.png" width="100%"></img>  |

Usage
-----

**1. Gradle dependency** (recommended)

  -  Add the following to your project level `build.gradle`:
 
```gradle
allprojects {
	repositories {
		maven { url "https://jitpack.io" }
	}
}
```
  -  Add this to your app `build.gradle`:
 
```gradle
dependencies {
	compile 'com.github.shivam301296:Android-CustomToast:1.0.1'
}
```

**2. Maven**
- Add the following to the `<repositories>` section of your `pom.xml`:

 ```xml
<repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
</repository>
```
- Add the following to the `<dependencies>` section of your `pom.xml`:

 ```xml
<dependency>
        <groupId>com.github.shivam301296</groupId>
	      <artifactId>Android-CustomToast</artifactId>
	      <version>1.0.0</version>
</dependency>
```
