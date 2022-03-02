package com.ubaya.adv160419024week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main.*
import java.util.*

/**
 * A simple [Fragment] subclass.
 * Use the [MainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnStart.setOnClickListener {
            //ambil nama pemain
            val playerName = txtName.text.toString()
            //dapatkan action yang akan dijalankan
            val action = MainFragmentDirections.actionGameFragment(playerName)
            // Jalankan action tersebut
            Navigation.findNavController(it).navigate(action)
        }

        //untuk memunculkan dialog tdk perlu aler dialog hanya cukup panggil actionnya saja.
        btnOption.setOnClickListener {
            val action = MainFragmentDirections.actionOptionFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }

}