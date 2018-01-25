package com.appbyme.app272523.base.util;

import android.content.Context;
import android.content.Intent;

import com.appbyme.app272523.app.service.ClanService;

/**
 * Created by Zhao on 15/9/9.
 */
public class ServiceUtils {

    public static void startClanService(Context context, String action) {
        Intent intent = new Intent(context, ClanService.class);
        intent.setAction(action);
        context.startService(intent);
    }

    public static void stopClanService(Context context, String action) {
        Intent intent = new Intent(context, ClanService.class);
        intent.setAction(action);
        context.stopService(intent);
    }
}
