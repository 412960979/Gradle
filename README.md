# Gradle学习笔记  
https://www.jianshu.com/p/846c376a52d4
### 自定义资源  
resValue("string","app_token","123")  
resValue("bool","rel","true")  
resValue("integer","num","4")  
//java代码中使用  
Log.d("xl",getResources().getString(R.string.app_token));  
Log.d("xl",getResources().getBoolean(R.bool.rel)+"");  
Log.d("xl",getResources().getInteger(R.integer.num)+"");  
//xml文件中使用
android:text="@string/app_token"  
resValue可以在哪里定义  
```  
defaultConfig {  
    resValue("string", "test1Value", "1")  
}
```  
```  
buildTypes {  
    debug {  
        resValue("bool", "test2Value", "true")  
    }
}  
```  
```  
productFlavors{  
    Flavortest{  
        resValue("integer", "test3Value", "3")
    }
}
```  
### sourceSets  
通过修改SourceSets中的属性，可以指定哪些源文件（或文件夹下的源文件）要被编译，哪些源文件要被排除。Gradle就是通过它实现Java项目的布局定义  
```  
android {
    sourceSets {
        main {
            manifest.srcFile 'AndroidManifest.xml'
            java.srcDirs = ['src']
            resources.srcDirs = ['src']
            aidl.srcDirs = ['src']
            renderscript.srcDirs = ['src']
            res.srcDirs = ['res']
            assets.srcDirs = ['assets']
            jniLibs.srcDirs = ['libs']
        }
}
```  
[具体使用可以参考这里](https://blog.csdn.net/lbcab/article/details/72771729)

### CustomPlugin
https://www.jianshu.com/p/66b8eafc2d04

