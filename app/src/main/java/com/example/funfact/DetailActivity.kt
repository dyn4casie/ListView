package com.example.funfact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.funfact.databinding.ActivityDetailBinding
import com.example.funfact.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {
    private var binding:ActivityDetailBinding? = null
    private var logo = 0
    private var name: String? = null
    private var detail: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        logo = intent.getIntExtra(FactAdapter.LOGO_EXTRAs,0)
        name = intent.getStringExtra(FactAdapter.NAME_EXTRAS)
        detail = intent.getStringExtra(FactAdapter.FACT_EXTRAS)
        setUpFactDetail()
    }


    private fun setUpFactDetail(){
        binding?.detaillv?.text = detail
        binding?.logolv?.setImageResource(logo)
        title = name
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}