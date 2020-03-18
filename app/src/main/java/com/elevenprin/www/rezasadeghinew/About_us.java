package com.elevenprin.www.rezasadeghinew;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;

/**
 * Created by NP on 7/6/2016.
 */
public class About_us extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_us);


        final FloatingActionButton fab_1 = (FloatingActionButton) findViewById(R.id.show2_fab);

        fab_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(About_us.this,Email.class));


            }
        });

        final FloatingActionButton fab_2 = (FloatingActionButton) findViewById(R.id.show3_fab);

        fab_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://telegram.me/mohammades6634"));
                startActivity(browserIntent);

            }

        });
    }
}
