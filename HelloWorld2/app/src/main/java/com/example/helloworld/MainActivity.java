package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView toastCounter;
    Button countBtn;
    Button toastBtn;

    int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toastCounter = findViewById(R.id.textView);
        countBtn = findViewById(R.id.button3);
//        toastBtn = findViewById(R.id.button);
//
//        toastBtn.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                toastCounter.setText("0");
//                counter = 0;
//            }
//        });

        toastCounter.setText("0"); //sets number to 0

        countBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                counter = counter+1;
                toastCounter.setText(String.valueOf(counter));
            }
        });
    }

    public void showToast(View view) {
        String msg = "Hello Toast";
        Toast toast = Toast.makeText(
          this, msg, 10);
        toast.show();
    }
}
