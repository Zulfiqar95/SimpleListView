package com.example.zulfiqarmehmood.simplelistview;

import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] values={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.list);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,values);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String itemvalue = (String) listView.getItemAtPosition(position);
                Toast.makeText(MainActivity.this, "You have Selected"+itemvalue, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
