package com.example.myapplication

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.ContentValues.TAG
import android.content.Context
import android.content.Intent
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.contentValuesOf
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_history.*
import kotlinx.android.synthetic.main.activity_history.list_historic
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_calculator.*
import net.objecthunter.exp4j.ExpressionBuilder
import java.text.FieldPosition
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    private val TAG = MainActivity::class.java.simpleName
    private val VISOR_KEY = "visor"

    private var listHistory = mutableListOf<Operation>()
    @SuppressLint("SimpleDateFormat")
    var format: SimpleDateFormat = SimpleDateFormat("HH:mm:ss")

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        text_visor.text = savedInstanceState?.getString(VISOR_KEY)
    }


    override fun onSaveInstanceState(outState: Bundle) {
        outState.run { putString(VISOR_KEY, text_visor.text.toString()) }
        super.onSaveInstanceState(outState)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "o metodo onCreate foi invocado")
        setContentView(R.layout.activity_main)
        NavigationManager.goToCalculatorFragment(supportFragmentManager)

    }

    override fun onDestroy() {
        Log.i(TAG, "o metodo onDestroy foi invocado")
        super.onDestroy()
    }

}

