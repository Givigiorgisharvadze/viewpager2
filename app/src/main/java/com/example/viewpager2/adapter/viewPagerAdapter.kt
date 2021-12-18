package com.example.viewpager2.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpager2.fragments.fragment1
import com.example.viewpager2.fragments.fragment2
import com.example.viewpager2.fragments.fragment3

class viewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle  ): FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {

        return when(position) {

            0 -> {

                fragment1()

            }

            1 -> {

                fragment2()

            }

            2 -> {

                fragment3()

            }

            else -> {

               Fragment()

            }

        }

    }

}