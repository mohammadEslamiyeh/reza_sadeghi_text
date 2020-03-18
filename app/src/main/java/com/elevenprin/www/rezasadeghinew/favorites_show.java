package com.elevenprin.www.rezasadeghinew;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NP on 4/17/2016.
 */
public class favorites_show extends Activity {

    public Globals0 global = new Globals0();
    ///////////////////////////////////////////album ha
    public int Subjects_total_number_1;
    public int Subjects_total_number_2;
    public int Subjects_total_number_3;
    public int Subjects_total_number_4;
    public int Subjects_total_number_5;
    public int Subjects_total_number_6;
    public int Subjects_total_number_7;
    public int Subjects_total_number_8;
    public int Subjects_total_number_9;
    public int Subjects_total_number_10;
    public int Subjects_total_number_11;
    public int Subjects_total_number_12;
    public int Subjects_total_number_13;
    public int Subjects_total_number_14;
    public int Subjects_total_number_15;
    public int Subjects_total_number_16;
    public int Subjects_total_number_17;
    public int Subjects_total_number_18;
    public int Subjects_total_number_19;
    public int Subjects_total_number_20;
    public int Subjects_total_number_21;
    public int Subjects_total_number_tak;

 /////////////////////////////////////////////////////////////
    public List<String> Favorites_numbers_1, Favorites_strings_1;

    ////////////////////////////////////////////////////////////////////////
    // List view
    public ListView lv_1;
    // Listview Adapter
    public ArrayAdapter<String> adapter_1;

public static SharedPreferences album_1 ,album_2,album_3,album_4,album_5,album_6,album_7
        ,album_8,album_9,album_10,album_11,album_12,album_13,album_14,album_15,album_16
        ,album_17,album_18,album_19,album_20,album_21,tak;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favorites_show);


        Favorites_strings_1 = new ArrayList<String>();
        Favorites_numbers_1 = new ArrayList<String>();
        /////////////////////////////////////////////////////////////////////
        Subjects_total_number_1 = global.album_1_song_number;
        Subjects_total_number_2 = global.album_2_song_number;
        Subjects_total_number_3 = global.album_3_song_number;
        Subjects_total_number_4 = global.album_4_song_number;
        Subjects_total_number_5 = global.album_5_song_number;
        Subjects_total_number_6 = global.album_6_song_number;
        Subjects_total_number_7 = global.album_7_song_number;
        Subjects_total_number_8 = global.album_8_song_number;
        Subjects_total_number_9 = global.album_9_song_number;
        Subjects_total_number_10 = global.album_10_song_number;
        Subjects_total_number_11 = global.album_11_song_number;
        Subjects_total_number_12 = global.album_12_song_number;
        Subjects_total_number_13 = global.album_13_song_number;
        Subjects_total_number_14 = global.album_14_song_number;
        Subjects_total_number_15 = global.album_15_song_number;
        Subjects_total_number_16 = global.album_16_song_number;
        Subjects_total_number_17 = global.album_17_song_number;
        Subjects_total_number_18 = global.album_18_song_number;
        Subjects_total_number_19 = global.album_19_song_number;
        Subjects_total_number_20 = global.album_20_song_number;
        Subjects_total_number_21 = global.album_21_song_number;
        Subjects_total_number_tak = global.tak_1_song_number;


        /////////////////////////////////////////////////////////////////////////////
        album_1= getSharedPreferences("Favorites", MODE_PRIVATE);
        album_2= getSharedPreferences("Favorites", MODE_PRIVATE);
        album_3= getSharedPreferences("Favorites", MODE_PRIVATE);
        album_4= getSharedPreferences("Favorites", MODE_PRIVATE);
        album_5= getSharedPreferences("Favorites", MODE_PRIVATE);
        album_6= getSharedPreferences("Favorites", MODE_PRIVATE);
        album_7= getSharedPreferences("Favorites", MODE_PRIVATE);
        album_8= getSharedPreferences("Favorites", MODE_PRIVATE);
        album_9= getSharedPreferences("Favorites", MODE_PRIVATE);
        album_10= getSharedPreferences("Favorites", MODE_PRIVATE);
        album_11= getSharedPreferences("Favorites", MODE_PRIVATE);
        album_12= getSharedPreferences("Favorites", MODE_PRIVATE);
        album_13= getSharedPreferences("Favorites", MODE_PRIVATE);
        album_14= getSharedPreferences("Favorites", MODE_PRIVATE);
        album_15= getSharedPreferences("Favorites", MODE_PRIVATE);
        album_16= getSharedPreferences("Favorites", MODE_PRIVATE);
        album_17= getSharedPreferences("Favorites", MODE_PRIVATE);
        album_18= getSharedPreferences("Favorites", MODE_PRIVATE);
        album_19= getSharedPreferences("Favorites", MODE_PRIVATE);
        album_20= getSharedPreferences("Favorites", MODE_PRIVATE);
        album_21= getSharedPreferences("Favorites", MODE_PRIVATE);
        tak     = getSharedPreferences("Favorites", MODE_PRIVATE);
        /////////////////////////////////////////////////////////////////////////
        for (int x = 1; x < Subjects_total_number_1 + 1; x = x + 1)
        {
            String each_subject_1 = "album_1_" + String.valueOf(x);
            Boolean a = album_1.getBoolean(each_subject_1, false);
            if (a) {
                String this_subject_1 = "album_1_song_" + String.valueOf(x);
                int resID_1 = getResources().getIdentifier(this_subject_1, "string", getPackageName());
                Favorites_strings_1.add(getResources().getString(resID_1));
                String x_string_1 = "album_1_"+String.valueOf(x);
                Favorites_numbers_1.add(x_string_1);
            }
        }


