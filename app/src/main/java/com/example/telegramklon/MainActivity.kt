package com.example.telegramklon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.example.telegramklon.databinding.ActivityMainBinding
import com.example.telegramklon.ui.fragments.ChatsFragment
import com.example.telegramklon.ui.oblects.AppDrawer

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding
    private lateinit var mToolbar: Toolbar
    private lateinit var mAppDrawer:AppDrawer


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }

    override fun onStart() {
        super.onStart()
        initFields()
        initFunc()
    }

    private fun initFunc() {
        setSupportActionBar(mToolbar)
        mAppDrawer.create()
        supportFragmentManager.beginTransaction().replace(R.id.DataContainer, ChatsFragment.newInstance()).commit()

    }



    private fun initFields() {
        mToolbar = mBinding.mainToolBar
        mAppDrawer= AppDrawer(this,mToolbar)
    }
}