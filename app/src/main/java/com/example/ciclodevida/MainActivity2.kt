package com.example.ciclodevida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.blogspot.atifsoftwares.animatoolib.Animatoo

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // overridePendingTransition(R.anim.in_trans, R.anim.hold_trans)
        setContentView(R.layout.activity_main2)
    }

    fun click(view: View) {
        val intent = Intent(this, MainActivity3::class.java)
        startActivity(intent)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Animatoo.animateInAndOut(this)
    }
}