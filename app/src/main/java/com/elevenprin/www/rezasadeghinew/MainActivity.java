package com.elevenprin.www.rezasadeghinew;

import android.annotation.SuppressLint;
import android.app.ActivityOptions;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        /////BUTTON_1//////////////////////////////////////////////////////////////////////////////////////////////////////////

        Button open_album = (Button) findViewById(R.id.album);
        open_album.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NewApi")
            @Override
            public void onClick(View v) {
                Intent slideactivity = new Intent(MainActivity.this, SecondActivity.class);
                Bundle bndlanimation =
                        ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.animation, R.anim.anmation2).toBundle();
                startActivity(slideactivity, bndlanimation);

            }
        });
/////////BUTTON_2/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Button open_tak = (Button) findViewById(R.id.takahang);
        open_tak.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NewApi")
            @Override
            public void onClick(View v) {
                Intent slideactivity = new Intent(MainActivity.this, tak_1.class);
                Bundle bndlanimation =
                        ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.animation, R.anim.anmation2).toBundle();
                startActivity(slideactivity, bndlanimation);

            }
        });



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar,R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            AlertDialog.Builder Dialog = new AlertDialog.Builder(MainActivity.this);
            Dialog.setMessage("آیا واقعا قصد خروج دارید؟");
            Dialog.setTitle("خروج");
            Dialog.setCancelable(false);
            Dialog.setPositiveButton("بله", new DialogInterface.OnClickListener() {

                @Override
                public void onClick(DialogInterface dialog, int which) {

                    Intent intent = new Intent(Intent.ACTION_MAIN);
                    intent.addCategory(Intent.CATEGORY_HOME);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                    finish();
                }
            });

            Dialog.setNegativeButton("خیر", new DialogInterface.OnClickListener() {

                @Override
                public void onClick(DialogInterface dialog, int which) {

                    dialog.cancel();

                }
            });
            AlertDialog alert = Dialog.create();
            alert.show();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.settings) {

            startActivity(new Intent(MainActivity.this, setting.class));

        } else if (id == R.id.favorites) {

            startActivity(new Intent(MainActivity.this, favorites_show.class));
        }else if (id==R.id.manabe){

            startActivity(new Intent(MainActivity.this,manabe.class));

        } else if (id == R.id.about) {

            startActivity(new Intent(MainActivity.this,About_us.class));

        } else if (id == R.id.biogerafi) {


            startActivity(new Intent(MainActivity.this, biogerafi.class));


        } else if (id == R.id.exite) {

            AlertDialog.Builder Dialog = new AlertDialog.Builder(MainActivity.this);
            Dialog.setMessage("آیا واقعا قصد خروج دارید؟");
            Dialog.setTitle("خروج");
            Dialog.setCancelable(false);
            Dialog.setPositiveButton("بله", new DialogInterface.OnClickListener() {

                @Override
                public void onClick(DialogInterface dialog, int which) {

                    Intent intent = new Intent(Intent.ACTION_MAIN);
                    intent.addCategory(Intent.CATEGORY_HOME);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                    finish();
                }
            });

            Dialog.setNegativeButton("خیر", new DialogInterface.OnClickListener() {

                @Override
                public void onClick(DialogInterface dialog, int which) {

                    dialog.cancel();

                }
            });
            AlertDialog alert = Dialog.create();
            alert.show();

        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
