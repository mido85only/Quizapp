package com.example.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String answer4 = "Germany";
    String answer5 = "Football";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the check answer button is clicked.
     */

    public void checkAnswer(View view) {


        RadioButton radioBotton2 =  findViewById(R.id.radioButton2);
        boolean radioBotton2Chose = radioBotton2.isChecked();

        RadioButton radioButton6 = findViewById(R.id.radioButton6);
        boolean radioBotton6chose = radioButton6.isChecked();

        CheckBox checkBox1 = findViewById(R.id.checkBox1);
        boolean checkBox1Checked = checkBox1.isChecked();

        CheckBox checkBox2 = findViewById(R.id.checkBox2);
        boolean checkbox2Checked = checkBox2.isChecked();

        CheckBox checkBox3 = findViewById(R.id.checkBox3);
        boolean checkBox3Checked = checkBox3.isChecked();

        CheckBox checkBox4 = findViewById(R.id.checkbox4);
        boolean checkBox4Cheked = checkBox4.isChecked();

        EditText question4 = findViewById(R.id.question);
        String question4Answer = question4.getText().toString();

        EditText question5 = findViewById(R.id.question2);
        String question5Answer = question5.getText().toString();

        String toastMessage = correctAnswers(radioBotton2Chose,radioBotton6chose , checkBox1Checked, checkbox2Checked ,checkBox3Checked,checkBox4Cheked, question4Answer , question5Answer )+ " of 10";

        Toast.makeText(getApplicationContext(),toastMessage,Toast.LENGTH_LONG).show();



    }

        // collect the correct answers
    private int correctAnswers (boolean radioBotton2correct , boolean radioButton6correct , boolean checkbox1correct , boolean checkbox2correct ,boolean checkbox3wrong, boolean checkbox4wrong, String question4correct, String question5correct) {

        int answervalue =0;

        if (radioBotton2correct) {
            answervalue = answervalue+2;
        }

        if (radioButton6correct){
            answervalue = answervalue + 2;
        }

        if (question4correct.equalsIgnoreCase(answer4)) {
            answervalue = answervalue + 2;
        }

        if (question5correct.equalsIgnoreCase(answer5)) {
            answervalue = answervalue + 2;
        }

        if (checkbox1correct && checkbox2correct && !checkbox3wrong && !checkbox4wrong) {
        answervalue = answervalue + 2;
        }

        return answervalue;
    }


}
