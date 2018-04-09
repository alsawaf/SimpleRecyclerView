package com.example.android.testrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by win8 on 4/9/2018.
 */

public class CustomAdapter extends RecyclerView.Adapter {

    ArrayList<String> CustomAdapterArrayList;
    Context context;

    public CustomAdapter(MainActivity mainActivity, ArrayList<String> myArrayList) {

        this.CustomAdapterArrayList = myArrayList;
        this.context = mainActivity;

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View myView = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemview,parent,false);

        MyViewHolder VH = new MyViewHolder(myView);

        return VH;

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }



    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.name.setText(CustomAdapterArrayList.get(position));

    }

    @Override
    public int getItemCount() {
        return CustomAdapterArrayList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name;// init the item view's
        public MyViewHolder(View itemView) {
            super(itemView);
            // get the reference of item view's
            name = (TextView) itemView.findViewById(R.id.ItemViewText);
        }
    }
}
