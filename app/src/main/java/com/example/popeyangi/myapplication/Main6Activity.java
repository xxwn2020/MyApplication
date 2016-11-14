package com.example.popeyangi.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.common.api.GoogleApiClient;


public class Main6Activity extends AppCompatActivity {
    Intent intent = null;

    Button voicecorrect;
    Button voicedelete;
    Button voiceend;
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
        setContentView(R.layout.activity_main6);
        voicecorrect = (Button) findViewById(R.id.voicecorrect);
        voicedelete = (Button) findViewById(R.id.voicedelete);
        voiceend = (Button) findViewById(R.id.voiceend);

        voiceend.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Main6Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
