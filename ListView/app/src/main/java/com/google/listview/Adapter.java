package com.google.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

public class Adapter extends BaseAdapter {

    private Context context ;
    private int layout ;
    private List<ThietBi> arraylist;

    public Adapter(Context context, int layout, List<ThietBi> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
    }

    @Override
    public int getCount() {
        return arraylist.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout, null);
        ThietBi thietBi = arraylist.get(position);

        TextView textV1 = convertView.findViewById(R.id.name);
        TextView textV2 = convertView.findViewById(R.id.mota);
        TextView textV3 = convertView.findViewById(R.id.gia);
        ImageView imageV = convertView.findViewById(R.id.imageHinh);

        textV1.setText (thietBi.getTenmon()) ;
        textV2.setText (thietBi.getMota()) ;
        textV3.setText (thietBi.getGia()) ;
        imageV.setImageResource(thietBi.getHinh()) ;
        return convertView;
    }
}