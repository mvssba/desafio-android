package com.mvssba.desafio_android_concrete.modules.repositories.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.mvssba.desafio_android_concrete.R
import com.mvssba.desafio_android_concrete.modules.repositories.RepositoriesViewModel
import com.mvssba.desafio_android_concrete.modules.repositories.adapter.RepositoriesAdapter

class RepositoriesFragment : Fragment() {

    private lateinit var adapterRepositories: RepositoriesAdapter

    private val viewModel: RepositoriesViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        inflater.inflate(R.layout.fragment_repositories, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        this.setupRecyclerView()

//        viewModel.list.observe(viewLifecycleOwner) {
////            adapterRepositories.update()
//        }
    }

    private fun setupRecyclerView() {
        adapterRepositories = RepositoriesAdapter()
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}