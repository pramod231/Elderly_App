package com.example.elderly.basicappactivity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator
import android.widget.Button
import android.widget.TextView
import com.example.elderly.R

class SignUpStepTwoActivity : AppCompatActivity()  {

    private lateinit var btnSignUpDone : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_step_two)

        btnSignUpDone = findViewById(R.id.btnDoneSignUp)

        btnSignUpDone.setOnClickListener {
            btnVibrate()
            val intent = Intent(this,FragmentHomeActivity::class.java)
            startActivity(intent)
        }
    }

    //Vibrate when btn Clicked
    private fun btnVibrate() {
        val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        vibratorService.vibrate(100)
    }
}