package com.previsio.recyclermasterkotlin.model

data class Email(
    val user: String,
    val subject: String,
    val preview: String,
    val date: String,
    val stared: Boolean,
    val unread: Boolean,
    var selected: Boolean = false
)

class EmailBuilder{
    var user: String = ""
    var subject: String = ""
    var preview: String = ""
    var date: String = ""
    var stared: Boolean = false
    var unread: Boolean = false
    var selected: Boolean = false

    fun build(): Email = Email(user, subject, preview, date, stared, unread, false)
}

fun email(block: EmailBuilder.() -> Unit): Email = EmailBuilder().apply(block).build()

fun fakeEmails(): MutableList<Email> = mutableListOf(
    email {
        user = "Facebook"
        subject = "Veja nossas 3 dicas principais para você conseguir"
        preview = "Olá Joel, você precisa ver esse site para"
        date = "01/11"
        stared = false
    },
    email {
        user = "Youtube"
        subject = "Veja nossas 3 dicas principais para você conseguir"
        preview = "Olá Joel, você precisa ver esse site para"
        date = "02/11"
        stared = false
    },
    email {
        user = "Github"
        subject = "Veja nossas 3 dicas principais para você conseguir"
        preview = "Olá Joel, você precisa ver esse site para"
        date = "04/11"
        stared = true
    },
    email {
        user = "Facebook"
        subject = "Veja nossas 3 dicas principais para você conseguir"
        preview = "Olá Joel, você precisa ver esse site para"
        date = "05/11"
        stared = true
    },
    email {
        user = "Gmail"
        subject = "Veja nossas 3 dicas principais para você conseguir"
        preview = "Olá Joel, você precisa ver esse site para"
        date = "05/11"
        stared = false
    },
    email {
        user = "Github"
        subject = "Veja nossas 3 dicas principais para você conseguir"
        preview = "Olá Joel, você precisa ver esse site para"
        date = "04/11"
        stared = true
    },
    email {
        user = "Facebook"
        subject = "Veja nossas 3 dicas principais para você conseguir"
        preview = "Olá Joel, você precisa ver esse site para"
        date = "05/11"
        stared = true
    },
    email {
        user = "Gmail"
        subject = "Veja nossas 3 dicas principais para você conseguir"
        preview = "Olá Joel, você precisa ver esse site para"
        date = "05/11"
        stared = false
    },
    email {
        user = "Github"
        subject = "Veja nossas 3 dicas principais para você conseguir"
        preview = "Olá Joel, você precisa ver esse site para"
        date = "04/11"
        stared = true
    },
    email {
        user = "Facebook"
        subject = "Veja nossas 3 dicas principais para você conseguir"
        preview = "Olá Joel, você precisa ver esse site para"
        date = "05/11"
        stared = true
    },
    email {
        user = "Gmail"
        subject = "Veja nossas 3 dicas principais para você conseguir"
        preview = "Olá Joel, você precisa ver esse site para"
        date = "05/11"
        stared = false
    },
)