package com.example.counter

interface CounterView {

    fun showChangeCount(count: Int)
    fun showToast()
    fun greenText()
    fun blackText()
}