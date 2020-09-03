package com.example.ti1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class BroadReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        if (intent.getExtras().getBoolean("connected")){
            Intent llamada = new Intent(Intent.ACTION_CALL);
            llamada.setData(Uri.parse("tel:" + "91136218862"));

            Toast.makeText(context,"llamando", Toast.LENGTH_LONG);

        }else{
            Toast.makeText(context, "llamada detenida", Toast.LENGTH_SHORT).show();
        }
        
    }
}
