package test.gradle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.gradle.BuildConfig
import com.gradle.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // BuildConfig里面保存了build.gradle里面生成的信息
        val url = BuildConfig.API_URL
        val name = resources.getString(R.string.name)
    }
}
