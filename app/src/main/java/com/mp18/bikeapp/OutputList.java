//Maulik Patel - 15802

package com.mp18.bikeapp;

import android.location.LocationListener;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.LinearLayout;
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
import java.util.AbstractCollection;
import java.util.ArrayList;

public class OutputList extends AppCompatActivity {


    //ASSIGN VARIABLE FOR RECYCLER VIEW AND ADAPTER
    public RecyclerView recyclerView;

    public CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output_list);



        //adapter = new CustomAdapter(jsonlistfetch.getInstance().getLisfOfArrays());

        DownloadTask task = new DownloadTask();
        task.execute("https://api.jcdecaux.com/vls/v1/stations/?apiKey=92ea5e8ece81240cdf77630672002da0d8b00cfb&contract=dublin");

        //        adapter = new CustomAdapter(jsonlistfetch.getInstance().getLisfOfArrays(),getApplicationContext());
//        adapter = new CustomAdapter(jsonlistfetch.getInstance().getLisfOfArrays(),getApplicationContext());
       // adapter = new CustomAdapter(getApplicationContext(), jsonlistfetch.getInstance().getLisfOfArrays());


        //   Log.i("Test =======",js);

        //recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        //recyclerView.setAdapter(adapter);


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

//        adapter = new CustomAdapter(jsonlistfetch.getInstance().getLisfOfArrays(),getApplicationContext());
//        recyclerView.setAdapter(adapter);
//        adapter.notifyDataSetChanged();



      //  Log.d("-----------------","test: "+jsonlistfetch.getInstance().getAddress());
    }





//ASSIGN LIST OF ARRYAS TO GET DATA IN ARRAYAS
        public ArrayList<jsonlistfetch> lisfOfArrays= new ArrayList<>();



//FETCHING THE DATA.
    public class DownloadTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... urls) {

            String result = "";
            URL url;
            HttpURLConnection urlConnection = null;

            try {
                url = new URL(urls[0]);

                urlConnection = (HttpURLConnection) url.openConnection();

                InputStream in = urlConnection.getInputStream();

                InputStreamReader reader = new InputStreamReader(in);

                int data = reader.read();

                while (data != -1) {

                    char current = (char) data;

                    result += current;

                    data = reader.read();

                }

                return result;

            }


            catch (IOException e) {

                // e.printStackTrace();

                Toast.makeText(getApplicationContext(),"Could not find station",Toast.LENGTH_LONG);
            }

            return null;
        }

         JSONObject mp;
        JSONObject mp1;
        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);

            try {

                String message = "";

//                JSONObject jsonObject = new JSONObject(result);
                JSONArray array = new JSONArray(result);

                for (int i=0; i<array.length(); i++){

                     mp = array.getJSONObject(i);


                     mp1 = mp.getJSONObject("position");

                    mp1.getString("lat");
                    mp1.getString("lng");

                    lisfOfArrays.add(new jsonlistfetch(

//FETCHNG THE DATA
                            ""+mp.getString("name"),
                            ""+mp.getString("banking"),
                            ""+mp.getString("bonus"),
                            ""+mp.getString("status"),
                            ""+mp.getString("contract_name"),
                            ""+mp.getString("bike_stands"),
                            ""+mp.getString("available_bike_stands"),
                            ""+mp.getString("available_bikes"),
                            ""+mp1.getString("lat"),
                            ""+mp1.getString("lng")

 ));

//                    String name = mp.getString("name");

                }

                // To set adapter in recyler view
                adapter = new CustomAdapter(lisfOfArrays,getApplicationContext());
                recyclerView.setAdapter(adapter);




            } catch (JSONException e) {
                e.printStackTrace();
            }


        }

    }
}








