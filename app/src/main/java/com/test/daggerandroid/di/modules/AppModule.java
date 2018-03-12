package com.test.daggerandroid.di.modules;

import com.test.daggerandroid.App;
import com.test.daggerandroid.di.scopes.ActivityScope;
import com.test.daggerandroid.ui.Activity1;
import com.test.daggerandroid.ui.Activity2;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Module(includes = {AndroidSupportInjectionModule.class})
public interface AppModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = {Activity1Module.class})
    Activity1 activity1Injector();

    @ActivityScope
    @ContributesAndroidInjector(modules = {Activity2Module.class})
    Activity2 activity2Injector();

}
