package com.osisupermoses.fashiongallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import com.osisupermoses.fashiongallery.databinding.ActivityGalleryBinding

class GalleryActivity : AppCompatActivity() {

    private var binding: ActivityGalleryBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGalleryBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val galleryViewPager = binding?.galleryVp
        val adapter = GalleryAdapter(this)
        galleryViewPager?.adapter = adapter

        TabLayoutMediator(binding!!.tabLayout, galleryViewPager!!) { tab, position ->
            tab.text = getTitle(position)
        }.attach()
    }

    private fun getTitle(position: Int): String? {
        return when(position) {
            0 -> "Tee-Shirts"
            1 -> "Hoodies"
            2 -> "Sneakers"
            else -> null
        }
    }
}