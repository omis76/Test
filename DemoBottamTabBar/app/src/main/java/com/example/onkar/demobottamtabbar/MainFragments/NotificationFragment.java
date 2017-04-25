package com.example.onkar.demobottamtabbar.MainFragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.onkar.demobottamtabbar.R;
import com.example.onkar.demobottamtabbar.UIHandler.SectionsPageAdapter;

import java.util.ArrayList;

/**
 * Created by onkar on 11/04/17.
 *
 */

public class NotificationFragment extends Fragment {
    private static final String TAG = "NotificationFragment";

    private OnFragmentInteractionListener mListener;
    private ViewPager viewPager;
    private SectionsPageAdapter pageAdapter;
    private ArrayList<String> list;

    public NotificationFragment() {
        list = new ArrayList<>();
    }

    public static NotificationFragment makeInstance() {
        NotificationFragment fragment;
        fragment = new NotificationFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (list.size() == 0) {
            final View view = inflater.inflate(R.layout.blank_fragment, container, false);
            return view;
        }
        else {
            final View view = inflater.inflate(R.layout.fragment_notification, container, false);
            return view;
        }
    }

    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(TAG,"onAttach");
        if (context instanceof NotificationFragment.OnFragmentInteractionListener) {
            mListener = (NotificationFragment.OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG,"onDetach");
        mListener = null;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG,"onCreate");
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }
}
