package com.example.onkar.demobottamtabbar.UIHandler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.onkar.demobottamtabbar.Adapters.SizeViewAdapter;

/**
 * Created by onkar on 21/04/17.
 *
 */

public class SizeListViewHolder extends RecyclerView.ViewHolder {

    public TextView[] textViewSet;

    public SizeListViewHolder(View itemView, int size) {
        super(itemView);
        textViewSet = new TextView[size];

        ViewGroup viewGroup = (ViewGroup) itemView;
        for (int i =0; i < textViewSet.length; i++) {
            textViewSet[i] = (TextView)viewGroup.getChildAt(i);
        }
    }

}
