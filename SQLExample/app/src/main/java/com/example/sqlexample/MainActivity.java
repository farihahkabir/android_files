package com.example.sqlexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btnSave, btnRefresh;
    EditText enterName, enterSalary;
    private ListView listView;

    @Override
    protected void onCreate(Bundle readInstanceState) {
        super.onCreate(readInstanceState);
        setContentView(R.layout.activity_main);
        final DatabaseHelper helper = new DatabaseHelper(this);
        final ArrayList array_list = helper.getAllContacts();
        enterName = findViewById(R.id.enterName);
        enterSalary = findViewById(R.id.enterSalary);
        listView = findViewById(R.id.listView);
        final ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, array_list);
        listView.setAdapter(arrayAdapter);
        findViewById(R.id.btnRefresh).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                array_list.clear();
                array_list.addAll(helper.getAllContacts());
                arrayAdapter.notifyDataSetChanged();
                listView.invalidateViews();
                listView.refreshDrawableState();
            }
        });

        findViewById(R.id.btnSave).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(!enterName.getText().toString().isEmpty() && !enterSalary.getText().toString().isEmpty()){
                    if(helper.insert(enterName.getText().toString(), enterSalary.getText().toString())){
                        Toast.makeText(MainActivity.this, "Inserted", Toast.LENGTH_LONG).show();
                    }
                    else{
                        Toast.makeText(MainActivity.this, "NOT Inserted", Toast.LENGTH_LONG).show();
                    }
                }
                else{
                    enterName.setError("Enter NAME");
                    enterSalary.setError("Enter SALARY");
                }
            }
        });
    }
}
