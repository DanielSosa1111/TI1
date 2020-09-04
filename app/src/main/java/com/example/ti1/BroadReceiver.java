package com.example.ti1;

import android.Manifest;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.widget.Toast;

import androidx.core.app.ActivityCompat;

public class BroadReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        if (intent.getExtras().getBoolean("connected")){

            Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel:910"));

            Toast.makeText(context,"llamando", Toast.LENGTH_LONG);

        }else{
            Toast.makeText(context, "llamada detenida", Toast.LENGTH_SHORT).show();
        }

    }
}
