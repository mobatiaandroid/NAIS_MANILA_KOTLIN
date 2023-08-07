package com.mobatia.naismanila.activity.tutorial

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.mobatia.naismanila.R
import com.mobatia.naismanila.activity.login.Login
import com.mobatia.naismanila.activity.tutorial.adapter.TutorialViewPagerAdapter
import com.mobatia.naismanila.constant.PreferenceManager

class Tutorial : AppCompatActivity() {
    lateinit var context: Context
    lateinit var tutorialViewPager: ViewPager
    lateinit var imageSkip: ImageView
    lateinit var mLinearLayout: LinearLayout
    lateinit var indicatorDots: Array<ImageView?>
    var bannerarray = ArrayList<Int>()
    var dataType: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorial)
        context = this

        bannerarray.add(R.drawable.tutorial_home_1)
        bannerarray.add(R.drawable.tutorial_home_2)
        bannerarray.add(R.drawable.tutorial_home_3)
        bannerarray.add(R.drawable.tutorial_home_4)
        initializeUI()
    }

    private fun initializeUI() {
        tutorialViewPager = findViewById(R.id.tutorialViewPager)
        imageSkip = findViewById(R.id.imageSkip)
        mLinearLayout = findViewById(R.id.linear)
        indicatorDots = arrayOfNulls(bannerarray.size)
        val tutorialViewPagerAdapter = TutorialViewPagerAdapter(context, bannerarray)
        tutorialViewPager.currentItem = 0
        tutorialViewPager.adapter = tutorialViewPagerAdapter
        addShowCountView(0)
        imageSkip.setOnClickListener {
            if (PreferenceManager.getIsFirstTime(context).equals("First"))
            {
                startActivity(Intent(this, Login::class.java))
                PreferenceManager.setIsFirstTime(context,"Second")
                finish()
            }
            else{
                finish()
            }

        }
        tutorialViewPager.setOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageSelected(position: Int) {
                for (i in bannerarray.indices) {
                    indicatorDots[i]!!.setBackgroundDrawable(
                        resources
                            .getDrawable(R.drawable.blackround)
                    )
                }
                if (position < bannerarray.size) {
                    indicatorDots[position]!!.setBackgroundDrawable(
                        resources
                            .getDrawable(R.drawable.redround)
                    )
                    mLinearLayout.removeAllViews()
                    addShowCountView(position)
                } else {
                    mLinearLayout.removeAllViews()
                    finish()
                }
            }

            override fun onPageScrolled(arg0: Int, arg1: Float, arg2: Int) {}
            override fun onPageScrollStateChanged(arg0: Int) {}
        })
        tutorialViewPager.adapter!!.notifyDataSetChanged()
    }
    private fun addShowCountView(count: Int) {
        for (i in bannerarray.indices) {
            indicatorDots[i] = ImageView(context)
            val layoutParams = LinearLayout.LayoutParams(
                resources
                    .getDimension(R.dimen.home_circle_width).toInt(),
                resources.getDimension(
                    R.dimen.home_circle_height
                ).toInt()
            )
            indicatorDots.get(i)!!.layoutParams = layoutParams
            if (i == count) {
                indicatorDots.get(i)!!.setBackgroundResource(R.drawable.redround)
            } else {
                indicatorDots.get(i)!!.setBackgroundResource(R.drawable.blackround)
            }
            mLinearLayout.addView(indicatorDots.get(i))
        }
    }
}