package com.example.lesson_4.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.viewbinding.ViewBinding
import com.example.lesson_4.R


typealias inflate<T> = (LayoutInflater, ViewGroup?, Boolean) -> T
 abstract class BaseFragment<VB : ViewBinding>(private val inflate: inflate<VB>) : Fragment() {
    private var _binding: VB? = null
    protected val binding get() = _binding

    private var _controller: NavController? = null
    protected val controller get() = _controller!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = inflate.invoke(inflater, container, false)
        val navHostFragment = requireActivity().supportFragmentManager.
        findFragmentById(androidx.navigation.fragment.R.id.nav_host_fragment_container) as NavHostFragment
        _controller= navHostFragment.navController
        return _binding?.root
        setupUI()
        setupObserver()
    }

    abstract fun setupUI()
    open fun setupObserver(){}

}