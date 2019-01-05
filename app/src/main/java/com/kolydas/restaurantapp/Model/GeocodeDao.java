package com.kolydas.restaurantapp.Model;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface GeocodeDao {

    // Adds a Geocode to the database
    @Insert
    void insertAll(Geocode... geo);

    // Removes a geocode from the database
    @Delete
    void delete(Geocode geocode);

    @Query("SELECT * FROM geocode")
    LiveData<List<Geocode>> getAllGeocode(); //use LiveData for multiple changes in db schema
}
