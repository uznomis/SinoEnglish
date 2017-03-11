package com.pinyingapp.android.sinoenglish;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Learn fragment of the app.
 */

public class LearnFragment extends ListFragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("PinYing Video");
        arrayList.add("PinYing Video");
        arrayList.add("PinYing Video");
        setListAdapter(new ArrayAdapter<>(getContext(), R.layout.learn_item, R.id.learn_text, arrayList));
    }
}
