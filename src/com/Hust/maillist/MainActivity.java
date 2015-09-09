package com.Hust.maillist;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.os.Build;

public class MainActivity extends Activity {
	
	private ListView lv;
	private MyAdappter adappter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GetNumner.getNumber(this);
        lv=(ListView) findViewById(R.id.lv);
        adappter=new MyAdappter(GetNumner.lists, this);
        lv.setAdapter(adappter);

          }
}
