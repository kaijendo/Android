package com.example.thuytq_pc.timbus.Controller;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.thuytq_pc.timbus.Model.BusCar;
import com.example.thuytq_pc.timbus.Model.DataService;
import com.example.thuytq_pc.timbus.R;
import com.example.thuytq_pc.timbus.SupportingFiles.CustomAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    /// MARK: - Properties
    /// Override function init with custom adapter.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ListView listView = (ListView) findViewById(R.id.tblBus);
        fakeData();
        CustomAdapter customAdapter = new CustomAdapter(MainActivity.this, R.layout.custom_cell, DataService.ourInstance.busCars);
        listView.setAdapter(customAdapter);
        if (DataService.ourInstance.busCars.isEmpty()) {
        }
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "You Clicked at ",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }


    /// Override menu layout with item
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.header_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.btnAdd:
                Intent intent = new Intent(this, AddBusCar.class);
                startActivity(intent);
                break;
            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }


    /// MARK: - Private Function.
    private void fakeData() {
        for (int item = 1; item <= 10; item++) {
            String name = "Chuyen xe " + item;
            String diemDen = "Diem den" + item;
            String diemDi = "Diem di" + item;
            boolean status = false;
            //String image = "@res/drawable/image" + item;
            BusCar newBusCar = new BusCar(name, diemDen, diemDi);
            DataService.ourInstance.busCars.add(newBusCar);
        }
    }
}
