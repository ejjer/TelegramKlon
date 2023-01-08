package com.example.telegramklon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.example.telegramklon.activitys.RegisterActivity
import com.example.telegramklon.databinding.ActivityMainBinding
import com.example.telegramklon.ui.fragments.ChatsFragment
import com.example.telegramklon.ui.oblects.AppDrawer
import com.example.telegramklon.utilits.replaceActivity
import com.example.telegramklon.utilits.replaceFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var toolbar: Toolbar
    private lateinit var appDrawer: AppDrawer


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        initFields()
        initFunc()
    }

    private fun initFunc() {

        if (true) {
            setSupportActionBar(toolbar)
            appDrawer.create()
            replaceFragment(ChatsFragment.newInstance())
        } else {
            replaceActivity(RegisterActivity())
        }
    }


    private fun initFields() {
        toolbar = binding.mainToolBar
        appDrawer = AppDrawer(this, toolbar)
    }
}