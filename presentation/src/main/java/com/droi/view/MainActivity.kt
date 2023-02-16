package com.droi.view

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentManager
import com.droi.*
import com.droi.databinding.ActivityMainBinding
import org.koin.android.ext.android.inject


class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding
    var fragmentManager: FragmentManager? = null
    val firstFragment: FirstFragment by inject()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this
    }

    override fun _init() {
        initTap()

        val b1 = "b1"
        val b2 = "b2"


    }

    private fun initTap() {
        fragmentManager = supportFragmentManager
//        if (firstFragment == null) {
//            firstFragment = FirstFragment()
        fragmentManager!!.beginTransaction().add(R.id.fl_main, firstFragment!!)
            .commitAllowingStateLoss()
//        }
    }
}