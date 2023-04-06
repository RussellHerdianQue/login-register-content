package android.example.com.modul3_18411026

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        textLogin.setOnClickListener {
            val intent = Intent ( this, MainActivity::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent = Intent ( this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}