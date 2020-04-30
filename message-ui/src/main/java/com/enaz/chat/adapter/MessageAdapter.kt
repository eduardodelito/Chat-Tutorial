package com.enaz.chat.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.enaz.chat.message.R
import com.enaz.chat.message.databinding.MessageItemBinding
import com.enaz.chat.model.MessageItem

/**
 * Created by eduardo.delito on 4/30/20.
 */
class MessageAdapter : RecyclerView.Adapter<MessageAdapter.MessageViewHolder>() {

    private var list = listOf<MessageItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        val binding: MessageItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.message_item,
            parent,
            false
        )
        return MessageViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        var context = holder.messageItemBinding.root.context
        holder.messageItemBinding.messageItem = list[position]
        holder.messageItemBinding.executePendingBindings()
        holder.messageItemBinding.root.animation = AnimationUtils.loadAnimation(context,R.anim.item_animation_fall_down)
    }

    /**
     * Function to update the message item in list
     *
     * @param list the new set of data
     */
    fun updateDataSet(list: List<MessageItem>) {
        this.list = list
        notifyDataSetChanged()
    }

    inner class MessageViewHolder(val messageItemBinding: MessageItemBinding) :
        RecyclerView.ViewHolder(messageItemBinding.root)
}
