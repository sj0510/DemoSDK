# ToastSDK
It is a Android SDK Library to show Toast message.

To get a Git project into your build, Please follow below steps to import this library:

> Step 1. Add it in your root **build.gradle** at the end of repositories:

```gradle
    allprojects {
    		repositories {
    			...
    			maven { url 'https://jitpack.io' }
    		}
    	}
```

> Step 2. Add the dependency
  ```gradle
    dependencies {
    	        implementation 'com.github.sj0510:DemoSDK:Tag'
    	}
   ```
> Step 3. Add this function in MainActivity or Fragment to call SDK Function

```MainActivity
        import com.sj.mylibrarysdk.MySdk
        fun launchSDK(view: View) {
        MySdk.showToast(this,"Welcome! This is SDK World")
        }
 ```
