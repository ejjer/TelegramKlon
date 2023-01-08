package com.example.telegramklon.utilits

import android.content.Intent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.telegramklon.R
import com.example.telegramklon.activitys.RegisterActivity
import com.example.telegramklon.ui.fragments.ChatsFragment

fun Fragment.showToast(massage:String){
    Toast.makeText(this.context,massage,Toast.LENGTH_SHORT).show()
}
fun AppCompatActivity.replaceActivity(activity:AppCompatActivity){
    val intent = Intent(this, activity::class.java)
    startActivity(intent)
    this.finish()
}
fun AppCompatActivity.replaceFragment(fragment: Fragment){
    supportFragmentManager
        .beginTransaction()
        .addToBackStack(null)
        .replace(R.id.DataContainer, fragment)
        .commit()
}fun Fragment.replaceFragment(fragment: Fragment){
    this.fragmentManager
        ?.beginTransaction()
        ?.addToBackStack(null)
        ?.replace(R.id.DataContainer, fragment)
        ?.commit()
}