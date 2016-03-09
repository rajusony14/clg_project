package com.example.android.bluetoothchat;




import com.example.android.bluetoothchat.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splash extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        
        new Handler().postDelayed(new Runnable() {
 			  @Override
           public void run() {
               Intent i = new Intent(splash.this, MainActivity.class);
              
               startActivity(i);
               overridePendingTransition(R.anim.zoom_enter, R.anim.zoom_exit);

               // close this activity
               finish();
           }
       }, 5000);
        
    };
}
