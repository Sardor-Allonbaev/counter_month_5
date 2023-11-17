package com.example.counter

class CountPresenter(private val counterView: CounterView) {

    private var model = Injector.getModel()

    fun increment() {
        model.increment()
        counterView.showChangeCount(model.count)

        if (model.count == 10) {
            counterView.showToast()
        } else if (model.count == 15) {
            counterView.greenText()
        } else {
            counterView.blackText()
        }
    }

    fun decrement() {
        model.decrement()
        counterView.showChangeCount(model.count)

        if (model.count == 10) {
            counterView.showToast()
        } else if (model.count == 15) {
            counterView.greenText()
        } else {
            counterView.blackText()
        }
    }
}