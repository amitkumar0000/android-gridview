package com.android.gridview.adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.android.gridview.R;

public class ImageAdapter extends BaseAdapter{

    Context context;
    public Integer[] mThumbIds = {
           R.mipmap.ic_launcher,R.mipmap.ic_launcher,
           R.mipmap.ic_launcher,R.mipmap.ic_launcher,
           R.mipmap.ic_launcher,R.mipmap.ic_launcher,
           R.mipmap.ic_launcher,R.mipmap.ic_launcher,
           R.mipmap.ic_launcher,R.mipmap.ic_launcher,
           R.mipmap.ic_launcher,R.mipmap.ic_launcher,
           R.mipmap.ic_launcher,R.mipmap.ic_launcher,
           R.mipmap.ic_launcher
    };

    public ImageAdapter(Context context){
        this.context =context;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int i) {
        return mThumbIds[i];
    }

    @Override
    public long getItemId(int i) {
        return mThumbIds[i];
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if(view == null){
            LayoutInflater inflater = LayoutInflater.from(context);
            view  = inflater.inflate(R.layout.singlerow,viewGroup,false);
            ImageView imageView  = view.findViewById(R.id.imageview);
            viewHolder = new ViewHolder(imageView);
            view.setTag(viewHolder);
        }

        viewHolder = (ViewHolder) view.getTag();

        viewHolder.imageView.setImageResource(mThumbIds[position]);

        return view;

    }

    class ViewHolder{
        ImageView imageView;
        ViewHolder(ImageView imageView){
            this.imageView = imageView;
        }

    }
}
