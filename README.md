# Gradle学习笔记  
##自定义资源  
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
defaultConfig {  
    resValue("string", "test1Value", "1")  
}
buildTypes {  
    debug {  
        resValue("bool", "test2Value", "true")  
    }
}  
productFlavors{  
    Flavortest{  
        resValue("integer", "test3Value", "3")
    }
}
