package com.example.xgh.weatherforecast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private ArrayList<Fragment> fragments = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initfragment();

        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                if (position==1) {

                    BlankFragment fragment = new BlankFragment();
                    return fragment;
                }else {

                    BlankFragment2  fragment2 = new BlankFragment2();
                    return fragment2;
                }

            }
            @Override
            public int getCount() {
                return fragments.size();
            }
        });
    }
    private void initfragment() {
        fragments.add( new BlankFragment());
        fragments.add( new BlankFragment2());
    }
    @Override
    protected void onResume() {
        super.onResume();

    }
}
