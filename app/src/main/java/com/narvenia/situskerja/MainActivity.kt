package com.narvenia.situskerja

import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvSitusKerja: RecyclerView
    private var list: ArrayList<SitusKerja> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvSitusKerja = findViewById(R.id.rv_situs)
        rvSitusKerja.setHasFixedSize(true)

        list.addAll(SitusKerjaData.situsKerjaData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvSitusKerja.layoutManager = LinearLayoutManager(this)
        val listSitusKerjaAdapter = ListSitusKerjaAdapter(list)
        rvSitusKerja.adapter = listSitusKerjaAdapter
        listSitusKerjaAdapter.setOnItemClickCallback(object : ListSitusKerjaAdapter.OnItemClickCallback {
            override fun onItemClicked(data: SitusKerja) {
                detailSitusKerja(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.about -> {
            val aboutMe = Intent(this@MainActivity, About::class.java)
            startActivity(aboutMe)
            true
        }
        else -> {
            super.onOptionsItemSelected(item)
        }
    }

    private fun detailSitusKerja(situs: SitusKerja) {
        val detailSitus = Intent(this@MainActivity, SitusKerjaDetail::class.java)
        detailSitus.putExtra(SitusKerjaDetail.EXTRA_NAME, situs.nameSitus)
        detailSitus.putExtra(SitusKerjaDetail.EXTRA_DOMAIN, situs.domainSitus)
        detailSitus.putExtra(SitusKerjaDetail.EXTRA_ABOUT, situs.aboutSitus)
        detailSitus.putExtra(SitusKerjaDetail.EXTRA_PHOTO, situs.photoSitus)
        startActivity(detailSitus)
    }
}