package com.example.pmalviya.actionbardemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class ActionBarDemoActivity extends Activity {

	//public final String DEFAULTDOLLAR = "defaultDollar";
	//public String NOTE = "defaultNode";
	//public String WHO ="Who";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_bar_demo);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.action_bar_demo, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
//        if (id == R.id.action_settings) {
//            return true;
//        }
        return super.onOptionsItemSelected(item);
    }
    
    public void onCreateItem(MenuItem mi){
		Intent i = new Intent(this, CreationActivity.class);
		i.putExtra("defaultDollar", 50);
		i.putExtra("defaultNode", "Food");
		i.putExtra("Who", "dxvgjh");
		startActivityForResult(i, 50);
	}
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
    	if(requestCode ==50 && resultCode == RESULT_OK){
    		Expense expense = (Expense) data.getSerializableExtra("expense");
    	}
    }
}
