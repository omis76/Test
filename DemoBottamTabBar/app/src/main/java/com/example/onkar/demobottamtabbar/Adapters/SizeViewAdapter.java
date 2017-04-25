package com.example.onkar.demobottamtabbar.Adapters;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;

import com.example.onkar.demobottamtabbar.UIHandler.SizeListViewHolder;

import java.util.ArrayList;

/**
 * Created by onkar on 21/04/17.
 *
 */

public class SizeViewAdapter extends RecyclerView.Adapter<SizeListViewHolder> {

    private Context context;
    private TextView[] textViewSet;
    private String[] dataArray = {"Title", "Name 2", "Name 3", "Name 4", "Name 5"};

    public SizeViewAdapter(Context context) {
        this.context = context;
    }

    @Override
    public SizeListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LinearLayout rowCell = new LinearLayout(context);

        textViewSet = new TextView[4];

        rowCell.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        rowCell.setOrientation(LinearLayout.HORIZONTAL);
        rowCell.setGravity(Gravity.CENTER);
        rowCell.setWeightSum(textViewSet.length);
        rowCell.setPadding(0,16,0,16);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(0, LayoutParams.WRAP_CONTENT);
        params.gravity = Gravity.CENTER;
        params.weight = 1;

        for (int i = 0; i < textViewSet.length; i++) {

            textViewSet[i] = new TextView(context);
            textViewSet[i].setLayoutParams(params);
            textViewSet[i].setGravity(Gravity.CENTER);
            rowCell.addView(textViewSet[i]);
        }

        return  new SizeListViewHolder(rowCell, textViewSet.length);
    }

    @Override
    public void onBindViewHolder(SizeListViewHolder holder, int position) {

        for (int i = 0; i < holder.textViewSet.length ; i++){
            if (position == 0) {
                holder.textViewSet[i].setTypeface(null, Typeface.BOLD);
                holder.textViewSet[i].setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
                holder.textViewSet[i].setBackgroundColor(Color.DKGRAY);
                holder.textViewSet[i].setTextColor(Color.WHITE);
            }
            holder.textViewSet[i].setText(dataArray[position]);
        }

    }

    @Override
    public int getItemCount() {
        return dataArray.length;
    }
}
