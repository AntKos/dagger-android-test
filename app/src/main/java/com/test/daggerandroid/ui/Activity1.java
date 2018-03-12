package com.test.daggerandroid.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.test.daggerandroid.R;
import com.test.daggerandroid.di.qualifiers.ActivityRouterQualifier;
import com.test.daggerandroid.router.Router;
import com.test.daggerandroid.tools.Tool;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.android.AndroidInjection;

public class Activity1 extends AppCompatActivity {
    @Inject
    Tool tool;
    @Inject @ActivityRouterQualifier
    Router router;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.activity_1_button)
    void startNextActivity() {
        router.showNextActivity();
    }
}
