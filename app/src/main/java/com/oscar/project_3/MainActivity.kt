package com.oscar.project_3

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.oscar.project_3.ui.theme.Project_3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);


        val button1 = findViewById<Button>(R.id.button3);
        val button2 = findViewById<Button>(R.id.button4);
        val button3 = findViewById<Button>(R.id.button5);

        val imageview = findViewById<ImageView>(R.id.imageView);


        button1.setOnClickListener{
            imageview.setImageResource(R.drawable.dog1);

        }
        button2.setOnClickListener{

            imageview.setImageResource(R.drawable.dog2);

        }
        button3.setOnClickListener{
            imageview.setImageResource(R.drawable.dog3);

        }


    }
}