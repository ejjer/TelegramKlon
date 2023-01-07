package com.example.telegramklon.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.telegramklon.R
import com.example.telegramklon.databinding.FragmentEnterPhoneNumberBinding


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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.registerBtnNext.setOnClickListener {
            if (binding.registerInputPhoneNumber.text.toString().isEmpty()) {
                Toast.makeText(activity, "Enter code", Toast.LENGTH_SHORT).show()
            } else {
                fragmentManager?.beginTransaction()
                    ?.replace(R.id.registerDataContainer, EnterCodeFragment.newInstance())
                    ?.addToBackStack(null)
                    ?.commit()
            }
        }
    }

    override fun onStart() {
        super.onStart()
        binding.registerBtnNext.setOnClickListener {
            if (binding.registerInputPhoneNumber.text.toString().isEmpty()) {
                Toast.makeText(activity, "Enter code", Toast.LENGTH_SHORT).show()
            } else {
                fragmentManager?.beginTransaction()
                    ?.replace(R.id.registerDataContainer, EnterCodeFragment.newInstance())
                    ?.addToBackStack(null)
                    ?.commit()
            }
        }

    }

    private fun sendCode() {

        if (binding.registerInputPhoneNumber.text.toString().isEmpty()) {
            Toast.makeText(activity, "Enter code", Toast.LENGTH_SHORT).show()
        } else {
            fragmentManager?.beginTransaction()
                ?.replace(R.id.registerDataContainer, EnterCodeFragment.newInstance())
                ?.addToBackStack(null)
                ?.commit()
        }
    }


    companion object {
        fun newInstance() = EnterPhoneNumberFragment()
    }
}