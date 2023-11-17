package com.example.counter

class Injector {

    companion object {

        fun getModel(): CountModel {
            return CountModel()
        }

        fun getPresenter(view: CounterView): CountPresenter {
            return CountPresenter(view)
        }
    }
}