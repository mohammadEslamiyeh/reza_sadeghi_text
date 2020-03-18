package com.elevenprin.www.rezasadeghinew;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by NP on 4/29/2016.
 */
public class Favorites_sh extends AppCompatActivity {
    public static SharedPreferences shared_fav;
    public static SharedPreferences.Editor editor_fav;
    public ImageView iv_favorites;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three_layout);

        Toolbar toolbar = (Toolbar) findViewById(R.id.show1_toolbar);
        setSupportActionBar(toolbar);

        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.show1_fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shared_fav = getSharedPreferences("Favorites", MODE_PRIVATE);
                editor_fav = shared_fav.edit();

                Bundle extras = getIntent().getExtras();
                if (extras != null) {
                    final String fave = extras.getString("key_number");
                    Boolean b2 = shared_fav.getBoolean(fave, false);
                    if (b2) {
                        editor_fav.putBoolean(fave, false);
                        editor_fav.apply();
                        fab.setImageResource(R.drawable.favorite_not_selected);
                        // show message
                        String message = getResources().getString(R.string.favorites_removed);
                        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                    } else {
                        editor_fav.putBoolean(fave, true);
                        editor_fav.apply();
                        fab.setImageResource(R.drawable.favorite_selected);
                        // show message
                        String message = getResources().getString(R.string.favorites_added);
                        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                    }
                }
            }
            });


///////////////////////////////////////////////////////////////////////////////////////
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            final String fave = extras.getString("key_number");


            int resId = getResources().getIdentifier(fave, "string", getPackageName());
            String song = getResources().getString(resId);

            TextView tv = (TextView) findViewById(R.id.show_textview);
            tv.setText(song);

            shared_fav = getSharedPreferences("Favorites", MODE_PRIVATE);
            editor_fav = shared_fav.edit();
            ///////////////////////////////////////////////text size
            int size =shared_fav.getInt("size",10);
            tv.setTextSize(size);
            boolean chbt = shared_fav.getBoolean("chk", true);
            if (chbt)
                getWindow()
                        .addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);// safhe
//////////////////////////////////////////////////////////////

            final Boolean b1 = shared_fav.getBoolean(fave, false);
            if (b1) {
                fab.setImageResource(R.drawable.favorite_selected);
            } else {
                fab.setImageResource(R.drawable.favorite_not_selected);
            }

            //iv_favorites = (ImageView) findViewById(R.id.imageView1);




            //final int subject_number_int = Integer.parseInt(this_subject);
            //*
            //final String this_subject_2 = "album_2_" + String.valueOf(my_key_number);



           /* iv_favorites.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
             */

        }
    }
}
