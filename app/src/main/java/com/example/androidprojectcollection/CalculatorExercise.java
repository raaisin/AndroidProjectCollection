package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class CalculatorExercise extends AppCompatActivity implements View.OnClickListener{


    Button clear, paren, percent, back, point;
    Button zero, one, two, three, four, five, six, seven, eight, nine;
    Button divide, multiply, minus, plus, equals;
    TextView textResult, TextInput;
    boolean decimalAdded = false;



    CalcProcess calcProcess = new CalcProcess();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_exercise);

        TextInput = findViewById(R.id.textInput);

         zero = findViewById(R.id.btnZero);
         one = findViewById(R.id.btnOne);
         two = findViewById(R.id.btnTwo);
         three = findViewById(R.id.btnThree);
         four = findViewById(R.id.btnFour);
         five = findViewById(R.id.btnFive);
         six = findViewById(R.id.btnSix);
         seven = findViewById(R.id.btnSeven);
         eight = findViewById(R.id.btnEight);
         nine = findViewById(R.id.btnNine);

         clear = findViewById(R.id.btnClear);
         paren = findViewById(R.id.btnParen);
         percent = findViewById(R.id.btnPercent);
         back = findViewById(R.id.btnBack);
         point = findViewById(R.id.btnPoint);
         divide = findViewById(R.id.btnDivision);
         multiply = findViewById(R.id.btnMultiply);
         minus = findViewById(R.id.btnMinus);
         plus = findViewById(R.id.btnPlus);
         equals = findViewById(R.id.btnEquals);
        setClickListeners();
    }

        private void setClickListeners() {
            //  btn_.setOnClickListener(this);
            zero.setOnClickListener(this);
            one.setOnClickListener(this);
            two.setOnClickListener(this);
            three.setOnClickListener(this);
            four.setOnClickListener( this);
            five.setOnClickListener( this);
            six.setOnClickListener( this);
            seven.setOnClickListener( this);
            eight.setOnClickListener(this);
            nine.setOnClickListener( this);

            clear.setOnClickListener(this);
            paren.setOnClickListener(this);
            percent.setOnClickListener(this);
            back.setOnClickListener(this);
            point.setOnClickListener(this);
            divide.setOnClickListener(this);
            multiply.setOnClickListener( this);
            minus.setOnClickListener(this);
            plus.setOnClickListener(this);
            equals.setOnClickListener(this);

        }


    @Override
    public void onClick(View view) {
        Button button = (Button) view;
        String buttonText = button.getText().toString();
        String dataToCalculate = TextInput.getText().toString();



        switch (buttonText) {
            case "Clear":
                TextInput.setText("");
                textResult.setText("0");
                decimalAdded = false;
                break;
            case "=":
                double result = calcProcess.evaluateExpression(dataToCalculate);
                System.out.println(result);
                //   (dataToCalculate);
                TextInput.setText(String.valueOf(result));
                textResult.setText(String.valueOf(result));
                break;
            case "C":
                if (!dataToCalculate.isEmpty()) {
                    dataToCalculate = dataToCalculate.substring(0, dataToCalculate.length() - 1);
                }else {
                    dataToCalculate=dataToCalculate+buttonText;
                }
                TextInput.setText(dataToCalculate);

                break;
            case ".":
                if (!decimalAdded) {
                    TextInput.append(buttonText);
                    decimalAdded = true;
                }
                break;
            case "+":
                //calcProcess.
            case "-":
            case "÷":
            case "×":
                decimalAdded = false;
                TextInput.append(buttonText);
                break;

            default:
                TextInput.append(buttonText);
                break;


        }
    }
};


