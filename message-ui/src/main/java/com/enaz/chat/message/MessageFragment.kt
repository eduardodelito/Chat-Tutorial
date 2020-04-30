package com.enaz.chat.message

import android.text.Editable
import android.text.InputFilter
import android.text.TextWatcher
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.enaz.chat.adapter.MessageAdapter
import com.enaz.chat.common.fragment.BaseFragment
import com.enaz.chat.database.entity.MessageEntity
import com.enaz.chat.mapper.entityModelToMessageItem
import com.enaz.chat.message.databinding.MessageFragmentBinding
import kotlinx.android.synthetic.main.message_fragment.*
import javax.inject.Inject

class MessageFragment : BaseFragment<MessageFragmentBinding, MessageViewModel>() {

    private val DEFAULT_MSG_LENGTH_LIMIT = 100

    lateinit var messageAdapter: MessageAdapter

    companion object {
        fun newInstance() = MessageFragment()
    }

    @Inject
    override lateinit var viewModel: MessageViewModel

    override fun createLayout() = R.layout.message_fragment

    override fun getBindingVariable() = BR.viewModel

    override fun initData() {
        // Do nothing for now
    }

    override fun initViews() {
        messageAdapter = MessageAdapter()
        with(recycler_view) {
            setHasFixedSize(true)
            val layoutMgr = LinearLayoutManager(context)
            layoutMgr.stackFromEnd = true
            this.layoutManager = layoutMgr
            this.adapter = messageAdapter
        }

        // Enable Send button when there's text to send
        messageEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}

            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                sendButton.isEnabled = charSequence.toString().trim { it <= ' ' }.isNotEmpty()
            }

            override fun afterTextChanged(editable: Editable) {}
        })
        messageEditText.filters =
            arrayOf<InputFilter>(InputFilter.LengthFilter(DEFAULT_MSG_LENGTH_LIMIT))

        // Send button sends a message and clears the EditText
        sendButton.setOnClickListener {
            val message = MessageEntity(0, messageEditText.text.toString())

            viewModel.setMessage(message)
            // Clear input box
            messageEditText.setText("")
        }
    }

    override fun subscribeUi() {
        viewModel.getMessages().observe(viewLifecycleOwner, Observer<List<MessageEntity>> {
            messageAdapter.updateDataSet(it.entityModelToMessageItem())
        })
    }
}