///////     2       /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        for (int x = 1; x < Subjects_total_number_2 + 1; x = x + 1) {
            String each_subject_2 = "album_2_" + String.valueOf(x);
            Boolean b = album_2.getBoolean(each_subject_2, false);
            if (b) {
                String this_subject_2 = "album_2_song_" + String.valueOf(x);
                int resID_2 = getResources().getIdentifier(this_subject_2, "string", getPackageName());
                Favorites_strings_1.add(getResources().getString(resID_2));
                String x_string_2 = "album_2_"+String.valueOf(x);
                Favorites_numbers_1.add(x_string_2);
            }
        }



        ////   3       /////////////////////////////////////////////////////////////////////////////////////////////////////////////////



        for (int x = 1; x < Subjects_total_number_3 + 1; x = x + 1) {
            String each_subject_3 = "album_3_" + String.valueOf(x);
            Boolean b = album_3.getBoolean(each_subject_3, false);
            if (b) {
                String this_subject_3 = "album_3_song_" + String.valueOf(x);
                int resID_3 = getResources().getIdentifier(this_subject_3, "string", getPackageName());
                Favorites_strings_1.add(getResources().getString(resID_3));
                String x_string_3 = "album_3_"+String.valueOf(x);
                Favorites_numbers_1.add(x_string_3);
            }
        }
