//Maulik Patel - 15802
package com.mp18.bikeapp;

import android.content.Context;
import android.graphics.Movie;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by mp18 on 09/03/2018.
 */


public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder>{

//ASSIGN VARIABLES

        private List<jsonlistfetch> list;
        private Context context;
        public CustomAdapter(List<jsonlistfetch> list,Context context) {
        this.list = list;
        this.context = context;
    }

        public class ViewHolder extends RecyclerView.ViewHolder {

            //  ID assign status, bikeavailable, address,Lat&Lng;

            public TextView status;
            public TextView bikeAvailable;
            public TextView bikestands;
            public TextView address;
            public LinearLayout linearLayout;
            public TextView tvLng;
            public TextView tvLat;



// SET THE VARIABLE BY ID

            public ViewHolder(View view) {
                super(view);
                status = (TextView) view.findViewById(R.id.status);
                bikeAvailable = (TextView) view.findViewById(R.id.bikeAvailable);
                bikestands = (TextView) view.findViewById(R.id.bikestands);
                address= (TextView) view.findViewById(R.id.address);
                tvLng=(TextView) view.findViewById(R.id.tvLng) ;
                tvLat=(TextView) view.findViewById(R.id.tvLat) ;

                linearLayout= (LinearLayout) view.findViewById(R.id.linearlayout);






            }
        }



//GETTING THE LAYOUT OF THE CARDVIEW (INFLATING THE LAYOUT)
        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//            View itemView = LayoutInflater.from(parent.getContext());

            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            View fit = inflater.inflate(R.layout.cardviewlist, parent ,false);
//                    .inflate(R.layout.cardviewlist, parent, false);

            return new ViewHolder(fit);
        }

        // To set text from JSONlistfech


    //BINDING TH EDATA INTO LIST
    @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            final jsonlistfetch jsonlistFetch = list.get(position);

            holder.status.setText(jsonlistFetch.getStatus());
            holder.bikeAvailable.setText(jsonlistFetch.getAvailable_bikes());
            holder.bikestands.setText(jsonlistFetch.getAvailable_bike_stands());
            holder.address.setText(jsonlistFetch.getAddress());
            holder.tvLng.setText(jsonlistFetch.getLng());
            holder.tvLat.setText(jsonlistFetch.getLat());

            // holder.address.setText(jsonlistFetch.getLat());
       //holder.address.setText(jsonlistFetch.getLng());



        //SHOWING THE ONCLIKC LISTNER
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, jsonlistFetch.getAddress(), Toast.LENGTH_SHORT).show();
                
            }
        });

        }

//        CHECK THE SIZE OF THE LIST

        @Override
        public int getItemCount() {
            return list.size();
        }



}
