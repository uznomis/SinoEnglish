package com.pinyingapp.android.sinoenglish;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by Simon Zu on 2/1/2017.
 */

public class DictionaryFragment extends ListFragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("orange");
        setListAdapter(new ArrayAdapter<>(getContext(), R.layout.drawer_list_item, arrayList));
    }
}
