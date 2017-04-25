package com.example.onkar.demobottamtabbar.UIHandler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.onkar.demobottamtabbar.R;

/**
 * Created by onkar on 13/04/17.
 *
 */

public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView item_name,item_price,item_type;
    public ImageView item_image;
    public ImageButton bookMark;

    public RecyclerViewHolders(View itemView) {
        super(itemView);
        item_name = (TextView) itemView.findViewById(R.id.item_name);
        item_price = (TextView) itemView.findViewById(R.id.item_price);
        item_type = (TextView) itemView.findViewById(R.id.item_type);
        item_image = (ImageView) itemView.findViewById(R.id.item_photo);
        bookMark = (ImageButton) itemView.findViewById(R.id.bookmark);
        bookMark.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bookmark:
                bookMark.setImageResource(R.drawable.added_bookmark);
                break;
        }
    }
}
