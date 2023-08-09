package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.MainActivityBinding


class AboutMeActivity : AppCompatActivity() {
    private lateinit var binding: MainActivityBinding
    private val myName:Name= Name("Avula sreelatha")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.main_activity)
        binding.myName=myName
        binding.doneButton.setOnClickListener {
            addNickname()
        }
    }
    private fun addNickname() {
        binding.nicknameText.text = binding.nicknameEdit.text
        myName.nickName=binding.nicknameEdit.text.toString()
        binding.nicknameEdit.visibility = View.GONE
        binding.doneButton.visibility = View.GONE
        binding.nicknameText.visibility = View.VISIBLE
    }
}