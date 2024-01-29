package com.example.applicationdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import com.example.applicationdesign.ui.theme.ApplicationDesignTheme
import android.content.Intent
import android.widget.ImageView
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.ui.unit.dp




class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)
        val rectangleContainer = findViewById<RelativeLayout>(R.id.rectangleContainer)
        val imageAppleWatch1 = findViewById<ImageView>(R.id.imageAppleWatch1)

        imageAppleWatch1.setOnClickListener {
            val intentToSecondActivity = Intent(this, SecondActivity::class.java)
            startActivity(intentToSecondActivity)
            println("helllloooo")
        }
        rectangleContainer.setOnClickListener {
            val intentToSecondActivity = Intent(this, SecondActivity::class.java)
            startActivity(intentToSecondActivity)
            println("helllloooo")
        }
    }
}

