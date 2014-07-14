package com.example.ebayprompt;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListPickupActivity extends ListActivity {
	
	static final String[] PICKUPS = new String[] { "PICKUP1", "PICKUP2", "PICKUP3" };
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_list_all_pickups);

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, PICKUPS);
		    
		setListAdapter(adapter);
		
		//getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
	}

	/*
	@Override
	
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main_activity_bar, menu);
	    return true;
	 }

	  @Override
	  public boolean onOptionsItemSelected(MenuItem item) {
	    Toast.makeText(this,
	        String.valueOf(getListView().getCheckedItemCount()),
	        Toast.LENGTH_LONG).show();
	    return true;
	  }
	*/
}
