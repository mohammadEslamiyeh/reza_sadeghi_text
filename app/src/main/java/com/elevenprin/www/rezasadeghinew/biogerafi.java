package com.elevenprin.www.rezasadeghinew;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

/**
 * Created by NP on 4/15/2016.
 */
public class biogerafi extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.biogerafi);
        TextView tx = (TextView)findViewById(R.id.txtbio);
        TranslateAnimation anim1 = new TranslateAnimation(-400, 40, 40, 40);
        anim1.setDuration(2500);

        tx.startAnimation(anim1);
    }
}
