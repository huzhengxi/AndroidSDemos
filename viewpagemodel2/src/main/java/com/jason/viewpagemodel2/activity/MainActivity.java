package com.jason.viewpagemodel2.activity;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.androidkun.xtablayout.XTabLayout;
import com.jason.viewpagemodel2.R;
import com.jason.viewpagemodel2.fragment.CJFragment;
import com.jason.viewpagemodel2.fragment.JSFragment;
import com.jason.viewpagemodel2.fragment.KJFragment;
import com.jason.viewpagemodel2.fragment.SPFragment;
import com.jason.viewpagemodel2.fragment.TYFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {
    XTabLayout tabLayout;
    ViewPager2 viewPager;
    List<Fragment> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tab);
        tabLayout.addTab(tabLayout.newTab().setText("财经"));
        tabLayout.addTab(tabLayout.newTab().setText("军事"));
        tabLayout.addTab(tabLayout.newTab().setText("科技"));
        tabLayout.addTab(tabLayout.newTab().setText("体育"));
        tabLayout.addTab(tabLayout.newTab().setText("视频"));

        viewPager = findViewById(R.id.viewpager);

        list.add(new CJFragment());
        list.add(new JSFragment());
        list.add(new TYFragment());
        list.add(new SPFragment());
        list.add(new KJFragment());

        tabLayout.setOnTabSelectedListener(new XTabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(XTabLayout.Tab tab) {
                int position = tab.getPosition();
                viewPager.setCurrentItem(position);
            }

            @Override
            public void onTabUnselected(XTabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(XTabLayout.Tab tab) {

            }
        });

        viewPager.setAdapter(new FragmentStateAdapter( this) {
            @NonNull
            @Override
            public Fragment createFragment(int position) {
                return list.get(position);
            }

            @Override
            public int getItemCount() {
                return list.size();
            }
        });

        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tabLayout.getTabAt(position).select();
            }
        });
    }
}