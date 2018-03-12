package com.test.daggerandroid.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.test.daggerandroid.R;
import com.test.daggerandroid.di.qualifiers.FragmentRouterQualifier;
import com.test.daggerandroid.router.Router;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.android.support.AndroidSupportInjection;

public class Fragment1 extends Fragment {

    @Inject
    @FragmentRouterQualifier
    Router router;

    @Override
    public void onAttach(Context context) {
        AndroidSupportInjection.inject(this);
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick(R.id.btn_move_to_activity)
    void moveToFirstActivity() {
        router.showNextActivity();
    }
}
