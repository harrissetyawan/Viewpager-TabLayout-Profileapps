package com.harris.tugasviewtab

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.harris.tugasviewtab.FirstFrag
import com.harris.tugasviewtab.FouthFrag
import com.harris.tugasviewtab.SecondFrag
import com.harris.tugasviewtab.ThirdFrag

class PagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    private val pages = listOf(
        FirstFrag(), SecondFrag(), ThirdFrag(), FouthFrag()
    )

    // menentukan fragment yang akan dibuka pada posisi tertentu
    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    override fun getCount(): Int {
        return pages.size
    }
}

