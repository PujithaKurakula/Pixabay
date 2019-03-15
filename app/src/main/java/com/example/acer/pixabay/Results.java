package com.example.acer.pixabay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class Results extends AppCompatActivity {

    ImageView image;
    TextView views,likes,downloads;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        image=findViewById(R.id.imageurl);
        views=findViewById(R.id.views);
        likes=findViewById(R.id.likes);
        downloads=findViewById(R.id.download);

        String[] s=getIntent().getStringArrayExtra("data");
        Picasso.with(this).load(s[0]).into(image);
        views.setText("views= " +s[1]);
        likes.setText( "Likes= "+s[2]);
        downloads.setText("Downloads= " +s[3]);
    }
}
