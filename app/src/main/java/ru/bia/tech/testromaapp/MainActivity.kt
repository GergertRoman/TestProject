package ru.bia.tech.testromaapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.View

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var toolbar: Toolbar? = null
    private var where: View? = null
    private var hither: View? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initToolbar()

        processingClicks()
    }

    private fun initToolbar() {
        toolbar = findViewById(R.id.toolbar)
        toolbar?.setTitle(R.string.title)
    }

    private  fun assigning() {
        where = findViewById(R.id.vWhereView)
        hither = findViewById(R.id.vHitherView)
    }

    private  fun processingClicks() {
        assigning()

        where?.setOnClickListener(this)
        hither?.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.vWhereView -> {
                val whereintent = Intent(this@MainActivity, TabActivity::class.java)
                whereintent.putExtra(TAB_KEY, Tag.WHERE.name)
                startActivity(whereintent)
            }

            R.id.vHitherView -> {
                val hitherintent = Intent(this@MainActivity, TabActivity::class.java)
                hitherintent.putExtra(TAB_KEY, Tag.HITHER.name)
                startActivity(hitherintent)
            }
        }
    }

}
