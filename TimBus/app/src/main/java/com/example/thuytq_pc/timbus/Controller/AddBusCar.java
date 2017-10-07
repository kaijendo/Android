package com.example.thuytq_pc.timbus.Controller;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.thuytq_pc.timbus.Model.BusCar;
import com.example.thuytq_pc.timbus.Model.DataService;
import com.example.thuytq_pc.timbus.R;

/**
 * Created by THUYTQ-PC on 06-Oct-17.
 */

public class AddBusCar extends Activity {

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add);
        initView();
    }
    private void initView() {
        final ImageView imgAvatar  = (ImageView) findViewById(R.id.imgAvatar);
        final EditText txtName = (EditText) findViewById(R.id.txtName);
        final EditText txtChuyenDi = (EditText) findViewById(R.id.txtChuyenDi);
        final EditText txtChuyenDen = (EditText) findViewById(R.id.txtChuyenDen);
        Button btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BusCar newBusCar = new BusCar(txtName.getText().toString(),txtChuyenDen.getText().toString(), txtChuyenDi.getText().toString());
                DataService.ourInstance.addNew(newBusCar);
            }
        });

    }
}
