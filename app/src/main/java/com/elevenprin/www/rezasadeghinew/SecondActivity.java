package com.elevenprin.www.rezasadeghinew;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class SecondActivity extends ListActivity {

    public static SharedPreferences shared;
    public SharedPreferences.Editor editor;

    private Globals0 global = new Globals0();
    private int album_number = global.album_total_number;
    private String[] shahrList = new String[album_number]; //{"tehran", "shiraz", "tabriz", "esfahan", "arak", "zanjan"};
    public ListView lv;
    public String number;
    Intent a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        setListAdapter(new MyAdapter(this,
                android.R.layout.simple_list_item_1,
                R.id.textView2,
                shahrList));

        for(int x = 1 ; x<= album_number ; x = x +1)
        {
            String this_subject = "album_" + String.valueOf(x);
            int resID = getResources().getIdentifier(this_subject,"string",getPackageName());
            shahrList[x-1] = getResources().getString(resID);
        }


        lv = getListView();
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, final View view,
                                    int position, long id) {
                /*Intent i = new Intent(getApplicationContext(), threeActivity.class);
                String number = String.valueOf(position + 1);
//                i.putExtra("key_number", number);
                    i.putExtra("key_number",number);
                startActivity(i);*/

                switch (position+1)
                {
                    case 1:{
                        startActivity(new Intent(SecondActivity.this,Album_1.class));
                        break;
                    }
                    case 2:{
                        startActivity(new Intent(SecondActivity.this , Album_2.class));
                        break;
                    }
                    case 3:{
                        startActivity(new Intent(SecondActivity.this,Album_3.class));
                        break;
                    }
                    case 4:{
                        startActivity(new Intent(SecondActivity.this,Album_4.class));
                        break;
                    }
                    case 5 :{
                        startActivity(new Intent(SecondActivity.this,Album_5.class));
                        break;
                    }
                    case 6:{
                        startActivity(new Intent(SecondActivity.this,Album_6.class));
                        break;
                    }
                    case 7:{
                        startActivity(new Intent(SecondActivity.this,Album_7.class));
                        break;
                    }
                    case 8:{
                        startActivity(new Intent(SecondActivity.this,Album_8.class));
                        break;
                    }
                    case 9:{
                        startActivity(new Intent(SecondActivity.this,Album_9.class));
                    break;
                    }
                    case 10:{
                        startActivity(new Intent(SecondActivity.this,Album_10.class));
                    break;
                    }
                    case 11:{
                        startActivity(new Intent(SecondActivity.this,Album_11.class));
                        break;
                    }
                    case 12:{
                        startActivity(new Intent(SecondActivity.this,Album_12.class));
                        break;
                    }
                    case 13:{
                        startActivity(new Intent(SecondActivity.this,Album_13.class));
                        break;
                    }
                    case 14:{
                        startActivity(new Intent(SecondActivity.this,Album_14.class));
                    break;
                    }
                    case 15:{
                        startActivity(new Intent(SecondActivity.this,Album_15.class));
                    break;
                    }
                    case 16:{
                        startActivity(new Intent(SecondActivity.this,Album_16.class));
                    break;
                    }
                    case 17:{
                        startActivity(new Intent(SecondActivity.this,Album_17.class));
                    break;
                    }
                    case 18:{
                        startActivity(new Intent(SecondActivity.this,Album_18.class));
                    break;
                    }
                    case 19:{
                        startActivity(new Intent(SecondActivity.this,Album_19.class));
                    break;
                    }
                    case 20:{
                        startActivity(new Intent(SecondActivity.this,Album_20.class));
                    break;
                    }
                    case 21:{
                        startActivity(new Intent(SecondActivity.this,Album_21.class));
                    break;
                    }
                }

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
//            tv.setText(shahrList[position]);
            tv.setText(shahrList[position]);
            shared  = getSharedPreferences("Favorites", MODE_PRIVATE);
            editor = shared.edit();
            ///////////////////////////////////////////////text size
            int size =shared.getInt("size",10);
            tv.setTextSize(size);
            boolean chbt = shared.getBoolean("chk", true);
            if (chbt)
                getWindow()
                        .addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);// safhe
//////////////////////////////////////////////////////////////
            Animation animation = AnimationUtils.loadAnimation(getContext(), R.anim.anim_example);
            row.startAnimation(animation);

            return row;
        }

    }
}

