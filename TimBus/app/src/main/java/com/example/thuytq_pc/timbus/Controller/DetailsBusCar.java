package com.example.thuytq_pc.timbus.Controller;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thuytq_pc.timbus.R;

/**
 * Created by THUYTQ-PC on 08-Oct-17.
 */

public class DetailsBusCar extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);
    }
    private void initView() {
        final ImageView imgAvatar = (ImageView) findViewById(R.id.imgAvatar);
        final TextView lblName = (TextView) findViewById(R.id.lblName);
        final TextView lblChuyenDi = (TextView) findViewById(R.id.lblChuyenDi);
        final TextView lblChuyenDen = (TextView) findViewById(R.id.lblChuyenDen);
        Button btnUpdate = (Button) findViewById(R.id.btnUpdate);

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });
    }
    }
