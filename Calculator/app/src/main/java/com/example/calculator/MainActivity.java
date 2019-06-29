package com.example.calculator;

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
        int result;

        switch(view.getId()){
            case R.id.btn0:
                int num0 = Integer.parseInt(btn0.getText().toString());
                textView.setText(num0 + "");
                break;
            case R.id.btn1:
                textView.setText(textView.getText().toString() + "1");
                break;
            case R.id.btn2:
                textView.setText(textView.getText().toString() + "2");
                break;
            case R.id.btn3:
                textView.setText(textView.getText().toString() + "3");
                break;
            case R.id.btn4:
                textView.setText(textView.getText().toString() + "4");
                break;
            case R.id.btn5:
                textView.setText(textView.getText().toString() + "5");
                break;
            case R.id.btn6:
                textView.setText(textView.getText().toString() + "6");
                break;
            case R.id.btn7:
                textView.setText(textView.getText().toString() + "7");
                break;
            case R.id.btn8:
                textView.setText(textView.getText().toString() + "8");
                break;
            case R.id.btn9:
                textView.setText(textView.getText().toString() + "9");
                break;
        }
    }

    public void onClickClear(View view) {
    }

    public void onClickEqual(View view) {
    }

    public void onClickOperator(View view) {
    }
}
