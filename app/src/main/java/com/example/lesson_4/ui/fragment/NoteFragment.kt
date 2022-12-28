package com.example.lesson_4.ui.fragment



import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lesson_4.R
import com.example.lesson_4.base.BaseFragment
import com.example.lesson_4.databinding.FragmentNoteBinding



class NoteFragment : BaseFragment<FragmentNoteBinding>(FragmentNoteBinding::inflate) {


    override fun setupObserver() {
        super.setupObserver()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_note, container, false)
    }

    override fun setupUI() {
        TODO("Not yet implemented")
    }


}