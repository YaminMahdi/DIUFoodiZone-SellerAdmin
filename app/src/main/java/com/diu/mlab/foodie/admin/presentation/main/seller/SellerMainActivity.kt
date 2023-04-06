package com.diu.mlab.foodie.admin.presentation.main.seller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.FragmentManager
import com.diu.mlab.foodie.admin.R
import com.diu.mlab.foodie.admin.databinding.ActivitySellerMainBinding
import com.diu.mlab.foodie.admin.util.changeStatusBarColor
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SellerMainActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySellerMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySellerMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val manager: FragmentManager = supportFragmentManager

        binding.bubbleTabBar.addBubbleListener { id ->
            when(id){
                R.id.foodList -> {
                    binding.topView.setBackgroundColor(this.getColor(R.color.tia))
                    this.changeStatusBarColor(R.color.tiaX,false)
                    manager.beginTransaction()
                        .replace(binding.sellFragment.id, FoodListFragment())
                        .commit()
                }
                R.id.addFood -> {
                    binding.topView.setBackgroundColor(this.getColor(R.color.redPop))
                    this.changeStatusBarColor(R.color.redZ,false)
                    manager.beginTransaction()
                        .replace(binding.sellFragment.id, FoodListFragment())
                        .commit()
                }
                R.id.profile -> {
                    binding.topView.setBackgroundColor(this.getColor(R.color.tia))
                    this.changeStatusBarColor(R.color.tiaX,false)
                    manager.beginTransaction()
                        .replace(binding.sellFragment.id, FoodListFragment())
                        .commit()
                }
            }
        }
    }
}