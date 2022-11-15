package com.example.baikiemtra1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<CaSi> arrayList;
    CaSiAdapter adapter;
    String strUsername = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        listView = findViewById(R.id.lvcasi);
        arrayList = new ArrayList<>();
        arrayList.add(new CaSi("Sơn Tùng", "MTP", "Việt Nam", R.drawable.img));
        arrayList.add(new CaSi("Phương Ly", "Tình đầu quốc dân", "Việt Nam", R.drawable.img_3));
        arrayList.add(new CaSi("JussTaTee", "Rapper", "Việt Nam", R.drawable.img_2));
        arrayList.add(new CaSi("Đen Vâu", "Ông chú ", "Việt Nam", R.drawable.img_1));
        arrayList.add(new CaSi("Mỹ Tâm", "Mỹ nhân", "Việt Nam", R.drawable.img_3));
        adapter = new CaSiAdapter(MainActivity.this, R.layout.item_list, arrayList);
        listView.setAdapter(adapter);


    }
}