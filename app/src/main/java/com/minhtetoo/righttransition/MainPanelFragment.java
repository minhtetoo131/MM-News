package com.minhtetoo.righttransition;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by min on 11/29/2017.
 */

public class MainPanelFragment extends Fragment {


    private String[] listEntries = new String[] {"assssssssssssssssssssssssssssssssaaaaa" ,"bdddddddddddddddddddddddddddddddaaa" ,"aaaacdddddddddddddddddddddddddddddddddd"};
    private ListView listView = null;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.main_panel_fragment,container,false);

        listView = v.findViewById(R.id.list);




        return v;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        listView.setAdapter(new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,listEntries));

        super.onViewCreated(view, savedInstanceState);
    }
}
