package com.example.easy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var etNo1: EditText;
    private lateinit var etNo2: EditText;
    private lateinit var tvTotalVal: TextView;
    private lateinit var tvHeading: TextView;
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        etNo1 = findViewById(R.id.etNo1)
        etNo2 = findViewById(R.id.etNo2)
        tvTotalVal = findViewById(R.id.tvTotalVal)
        tvHeading = findViewById(R.id.tvHeading)
        if (item.itemId == R.id.id_add) {
            tvHeading.text = "Addition"
            addition()
        }
        else if (item.itemId == R.id.id_sub) {
            tvHeading.text = "Subtraction"
            subtraction()
        }
        else if(item.itemId == R.id.id_mul) {
            tvHeading.text = "Multiplication"
            multiplication()
        }
        else if(item.itemId == R.id.id_div) {
            tvHeading.text = "Division"
            division()
        }

        etNo1.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                if (item.itemId == R.id.id_add) {
                    addition()
                }
                else if(item.itemId == R.id.id_sub) {
                    subtraction()
                }
                else if(item.itemId == R.id.id_mul) {
                    multiplication()
                }
                else if(item.itemId == R.id.id_div) {
                    division()
                }

            }
        })
        etNo2.addTextChangedListener(object: TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                if (item.itemId == R.id.id_add) {
                    addition()
                }
                else if(item.itemId == R.id.id_sub) {
                    subtraction()
                }
                else if(item.itemId == R.id.id_mul) {
                    multiplication()
                }
                else if(item.itemId == R.id.id_div) {
                    division()
                }

            }
        })
        return super.onOptionsItemSelected(item)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    private fun addition(){
        if (etNo1.text.toString() == "" || etNo2.text.toString() == "") {
            tvTotalVal.text = ""
        }
        else if(etNo1.text.toString() == "+" || etNo2.text.toString() == "+") {
            tvTotalVal.text = ""
        }
        else {
            val total = etNo1.text.toString().toLong() + etNo2.text.toString().toLong()
            tvTotalVal.text = total.toString()
        }

    }
    private fun subtraction() {
        if (etNo1.text.toString() == "" || etNo2.text.toString() == "") {
            tvTotalVal.text = ""
        }
        else if(etNo1.text.toString() == "+" || etNo2.text.toString() == "+") {
            tvTotalVal.text = ""
        }
        else {
            val total = etNo1.text.toString().toLong() - etNo2.text.toString().toLong()
            tvTotalVal.text = total.toString()
        }
    }
    private fun multiplication() {
        if (etNo1.text.toString() == "" || etNo2.text.toString() == "") {
            tvTotalVal.text = ""
        }
        else if(etNo1.text.toString() == "+" || etNo2.text.toString() == "+") {
            tvTotalVal.text = ""
        }
        else {
            val total = etNo1.text.toString().toLong() * etNo2.text.toString().toLong()
            tvTotalVal.text = total.toString()
        }
    }
    private fun division() {
        if (etNo1.text.toString() == "" || etNo2.text.toString() == "") {
            tvTotalVal.text = ""
        }
        else if(etNo1.text.toString() == "+" || etNo2.text.toString() == "+") {
            tvTotalVal.text = ""
        }
        else {
            val total = etNo1.text.toString().toLong() / etNo2.text.toString().toLong()
            tvTotalVal.text = total.toString()
        }
    }
}
