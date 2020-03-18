package com.elevenprin.www.rezasadeghinew;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;

/**
 * Created by NP on 4/16/2016.
 */
public class Favorites extends PreferenceActivity {

    ;
    public int Subjects_total_number;
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

    public Globals0 global = new Globals0();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

 ///////////////////////////////////////////////////////////////////////////////////////////////////
        SharedPreferences prefs_1 = PreferenceManager.getDefaultSharedPreferences(this);

        Subjects_total_number = global.album_1_song_number;

        // for favorites
        Boolean[] favorites = new Boolean[Subjects_total_number];
        for (int a = 1; a < Subjects_total_number + 1; a++) {
            String each_subject1 = "album_1_" + String.valueOf(a);
            favorites[a] = prefs_1.getBoolean(each_subject1, false);
        }

        //////////////////////////////////////////////////////////////////////////////////////////////////
        SharedPreferences prefs_2 = PreferenceManager.getDefaultSharedPreferences(this);

        Subjects_total_number_2 = global.album_2_song_number;

        // for favorites
        Boolean[] favorites_2 = new Boolean[Subjects_total_number_2];

        for (int b = 1; b < Subjects_total_number_2 + 1; b++) {
            String each_subject2 = "album_2_" + String.valueOf(b);
            favorites_2[b] = prefs_2.getBoolean(each_subject2, false);

        }
        //////////////////////////////////////////////////////////////////////////////////////////////////
        SharedPreferences prefs_3 = PreferenceManager.getDefaultSharedPreferences(this);


        Subjects_total_number_3 = global.album_3_song_number;

        // for favorites
        Boolean[] favorites_3 = new Boolean[Subjects_total_number_3];

        for (int c = 1; c < Subjects_total_number_3 + 1; c++) {
            String each_subject2 = "album_3_" + String.valueOf(c);
            favorites_3[c] = prefs_3.getBoolean(each_subject2, false);
        }

        //////////////////////////////////////////////////////////////////////////////////////////////////
        SharedPreferences prefs_4 = PreferenceManager.getDefaultSharedPreferences(this);


        Subjects_total_number_4 = global.album_4_song_number;

        // for favorites
        Boolean[] favorites_4 = new Boolean[Subjects_total_number_4];

        for (int d = 1; d < Subjects_total_number_4 + 1; d++) {
            String each_subject2 = "album_4_" + String.valueOf(d);
            favorites_4[d] = prefs_4.getBoolean(each_subject2, false);

        }

        //////////////////////////////////////////////////////////////////////////////////////////////////
        SharedPreferences prefs_5 = PreferenceManager.getDefaultSharedPreferences(this);


        Subjects_total_number_5 = global.album_5_song_number;

        // for favorites
        Boolean[] favorites_5 = new Boolean[Subjects_total_number_5];

        for (int e = 1; e < Subjects_total_number_5 + 1; e++) {
            String each_subject2 = "album_5_" + String.valueOf(e);
            favorites_5[e] = prefs_5.getBoolean(each_subject2, false);

        }

        //////////////////////////////////////////////////////////////////////////////////////////////////
        SharedPreferences prefs_6 = PreferenceManager.getDefaultSharedPreferences(this);


        Subjects_total_number_6 = global.album_6_song_number;

        // for favorites
        Boolean[] favorites_6 = new Boolean[Subjects_total_number_6];

        for (int f = 1; f < Subjects_total_number_6 + 1; f++) {
            String each_subject2 = "album_6_" + String.valueOf(f);
            favorites_6[f] = prefs_6.getBoolean(each_subject2, false);

        }

        //////////////////////////////////////////////////////////////////////////////////////////////////
        SharedPreferences prefs_7 = PreferenceManager.getDefaultSharedPreferences(this);


        Subjects_total_number_7 = global.album_7_song_number;

        // for favorites
        Boolean[] favorites_7 = new Boolean[Subjects_total_number_7];

        for (int g = 1; g < Subjects_total_number_7 + 1; g++) {
            String each_subject2 = "album_7_" + String.valueOf(g);
            favorites_7[g] = prefs_7.getBoolean(each_subject2, false);

        }
//////////////////////////////////////////////////////////////////////////////////////////////////
        SharedPreferences prefs_8 = PreferenceManager.getDefaultSharedPreferences(this);

