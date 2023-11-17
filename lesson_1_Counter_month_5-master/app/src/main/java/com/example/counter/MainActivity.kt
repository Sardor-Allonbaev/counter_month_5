package com.example.counter

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterView {

    private lateinit var binding: ActivityMainBinding

    private var presenter = Injector.getPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickers()
    }

    private fun initClickers() {
        with(binding) {
            btnPlus.setOnClickListener {
                presenter.increment()
            }
            btnMinus.setOnClickListener {
                presenter.decrement()
            }
        }
    }

    override fun showChangeCount(count: Int) {
        binding.tvCount.text = count.toString()
    }

    override fun showToast() {
        Toast.makeText(this, "Поздравляем", Toast.LENGTH_SHORT).show()
    }

    override fun greenText() {
        binding.tvCount.setTextColor(Color.GREEN)
    }

    override fun blackText() {
        binding.tvCount.setTextColor(Color.BLACK)
    }

}