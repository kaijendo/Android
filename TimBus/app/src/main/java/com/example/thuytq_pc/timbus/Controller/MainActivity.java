package com.example.thuytq_pc.timbus.Controller;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.thuytq_pc.timbus.Model.BusCar;
import com.example.thuytq_pc.timbus.R;
import com.example.thuytq_pc.timbus.SupportingFiles.CustomAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<BusCar> arrBus = new ArrayList<BusCar>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fakeData();
        ListView listView = (ListView) findViewById(R.id.tblBus);
        if (arrBus.isEmpty()) {
            listView.setVisibility(View.GONE);

        }
        CustomAdapter customAdapter = new CustomAdapter(MainActivity.this, R.layout.custom_cell, arrBus);
        listView.setAdapter(customAdapter);


    }

    void fakeData() {

        ArrayList<String> diemDen = new ArrayList<String>();
        ArrayList<String> diemDi = new ArrayList<String>();
        for (int item = 0; item < 10; item++) {
            String name = "Chuyen xe " + item;
            diemDen.add("Diem den" + item);
            diemDi.add("Diem di" + item);
            boolean status = false;
            //String image = "@res/drawable/image" + item;
            BusCar newBusCar = new BusCar(name, status, diemDen, diemDi);
            arrBus.add(newBusCar);
        }
    }
}
