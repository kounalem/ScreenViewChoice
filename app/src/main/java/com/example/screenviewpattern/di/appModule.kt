package com.example.screenviewpattern.di

import com.example.screenviewpattern.presentation.Contract
import com.example.screenviewpattern.presentation.MainPresenter
import org.koin.dsl.module

val appModule = module {

    factory<Contract.Presenter> { MainPresenter() }

}
