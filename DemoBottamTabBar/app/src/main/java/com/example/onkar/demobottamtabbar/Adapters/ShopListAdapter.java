package com.example.onkar.demobottamtabbar.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.onkar.demobottamtabbar.R;
import com.example.onkar.demobottamtabbar.UIHandler.RecyclerViewHolders;

import java.util.ArrayList;

/**
 * Created by onkar on 13/04/17.
 *
 */

public class ShopListAdapter extends RecyclerView.Adapter<RecyclerViewHolders> {

    private Context context;
    private ArrayList<String> list;
    private int type;

    public ShopListAdapter(Context context, ArrayList<String> list, int type){
        this.context = context;
        this.list = list;
        this.type = type;
    }

    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cell_shop_1, null);
        return new RecyclerViewHolders(layoutView);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolders holder, int position) {
        switch (type) {
            case 0:
                holder.item_image.setImageResource(R.drawable.demo_image);
                break;
            case 1:
                holder.item_image.setImageResource(R.drawable.demo_image_2);
                break;
            case 2:
                holder.item_image.setImageResource(R.drawable.demo_image_3);
                break;
        }
    }

    @Override
    public int getItemCount() {
        return 20;
    }
}
