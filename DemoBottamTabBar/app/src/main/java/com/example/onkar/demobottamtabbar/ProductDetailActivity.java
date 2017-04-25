package com.example.onkar.demobottamtabbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.TextView;

import com.example.onkar.demobottamtabbar.Adapters.SizeViewAdapter;
import com.example.onkar.demobottamtabbar.Interfaces.IncrementDecrementHandler;
import com.example.onkar.demobottamtabbar.Util.QuantityIncrementDecrement;

public class ProductDetailActivity extends AppCompatActivity {

    TextView quantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.sizeList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new SizeViewAdapter(this));


        quantity = (TextView) findViewById(R.id.quantity1);
        QuantityIncrementDecrement quantityIncrementDecrement = new QuantityIncrementDecrement((Button) findViewById(R.id.size1Increment), (Button) findViewById(R.id.size1decrement), new IncrementDecrementHandler() {
            @Override
            public int increment() {
                return 0;
            }

            @Override
            public int decrement() {
                return 0;
            }

            @Override
            public void changeText(int value) {
                quantity = (TextView) findViewById(R.id.quantity1);
                quantity.setText(String.valueOf(value));
            }
        }, this);

        QuantityIncrementDecrement quantityIncrementDecrement1 = new QuantityIncrementDecrement((Button) findViewById(R.id.size2Increment), (Button) findViewById(R.id.size2Decrement), new IncrementDecrementHandler() {
            @Override
            public int increment() {
                return 0;
            }

            @Override
            public int decrement() {
                return 0;
            }

            @Override
            public void changeText(int value) {
                quantity = (TextView) findViewById(R.id.size2Quantity);
                quantity.setText(String.valueOf(value));
            }
        }, this);


        QuantityIncrementDecrement quantityIncrementDecrement2 = new QuantityIncrementDecrement((Button) findViewById(R.id.size3Increment), (Button) findViewById(R.id.size3Decrement), new IncrementDecrementHandler() {
            @Override
            public int increment() {
                return 0;
            }

            @Override
            public int decrement() {
                return 0;
            }

            @Override
            public void changeText(int value) {
                quantity = (TextView) findViewById(R.id.size3Quantity);
                quantity.setText(String.valueOf(value));
            }
        }, this);
    }
}
