package com.kolydas.restaurantapp;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kolydas.restaurantapp.Model.AppDatabase;
import com.kolydas.restaurantapp.Model.Geocode;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get an instance of the created database using the following code:
        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "geo-database").build();

        //get all the geocode data that's in the database
        LiveData<List<Geocode>> everyRest = db.getGeocodeDao().getAllGeocode();
    }
}
