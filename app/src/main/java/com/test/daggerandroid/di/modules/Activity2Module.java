package com.test.daggerandroid.di.modules;

import com.test.daggerandroid.di.qualifiers.ActivityRouterQualifier;
import com.test.daggerandroid.di.scopes.ActivityScope;
import com.test.daggerandroid.di.scopes.FragmentScope;
import com.test.daggerandroid.router.Activity1Router;
import com.test.daggerandroid.router.Activity2Router;
import com.test.daggerandroid.router.Router;
import com.test.daggerandroid.ui.Fragment1;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public interface Activity2Module {
    @ActivityScope
    @Binds
    @ActivityRouterQualifier
    Router provideRouter(Activity2Router router);

    @FragmentScope
    @ContributesAndroidInjector(modules = {FragmentModule.class})
    Fragment1 provideFragment();
}
