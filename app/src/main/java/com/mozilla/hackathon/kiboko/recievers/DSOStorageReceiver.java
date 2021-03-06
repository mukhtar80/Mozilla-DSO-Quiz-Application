package com.mozilla.hackathon.kiboko.recievers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.mozilla.hackathon.kiboko.App;
import com.mozilla.hackathon.kiboko.events.LowstorageStateChanged;

/**
 * Created by mwadime on 6/7/2016.
 */
public class DSOStorageReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().matches(Intent.ACTION_DEVICE_STORAGE_LOW)){
            App.getBus().post(new LowstorageStateChanged(true));
        }
    }
}
