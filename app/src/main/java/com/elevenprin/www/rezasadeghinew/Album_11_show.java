package com.elevenprin.www.rezasadeghinew;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by NP on 4/6/2016.
 */
public class Album_11_show extends AppCompatActivity {

    public static SharedPreferences shared_3;
    public SharedPreferences.Editor editor_3;
    Globals0 global = new Globals0();
    public ImageView iv_favorites_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three_layout);
        getSupportActionBar().setTitle(null);

        Toolbar toolbar = (Toolbar) findViewById(R.id.show1_toolbar);
        setSupportActionBar(toolbar);

        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.show1_fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shared_3 = getSharedPreferences("Favorites", MODE_PRIVATE);
                editor_3 = shared_3.edit();

                Bundle extras = getIntent().getExtras();
                if (extras != null) {
                    final String my_key_number = extras.getString("key_number");
                    final String this_subject_3 = "album_11_" + my_key_number;

                    Boolean b2 = shared_3.getBoolean(this_subject_3, false);
                    if (b2) {
                        editor_3.putBoolean(this_subject_3, false);
                        editor_3.apply();
                        fab.setImageResource(R.drawable.favorite_not_selected);
                        // show message
                        String message = getResources().getString(R.string.favorites_removed);
                        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                    } else {
                        editor_3.putBoolean(this_subject_3, true);
                        editor_3.apply();
                        fab.setImageResource(R.drawable.favorite_selected);
                        // show message
                        String message = getResources().getString(R.string.favorites_added);
                        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                    }
                }
                }
            });

////////////////////////////////////////////////////////////////////////////////////////////////////
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String my_key_number = extras.getString("key_number");

            String this_subject = "album_11_" + my_key_number;
            int resId = getResources().getIdentifier(this_subject, "string", getPackageName());
            String song = getResources().getString(resId);

            TextView tv3 = (TextView) findViewById(R.id.textview11);
            Bundle extras2 = getIntent().getExtras();
            if(extras2 != null)
            {
                String list = extras2.getString("list");
                int resID_2 = getResources().getIdentifier(list,"string",getPackageName());
                String list_song = getResources().getString(resID_2);
                tv3.setText(list_song);

            }



            TextView tv = (TextView) findViewById(R.id.show_textview);
            tv.setText(song);
            shared_3 = getSharedPreferences("Favorites", MODE_PRIVATE);
            editor_3 = shared_3.edit();
            ///////////////////////////////////////////////text size
            int size =shared_3.getInt("size",10);
            tv.setTextSize(size);
            boolean chbt = shared_3.getBoolean("chk", true);
            if (chbt)
                getWindow()
                        .addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);// safhe
//////////////////////////////////////////////////////////////

            final String this_subject_3 = "album_11_" + my_key_number;

            final Boolean b1 = shared_3.getBoolean(this_subject, false);
            if (b1) {
                fab.setImageResource(R.drawable.favorite_selected);
            } else {
                fab.setImageResource(R.drawable.favorite_not_selected);
            }

//
            ///  ////////////////////////////////////////////////////////////////////////////////////////////





        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.meu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.itemFavorites:
                startActivity(new Intent(Album_11_show.this, favorites_show.class));
                return true;
            default:
                return true;
        }


    }
}








