package ru.bia.tech.testromaapp

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.FragmentPagerAdapter
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.*
import android.view.View
import kotlinx.android.synthetic.main.activity_tab.*


class TabActivity: AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {

    }

    private var toolbar: Toolbar? = null
    private var fragmentAdapter: FragmentPagerAdapter? = null
    private var tabLayout: TabLayout? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab)

        initToolbar()

        fragmentAdapter = PagerAdapter(supportFragmentManager)
        viewpager.adapter = fragmentAdapter
        tabs.setupWithViewPager(viewpager)

        activBar()

    }

    private fun initToolbar() {
        toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        toolbar?.setNavigationIcon(R.drawable.arrow_left)
        toolbar?.setTitle(R.string.text_tab_header)
        toolbar?.inflateMenu(R.menu.menu_toolbar)
        toolbar?.setNavigationOnClickListener { onBackPressed() }
    }

    private fun selectPage(pageIndex: Int) {
        tabLayout = findViewById<View>(R.id.tabs) as TabLayout
        tabLayout?.setScrollPosition(pageIndex, 0f, true)
        viewpager.currentItem = pageIndex
    }

    private fun activBar() {
        val tag = intent.getStringExtra(TAB_KEY)
        if(tag == Tag.WHERE.name) {
            selectPage(0)
        }
        else {
            selectPage(1)
        }
    }





}