package com.elevenprin.www.rezasadeghinew;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

/**
 * Created by NP on 4/8/2016.
 */
public class launcher extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launcher);

///////////////////////////////////////////////////////////////////////
         TextView tb_1 =(TextView)findViewById(R.id.textLaunch_1);
        TranslateAnimation anim1 = new TranslateAnimation(-400, 40, 40, 40);
        anim1.setDuration(2500);

        tb_1.startAnimation(anim1);

/////////////////////////////////////////////////////////////////////////////////
        TextView tb_2 =(TextView)findViewById(R.id.textLaunch_2);
        TranslateAnimation anim2 = new TranslateAnimation(-400, 40, 40, 40);
        anim2.setDuration(2500);
        tb_2.startAnimation(anim2);

//////////////////////////////////////////////////////////////////////////////////
        TextView tb_3 =(TextView)findViewById(R.id.textLaunch_3);
        TranslateAnimation anim3 = new TranslateAnimation(-400, 40, 40, 40);
        anim3.setDuration(2500);

        tb_3.startAnimation(anim3);
////////////////////////////////////////////////////////////////////////////////////
        TextView tb_4 =(TextView)findViewById(R.id.textLaunch_4);
        TranslateAnimation anim4 = new TranslateAnimation(-400, 40, 40, 40);
        anim4.setDuration(2500);

        tb_4.startAnimation(anim4);

///////////////////////////////////////////////////////////////////
        TextView tb_5 =(TextView)findViewById(R.id.textLaunch_5);
        TranslateAnimation anim5 = new TranslateAnimation(-400, 40, 40, 40);
        anim5.setDuration(2500);

        tb_5.startAnimation(anim5);











        Thread timer = new Thread(){
            @Override
            public void run(){

                try{
                    sleep(5000);
                }catch (InterruptedException whatIsmyproblem){
                    whatIsmyproblem.printStackTrace();
                }finally {
                    Intent intent = new Intent(launcher.this,MainActivity.class);
                    startActivity(intent);

                finish();
                }

            }
        };
        timer.start();
    }
}

