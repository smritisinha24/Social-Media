package com.example.socialmediaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.socialmediaapp.daos.PostDao
import com.example.socialmediaapp.models.Post

class CreatePostActivity : AppCompatActivity() {

    private lateinit var postDao: PostDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_post_activity)

        postDao = PostDao()

        val postButton = findViewById<Button>(R.id.postButton)
        postButton.setOnClickListener {
            val PostInput = findViewById<EditText>(R.id.postInput)
            val input = PostInput.editableText.toString()
            if(input.isNotEmpty()){
                postDao.addPost(input)
                finish()
            }
        }
    setUpRecyclerView()
    }
    private fun setUpRecyclerView() {
    }
    }