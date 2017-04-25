package com.example.onkar.demobottamtabbar.UIHandler;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.onkar.demobottamtabbar.Adapters.ShopListAdapter;
import com.example.onkar.demobottamtabbar.R;

import java.util.ArrayList;

/**
 * Created by onkar on 11/04/17.
 *
 */

public class PlaceHolderFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";
    public PlaceHolderFragment() {

    }

    public static PlaceHolderFragment newInstance(int sectionNumber) {
        PlaceHolderFragment fragment = new PlaceHolderFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_shop_type,container,false);
        RecyclerView list = (RecyclerView) rootView.findViewById(R.id.list);
        list.setLayoutManager(new GridLayoutManager(getActivity(),2));
        ShopListAdapter adapter;
        switch (getArguments().getInt(ARG_SECTION_NUMBER)) {
            case 1:
                adapter = new ShopListAdapter(getActivity(),new ArrayList<String>(),0);
                list.setAdapter(adapter);
                break;
            case 2:
                adapter = new ShopListAdapter(getActivity(),new ArrayList<String>(),1);
                list.setAdapter(adapter);
                break;
            case 3:
                adapter = new ShopListAdapter(getActivity(),new ArrayList<String>(),2);
                list.setAdapter(adapter);
                break;
            default:
                return rootView;
        }
        return rootView;
    }

}