//  4 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        for (int x = 1; x < Subjects_total_number_4 + 1; x = x + 1) {
            String each_subject_4 = "album_4_" + String.valueOf(x);
            Boolean b = album_4.getBoolean(each_subject_4, false);
            if (b) {
                String this_subject_4 = "album_4_song_" + String.valueOf(x);
                int resID_4 = getResources().getIdentifier(this_subject_4, "string", getPackageName());
                Favorites_strings_1.add(getResources().getString(resID_4));
                String x_string_4 = "album_4_"+String.valueOf(x);
                Favorites_numbers_1.add(x_string_4);
            }
        }
        ////5///////////////////////////////////////////////////////////////////////////////////////////
        for (int x = 1; x < Subjects_total_number_5 + 1; x = x + 1) {
            String each_subject_5 = "album_5_" + String.valueOf(x);
            Boolean b = album_5.getBoolean(each_subject_5, false);
            if (b) {
                String this_subject_5 = "album_5_song_" + String.valueOf(x);
                int resID_5 = getResources().getIdentifier(this_subject_5, "string", getPackageName());
                Favorites_strings_1.add(getResources().getString(resID_5));
                String x_string_5 = "album_5_"+String.valueOf(x);
                Favorites_numbers_1.add(x_string_5);
            }
        }
        //  6 ///////////////////////////////////////// //////////////////////////////////////////////////////

        for (int x = 1; x < Subjects_total_number_6 + 1; x = x + 1) {
            String each_subject_6 = "album_6_" + String.valueOf(x);
            Boolean b = album_6.getBoolean(each_subject_6, false);
            if (b) {
                String this_subject_6 = "album_6_song_" + String.valueOf(x);
                int resID_6 = getResources().getIdentifier(this_subject_6, "string", getPackageName());
                Favorites_strings_1.add(getResources().getString(resID_6));
                String x_string_6 = "album_6_"+String.valueOf(x);
                Favorites_numbers_1.add(x_string_6);
            }
        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////
        //  7 ///////////////////////////////////////// //////////////////////////////////////////////////////

        for (int x = 1; x < Subjects_total_number_7 + 1; x = x + 1) {
            String each_subject_7 = "album_7_" + String.valueOf(x);
            Boolean b = album_7.getBoolean(each_subject_7, false);
            if (b) {
                String this_subject_7 = "album_7_song_" + String.valueOf(x);
                int resID_7 = getResources().getIdentifier(this_subject_7, "string", getPackageName());
                Favorites_strings_1.add(getResources().getString(resID_7));
                String x_string_7 = "album_7_"+String.valueOf(x);
                Favorites_numbers_1.add(x_string_7);
            }
        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////
        //  8 ///////////////////////////////////////// //////////////////////////////////////////////////////

        for (int x = 1; x < Subjects_total_number_8 + 1; x = x + 1) {
            String each_subject_8 = "album_8_" + String.valueOf(x);
            Boolean b = album_8.getBoolean(each_subject_8, false);
            if (b) {
                String this_subject_8 = "album_8_song_" + String.valueOf(x);
                int resID_8 = getResources().getIdentifier(this_subject_8, "string", getPackageName());
                Favorites_strings_1.add(getResources().getString(resID_8));
                String x_string_8 = "album_8_"+String.valueOf(x);
                Favorites_numbers_1.add(x_string_8);
            }
        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////
        //  9 ///////////////////////////////////////// //////////////////////////////////////////////////////

        for (int x = 1; x < Subjects_total_number_9 + 1; x = x + 1) {
            String each_subject_9 = "album_9_" + String.valueOf(x);
            Boolean b = album_9.getBoolean(each_subject_9, false);
            if (b) {
                String this_subject_9 = "album_9_song_" + String.valueOf(x);
                int resID_9 = getResources().getIdentifier(this_subject_9, "string", getPackageName());
                Favorites_strings_1.add(getResources().getString(resID_9));
                String x_string_9 = "album_9_"+String.valueOf(x);
                Favorites_numbers_1.add(x_string_9);
            }
        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////
        //  10 ///////////////////////////////////////// //////////////////////////////////////////////////////

        for (int x = 1; x < Subjects_total_number_10 + 1; x = x + 1) {
            String each_subject_10 = "album_10_" + String.valueOf(x);
            Boolean b = album_10.getBoolean(each_subject_10, false);
            if (b) {
                String this_subject_10 = "album_10_song_" + String.valueOf(x);
                int resID_10 = getResources().getIdentifier(this_subject_10, "string", getPackageName());
                Favorites_strings_1.add(getResources().getString(resID_10));
                String x_string_10 = "album_10_"+String.valueOf(x);
                Favorites_numbers_1.add(x_string_10);
            }
        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////
        //  11 ///////////////////////////////////////// //////////////////////////////////////////////////////

        for (int x = 1; x < Subjects_total_number_11 + 1; x = x + 1) {
            String each_subject_11 = "album_11_" + String.valueOf(x);
            Boolean b = album_11.getBoolean(each_subject_11, false);
            if (b) {
                String this_subject_11 = "album_11_song_" + String.valueOf(x);
                int resID_ = getResources().getIdentifier(this_subject_11, "string", getPackageName());
                Favorites_strings_1.add(getResources().getString(resID_));
                String x_string_11 = "album_11_"+String.valueOf(x);
                Favorites_numbers_1.add(x_string_11);
            }
        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////
        // 12  ///////////////////////////////////////// //////////////////////////////////////////////////////

        for (int x = 1; x < Subjects_total_number_12 + 1; x = x + 1) {
            String each_subject_12 = "album_12_" + String.valueOf(x);
            Boolean b = album_12.getBoolean(each_subject_12, false);
            if (b) {
                String this_subject_12 = "album_12_song_" + String.valueOf(x);
                int resID_12 = getResources().getIdentifier(this_subject_12, "string", getPackageName());
                Favorites_strings_1.add(getResources().getString(resID_12));
                String x_string_12 = "album_12_"+String.valueOf(x);
                Favorites_numbers_1.add(x_string_12);
            }
        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////

        // 13  ///////////////////////////////////////// //////////////////////////////////////////////////////

        for (int x = 1; x < Subjects_total_number_13 + 1; x = x + 1) {
            String each_subject_13 = "album_13_" + String.valueOf(x);
            Boolean b = album_13.getBoolean(each_subject_13, false);
            if (b) {
                String this_subject_13 = "album_13_song_" + String.valueOf(x);
                int resID_13 = getResources().getIdentifier(this_subject_13, "string", getPackageName());
                Favorites_strings_1.add(getResources().getString(resID_13));
                String x_string_13 = "album_13_"+String.valueOf(x);
                Favorites_numbers_1.add(x_string_13);
            }
        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////
        //  14 ///////////////////////////////////////// //////////////////////////////////////////////////////

        for (int x = 1; x < Subjects_total_number_14 + 1; x = x + 1) {
            String each_subject_14 = "album_14_" + String.valueOf(x);
            Boolean b = album_14.getBoolean(each_subject_14, false);
            if (b) {
                String this_subject_14 = "album_14_song_" + String.valueOf(x);
                int resID_14 = getResources().getIdentifier(this_subject_14, "string", getPackageName());
                Favorites_strings_1.add(getResources().getString(resID_14));
                String x_string_14 = "album_14_"+String.valueOf(x);
                Favorites_numbers_1.add(x_string_14);
            }
        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////
        //  15 ///////////////////////////////////////// //////////////////////////////////////////////////////

        for (int x = 1; x < Subjects_total_number_15 + 1; x = x + 1) {
            String each_subject_15 = "album_15_" + String.valueOf(x);
            Boolean b = album_15.getBoolean(each_subject_15, false);
            if (b) {
                String this_subject_15 = "album_15_song_" + String.valueOf(x);
                int resID_15 = getResources().getIdentifier(this_subject_15, "string", getPackageName());
                Favorites_strings_1.add(getResources().getString(resID_15));
                String x_string_15 = "album_15_"+String.valueOf(x);
                Favorites_numbers_1.add(x_string_15);
            }
        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////
        //  16 ///////////////////////////////////////// //////////////////////////////////////////////////////

        for (int x = 1; x < Subjects_total_number_16 + 1; x = x + 1) {
            String each_subject_16 = "album_16_" + String.valueOf(x);
            Boolean b = album_16.getBoolean(each_subject_16, false);
            if (b) {
                String this_subject_16 = "album_16_song_" + String.valueOf(x);
                int resID_16 = getResources().getIdentifier(this_subject_16, "string", getPackageName());
                Favorites_strings_1.add(getResources().getString(resID_16));
                String x_string_16 = "album_16_"+String.valueOf(x);
                Favorites_numbers_1.add(x_string_16);
            }
        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////
        // 17  ///////////////////////////////////////// //////////////////////////////////////////////////////

        for (int x = 1; x < Subjects_total_number_17 + 1; x = x + 1) {
            String each_subject_17 = "album_17_" + String.valueOf(x);
            Boolean b = album_17.getBoolean(each_subject_17, false);
            if (b) {
                String this_subject_17 = "album_17_song_" + String.valueOf(x);
                int resID_17 = getResources().getIdentifier(this_subject_17, "string", getPackageName());
                Favorites_strings_1.add(getResources().getString(resID_17));
                String x_string_17 = "album_17_"+String.valueOf(x);
                Favorites_numbers_1.add(x_string_17);
            }
        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////
        //   ///////////////////////////////////////// //////////////////////////////////////////////////////

        for (int x = 1; x < Subjects_total_number_18 + 1; x = x + 1) {
            String each_subject_18 = "album_18_" + String.valueOf(x);
            Boolean b = album_18.getBoolean(each_subject_18, false);
            if (b) {
                String this_subject_18 = "album_18_song_" + String.valueOf(x);
                int resID_18 = getResources().getIdentifier(this_subject_18, "string", getPackageName());
                Favorites_strings_1.add(getResources().getString(resID_18));
                String x_string_18 = "album_18_"+String.valueOf(x);
                Favorites_numbers_1.add(x_string_18);
            }
        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////
        // 19  ///////////////////////////////////////// //////////////////////////////////////////////////////

        for (int x = 1; x < Subjects_total_number_19 + 1; x = x + 1) {
            String each_subject_19 = "album_19_" + String.valueOf(x);
            Boolean b = album_19.getBoolean(each_subject_19, false);
            if (b) {
                String this_subject_19 = "album_19_song_" + String.valueOf(x);
                int resID_19 = getResources().getIdentifier(this_subject_19, "string", getPackageName());
                Favorites_strings_1.add(getResources().getString(resID_19));
                String x_string_19 = "album_19_"+String.valueOf(x);
                Favorites_numbers_1.add(x_string_19);
            }
        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////
        //   20 ///////////////////////////////////////// //////////////////////////////////////////////////////

        for (int x = 1; x < Subjects_total_number_20 + 1; x = x + 1) {
            String each_subject_20 = "album_20_" + String.valueOf(x);
            Boolean b = album_20.getBoolean(each_subject_20, false);
            if (b) {
                String this_subject_20 = "album_20_song_" + String.valueOf(x);
                int resID_20 = getResources().getIdentifier(this_subject_20, "string", getPackageName());
                Favorites_strings_1.add(getResources().getString(resID_20));
                String x_string_20 = "album_20_"+String.valueOf(x);
                Favorites_numbers_1.add(x_string_20);
            }
        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////
        // 21  ///////////////////////////////////////// //////////////////////////////////////////////////////

        for (int x = 1; x < Subjects_total_number_21 + 1; x = x + 1) {
            String each_subject_21 = "album_21_" + String.valueOf(x);
            Boolean b = album_21.getBoolean(each_subject_21, false);
            if (b) {
                String this_subject_21 = "album_21_song_" + String.valueOf(x);
                int resID_21 = getResources().getIdentifier(this_subject_21, "string", getPackageName());
                Favorites_strings_1.add(getResources().getString(resID_21));
                String x_string_21 = "album_21_"+String.valueOf(x);
                Favorites_numbers_1.add(x_string_21);
            }
        }

        // tak ///////////////////////////////////////// //////////////////////////////////////////////////////

        for (int x = 1; x < Subjects_total_number_tak + 1; x = x + 1) {
            String each_subject_tak = "tak_1_song_" + String.valueOf(x);
            Boolean b = tak.getBoolean(each_subject_tak, false);
            if (b) {
                String this_subject_tak = "tak_" + String.valueOf(x);
                int resID_tak = getResources().getIdentifier(this_subject_tak, "string", getPackageName());
                Favorites_strings_1.add(getResources().getString(resID_tak));
                String x_string_tak = "tak_1_song_"+String.valueOf(x);
                Favorites_numbers_1.add(x_string_tak);
            }
        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////     ///////////////////////////////////////////////////////////////////////////////////////////////////
//**************************************************************************************************************************************
////
        lv_1 = (ListView) findViewById(R.id.list_view);

        // Adding items to listview
        adapter_1 = new ArrayAdapter<String>(this, R.layout.list_item_favorites, R.id.favorites_textView, Favorites_strings_1);
        lv_1.setAdapter(adapter_1);


        lv_1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, final View view,
                                    int position, long id) {
                String favorite_number_1 = Favorites_numbers_1.get(position);
                Intent i = new Intent(getApplicationContext(), Favorites_sh.class);
                i.putExtra("key_number", favorite_number_1);
                startActivity(i);
            }
        });


        ////////////////////////////////////////////////////////////////////////////////////////////////////////


    }
}







  /*  @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.meu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.itemFavorites:
                startActivity(new Intent(favorites_show.this, Favorites.class));
                return true;
            default:
                return true;
        }
   }



}*/

