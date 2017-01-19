package com.hackingbuzz.service1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // we are working  with service ...we using activity because we are marking user interface n creating button on it..
        // like when we download...we have download button.for that we need UI to see it...
        // we we use startService(intent) to go to Service class...it activates the startCommand method of service class..
        // we use stopServie(intent) to go to Service class....onDestroy() method of serivce class called...
        //these are service life Cycle methods...
        // four main components of Android..... Activities, Services, Broadcast Recivers, Content Providers ( kinda SqL) , Intents..
        // it runs independently of Activity..we use it for long duration work..like downloading, uploading,,,for music player
        // so we can play songs whitout getting bothered...so it doesnt interfare..
    }

    public void startService(View view) { // dont forget to put View class othwise it will crash your application // view is button here

        Intent intent = new Intent(this, ServiceDemo.class );
        startService(intent);  // calling onStartCommand Method..
    }

    public void stopService(View view) {

        stopService(new Intent(this, ServiceDemo.class));
    }


    // now you created the service it will not work until you register them into manifest file... how is it going to know what you have in your project for execution.

}
