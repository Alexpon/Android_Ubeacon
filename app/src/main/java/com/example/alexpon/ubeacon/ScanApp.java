package com.example.alexpon.ubeacon;

/*
 * Created by alexpon on 2015/5/24.
 */

import org.altbeacon.beacon.BeaconManager;
import org.altbeacon.beacon.powersave.BackgroundPowerSaver;
import android.app.Application;

public class ScanApp extends Application{
    private BackgroundPowerSaver backgroundPowerSaver;
    private BeaconManager beaconManager;

    public BeaconManager getBeaconManager() {
        return beaconManager;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        // Allow scanning to continue in the background.
        backgroundPowerSaver = new BackgroundPowerSaver(this);
        beaconManager = BeaconManager.getInstanceForApplication(this);
    }

}
