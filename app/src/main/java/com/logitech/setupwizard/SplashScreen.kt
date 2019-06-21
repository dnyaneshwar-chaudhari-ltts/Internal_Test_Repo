package com.logitech.setupwizard

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {

    //Second Branch changes
    private var mHandler: Handler? = null
    private val SPLASH_DELAY: Long = 3000

    private val mRunnable: Runnable = Runnable {
        if (!isFinishing) {
            var mIntent = Intent(this@SplashScreen, SyncPortalActivity::class.java)
            startActivity(mIntent)
            finish()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        //launch logitech welcome screen
        mHandler = Handler()
        mHandler!!.postDelayed(mRunnable, SPLASH_DELAY)
    }

    override fun onDestroy() {
        if (mHandler != null) {
            mHandler!!.removeCallbacks(mRunnable)
        }
        super.onDestroy()
    }
}
