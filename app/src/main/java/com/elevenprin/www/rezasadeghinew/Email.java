package com.elevenprin.www.rezasadeghinew;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by NP on 5/28/2016.
 */
public class Email extends Activity {
    EditText Email, Subject, Text;
    TextView email;
    Button Send;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.email);


       /* Button btn = (Button) findViewById(R.id.bSend);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, "موضوع");
                intent.putExtra(Intent.EXTRA_TEXT, "متن:");
                intent.setData(Uri.parse("mailto:mohammades6634@gmail.com")); //"mailto:" برای ایمیل بدون ارسال کننده خاص
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); // برای اینکه وقتی کاربر برگشت برنامه شما نشان داده شود نه صفحه اصلی برنامه ایمیل
                startActivity(intent);



            }
        });

    }
}*/
        init();
        Send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String E_mail = email.getText().toString();
                String subject = Subject.getText().toString();
                String text = Text.getText().toString();
                String EmailAdress[] = {E_mail};


                Intent sendEmail = new Intent(Intent.ACTION_SEND);
                sendEmail.putExtra(Intent.EXTRA_EMAIL, EmailAdress);
                sendEmail.putExtra(Intent.EXTRA_SUBJECT, subject);
                sendEmail.setType("plain/text");
             //sendEmail.setData(Uri.parse("mailto:mohammades6634@gmail.com"));
                sendEmail.putExtra(Intent.EXTRA_TEXT, text);


                startActivity(sendEmail);
            }
        });
    }

    private void init() {

       // Email = (EditText) findViewById(R.id.etEmailAdd);
        email =(TextView)findViewById(R.id.text_email);
        Subject = (EditText) findViewById(R.id.etSubject);
        Text = (EditText) findViewById(R.id.etText);

        Send = (Button) findViewById(R.id.bSend);
    }
}
