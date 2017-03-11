package com.pinyingapp.android.sinoenglish;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Simon on 2/1/2017.
 */

public class TutorialFragment extends Fragment {
    private LearnPagerAdapter mLearnPagerAdapter;
    private ViewPager mViewPager;
    private final int numOfFragments = 10;
    private Fragment[] fragments = new Fragment[numOfFragments];


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mLearnPagerAdapter =
                new LearnPagerAdapter(getChildFragmentManager());
        for (int i = 0; i < numOfFragments; i++) {
            fragments[i] = new SoundChartFragment();
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tutorial_fragment, container, false);

        mViewPager = (ViewPager) view.findViewById(R.id.tutorial_pager);
        mViewPager.setAdapter(mLearnPagerAdapter);
        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    public class LearnPagerAdapter extends FragmentPagerAdapter {

        public LearnPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragments[position];
        }

        @Override
        public int getCount() {
            return numOfFragments;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return String.valueOf(position + 1).concat("/" + String.valueOf(getCount()));
        }
    }
}