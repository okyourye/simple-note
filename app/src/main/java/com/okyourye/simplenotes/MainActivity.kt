package com.okyourye.simplenotes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.okyourye.simplenotes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.saveButton.setOnClickListener {
            val text = binding.memoInput.text.toString().trim()
            if (text.isNotEmpty()) {
                binding.memoList.append("• $text\n")
                binding.memoInput.text?.clear()
            }
        }
    }
}
