package com.elevenprin.www.rezasadeghinew;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.widget.AppCompatSeekBar;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * Created by NP on 5/29/2016.
 */
public class setting extends Activity {


    SwitchCompat swichCompat;
    AppCompatSeekBar seekBar;
    AppCompatSeekBar seekBar_2;
    int bright;
    int bright_2;
    int size;
    boolean chbt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);


        final CheckBox chb = (CheckBox)findViewById(R.id.chbR);
        chb.setChecked(chbt);
///////////////////////////////////////////////////////////////////////////////////////////////////
        final SharedPreferences shp = getSharedPreferences("Favorites", MODE_PRIVATE);
        chbt = shp.getBoolean("chk", true);
        Button btnsave =(Button)findViewById(R.id.save);
        final SeekBar skb = (SeekBar)findViewById(R.id.seekbar_2);
        skb.setMax(60);
        size = shp.getInt("size",10);
        final TextView changfont = (TextView)findViewById(R.id.textView6);
        skb.setKeyProgressIncrement(1);
        skb.setProgress((int) size);

        skb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
            changfont.setTextSize(i);
                size = i;

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor shpE = shp.edit();
                shpE.putBoolean("chk",chb.isChecked());
                shpE.putInt("size",size);
                shpE.commit();
                finish();


            }
        });

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*seekBar = (AppCompatSeekBar) findViewById(R.id.seekbar);

        try {
            bright = Settings.System.getInt(getContentResolver(), Settings.System.SCREEN_BRIGHTNESS);
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
        }
        seekBar.setKeyProgressIncrement(1);
        seekBar.setProgress(bright);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                bright = i;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                Settings.System.putInt(getContentResolver(), Settings.System.SCREEN_BRIGHTNESS_MODE, Settings.System.SCREEN_BRIGHTNESS_MODE_MANUAL);


                Settings.System.putInt(getContentResolver(), Settings.System.SCREEN_BRIGHTNESS, bright);
            }
        });*/

    }
}