        Subjects_total_number_8 = global.album_8_song_number;

        // for favorites
        Boolean[] favorites_8 = new Boolean[Subjects_total_number_8];

        for (int h = 1; h < Subjects_total_number_8 + 1; h++) {
            String each_subject2 = "album_8_" + String.valueOf(h);
            favorites_8[h] = prefs_8.getBoolean(each_subject2, false);

        }
//////////////////////////////////////////////////////////////////////////////////////////////////
        SharedPreferences prefs_9 = PreferenceManager.getDefaultSharedPreferences(this);

        Subjects_total_number_9 = global.album_9_song_number;

        // for favorites
        Boolean[] favorites_9 = new Boolean[Subjects_total_number_9];

        for (int i = 1; i < Subjects_total_number_9 + 1; i++) {
            String each_subject2 = "album_9_" + String.valueOf(i);
            favorites_9[i] = prefs_9.getBoolean(each_subject2, false);

        }
        //////////////////////////////////////////////////////////////////////////////////////////////////
        SharedPreferences prefs_10 = PreferenceManager.getDefaultSharedPreferences(this);


        Subjects_total_number_10 = global.album_10_song_number;

        // for favorites
        Boolean[] favorites_10 = new Boolean[Subjects_total_number_10];

        for (int j = 1; j < Subjects_total_number_10 + 1; j++) {
            String each_subject10 = "album_10_" + String.valueOf(j);
            favorites_10[j] = prefs_10.getBoolean(each_subject10, false);

        }

        //////////////////////////////////////////////////////////////////////////////////////////////////
        SharedPreferences prefs_11 = PreferenceManager.getDefaultSharedPreferences(this);


        Subjects_total_number_10 = global.album_10_song_number;

        // for favorites
        Boolean[] favorites_11 = new Boolean[Subjects_total_number_11];

        for (int k = 1; k < Subjects_total_number_11 + 1; k++) {
            String each_subject2 = "album_11_" + String.valueOf(k);
            favorites_11[k] = prefs_11.getBoolean(each_subject2, false);

        }


        //////////////////////////////////////////////////////////////////////////////////////////////////
        SharedPreferences prefs_12 = PreferenceManager.getDefaultSharedPreferences(this);

        Subjects_total_number_12 = global.album_12_song_number;

        // for favorites
        Boolean[] favorites_12 = new Boolean[Subjects_total_number_12];

        for (int l = 1; l < Subjects_total_number_12 + 1;l++) {
            String each_subject2 = "album_12_" + String.valueOf(l);
            favorites_12[l] = prefs_12.getBoolean(each_subject2, false);

        }
        //////////////////////////////////////////////////////////////////////////////////////////////////
        SharedPreferences prefs_13 = PreferenceManager.getDefaultSharedPreferences(this);



        Subjects_total_number_13 = global.album_13_song_number;

        // for favorites
        Boolean[] favorites_13 = new Boolean[Subjects_total_number_13];

        for (int m = 1; m < Subjects_total_number_13 + 1; m++) {
            String each_subject2 = "album_10_" + String.valueOf(m);
            favorites_13[m] = prefs_13.getBoolean(each_subject2, false);

        }
//////////////////////////////////////////////////////////////////////////////////////////////////
        SharedPreferences prefs_14 = PreferenceManager.getDefaultSharedPreferences(this);



        Subjects_total_number_14 = global.album_14_song_number;

        // for favorites
        Boolean[] favorites_14 = new Boolean[Subjects_total_number_14];

        for (int n = 1; n < Subjects_total_number_14 + 1; n++) {
            String each_subject2 = "album_14_" + String.valueOf(n);
            favorites_14[n] = prefs_14.getBoolean(each_subject2, false);

        }

        //////////////////////////////////////////////////////////////////////////////////////////////////
        SharedPreferences prefs_15 = PreferenceManager.getDefaultSharedPreferences(this);


        Subjects_total_number_15 = global.album_15_song_number;

        // for favorites
        Boolean[] favorites_15 = new Boolean[Subjects_total_number_15];

        for (int o = 1; o < Subjects_total_number_15 + 1; o++) {
            String each_subject2 = "album_15_" + String.valueOf(o);
            favorites_15[o] = prefs_15.getBoolean(each_subject2, false);
        }

