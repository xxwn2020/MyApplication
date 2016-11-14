package com.example.popeyangi.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.common.api.GoogleApiClient;


public class Main7Activity extends AppCompatActivity {
    Intent intent = null;

    Button textcorrect;
    Button textdelete;
    Button textend;
    /*
* ATTENTION: This was auto-generated to implement the App Indexing API.
* See https://g.co/AppIndexing/AndroidStudio for more information.
*/
    private GoogleApiClient client;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        textcorrect = (Button) findViewById(R.id.textcorrect);
        textdelete = (Button) findViewById(R.id.textdelete);
        textend = (Button) findViewById(R.id.textend);

        textend.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Main7Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

