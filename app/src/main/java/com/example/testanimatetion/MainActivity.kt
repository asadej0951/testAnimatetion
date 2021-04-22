package com.example.testanimatetion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.testanimatetion.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val bounce = AnimationUtils.loadAnimation(this,R.anim.bounce)
        val fadeIn = AnimationUtils.loadAnimation(this,R.anim.fade_in)
        val fadeOut = AnimationUtils.loadAnimation(this,R.anim.fade_out)
        val rotate = AnimationUtils.loadAnimation(this,R.anim.rotate)
        val slideDown = AnimationUtils.loadAnimation(this,R.anim.slide_down)
        val slideUp = AnimationUtils.loadAnimation(this,R.anim.slide_up)
        val zoomIn = AnimationUtils.loadAnimation(this,R.anim.zoom_in)
        val zoomOut = AnimationUtils.loadAnimation(this,R.anim.zoom_out)


        binding.bounce.setOnClickListener {
            binding.tv.startAnimation(bounce)
        }
        binding.fadeIn.setOnClickListener {
            binding.tv.startAnimation(fadeIn)
        }
        binding.fadeOut.setOnClickListener {
            binding.tv.startAnimation(fadeOut)
        }
        binding.rotate.setOnClickListener {
            binding.tv.startAnimation(rotate)
        }
        binding.slideDown.setOnClickListener {
            binding.tv.startAnimation(slideDown)
        }
        binding.slideUp.setOnClickListener {
            binding.tv.startAnimation(slideUp)
        }
        binding.zoomIn.setOnClickListener {
            binding.tv.startAnimation(zoomIn)
        }
        binding.zoomOut.setOnClickListener {
            binding.tv.startAnimation(zoomOut)
        }
    }
}