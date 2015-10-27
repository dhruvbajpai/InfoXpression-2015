package com.infox.dhruv.techfest;

import android.app.Application;
import com.parse.Parse;
import com.parse.PushService;
/**
 * Created by Dhruv on 08-Feb-15.
 */
public class TechApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "mdcVUeM24dxKyyqcwwWo6uHdpYKfIkQzbwuroh9l", "u3VKAaLaffumWRStBEShce4iEhGF9tMVrjUirXYc");
        PushService.setDefaultPushCallback(this,MainActivity.class);
    }
}
