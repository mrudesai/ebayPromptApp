package com.example.ebayprompt;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class AndroidTabLayoutActivity extends TabActivity {

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         
        TabHost tabHost = getTabHost();
         
        // Tab for List All Pickups
        Intent intentList = new Intent(this, ListPickupActivity.class);
        TabSpec tabSpecList = tabHost.newTabSpec("List");
        tabSpecList.setIndicator("", getResources().getDrawable(R.drawable.ic_action_view_as_list));
        tabSpecList.setContent(intentList);
         
        // Tab for Display Pickup Codes
        Intent intentDisplay = new Intent(this, DisplayPickupCodeActivity.class);
        TabSpec tabSpecDisplay = tabHost.newTabSpec("Display")
        		.setIndicator("", getResources().getDrawable(R.drawable.ic_action_labels))
        		.setContent(intentDisplay);
         
        // Tab for Redeem Delivery Code
        Intent intentRedeem = new Intent(this, RedeemDeliveryCodeActivity.class);
        TabSpec tabSpecRedeem = tabHost.newTabSpec("Redeem")
        		.setIndicator("", getResources().getDrawable(R.drawable.ic_action_accept))
        		.setContent(intentRedeem);
         
        // Adding all TabSpec to TabHost
        tabHost.addTab(tabSpecList); // Adding List tab
        tabHost.addTab(tabSpecDisplay); // Adding Display tab
        tabHost.addTab(tabSpecRedeem); // Adding Delivery tab
	}    
}
