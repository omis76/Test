package com.example.onkar.demobottamtabbar.Util;

import android.content.Context;
import android.view.View;
import android.widget.Button;

import com.example.onkar.demobottamtabbar.Interfaces.IncrementDecrementHandler;

/**
 * Created by onkar on 17/04/17.
 *
 */

public class QuantityIncrementDecrement {

    private int quantity =0;
    private Context context;

    public QuantityIncrementDecrement(Button incrementerId, Button decrementerId, final IncrementDecrementHandler handler, Context context) {
        this.context = context;
        incrementerId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity = quantity + 1;
                handler.changeText(quantity);
            }
        });

        decrementerId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity = quantity - 1;
                handler.changeText(quantity);
            }
        });
    }

}
