package com.example.swipeytabs;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;

public class SwipeyTabs extends FragmentActivity {

	private ViewPager mViewPager;
	private TabsAdapter mTabsAdapter;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipey_tabs);
        
        mViewPager = (ViewPager)findViewById(R.id.pager);
        
        final ActionBar bar = getActionBar();
        bar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        
        mTabsAdapter = new TabsAdapter(this, mViewPager);
        mTabsAdapter.addTab(bar.newTab().setText("Tab 1"),
        Tab1.class, null);
        mTabsAdapter.addTab(bar.newTab().setText("Tab 2"),
                Tab2.class, null);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_swipey_tabs, menu);
        return true;
    }
}
