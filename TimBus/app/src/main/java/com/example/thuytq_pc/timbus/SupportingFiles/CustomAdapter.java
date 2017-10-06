package com.example.thuytq_pc.timbus.SupportingFiles;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thuytq_pc.timbus.Model.BusCar;
import com.example.thuytq_pc.timbus.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by THUYTQ-PC on 04-Oct-17.
 */

public class CustomAdapter extends ArrayAdapter<BusCar> {
    Context context;
    ArrayList<BusCar> data = new ArrayList<BusCar>();

    public CustomAdapter(Context context, int resource, List<BusCar> object) {
        super(context, resource, object);
        this.context = context;
        this.data = new ArrayList<BusCar>(object);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View rowView = convertView;
        ViewHolder viewHolder;
        if(rowView == null) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.custom_cell, null);
            viewHolder = new ViewHolder();
            if (rowView == null) {
                viewHolder.lblName = (TextView) rowView.findViewById(R.id.lblName);
                viewHolder.lblChuyenDi = (TextView) rowView.findViewById(R.id.lblChuyenDi);
                viewHolder.lblChuyenDen = (TextView) rowView.findViewById(R.id.lblChuyenDen);
                viewHolder.imgAvatar = (ImageView) rowView.findViewById(R.id.imgAvatar);
                viewHolder.btnFav = (ImageButton) rowView.findViewById(R.id.btnFav);
                rowView.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) convertView.getTag();
            }
            BusCar busCar = data.get(position);
            viewHolder.lblName.setText(busCar.getName());
            viewHolder.lblChuyenDi.setText((CharSequence) busCar.getChuyenDi());
            viewHolder.lblChuyenDen.setText((CharSequence) busCar.getChuyenDen());
            viewHolder.imgAvatar.setImageResource(busCar.getImage());
        }
        return super.getView(position, convertView, parent);
    }
    static class ViewHolder {
        TextView lblName;
        TextView lblChuyenDi;
        TextView lblChuyenDen;
        ImageView imgAvatar;
        ImageButton btnFav;
    }
}