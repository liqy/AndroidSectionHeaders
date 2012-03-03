package com.ifixit.android.sectionheaders.sample;

import java.util.ArrayList;

import android.content.Context;

import android.view.View;
import android.view.ViewGroup;

import com.ifixit.android.sectionheaders.Section;

import android.widget.TextView;

public class SampleSectionAdapter extends Section {
   private Context mContext;
   private ArrayList<String> mList;
   private String mHeader;

   public SampleSectionAdapter(Context context, ArrayList<String> list,
    String header) {
      mContext = context;
      mList = list;
      mHeader = header;
   }

   public int getCount() {
      return mList.size();
   }

   public Object getItem(int position) {
      return mList.get(position);
   }

   public long getItemId(int position) {
      return position;
   }

   public View getView(int position, View convertView, ViewGroup parent) {
      TextView view = (TextView)convertView;

      if (view == null) {
         view = new TextView(mContext);
         view.setTextSize(30);
      }

      view.setText(mList.get(position));

      return view;
   }

   @Override
   public Object getHeaderItem() {
      return mHeader;
   }

   @Override
   public View getHeaderView(View convertView, ViewGroup parent) {
      TextView header = (TextView)convertView;
      
      if (header == null) {
         header = new TextView(mContext);
         header.setTextSize(15);
      }

      header.setText(mHeader);

      return header;
   }
}
