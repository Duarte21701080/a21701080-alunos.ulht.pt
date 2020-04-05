package com.example.myapplication

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.myapplication.fragment.CalculatorFragment

class NavigationManager {

    companion object{

        private fun placeFragment(fm: FragmentManager, fragment: Fragment){
            val transition = fm.beginTransaction()
            transition.replace(R.id.frame, fragment)
            transition.addToBackStack(null)
            transition.commit()
        }

        fun goToCalculatorFragment(fm: FragmentManager){
            placeFragment(fm,
                CalculatorFragment()
            )
        }

    }

}