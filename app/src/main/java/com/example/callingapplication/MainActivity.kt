package com.example.callingapplication

import android.content.Intent
import android.content.Intent.ACTION_CALL
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button1: Button = findViewById(R.id.button1)
        var editText1: EditText = findViewById(R.id.editext1)
        button1.setOnClickListener {
            var mobnumber = editText1.text.toString()
            var intent: Intent = Intent(ACTION_CALL)
            intent.setData(Uri.parse("tel:"+mobnumber))
            startActivity(intent)
        }


    }
}
