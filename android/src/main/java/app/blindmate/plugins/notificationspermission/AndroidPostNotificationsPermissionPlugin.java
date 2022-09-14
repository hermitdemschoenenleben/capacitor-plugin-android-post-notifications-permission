package app.blindmate.plugins.notificationspermission;

import android.Manifest;
import android.os.Build;
import android.util.Log;

import java.util.HashMap;
import java.util.Map;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.PermissionState;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.annotation.Permission;
import com.getcapacitor.annotation.PermissionCallback;
import com.getcapacitor.util.PermissionHelper;

@CapacitorPlugin(
    name = "AndroidPostNotificationsPermission",
    permissions = {
        @Permission(strings = { Manifest.permission.POST_NOTIFICATIONS }, alias = AndroidPostNotificationsPermissionPlugin.POST_NOTIFICATIONS)
    }

)
public class AndroidPostNotificationsPermissionPlugin extends Plugin {

    private static final String TAG = "AndroidPostNotificationsPermissionPlugin";
    static final String POST_NOTIFICATIONS = "postNotifications";
    private AndroidPostNotificationsPermission implementation = new AndroidPostNotificationsPermission();

    @PluginMethod
    public void echo(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("value", implementation.echo(value));
        call.resolve(ret);
    }

    @Override
    @PluginMethod
    public void checkPermissions(PluginCall call) {
        if (!autoGrantPermissionsOnOldAndroidVersions(call)) {
            super.checkPermissions(call);
        }
    }

    @Override
    @PluginMethod
    public void requestPermissions(PluginCall call) {
        if (!autoGrantPermissionsOnOldAndroidVersions(call)) {
            super.requestPermissions(call);
        }
    }

    public boolean autoGrantPermissionsOnOldAndroidVersions(PluginCall call) {
        Map<String, PermissionState> permissionsResults = new HashMap<>();
        if (Build.VERSION.SDK_INT < 33) {
            Log.v(TAG, "android version is pre-13: POST_NOTIFICATION permission is always granted");

            permissionsResults.put(POST_NOTIFICATIONS, PermissionState.GRANTED);

            JSObject permissionsResultJSON = new JSObject();
            for (Map.Entry<String, PermissionState> entry : permissionsResults.entrySet()) {
                permissionsResultJSON.put(entry.getKey(), entry.getValue());
            }
            call.resolve(permissionsResultJSON);
            return true;
        } else {
            Log.v(TAG, "android version is 13 or higher: POST_NOTIFICATION permission is not granted by default");

            return false;
        }
    }
}
