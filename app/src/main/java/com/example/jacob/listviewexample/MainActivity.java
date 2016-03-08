package com.example.jacob.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.listView);
        final String arrayList[]={"Rahim","karim","Ram","Mortaza","Tamim","sakib","Alamin","musfiq","mostafiz","Hasina","Kheleda","Raza","Goja"};
        Arrays.sort(arrayList);
        //ArrayAdapter <String>>adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,arrayList);
        //custom layout
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,R.layout.row_layout,arrayList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               String clickedItem=arrayList[position];
                Toast.makeText(getApplicationContext(),clickedItem,Toast.LENGTH_LONG).show();

            }
        });

    }
}
