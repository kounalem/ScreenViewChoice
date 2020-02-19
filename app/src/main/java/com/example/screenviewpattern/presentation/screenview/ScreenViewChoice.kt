package com.example.screenviewpattern.presentation.screenview

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.screenviewpattern.R
import com.example.screenviewpattern.databinding.FragmentMainBinding
import com.example.screenviewpattern.presentation.Contract

class ScreenViewChoice(
    inflater: LayoutInflater,
    container: ViewGroup?,
    private val presenter: Contract.Presenter,
    private val showEnterDialog: (title: String, description: String) -> Unit,
    private val goSomewhere: (chosenValue: String) -> Unit,
    private val finish: () -> Unit
) : Contract.View {

    private val binding: FragmentMainBinding =
        FragmentMainBinding.inflate(inflater, container, false)

    val root: View
        get() = binding.root

    init {
        presenter.attachView(this)

        binding.mainBtnChangeDescription.setOnClickListener {
            if (binding.mainTvDescription.text == root.context.getString(R.string.one)) {
                binding.mainTvDescription.text = root.context.getString(R.string.two)
                presenter.doActionA()
            } else {
                binding.mainTvDescription.text = root.context.getString(R.string.one)
                presenter.doActionB()
            }
        }
    }

    override fun showProgress() {}

    override fun hideProgress() {}


    override fun finishedA() {
        Log.d(ScreenViewChoice::class.simpleName, "finished action A")
    }

    override fun finishedB() {
        Log.d(ScreenViewChoice::class.simpleName, "finished action B")
    }

}
