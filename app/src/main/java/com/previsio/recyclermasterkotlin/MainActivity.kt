package com.previsio.recyclermasterkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.previsio.recyclermasterkotlin.model.fakeEmails

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recycler_view_main: RecyclerView = findViewById(R.id.recycler_view_main)
        recycler_view_main.adapter = EmailAdapter(fakeEmails())
        recycler_view_main.layoutManager = LinearLayoutManager(this)

    }
}