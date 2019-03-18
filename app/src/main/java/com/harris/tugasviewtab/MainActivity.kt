package com.harris.tugasviewtab

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.PagerAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        vp_main.adapter = PagerAdapter(supportFragmentManager)
        tabs_main.setupWithViewPager(vp_main)

        //Icon Set
        tabs_main.getTabAt(0)!!.setIcon(R.drawable.baseline_person_black_18dp)
        tabs_main.getTabAt(1)!!.setIcon(R.drawable.baseline_library_music_black_18dp)
        tabs_main.getTabAt(2)!!.setIcon(R.drawable.baseline_movie_black_18dp)
        tabs_main.getTabAt(3)!!.setIcon(R.drawable.baseline_videogame_asset_black_18dp)


    }


}
