package com.kolydas.restaurantapp.Model;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {Geocode.class},version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract GeocodeDao getGeocodeDao();


}
