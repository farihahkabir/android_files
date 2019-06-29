package com.example.calc2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btnClear;
    Button btnEqual;
    Button btnPlus;
    Button btnMinus;
    Button btnMult;
    Button btnDiv;
    float result;
    float firstNum;
    float secondNum;
    String operator;
    String temp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btnClear = findViewById(R.id.btnClear);
        btnEqual = findViewById(R.id.btnEqual);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMult = findViewById(R.id.btnMult);
        btnDiv = findViewById(R.id.btnDiv);
    }

    public void onClickNumber(View view) {
        temp = textView.getText().toString();

        switch(view.getId()) {
            case R.id.btn0:
                temp = temp + (btn0.getText().toString());

                textView.setText(temp);
                break;
            case R.id.btn1:
                temp = temp + (btn1.getText().toString());
                textView.setText(temp);
                break;
            case R.id.btn2:
                temp = temp + (btn2.getText().toString());
                textView.setText(temp);
                break;
            case R.id.btn3:
                temp = temp + (btn3.getText().toString());
                textView.setText(temp);
                break;
            case R.id.btn4:
                temp = temp + (btn4.getText().toString());
                textView.setText(temp);
                break;
            case R.id.btn5:
                temp = temp + (btn5.getText().toString());
                textView.setText(temp);
                break;
            case R.id.btn6:
                temp = temp + (btn6.getText().toString());
                textView.setText(temp);
                break;
            case R.id.btn7:
                int num7 = Integer.parseInt(btn7.getText().toString());
                textView.setText(temp + num7 + "");
                break;
            case R.id.btn8:
                temp = temp + (btn8.getText().toString());
                textView.setText(temp);
                break;
            case R.id.btn9:
                temp = temp + (btn9.getText().toString());
                textView.setText(temp);
                break;
            case R.id.btnClear:
                temp = "0";
                textView.setText(temp);
                break;
        }

    }

//    public void onClickClear(View view) {
//        int result = Integer.parseInt(textView.getText().toString());
//        if(view.getId() == R.id.btnClear){
//            result = 0;
//            textView.setText(result + "");
//        }
//    }

    public void onClickOperator(View view) {
        switch (view.getId()){
            case R.id.btnPlus:
                operator = "+";
                firstNum = Integer.parseInt(temp);
                temp = "";
                textView.setText(temp);
                break;
            case R.id.btnMinus:
                operator = "-";
                firstNum = Integer.parseInt(temp);
                temp = "";
                textView.setText(temp);
                break;
            case R.id.btnMult:
                operator = "*";
                firstNum = Integer.parseInt(temp);
                temp = "";
                textView.setText(temp);
                break;
            case R.id.btnDiv:
                operator = "/";
                firstNum = Integer.parseInt(temp);
                temp = "";
                textView.setText(temp);
                break;

        }
    }

    public void onClickEqual(View view) {
        if(view.getId() == R.id.btnEqual){
            secondNum = Integer.parseInt(temp);
            if(operator == "+"){
                result = firstNum + secondNum;
                textView.setText(result + "");
            }
            else if(operator == "-"){
                result = firstNum - secondNum;
                textView.setText(result + "");
            }
            else if(operator == "*"){
                result = firstNum * secondNum;
                textView.setText(result + "");
            }
            else if(operator == "/"){
                result = firstNum / secondNum;
                textView.setText(result + "");
            }
        }
    }

}
