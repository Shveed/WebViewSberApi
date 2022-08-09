package ru.miti.webviewsberapi.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import ru.miti.webviewsberapi.databinding.MainFragmentBinding

class MainFragment : Fragment() {

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        with(MainFragmentBinding.inflate(inflater, container, false)) {
            viewModel = ViewModelProvider(this@MainFragment)[MainViewModel::class.java]
            initView(this)
            return root
        }
    }

    private fun initView(binding: MainFragmentBinding) {
        binding.button.setOnClickListener {
//            findNavController().navigate()
        }
    }

    companion object {
        fun newInstance() = MainFragment()
        private const val TAG = "MainFragment"
    }
}
