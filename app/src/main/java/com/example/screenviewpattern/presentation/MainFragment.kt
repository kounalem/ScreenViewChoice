package com.example.screenviewpattern.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.screenviewpattern.presentation.screenview.ScreenViewChoice
import org.koin.android.ext.android.inject

class MainFragment : Fragment() {

    private val presenter: Contract.Presenter by inject()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return ScreenViewChoice(
            inflater,
            container,
            presenter,
            showEnterDialog = { title, description ->
            },
            goSomewhere = { chosenValue ->
                // use the navigator and do something else. TODO on another example
            },
            finish = { activity?.finish() }
        ).root
    }

}
