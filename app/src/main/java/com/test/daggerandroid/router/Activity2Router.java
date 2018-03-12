package com.test.daggerandroid.router;

import android.content.Context;
import android.content.Intent;

import com.test.daggerandroid.ui.Activity1;
import com.test.daggerandroid.ui.Activity2;

import javax.inject.Inject;

import static com.test.daggerandroid.util.Logger.log;

public class Activity2Router implements Router {

    private Context context;

    @Inject
    public Activity2Router(Activity2 context) {
        log("Activity2Router created " + this);
        this.context = context;
    }

    @Override
    public void showNextActivity() {
        context.startActivity(new Intent(context, Activity1.class));
    }

    @Override
    protected void finalize() throws Throwable {
        log("Activity2Router finalized " + this);
        super.finalize();
    }
}
