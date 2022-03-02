package com.ubaya.adv160419024week2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //lateinit var buat variabel yang yakin tidak null
    private  lateinit var navController:NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //set navController datangnya dari mana
        //hubungkan dengan nav host yang sdh dibuat
        navController = (supportFragmentManager.findFragmentById(R.id.hostFragment) as NavHostFragment).navController
        //setup action bar dengan soft back button
        NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout)
        //Navbar kiri
        NavigationUI.setupWithNavController(navView, navController)

        //Hubungkan antara bottom nav dengan nav controller
        bottomNav.setupWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(drawerLayout) || super.onSupportNavigateUp()
    }
}