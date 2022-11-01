package com.previsio.recyclermasterkotlin

import android.graphics.Typeface
import android.graphics.Typeface.BOLD
import android.graphics.Typeface.NORMAL
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.previsio.recyclermasterkotlin.R.*
import com.previsio.recyclermasterkotlin.model.Email

class EmailAdapter(val emails: MutableList<Email>):RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(layout.email_item, parent, false)
        return EmailViewHolder(view)
    }

    override fun getItemCount(): Int = emails.size

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        holder.bind(emails[position])
    }




    inner class EmailViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(email: Email) {

            val txt_user:TextView = itemView.findViewById(id.txt_user)
            val txt_icon:TextView = itemView.findViewById(id.txt_icon)
            val txt_subject:TextView = itemView.findViewById(id.txt_subject)
            val txt_preview:TextView = itemView.findViewById(id.txt_preview)
            val txt_date:TextView = itemView.findViewById(id.txt_date)
            val img_star:ImageView = itemView.findViewById(id.img_star)

            txt_user.text = email.user
            txt_icon.text = email.user.first().toString()
            txt_subject.text = email.subject
            txt_preview.text = email.preview
            txt_date.text = email.date

            txt_user.setTypeface(Typeface.DEFAULT, if(email.unread) BOLD else NORMAL)
            txt_subject.setTypeface(Typeface.DEFAULT, if(email.unread) BOLD else NORMAL)
            txt_date.setTypeface(Typeface.DEFAULT, if(email.unread) BOLD else NORMAL)

            img_star.setImageResource(
                if(email.stared) R.drawable.ic_baseline_star_24
                else R.drawable.ic_baseline_star_border_24
            )


        }
    }
}