package com.hackingbuzz.service1;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by Avi Hacker on 11/1/2016.
 */
public class ServiceDemo extends Service {                                                                           // two types of services Bound (bound with activites or other components ) and UnBound



   @Nullable
    @Override
    public IBinder onBind(Intent intent) {                                                                          // must implemet method
        return null;
    }


    // this method called when service started
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {                                              //lyfecycle method we implementhing

        Toast.makeText(ServiceDemo.this, "Service is Started", Toast.LENGTH_SHORT).show();                            // for session in service we dont use..( context ) we write className.this ..ServiceDemo.this
        return super.onStartCommand(intent, flags, startId);                                                        // return line should be come in end
    }

    // this method called when service stopped

    @Override
    public void onDestroy() {                                                                                               //user implements methods.. lifecycle method..

        Toast.makeText(ServiceDemo.this, "Service is Stopped", Toast.LENGTH_LONG).show();
        super.onDestroy();
    }
}
