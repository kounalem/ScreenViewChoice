package com.example.screenviewpattern.presentation

import com.example.screenviewpattern.core.BasePresenter

class MainPresenter : BasePresenter<Contract.View>(), Contract.Presenter {

    override fun onViewReady() {

    }

    override fun doActionA() {
        view?.finishedA()
    }

    override fun doActionB() {
        view?.finishedB()
    }
}
