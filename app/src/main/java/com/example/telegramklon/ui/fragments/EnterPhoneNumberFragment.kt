package com.example.telegramklon.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.telegramklon.R
import com.example.telegramklon.databinding.FragmentEnterPhoneNumberBinding
import com.example.telegramklon.utilits.replaceFragment
import com.example.telegramklon.utilits.showToast


class EnterPhoneNumberFragment : Fragment() {
    private var _binding: FragmentEnterPhoneNumberBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEnterPhoneNumberBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        binding.registerBtnNext.setOnClickListener {
            sendCode()
        }
    }

    private fun sendCode() {

        if (binding.registerInputPhoneNumber.text.toString().isEmpty()) {
            showToast("Enter phone number")
        } else {
            replaceFragment(EnterCodeFragment.newInstance())
        }
    }


    companion object {
        fun newInstance() = EnterPhoneNumberFragment()
    }
}