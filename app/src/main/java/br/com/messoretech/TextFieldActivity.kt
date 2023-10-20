package br.com.messoretech

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.messoretech.databinding.ActivityTextFieldsBinding

class TextFieldActivity : AppCompatActivity() {

    private val binding by lazy { ActivityTextFieldsBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.inputError.error = "Campo obrigatorio"

    }

    companion object{
        fun createIntent(context: Context): Intent = Intent(context, TextFieldActivity::class.java)
    }
}
