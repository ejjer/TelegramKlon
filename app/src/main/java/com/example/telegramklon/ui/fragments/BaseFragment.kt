package com.example.telegramklon.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.telegramklon.R


open class BaseFragment(val layout : Int) : Fragment() {

    private lateinit var rootView:View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = inflater.inflate(layout,container,false)
        return rootView
    }

    override fun onStart() {
        super.onStart()
    }

}