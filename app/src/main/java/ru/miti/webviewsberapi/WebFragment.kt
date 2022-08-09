package ru.miti.webviewsberapi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.miti.webviewsberapi.databinding.FragmentWebBinding

class WebFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        with(FragmentWebBinding.inflate(inflater, container, false)) {

            return root
        }
    }

    private fun initView(binding: FragmentWebBinding) {
        binding.webView.webViewClient
    }

    companion object {
        @JvmStatic
        fun newInstance() = WebFragment()
    }
}
