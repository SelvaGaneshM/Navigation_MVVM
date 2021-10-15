package com.learning.navigationsample.ui.splash

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.learning.navigationsample.R
import com.learning.navigationsample.base.BaseFragment
import com.learning.navigationsample.databinding.FragmentSplashBinding


class SplashFragment : BaseFragment() {

    /** Duration of wait  */
    private val SPLASH_DISPLAY_LENGTH = 1000
    private lateinit var binding: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSplashBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        Handler().postDelayed(Runnable {
            Navigation.findNavController(view)
                .navigate(R.id.action_splashFragment_to_loginFragment);
        }, SPLASH_DISPLAY_LENGTH.toLong())

    }

}