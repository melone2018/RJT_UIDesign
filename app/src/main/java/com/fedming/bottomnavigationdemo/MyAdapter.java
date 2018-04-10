package com.fedming.bottomnavigationdemo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<Product> list;


    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView mImageView;

        public ViewHolder(View itemView, ImageView imageView, TextView textView1, TextView textView2) {
            super(itemView);
            mImageView = imageView;
            mTextView1 = textView1;
            mTextView2 = textView2;
        }

        public TextView mTextView1;
        public TextView mTextView2;

    }
    public MyAdapter(List<Product> list){
        this.list = list;
    }


    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list_recycler, parent, false);
        ImageView imgView = view.findViewById(R.id.imageSource);
        TextView txName = view.findViewById(R.id.TextViewProduct);
        TextView txPrice = view.findViewById(R.id.TextViewPrice);
        return new ViewHolder(view, imgView, txName, txPrice);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position){
        holder.mImageView.setImageResource(this.list.get(position).getId());
        holder.mTextView1.setText(this.list.get(position).getName());
        holder.mTextView2.setText(this.list.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        Log.d("RECYCLERREVIEW", Integer.toString(list.size()));
        return list.size();
    }
}
