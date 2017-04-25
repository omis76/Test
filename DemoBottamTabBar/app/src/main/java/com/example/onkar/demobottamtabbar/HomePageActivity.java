package com.example.onkar.demobottamtabbar;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;

import com.example.onkar.demobottamtabbar.MainFragments.AccountFragment;
import com.example.onkar.demobottamtabbar.MainFragments.HomeFragment;
import com.example.onkar.demobottamtabbar.MainFragments.NotificationFragment;
import com.example.onkar.demobottamtabbar.MainFragments.ShopFragment;

public class HomePageActivity extends AppCompatActivity implements ShopFragment.OnFragmentInteractionListener, AccountFragment.OnFragmentInteractionListener,NotificationFragment.OnFragmentInteractionListener,HomeFragment.OnFragmentInteractionListener {

    private static final String TAG = "HomePageActivity";

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment = null;
            switch (item.getItemId()) {

                case R.id.navigation_home:
                    fragment = HomeFragment.makeInstance();
                    FragmentTransaction fragmentTransaction0 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction0.replace(R.id.content,fragment);
                    fragmentTransaction0.commit();
                    return true;
                case R.id.navigation_shop:
                    fragment = ShopFragment.makeInstance();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.content,fragment);
                    fragmentTransaction.commit();
                    return true;

                case R.id.navigation_notifications:
                    fragment = NotificationFragment.makeInstance();
                    FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction1.replace(R.id.content,fragment);
                    fragmentTransaction1.commit();
                    return true;

                case R.id.navigation_account:
                    fragment = AccountFragment.makeInstance();
                    FragmentTransaction fragmentTransaction2 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction2.replace(R.id.content,fragment);
                    fragmentTransaction2.commit();
                    return true;
            }
            return true;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
        Log.d(TAG,String.valueOf(uri));
    }
}
