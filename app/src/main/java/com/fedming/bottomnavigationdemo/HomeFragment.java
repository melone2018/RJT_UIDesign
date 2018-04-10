package com.fedming.bottomnavigationdemo;

import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment{
    RecyclerView mRecyclerView;
    View mView;
    List<Product> mProductList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        mView = inflater.inflate(R.layout.fragment_home, container, false);
        mRecyclerView = mView.findViewById(R.id.homeRecycler);
        mProductList = new ArrayList<>();
        mProductList.add(new Product(R.drawable.woman1, "Damn Shoes", "12.39$"));
        mProductList.add(new Product(R.drawable.woman2, "Damn Shoes", "12.39$"));
        mProductList.add(new Product(R.drawable.woman3, "Damn Shoes", "12.39$"));

        LinearLayoutManager ms = new LinearLayoutManager(getContext());
        ms.setOrientation(LinearLayoutManager.HORIZONTAL);
        mRecyclerView.setLayoutManager(ms);
        mRecyclerView.setAdapter(new MyAdapter(mProductList));
        return mView;
    }

}
