package com.sstopin.udacitymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the Views of the albums, songs and artist textviews
        final TextView albums = (TextView) findViewById(R.id.albums);
        final TextView songs = (TextView) findViewById(R.id.songs);
        final TextView artists = (TextView) findViewById(R.id.artists);

        // Set a click listener on album View
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the albums View is clicked on
            // and highlight the textview.
            @Override
            public void onClick(View view) {
                albums.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                songs.setBackgroundColor(getResources().getColor(R.color.transparent));
                artists.setBackgroundColor(getResources().getColor(R.color.transparent));
            }
        });

        // Set a click listener on songs View
        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the albums View is clicked on
            // and highlight the textview.
            @Override
            public void onClick(View view) {
                albums.setBackgroundColor(getResources().getColor(R.color.transparent));
                songs.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                artists.setBackgroundColor(getResources().getColor(R.color.transparent));
            }
        });

        // Set a click listener on artist View
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the albums View is clicked on
            // and highlight the textview.
            @Override
            public void onClick(View view) {
                albums.setBackgroundColor(getResources().getColor(R.color.transparent));
                songs.setBackgroundColor(getResources().getColor(R.color.transparent));
                artists.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
            }
        });


    }
}