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
 * Created by NP on 3/9/2016.
 */
public class threeActivity extends AppCompatActivity {

    public static SharedPreferences shared;
    public SharedPreferences.Editor editor;
    Globals0 global = new Globals0();
    public ImageView iv_favorites;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three_layout);

      Toolbar toolbar = (Toolbar) findViewById(R.id.show1_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);

        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.show1_fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                shared = getSharedPreferences("Favorites", MODE_PRIVATE);
                editor = shared.edit();
                Bundle extras = getIntent().getExtras();
                if (extras != null) {

                    final String my_key_number1 = extras.getString("key_number");
                    // final int subject_number_int = Integer.parseInt(my_key_number);
                    final String this_subject_1 = "album_1_"  + my_key_number1;

                    Boolean b2 = shared.getBoolean(this_subject_1, false);
                    if (b2) {
                        editor.putBoolean(this_subject_1, false);
                        editor.apply();
                        fab.setImageResource(R.drawable.favorite_not_selected);
                        // show message
                        String message = getResources().getString(R.string.favorites_removed);
                        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                    } else {
                        editor.putBoolean(this_subject_1, true);
                        editor.apply();
                        fab.setImageResource(R.drawable.favorite_selected);
                        // show message
                        String message = getResources().getString(R.string.favorites_added);
                        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                    }


                }




            }
        });


/////////////////////////////////////////////////////////////////////////////////////////////


/////////////////////////////////////////////////////////////////////////////////////////////////////
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            final String my_key_number = extras.getString("key_number");

            String this_subject = "album_1_" + my_key_number;
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

            shared = getSharedPreferences("Favorites", MODE_PRIVATE);
            editor = shared.edit();
            ///////////////////////////////////////////////text size
            int size =shared.getInt("size",10);
            tv.setTextSize(size);
            boolean chbt = shared.getBoolean("chk", true);
            if (chbt)
                getWindow()
                        .addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);// safhe
//////////////////////////////////////////////////////////////

            // final int subject_number_int = Integer.parseInt(my_key_number);
            final String this_subject_1 = "album_1_"  + my_key_number;

            final Boolean b1 = shared.getBoolean(this_subject_1, false);
            if (b1) {
                fab.setImageResource(R.drawable.favorite_selected);
            } else {
                fab.setImageResource(R.drawable.favorite_not_selected);
            }

            ///////////////////////////////////////////////////////////////////////////////////////////
            /*iv_favorites = (ImageView) findViewById(R.id.imageView1);

            */
        }


    }




  /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.meu, menu);
        return true;
    }*/
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
                startActivity(new Intent(threeActivity.this, favorites_show.class));
                return true;
            default:
                return true;
        }


    }
}