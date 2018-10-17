package com.votlin.android.ui.adapter

import android.view.View
import com.votlin.android.R
import com.votlin.model.Talk
import kotlinx.android.synthetic.main.item_talk.view.*

class TalksAdapter(onItemClick: (Talk) -> Unit) : RootAdapter<Talk>(onItemClickListener = onItemClick) {

    override val itemLayoutId: Int = R.layout.item_talk

    override fun viewHolder(view: View): RootViewHolder<Talk> = TalkViewHolder(view)

    class TalkViewHolder(itemView: View) : RootViewHolder<Talk>(itemView = itemView) {

        override fun bind(model: Talk) {
            itemView.title.text = model.name
            itemView.speakers.text = model.speakers.joinToString { it.name }
        }
    }
}