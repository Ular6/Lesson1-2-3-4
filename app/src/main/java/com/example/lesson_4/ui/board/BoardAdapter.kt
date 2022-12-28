package com.example.lesson_4.ui.board

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.lesson_4.R
import com.example.lesson_4.databinding.ItemBoardBinding

class BoardAdapter(private val listener: OpenListener) : RecyclerView.Adapter<BoardAdapter.BoardViewHolder>(){

    val titleList = listOf("Заметки", "Контакты", "Конец")
    val desList = listOf("Добавление заметок", "Доступ ко всем контактам", "Регистрация через email")
    val imgList = listOf(R.drawable.contact, R.drawable.geektech, R.drawable.note)


   inner class BoardViewHolder( val binding: ItemBoardBinding) : RecyclerView.ViewHolder(binding.root) {


        fun inBind(position: Int) {
            binding.imgItemBoard.setImageResource(imgList[position])
            binding.tvItemTitleBoard.text = titleList[position]
            binding.tvItemDescriptionBoard.text = desList[position]
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BoardViewHolder {
        return BoardViewHolder(ItemBoardBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: BoardViewHolder, position: Int) {
       holder.inBind(position)
        holder.binding.btnItemStartBoard.setOnClickListener {
            listener.open()
        }

    }

    override fun getItemCount(): Int = titleList.size



}
interface OpenListener{
    fun open()
}