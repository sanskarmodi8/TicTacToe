package com.example.tictactoe

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var flag = 0
    var winner = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rstBtn.setOnClickListener {
            flag = 0
            winner = ""
            txtView.text = "X's Turn"
            btn1.text = ""
            btn2.text = ""
            btn3.text = ""
            btn4.text = ""
            btn5.text = ""
            btn6.text = ""
            btn7.text = ""
            btn8.text = ""
            btn9.text = ""

            btn1.setBackgroundColor(Color.parseColor("#FFBB86FC"))
            btn2.setBackgroundColor(Color.parseColor("#FFBB86FC"))
            btn3.setBackgroundColor(Color.parseColor("#FFBB86FC"))
            btn4.setBackgroundColor(Color.parseColor("#FFBB86FC"))
            btn5.setBackgroundColor(Color.parseColor("#FFBB86FC"))
            btn6.setBackgroundColor(Color.parseColor("#FFBB86FC"))
            btn7.setBackgroundColor(Color.parseColor("#FFBB86FC"))
            btn8.setBackgroundColor(Color.parseColor("#FFBB86FC"))
            btn9.setBackgroundColor(Color.parseColor("#FFBB86FC"))
        }


    }

    fun checkWinner() {
        if (flag % 2 == 0) {
            txtView.text = "O Won!"
            winner = "0"


        } else {
            txtView.text = "X Won!"
            winner = "X"

        }
    }

    fun checkWin(): Boolean {
        if ((btn1.text == btn2.text) && (btn2.text == btn3.text) && btn1.text != "") {
            checkWinner()
            btn1.setBackgroundColor(Color.parseColor("#FF3700B3"))
            btn2.setBackgroundColor(Color.parseColor("#FF3700B3"))
            btn3.setBackgroundColor(Color.parseColor("#FF3700B3"))
            flag = 0
            return true
        } else if ((btn4.text == btn5.text) && (btn5.text == btn6.text) && btn5.text != "") {
            checkWinner()
            btn4.setBackgroundColor(Color.parseColor("#FF3700B3"))
            btn5.setBackgroundColor(Color.parseColor("#FF3700B3"))
            btn6.setBackgroundColor(Color.parseColor("#FF3700B3"))
            flag = 0
            return true
        } else if ((btn7.text == btn8.text) && (btn8.text == btn9.text) && btn8.text != "") {
            checkWinner()
            btn7.setBackgroundColor(Color.parseColor("#FF3700B3"))
            btn8.setBackgroundColor(Color.parseColor("#FF3700B3"))
            btn9.setBackgroundColor(Color.parseColor("#FF3700B3"))
            flag = 0
            return true
        } else if ((btn1.text == btn4.text) && (btn4.text == btn7.text) && btn1.text != "") {
            checkWinner()
            btn1.setBackgroundColor(Color.parseColor("#FF3700B3"))
            btn4.setBackgroundColor(Color.parseColor("#FF3700B3"))
            btn7.setBackgroundColor(Color.parseColor("#FF3700B3"))
            flag = 0
            return true
        } else if ((btn2.text == btn5.text) && (btn5.text == btn8.text) && btn5.text != "") {
            checkWinner()
            btn2.setBackgroundColor(Color.parseColor("#FF3700B3"))
            btn5.setBackgroundColor(Color.parseColor("#FF3700B3"))
            btn8.setBackgroundColor(Color.parseColor("#FF3700B3"))
            flag = 0
            return true
        } else if ((btn3.text == btn6.text) && (btn6.text == btn9.text) && btn6.text != "") {
            checkWinner()
            btn3.setBackgroundColor(Color.parseColor("#FF3700B3"))
            btn6.setBackgroundColor(Color.parseColor("#FF3700B3"))
            btn9.setBackgroundColor(Color.parseColor("#FF3700B3"))
            flag = 0
            return true
        } else if ((btn1.text == btn5.text) && (btn5.text == btn9.text) && btn5.text != "") {
            checkWinner()
            btn1.setBackgroundColor(Color.parseColor("#FF3700B3"))
            btn5.setBackgroundColor(Color.parseColor("#FF3700B3"))
            btn9.setBackgroundColor(Color.parseColor("#FF3700B3"))
            flag = 0
            return true
        } else if ((btn3.text == btn5.text) && (btn5.text == btn7.text) && btn5.text != "") {
            checkWinner()
            btn3.setBackgroundColor(Color.parseColor("#FF3700B3"))
            btn5.setBackgroundColor(Color.parseColor("#FF3700B3"))
            btn7.setBackgroundColor(Color.parseColor("#FF3700B3"))
            flag = 0
            return true
        } else if (btn1.text != "" && btn2.text != "" && btn3.text != "" && btn4.text != "" && btn5.text != "" && btn6.text != "" && btn7.text != "" && btn8.text != "" && btn9.text != "" && winner == "") {
            txtView.text = "Match Draw!"
            flag = 0
            return true
        }
        return false
    }

    fun click(view: View) {
        val btnCurrent: Button = view as Button
        if (btnCurrent.text == "" && winner == "") {
            flag++


            if (flag % 2 == 0) {
                btnCurrent.text = "O"

            } else {
                btnCurrent.text = "X"
            }
            if (checkWin()) {

                return
            } else {
                txtView.text = when (flag % 2) {
                    0 -> "X's Turn"
                    else -> "O's Turn"

                }

            }

        }


    }
}
