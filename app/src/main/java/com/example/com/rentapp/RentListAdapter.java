package com.example.com.rentapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by com on 2018-11-11.
 */

public class RentListAdapter extends BaseAdapter{
    private Context mContext;
    private int mResource;
    private ArrayList<Rentlistobject> mItems = new ArrayList<Rentlistobject>();

    public RentListAdapter(Context context, int resource, ArrayList<Rentlistobject> items) {
        mContext = context;
        mItems = items;
        mResource = resource;
    }
    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public Object getItem(int position) {
        return mItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(mResource, parent,false);
        }
        TextView name = (TextView) convertView.findViewById(R.id.rentname);
        String infos = mItems.get(position).listname;
        name.setText(infos);
        return convertView;
    }
}
class Rentlistobject{
    String listname;
    String numlist;
    Rentlistobject(String a,String b){
        listname=a;
        numlist=b;
    }

}
