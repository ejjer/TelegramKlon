package com.example.telegramklon.ui.fragments

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.telegramklon.R
import com.example.telegramklon.databinding.FragmentEnterCodeBinding
import com.example.telegramklon.databinding.FragmentEnterPhoneNumberBinding
import com.example.telegramklon.utilits.AppTextWatcher
import com.example.telegramklon.utilits.showToast


class EnterCodeFragment : Fragment() {

    private var _binding: FragmentEnterCodeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEnterCodeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        binding?.registerInputCode.addTextChangedListener(AppTextWatcher {

            val string = binding.registerInputCode.text.toString()
            if (string.length == 6) {
                verifiCode()
            }
        })
    }

    fun verifiCode() {
        showToast("Ok")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


    companion object {
        fun newInstance() = EnterCodeFragment()
    }
}