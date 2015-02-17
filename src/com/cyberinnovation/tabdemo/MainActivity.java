package com.cyberinnovation.tabdemo;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;

@SuppressWarnings({ "deprecation", "unused" })
public class MainActivity extends TabActivity implements OnTabChangeListener {

	TabHost mytabhost;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mytabhost = getTabHost();
		mytabhost.setOnTabChangedListener(this);

		TabHost.TabSpec sepc;
		Intent intent;

		intent = new Intent().setClass(this, DayTabActivity.class);
		sepc = mytabhost.newTabSpec("Day").setIndicator("").setContent(intent);
		mytabhost.addTab(sepc);

		intent = new Intent().setClass(this, YearTabActivity.class);
		sepc = mytabhost.newTabSpec("Year").setIndicator("").setContent(intent);
		mytabhost.addTab(sepc);

		intent = new Intent().setClass(this, MonthTabActivity.class);
		sepc = mytabhost.newTabSpec("Month").setIndicator("")
				.setContent(intent);

		mytabhost.addTab(sepc);

		mytabhost.getTabWidget().getChildAt(1)
				.setBackgroundResource(R.drawable.image_user);
		mytabhost.getTabWidget().getChildAt(2)
				.setBackgroundResource(R.drawable.image_user);

		mytabhost.getTabWidget().setCurrentTab(0);
		mytabhost.getTabWidget().getChildAt(0)
				.setBackgroundResource(R.drawable.ic_launcher);
	}

	@Override
	public void onTabChanged(String tabId) {
		// TODO Auto-generated method stub

		for (int i = 0; i < mytabhost.getTabWidget().getChildCount(); i++) {

			if (i == 0) {
				mytabhost.getTabWidget().getChildAt(i)
						.setBackgroundResource(R.drawable.ic_launcher);
			} else if (i == 1) {
				mytabhost.getTabWidget().getChildAt(i)
						.setBackgroundResource(R.drawable.ic_launcher);
			} else if (i == 2) {
				mytabhost.getTabWidget().getChildAt(i)
						.setBackgroundResource(R.drawable.ic_launcher);
			}
		}

		if (mytabhost.getCurrentTab() == 0)
			mytabhost.getTabWidget().getChildAt(mytabhost.getCurrentTab())
					.setBackgroundResource(R.drawable.ic_launcher);
		else if (mytabhost.getCurrentTab() == 1)
			mytabhost.getTabWidget().getChildAt(mytabhost.getCurrentTab())
					.setBackgroundResource(R.drawable.ic_launcher);
		else if (mytabhost.getCurrentTab() == 2)
			mytabhost.getTabWidget().getChildAt(mytabhost.getCurrentTab())
					.setBackgroundResource(R.drawable.ic_launcher);
	}
}
