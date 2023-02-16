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

        val bbbbbb = "2222222"
        val aaa= "11111"
        val ccc= "333"
        val ddd= "444"
        val fff= "444"

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