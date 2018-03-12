package com.test.daggerandroid.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.test.daggerandroid.R;
import com.test.daggerandroid.di.qualifiers.ActivityRouterQualifier;
import com.test.daggerandroid.router.Router;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.android.AndroidInjection;
import dagger.android.DaggerActivity;
import dagger.android.support.AndroidSupportInjection;
import dagger.android.support.DaggerAppCompatActivity;

public class Activity2 extends DaggerAppCompatActivity {
    @Inject
    @ActivityRouterQualifier
    Router router;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.activity_2_button)
    void startPreviousActivity() {
        router.showNextActivity();
    }
}
