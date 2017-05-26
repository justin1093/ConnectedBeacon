package com.example.justin.connectedbeacon;

/**
 * Created by Justin on 5/14/2017.
 */

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] itemname;
    private final Integer[] imgid;

    public CustomListAdapter(Activity context, String[] itemname, Integer[] imgid) {
        super(context, R.layout.customlayout, itemname);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.itemname=itemname;
        this.imgid=imgid;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.customlayout, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.textView_name);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView);
        TextView extratxt = (TextView) rowView.findViewById(R.id.textView_description);

        txtTitle.setText(itemname[position]);
        imageView.setImageResource(imgid[position]);
        extratxt.setText("Description "+itemname[position]);
        return rowView;

    };
}