package com.arvi.dearbuddy.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.arvi.dearbuddy.R
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        button_register_register.setOnClickListener {
            val username = edit_text_username_register.text.toString()
            val email = edit_text_email_register.text.toString()
            val password = edit_text_password_register.text.toString()

            Log.d("RegisterActivity", "Username is: $username")
            Log.d("RegisterActivity", "Email is: $email")
            Log.d("RegisterActivity", "Password is: $password")

            //firebase authentication to create a user with username, email and password.
        }

        //Launch the login activity
        text_view_have_account.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
