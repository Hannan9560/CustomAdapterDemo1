package net.a6te.lazycoder.customadapterdemo1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mobile App Develop on 3/29/2017.
 */

public class ImageAdapter extends ArrayAdapter<ImageCollection> {
    private Context context;
    private ArrayList<ImageCollection>imageCollections;

    public ImageAdapter(Context context, ArrayList<ImageCollection> imageCollections) {
        super(context, R.layout.gallary_row);
        this.imageCollections = imageCollections;
        this.context = context;
    } 0

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.gallary_row,parent,false);
        ImageView collectionImageView = (ImageView) convertView.findViewById(R.id.imageList);
        TextView collecName = (TextView) convertView.findViewById(R.id.nameTV);
        TextView creditName = (TextView) convertView.findViewById(R.id.creaditTV);


        collecName.setText(imageCollections.get(position).getImageName());
        creditName.setText(imageCollections.get(position).getCreditName());
        collectionImageView.setImageResource(imageCollections.get(position).getImage());


        return convertView;
    }
}
