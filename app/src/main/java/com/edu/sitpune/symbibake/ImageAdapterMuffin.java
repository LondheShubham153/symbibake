package com.edu.sitpune.symbibake;

/**
 * Created by shubham on 13/11/17.
 */

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapterMuffin extends BaseAdapter {
    private Context mContext;

    // Constructor
    public ImageAdapterMuffin(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(500, 500));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        }
        else
        {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // Keep all Images in array
    public Integer[] mThumbIds = {
            R.drawable.muffin_sample1,R.drawable.muffin_sample2,
            R.drawable.muffin_sample3,R.drawable.muffin_sample4,
            R.drawable.muffin_sample5,R.drawable.muffin_sample6,
            R.drawable.muffin_sample7,R.drawable.muffin_sample8,
            
    };
}

