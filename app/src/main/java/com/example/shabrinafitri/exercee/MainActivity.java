package com.example.shabrinafitri.exercee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    protected ListView lv;
    protected ListAdapter adapter;
    SimpleAdapter Adapter;
    HashMap<String, String> map;
    ArrayList<HashMap<String, String>> myList;
    String[] Ing;
    String[] Gbr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Motorcycle");
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.lv);
        Ing = new String[]{"Honda CBR 150","Honda CBR 150R","Honda CBR 250","Honda CBR 600RR","Honda CBR 1000RR"};
        Gbr = new String[] {Integer.toString(R.drawable.cbr_150),
                Integer.toString(R.drawable.cbr_150r),
                Integer.toString(R.drawable.cbr_250),
                Integer.toString(R.drawable.cbr_600rr),
                Integer.toString(R.drawable.cbr_1000rr),
        };
        myList = new ArrayList<HashMap<String, String>>();
        for (int i = 0; i < Ing.length; i++){
            map = new HashMap<String, String>();
            map.put("list-ing", Ing[i]);
            map.put("gbr", Gbr[i]);
            myList.add(map);
        }
        Adapter = new SimpleAdapter(this, myList, R.layout.layout_isi_lv,
                new String[]{"list-ing","gbr"},
                new int[] {R.id.tv, R.id.imgv}
        );
        lv.setAdapter(Adapter);
    }
}
