//Maulik Patel - 15802
package com.mp18.bikeapp;

import java.util.ArrayList;

/**
 * Created by mp18 on 09/03/2018.
 */
//MODEL CLASS  ASSIGN THE VARAIBLES GETTER METHOD
public class jsonlistfetch {


// String to store all detalis about station

    private String address;
    private String banking;
    private String bonus;
    private String status;
    private String contract_name;
    private String bike_stands;
    private String available_bike_stands;
    private String available_bikes;
    private String lat;
    private String lng;




// JSON DATA fech process start

    public   static jsonlistfetch instance;

    public static jsonlistfetch getInstance() {

        if(instance == null)
            return  instance = new jsonlistfetch();


        else
            return instance;
    }


    private   ArrayList<jsonlistfetch> lisfOfArrays= new ArrayList<jsonlistfetch>();
//    ArrayList test = new ArrayList();

//    private jsonlistfetch parts;

    public  jsonlistfetch(){

    }
// CONSTRUCTOR TO GET DATA FROM BACK
    // KINDA OF OBJECT TO  CONNECT FOR EXAMPLE -- ADDRESS WITH ADDRESS


    public jsonlistfetch(String address, String banking, String bonus, String status, String contract_name, String bike_stands, String available_bike_stands, String available_bikes,String lat, String lng) {
        this.address = address;
        this.banking = banking;
        this.bonus = bonus;
        this.status = status;
        this.contract_name = contract_name;
        this.bike_stands = bike_stands;
        this.available_bike_stands = available_bike_stands;
        this.available_bikes = available_bikes;
        this.lat = lat;
        this.lng = lng;

    }

    // MY GETTER TO GET DATA IN CONSTRUCTOR

    public String getAddress() {
        return address;
    }

    public String getBanking() {
        return banking;
    }

    public String getBonus() {
        return bonus;
    }

    public String getStatus() {
        return status;
    }

    public String getContract_name() {
        return contract_name;
    }

    public String getBike_stands() {
        return bike_stands;
    }

    public String getAvailable_bike_stands() {
        return available_bike_stands;
    }

    public String getAvailable_bikes() {
        return available_bikes;
    }

    public String getLat() {
        return lat;
    }

    public String getLng() {
        return lng;
    }

    public ArrayList<jsonlistfetch> getLisfOfArrays() {

        return lisfOfArrays;
    }











}



