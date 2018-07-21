package com.itsteps.altair.practical2;


import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //private static int SPLASH_TIME_OUT = 3000;
    Button btnTimer;
    Button btnCalender;
    Button btnBrowser;
    Button btnEmail;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTimer = (Button) findViewById(R.id.timer_btn);
        btnCalender = (Button) findViewById(R.id.calender_btn);
        btnBrowser = (Button) findViewById(R.id.browser_btn);
        btnEmail= (Button) findViewById(R.id.email_btn);
        btnTimer.setOnClickListener(this);
        btnCalender.setOnClickListener(this);
        btnBrowser.setOnClickListener(this);
        btnEmail.setOnClickListener(this);

    }

    /*public void newScreen(View v) {
        Intent intObj = new Intent(this, SecondActivity.class);
        startActivity(intObj);
    }*/

    @Override
    public void onClick(View v) {
        Intent intent;
        Intent intObj;

        switch (v.getId()){
            case R.id.browser_btn:
                intObj = new Intent(this, FirstActivity.class);
                startActivity(intObj);
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(intent);
                break;

            case R.id.email_btn:
                intObj = new Intent(this, SecondActivity.class);
                startActivity(intObj);
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:?subject=" + "blah blah subject" + "&body=" + "blah blah body" + "&to=" + "sendme@me.com"));
                //intent.setData(data);
                startActivity(intent);
                break;


            case R.id.timer_btn:
                intObj = new Intent(this, ThreeActivity.class);
                startActivity(intObj);

                break;

            case R.id.calender_btn:
                intObj = new Intent(this, FourActivity.class);
                startActivity(intObj);
                break;
        }
    }
}
