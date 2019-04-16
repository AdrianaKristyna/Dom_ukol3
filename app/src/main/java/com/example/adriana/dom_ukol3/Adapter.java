package com.example.adriana.dom_ukol3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter {

    private final ArrayList<Filmy> filmies;
    private final Activity activity;

    public Adapter(Activity activity, ArrayList<Filmy> filmies) {
        super(activity, R.layout.list_item, filmies);
        this.activity = activity;
        this.filmies = filmies;
    }

    //ziskame reference na views v xml
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_item, null, true);

        TextView names = rowView.findViewById(R.id.names);
        //TextView descriptions = rowView.findViewById(R.id.description);
        TextView number=rowView.findViewById(R.id.number);
        ImageView image = rowView.findViewById(R.id.image);
        TextView title=rowView.findViewById(R.id.title);

        //nastavime do nich data z listu
        names.setText(filmies.get(position).name);

        //descriptions.setText(filmies.get(position).description);
        number.setText(filmies.get(position).number);
        Glide.with(activity).load(filmies.get(position).getImage()).into(image);
        title.setText(filmies.get(position).title);

        return rowView;
    }
}

