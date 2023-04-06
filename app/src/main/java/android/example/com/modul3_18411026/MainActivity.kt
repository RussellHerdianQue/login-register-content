package android.example.com.modul3_18411026

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textRegister.setOnClickListener {
            val intent = Intent ( this, RegisterActivity::class.java)
            startActivity(intent)
        }

         buttonLogin.setOnClickListener {
             val intent = Intent ( this , ContentActivity::class.java)
             startActivity(intent)
         }


    }
}