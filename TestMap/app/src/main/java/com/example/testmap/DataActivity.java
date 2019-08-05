package com.example.testmap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class DataActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        APIActivity getData = new  APIActivity();
        getData.execute("https://api.waqi.info/feed/beijing/" + "?token=dde58930fe41788aa121c1a177000a9b49af7ed9");
    }

}
