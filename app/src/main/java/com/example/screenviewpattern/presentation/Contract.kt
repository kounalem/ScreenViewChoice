package com.example.screenviewpattern.presentation

import com.example.screenviewpattern.core.MvpPresenter
import com.example.screenviewpattern.core.MvpView

interface Contract {
    interface View : MvpView {
        fun showProgress()
        fun hideProgress()
        fun finishedA()
        fun finishedB()
    }

    interface Presenter : MvpPresenter<View> {
        fun onViewReady()
        fun doActionA()
        fun doActionB()
    }
}
