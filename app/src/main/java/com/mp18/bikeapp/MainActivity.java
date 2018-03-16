//Maulik Patel - 15802
package com.mp18.bikeapp;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//ASSIGNN THE BUTTONS ON THE MAIN PAGE


        Button listbutton = (Button) findViewById(R.id.listbutton);
        Button mapButton = (Button) findViewById(R.id.mapButton);
        Button about = (Button) findViewById(R.id.about);


       // adapter = new CustomAdapter(jsonlistfetch.getInstance().getLisfOfArrays());

        //    recyclerView.setAdapter(adapter);

        //SET ON CLICK ON THE LIST BUTTON

        listbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Intent i = new Intent(this,RecyclerView.class);
                Intent i = new Intent(getApplicationContext(), OutputList.class);

                startActivity(i);
                Toast.makeText(getApplicationContext(), "You clicked On List Button", Toast.LENGTH_LONG).show();

            }
        });

//SET ON CLICK ON THE MAP
        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(), "You clicked On Map Button", Toast.LENGTH_LONG).show();

            }
        });

//SET ON CLICK ON THE ABOUT

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent i = new Intent(getApplicationContext(), About.class);

                startActivity(i);
                Toast.makeText(getApplicationContext(), "You clicked On About Button", Toast.LENGTH_LONG).show();

            }
        });

    }





}





