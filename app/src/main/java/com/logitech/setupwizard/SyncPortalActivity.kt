package com.logitech.setupwizard

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.KeyEvent
import android.view.MotionEvent
import android.view.View
import android.widget.Button

class SyncPortalActivity : AppCompatActivity(), View.OnClickListener, View.OnTouchListener {

    private lateinit var mSignInButton: Button
    private lateinit var mCreateAccountButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen)

        mSignInButton = findViewById(R.id.sign_in_button)
        mSignInButton.setOnClickListener(this)
        mSignInButton.setOnTouchListener(this)
        mCreateAccountButton = findViewById(R.id.create_account_button)
        mCreateAccountButton.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.sign_in_button -> signInSyncPortal()
            R.id.create_account_button -> createAccount()
        }
    }

    private fun signInSyncPortal() {
        //mSignInButton.setBackgroundResource(R.color.view_background_color)
    }

    private fun createAccount() {
        //mCreateAccountButton.setBackgroundResource(R.color.view_background_color)
    }

    override fun onTouch(v: View?, event: MotionEvent?): Boolean {
        when (v?.id) {
            R.id.sign_in_button -> updateSignInPortalBackground(event?.action)
        }
        return false
    }

    private fun updateSignInPortalBackground(actionPerformed: Int?) {
        if (actionPerformed == KeyEvent.ACTION_DOWN) {
            mSignInButton.setBackgroundColor(resources.getColor(R.color.view_background_color, null))
        } else if (actionPerformed == KeyEvent.ACTION_UP) {
            mSignInButton.setBackgroundColor(resources.getColor(R.color.view_background_color, null))
        }
    }
}
