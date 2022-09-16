package com.narvenia.situskerja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class SitusKerjaDetail : AppCompatActivity() {
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DOMAIN = "extra_domain"
        const val EXTRA_ABOUT = "extra_about"
        const val EXTRA_PHOTO = "extra_photo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_situs_detail)

        val tvName : TextView = findViewById(R.id.tv_situsName)
        val tvDomain : TextView = findViewById(R.id.tv_domainName)
        val tvSitusAbout : TextView = findViewById(R.id.tv_situsAbout)
        val ivPhoto : ImageView = findViewById(R.id.iv_situsPhoto)

        val actionBar = supportActionBar

        val name = intent.getStringExtra(EXTRA_NAME)
        val domain = intent.getStringExtra(EXTRA_DOMAIN)
        val about = intent.getStringExtra(EXTRA_ABOUT)
        val photo = intent.getIntExtra(EXTRA_PHOTO, 0)

        val txtDomain = "Domain:\n$domain"

        tvName.text = name
        tvDomain.text = txtDomain
        tvSitusAbout.text = about
        ivPhoto.setImageResource(photo)

        actionBar!!.title = name
        actionBar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}