        //////////////////////////////////////////////////////////////////////////////////////////////////
        SharedPreferences prefs_16 = PreferenceManager.getDefaultSharedPreferences(this);


        Subjects_total_number_16 = global.album_16_song_number;

        // for favorites
        Boolean[] favorites_16 = new Boolean[Subjects_total_number_16];

        for (int p = 1; p < Subjects_total_number_16 + 1; p++) {
            String each_subject2 = "album_16_" + String.valueOf(p);
            favorites_16[p] = prefs_16.getBoolean(each_subject2, false);
        }

        //////////////////////////////////////////////////////////////////////////////////////////////////
        SharedPreferences prefs_17 = PreferenceManager.getDefaultSharedPreferences(this);




        Subjects_total_number_17 = global.album_17_song_number;

        // for favorites
        Boolean[] favorites_17 = new Boolean[Subjects_total_number_17];

        for (int q = 1; q < Subjects_total_number_17 + 1; q++) {
            String each_subject2 = "album_17_" + String.valueOf(q);
            favorites_17[q] = prefs_17.getBoolean(each_subject2, false);
        }

        //////////////////////////////////////////////////////////////////////////////////////////////////
        SharedPreferences prefs_18 = PreferenceManager.getDefaultSharedPreferences(this);


        Subjects_total_number_18 = global.album_18_song_number;

        // for favorites
        Boolean[] favorites_18 = new Boolean[Subjects_total_number_18];

        for (int r = 1; r < Subjects_total_number_18 + 1; r++) {
            String each_subject2 = "album_18_" + String.valueOf(r);
            favorites_18[r] = prefs_18.getBoolean(each_subject2, false);
        }

        //////////////////////////////////////////////////////////////////////////////////////////////////
        SharedPreferences prefs_19 = PreferenceManager.getDefaultSharedPreferences(this);


        Subjects_total_number_19 = global.album_19_song_number;

        // for favorites
        Boolean[] favorites_19 = new Boolean[Subjects_total_number_19];

        for (int s = 1;s < Subjects_total_number_19 + 1; s++) {
            String each_subject2 = "album_19_" + String.valueOf(s);
            favorites_19[s] = prefs_19.getBoolean(each_subject2, false);
        }


        //////////////////////////////////////////////////////////////////////////////////////////////////
        SharedPreferences prefs_20 = PreferenceManager.getDefaultSharedPreferences(this);


        Subjects_total_number_20 = global.album_20_song_number;

        // for favorites
        Boolean[] favorites_20 = new Boolean[Subjects_total_number_20];

        for (int t = 1; t < Subjects_total_number_20 + 1; t++) {
            String each_subject2 = "album_20_" + String.valueOf(t);
            favorites_20[t] = prefs_20.getBoolean(each_subject2, false);
        }

        //////////////////////////////////////////////////////////////////////////////////////////////////
        SharedPreferences prefs_21 = PreferenceManager.getDefaultSharedPreferences(this);


        Subjects_total_number_21 = global.album_21_song_number;

        // for favorites
        Boolean[] favorites_21 = new Boolean[Subjects_total_number_21];

        for (int u = 1; u < Subjects_total_number_21 + 1; u++) {
            String each_subject2 = "album_21_" + String.valueOf(u);
            favorites_21[u] = prefs_21.getBoolean(each_subject2, false);
        }

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////
        SharedPreferences prefs_tak = PreferenceManager.getDefaultSharedPreferences(this);


        Subjects_total_number_tak = global.tak_1_song_number;

        // for favorites
        Boolean[] favorites_tak = new Boolean[Subjects_total_number_tak];

        for (int u = 1; u < Subjects_total_number_tak + 1; u++) {
            String each_subject2 = "tak_1_" + String.valueOf(u);
            favorites_tak[u] = prefs_tak.getBoolean(each_subject2, false);
        }
    }
}

//Subjects_total_number2 = global.album_2_song_number;

        // for favorites
      //  Boolean [] favorites = new Boolean [Subjects_total_number2];
       // for(int x = 1; x < Subjects_total_number+1; x++){
       // String each_subject="album_2_song_"+String.valueOf(x);


       // }
       // }
       // }