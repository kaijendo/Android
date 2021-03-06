package com.example.thuytq_pc.timbus.SupportingFiles;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thuytq_pc.timbus.Model.BusCar;
import com.example.thuytq_pc.timbus.Model.DataService;
import com.example.thuytq_pc.timbus.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by THUYTQ-PC on 04-Oct-17.
 */

public class CustomAdapter extends BaseAdapter {
    Context context;
    ArrayList<BusCar> data = new ArrayList<BusCar>();
    public CustomAdapter(Context context, int resource, List<BusCar> object) {
        //super(context, resource, object);
        this.context = context;
        this.data = DataService.ourInstance.busCars;
    }

    @Override
    public int getCount() {
        return this.data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View rowView = convertView;
        ViewHolder viewHolder;

        if(rowView == null) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.custom_cell, parent, false);
            viewHolder = new ViewHolder();

                viewHolder.lblName = (TextView) rowView.findViewById(R.id.lblName);
                viewHolder.lblChuyenDi = (TextView) rowView.findViewById(R.id.lblChuyenDi);
                viewHolder.lblChuyenDen = (TextView) rowView.findViewById(R.id.lblChuyenDen);
                viewHolder.imgAvatar = (ImageView) rowView.findViewById(R.id.imgAvatar);
                viewHolder.btnFav = (ImageButton) rowView.findViewById(R.id.btnFav);
                rowView.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) rowView.getTag();
            }

        BusCar busCar = data.get(position);
        viewHolder.lblName.setText(busCar.getName());
        viewHolder.lblChuyenDen.setText(busCar.getChuyenDen());
        viewHolder.lblChuyenDi.setText(busCar.getChuyenDi());
        return rowView;
    }
    static class ViewHolder {
        TextView lblName;
        TextView lblChuyenDi;
        TextView lblChuyenDen;
        ImageView imgAvatar;
        ImageButton btnFav;
    }
}