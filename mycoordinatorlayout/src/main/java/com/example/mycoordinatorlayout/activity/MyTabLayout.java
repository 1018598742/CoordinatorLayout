package com.example.mycoordinatorlayout.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.mycoordinatorlayout.other.MyFragment;
import com.example.mycoordinatorlayout.R;

/**
 * 里面使用的可移动的布局不能是listview(因为没有实现NestedScrollingChild接口)
 */
public class MyTabLayout extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_tab_layout);
        toolbar = ((Toolbar) findViewById(R.id.toolbar));
//        setSupportActionBar(toolbar);
        toolbar.setTitle("标题");
        tabLayout = ((TabLayout) findViewById(R.id.tabs));
        viewPager = ((ViewPager) findViewById(R.id.viewPager));
        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                switch (position){
                    case 0:
                        return new MyFragment();
                    default:
                        return new MyFragment();
                }
            }

            @Override
            public int getCount() {
                return 4;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                int title = position + 1;
                return "第"+title+"页";
            }
        });
        tabLayout.setupWithViewPager(viewPager);
    }
}
