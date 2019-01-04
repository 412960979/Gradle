package test.gradle;

import android.app.Application;
import android.content.Context;

public class MyApplication extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);

        /*
         * 解决单个dex64K方法数限制
         * 构建应用后，Android构建工具会根据需要构建主DEX文件（classes.dex）和辅助DEX文件（
         * classes2.dex, classes3.dex等）。然后构建系统会将所有DEX文件打包到APK中
         */
        android.support.multidex.MultiDex.install(this);
    }
}
