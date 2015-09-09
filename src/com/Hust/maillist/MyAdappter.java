package com.Hust.maillist;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyAdappter extends BaseAdapter{
	private List<PhoneInfo> lists;
	private Context context;
	private LinearLayout layout;
	
	public MyAdappter(List<PhoneInfo> lists,Context context) {
		this.lists=lists;
		this.context=context;
	}

	@Override
	public int getCount() {
		
		return lists.size();
	}

	@Override
	public Object getItem(int position) {
	    
		return lists.get(position);
	}

	@Override
	public long getItemId(int position) {
		
		return position;
	}

	@Override
	public View getView(int position, View converView, ViewGroup parent) {
		ViewHolder holder;
		if (converView==null) {
			converView=LayoutInflater.from(context).inflate(R.layout.cell, null);
			holder=new ViewHolder();
			holder.nametv=(TextView) converView.findViewById(R.id.name);
			holder.numbertv=(TextView) converView.findViewById(R.id.number);
			holder.nametv.setText(lists.get(position).getName());
			holder.numbertv.setText(lists.get(position).getNumber());
			converView.setTag(holder);
		} else {
			holder=(ViewHolder) converView.getTag();
			holder.nametv.setText(lists.get(position).getName());
			holder.numbertv.setText(lists.get(position).getNumber());

		}
		return converView;
	}
	
	private static class ViewHolder{
		TextView nametv;
		TextView numbertv;
	}

}
