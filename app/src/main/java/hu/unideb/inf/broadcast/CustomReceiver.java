package hu.unideb.inf.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String toast_message = "Unknown action received...";

        switch (intent.getAction()){
            case Intent.ACTION_POWER_CONNECTED: toast_message="Power connected."; break;
            case Intent.ACTION_POWER_DISCONNECTED: toast_message="Power disconnected.";
        }

        Toast.makeText(context, toast_message, Toast.LENGTH_SHORT).show();
    }
}
