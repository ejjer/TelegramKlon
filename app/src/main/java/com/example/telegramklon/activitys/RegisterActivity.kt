package com.example.telegramklon.activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.example.telegramklon.R
import com.example.telegramklon.databinding.ActivityRegisterBinding
import com.example.telegramklon.ui.fragments.EnterPhoneNumberFragment
import com.example.telegramklon.utilits.replaceFragment

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding
    private lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        toolbar = binding.registerToolBar
        setSupportActionBar(toolbar)
        title = getString(R.string.register_title_you_phone)
        replaceFragment(EnterPhoneNumberFragment.newInstance())
    }

}