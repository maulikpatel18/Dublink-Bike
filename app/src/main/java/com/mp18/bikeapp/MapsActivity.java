//Maulik Patel - 15802
package com.mp18.bikeapp;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    public Marker marker;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        //String title= "";

        //System.out.println("ooooooooooooooooo");


        // Add a marker in Dublin and move the camera

// display marker by using Google Lat & Lng

        LatLng D1 = new LatLng(53.349562, -6.278198);

        marker = mMap.addMarker(new MarkerOptions().position(D1).title("address").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(D1, 12));


        LatLng D2 = new LatLng(53.353462, -6.265305);
        marker = mMap.addMarker(new MarkerOptions().position(D2).title("Marker in Dublin").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(D2, 12));

        LatLng D3 = new LatLng(53.336021, -6.26298);
        marker = mMap.addMarker(new MarkerOptions().position(D3).title("Marker in Dublin").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(D3, 12)); //Zoom on the map


        LatLng D4 = new LatLng(53.33796, -6.24153);
        marker = mMap.addMarker(new MarkerOptions().position(D4).title("Marker in Dublin").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(D4, 12));


        LatLng D5 = new LatLng(53.343368, -6.27012);
        marker = mMap.addMarker(new MarkerOptions().position(D5).title("Marker in Dublin").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(D5, 12));


        LatLng D6 = new LatLng(53.334123, -6.265436);
        marker = mMap.addMarker(new MarkerOptions().position(D6).title("Marker in Dublin").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(D6, 12));

        LatLng D7 = new LatLng(53.347777, -6.244239);
        marker = mMap.addMarker(new MarkerOptions().position(D7).title("Marker in Dublin").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(D7, 12));

        LatLng D8 = new LatLng(53.330091, -6.268044);
        marker = mMap.addMarker(new MarkerOptions().position(D8).title("Marker in Dublin").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(D8, 12));

        LatLng D9 = new LatLng(53.339983, -6.295594);
        marker = mMap.addMarker(new MarkerOptions().position(D9).title("Marker in Dublin").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(D9, 12));

        LatLng D10 = new LatLng(53.350929, -6.265125);
        marker = mMap.addMarker(new MarkerOptions().position(D10).title("Marker in Dublin").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(D10, 12));


//        String latii = jsonlistfetch.getInstance().getLat();
       // String latq = jsonlistfetch.getInstance().getLat();


       // Log.i("ye ha ga data ",""+latq);

//        LatLng sydney = new LatLng(-33.852, 151.211);
//        googleMap.addMarker(new MarkerOptions().position(sydney)
//                .title("Marker in Sydney"));
//        googleMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
//        for (int i = 0; i < jsonlistfetch.getInstance().getLisfOfArrays().size(); i++) {


     //  for (int i = 0; i <jsonlistfetch.getInstance().getLisfOfArrays().size(); i++) {

//            Parsing the fetced lat lng in double because they are in String and google Map is taking the lat lng in
//            Double

//           double lat = Double.parseDouble(jsonlistfetch.getInstance().getLisfOfArrays().get(i).getLat());
//            double lng = Double.parseDouble(jsonlistfetch.getInstance().getLisfOfArrays().get(i).getLng());
//
//           System.out.println("oooooooooooooooo"+lat+"   "+lng);

//          Getting the address from the json and stored them in String
            // title = jsonlistfetch.getInstance().getLisfOfArrays().get(i).getAddress();


            //Adding marker in different place with lat lng double implementing in the lat lng value
//            marker = mMap.addMarker(new MarkerOptions().position(new LatLng(lat, lng)).title(title).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
//            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(lat, lng), 14));



        //This is on click marker method using this method to click the marker and going to the next actity
//        mMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
//            @Override
//           // public void onInfoWindowClick(Marker marker) {


//      This is the onClick listner show the new activity when user click on the markers in Google Maps
//                Intent intent = new Intent(getApplicationContext(), Full.class);
//                intent.putExtra("title", marker.getTitle());
//                startActivity(intent);
            }


    }







//}
