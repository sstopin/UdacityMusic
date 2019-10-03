package com.sstopin.udacitymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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
        TextView albums = (TextView) findViewById(R.id.albums);
        TextView songs = (TextView) findViewById(R.id.songs);
        TextView artists = (TextView) findViewById(R.id.artists);
        Button buttonClicked = (Button) findViewById(R.id.buttonxx);

        // Set a click listener on album View
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the albums View is clicked on.
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "album clicked", Toast.LENGTH_LONG).show();
            }
        });

        // Set a click listener on songs View
        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the albums View is clicked on.
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "songs clicked", Toast.LENGTH_LONG).show();
            }
        });

        // Set a click listener on artist View
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the albums View is clicked on.
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "artists clicked", Toast.LENGTH_LONG).show();
            }
        });


    }
}