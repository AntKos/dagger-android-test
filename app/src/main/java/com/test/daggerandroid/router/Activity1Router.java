package com.test.daggerandroid.router;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.test.daggerandroid.ui.Activity1;
import com.test.daggerandroid.ui.Activity2;

import javax.inject.Inject;
import static com.test.daggerandroid.util.Logger.log;

public class Activity1Router implements Router {
    private Context context;

    @Inject
    public Activity1Router(Activity1 context) {
        log("Activity1Router created " + this);
        this.context = context;
    }

    @Override
    public void showNextActivity() {
        Intent intent = new Intent(context, Activity2.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        context.startActivity(intent);
    }

    @Override
    protected void finalize() throws Throwable {
        log("Activity1Router finalized " + this);
        super.finalize();
    }
}
