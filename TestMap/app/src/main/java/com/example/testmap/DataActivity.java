package com.example.testmap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class DataActivity extends AppCompatActivity {
    static TextView aqi;
    static String cityMenu;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
//        cityMenu = (menu)
//Idea: Use the menu options to retrieve the location and feed that in the citymenu variable
        aqi = (TextView) findViewById(R.id.aqi);

        APIActivity getData = new  APIActivity();
        getData.execute("https://api.waqi.info/feed/" + cityMenu + "/?token=dde58930fe41788aa121c1a177000a9b49af7ed9");

        final DatabaseHelper helper = new DatabaseHelper(this);
        final ArrayList array_list = helper.getAllInfo();

        name = findViewById(R.id.nameField);
        aqi = findViewById(R.id.aqi);
        gmt = findViewById(R.id.aqi);
        lat = findViewById(R.id.aqi);
        longitude = findViewById(R.id.aqi);
        co = findViewById(R.id.aqi);
        no2 = findViewById(R.id.aqi);
        o3 = findViewById(R.id.aqi);
        so2 = findViewById(R.id.aqi);
        listView = findViewById(R.id.listView);

        final ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, array_list);
        listView.setAdapter(arrayAdapter);

        findViewById(R.id.viewAllBtn).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                array_list.clear();
                array_list.addAll(helper.getAllInfo());
                arrayAdapter.notifyDataSetChanged();
                listView.invalidateViews();
                listView.refreshDrawableState();
            }
        });

//        findViewById(R.id.saveBtn).setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                if(!name.getText().toString().isEmpty()  && !aqi.getText().toString().isEmpty()){
//                    if (helper.insert(name.getText().toString(), aqi.getText().toString())){
//                        Toast.makeText(DataActivity.this, "Inserted", Toast.LENGTH_LONG).show();
//                    } else {
//                        Toast.makeText(DataActivity.this, "Not Inserted",  Toast.LENGTH_LONG).show();
//                    }
//                } else {
//                    name.setError("Enter  Name");
//                    aqi.setError("Enter AQI");
//                }
//            }
//        });
    }
}
