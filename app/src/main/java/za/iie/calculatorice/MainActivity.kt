package za.iie.calculatorice

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val buttonAdd = findViewById<Button>(R.id.buttonAdd)
        val buttonSubtract = findViewById<Button>(R.id.buttonSubtract)
        val buttonMultiply = findViewById<Button>(R.id.buttonMultiply)
        val buttonDivide = findViewById<Button>(R.id.buttonDivide)
        val num1 = findViewById<EditText>(R.id.num1)
        val num2 = findViewById<EditText>(R.id.num2)
        val resultDisplay = findViewById<TextView>(R.id.resultDisplay)

        buttonAdd!!.setOnClickListener {
            val number1 = num1.text.toString().toInt()
            val number2 = num2.text.toString().toInt()
            val sum = number1 + number2
            resultDisplay.text = "$sum"
        }

            buttonSubtract!!.setOnClickListener {
                val number1 = num1.text.toString().toInt()
                val number2 = num2.text.toString().toInt()
                val sum = number1 - number2
                resultDisplay.text = "$sum"
            }
        buttonMultiply!!.setOnClickListener {
            val number1 = num1.text.toString().toInt()
            val number2 = num2.text.toString().toInt()
            val sum = number1 * number2
            resultDisplay.text = "$sum"
        }
        buttonDivide!!.setOnClickListener {
            val number1 = num1.text.toString().toInt()
            val number2 = num2.text.toString().toInt()
            val sum = number1 / number2
            resultDisplay.text = "$sum"
        }


    }
}