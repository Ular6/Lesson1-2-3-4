package com.example.lesson_4.ui.board

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lesson_4.R
import com.example.lesson_4.base.BaseFragment
import com.example.lesson_4.databinding.FragmentOnBoardBinding


class OnBoardFragment : BaseFragment<FragmentOnBoardBinding>(FragmentOnBoardBinding::inflate), OpenListener {
    private lateinit var adapter: BoardAdapter



    override fun open() {
        controller.navigate(R.id.navigation_note)
    }

    override fun setupUI() {
        adapter = BoardAdapter(this)
        binding?.boardPager?.adapter = adapter
    }
}