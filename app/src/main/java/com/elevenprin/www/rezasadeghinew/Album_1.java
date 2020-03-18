package com.elevenprin.www.rezasadeghinew;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class Album_1 extends ListActivity{

    public Globals0 global = new Globals0();
    private int song_number = global.album_1_song_number;
    private String[] album_1_song =  new String[song_number];  /* {"a","b","c"}; */
    private ListView album_1_listview;
   //////////////////////////////////////////////
    public static SharedPreferences shared_3;
    public SharedPreferences.Editor editor_3;
//////////////////////////////////////////////////////
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album_1);


        /////////////////////////////////////////////////////////////////////////////////////////////////////

        setListAdapter(new MyAdapter(this, android.R.layout.simple_list_item_1, R.id.textView2, album_1_song));

        for(int x = 1 ; x <= song_number ; x = x + 1)
        {
            String this_subject = "album_1_song_" + String.valueOf(x);
            int resID = getResources().getIdentifier(this_subject,"string",getPackageName());
            album_1_song[x-1] = getResources().getString(resID);
        }

        album_1_listview = getListView();
        album_1_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String p = String.valueOf(position+1);
                String c = "album_1_song_" + String.valueOf(position+1);
                Intent a = new Intent(Album_1.this,threeActivity.class);
                a.putExtra("key_number",p);
                a.putExtra("list" , c);
                startActivity(a);
            }
        });
    }

    private class MyAdapter extends ArrayAdapter<String> {

        public MyAdapter(Context context, int resource, int textViewResourceId,
                         String[] strings) {
            super(context, resource, textViewResourceId, strings);
            // TODO Auto-generated constructor stub
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = inflater.inflate(R.layout.list_item, parent, false);

           /* String stringName = "name_of_string";
            int string_res_ID = getResources().getIdentifier(stringName, "string", getPackageName());
            String my_string = getResources().getString(R.string.shahrList);*/
            TextView tv = (TextView) row.findViewById(R.id.textView2);
          // tv.setText(shahrList[position]);
            tv.setText(album_1_song[position]);

            ///////////////////////////////////////////////text size
            shared_3 = getSharedPreferences("Favorites", MODE_PRIVATE);
            editor_3 = shared_3.edit();
            int size =shared_3.getInt("size",10);
            tv.setTextSize(size);
            boolean chbt = shared_3.getBoolean("chk", true);
            if (chbt)
                getWindow()
                        .addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);// safhe
//////////////////////////////////////////////////////////////
            Animation animation = AnimationUtils.loadAnimation(getContext(), R.anim.anim_example);
            row.startAnimation(animation);

            return row;
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
                startActivity(new Intent(Album_1.this, favorites_show.class));
                return true;
            default:
                return true;
        }
    }

}