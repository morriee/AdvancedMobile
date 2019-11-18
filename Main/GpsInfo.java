package com.example.papaya;

import android.app.Service;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

public class GpsInfo extends Service implements LocationListener {

    private final Context mContext;
    boolean useGPS = false;     //현재 GPS 사용유무
    boolean useNetwork = false;     //현재 네트워크 사용유무
    boolean getPosition = false;    //GPS 상태값

    Location location;
    double latitude; // 위도
    double longitude; // 경도

    private static final long MIN_DISTANCE_UPDATES = 10;        // GPS 정보 업데이트 거리 10미터
    private static final long MIN_TIME_UPDATES = 1000 * 60 * 1;     // GPS 정보 업데이트 시간 1/1000

    protected LocationManager locationManager;

    public GpsInfo(Context context) {
        this.mContext = context;
        getLocation();
    }


    public Location getLocation() {

        try {
            locationManager = (LocationManager) mContext.getSystemService(LOCATION_SERVICE);

            useGPS = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);

            useNetwork = locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER);

            if (!useGPS && !useNetwork) {
            } else {
                this.getPosition = true;
                if (useNetwork) {
                    locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, MIN_TIME_UPDATES, MIN_DISTANCE_UPDATES, this);

                    if (locationManager != null) {
                        location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
                        if (location != null) {
                            // 위도 경도 저장
                            latitude = location.getLatitude();
                            longitude = location.getLongitude();
                        }
                    }
                }

                if (useGPS) {
                    if (location == null) {
                        locationManager.requestLocationUpdates(
                                        LocationManager.GPS_PROVIDER, MIN_TIME_UPDATES, MIN_DISTANCE_UPDATES, this);

                        if (locationManager != null) {
                            location = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);

                            if (location != null) {
                                latitude = location.getLatitude();
                                longitude = location.getLongitude();
                            }
                        }
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return location;
    }

    @Override
    public void onLocationChanged(Location location) {

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }
}
