package com.test.daggerandroid.router;


import android.content.Context;
import android.content.Intent;

import com.test.daggerandroid.ui.Activity1;
import com.test.daggerandroid.ui.Activity2;

import javax.inject.Inject;

import dagger.android.AndroidInjector;

import static com.test.daggerandroid.util.Logger.log;

public class FragmentRouter implements Router {
    private Context context;

    @Inject
    public FragmentRouter(Activity2 context) {  //инжектим Activity, которая видна в этом Scope
        log("FragmentRouter created " + this);
        this.context = context;
    }

    @Override
    public void showNextActivity() {
        Intent intent = new Intent(context, Activity1.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    @Override
    protected void finalize() throws Throwable {
        log("FragmentRouter finalized " + this);
        super.finalize();
    }
}
