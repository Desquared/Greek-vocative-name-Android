package gr.desquared.greekvocativename.activities

import android.os.Bundle
import android.view.View
import android.view.inputmethod.EditorInfo
import androidx.appcompat.app.AppCompatActivity
import gr.desquared.greekvocativename.R
import gr.desquared.vocativename.VocativeUtils
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.content_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        button.setOnClickListener(View.OnClickListener {
            changeName()
        })
        editText.setOnEditorActionListener { v, actionId, event ->
            return@setOnEditorActionListener when (actionId) {
                EditorInfo.IME_ACTION_GO -> {
                    changeName()
                    true
                }
                else -> false
            }
        }
    }

    private fun changeName() {
        textView.text = "Γεια σου "+VocativeUtils.getVocativeName(editText.text.toString())
    }

}
