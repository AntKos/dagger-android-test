package com.test.daggerandroid.di.modules;

import com.test.daggerandroid.di.scopes.ActivityScope;
import com.test.daggerandroid.router.Activity1Router;
import com.test.daggerandroid.router.Activity2Router;
import com.test.daggerandroid.router.Router;

import dagger.Binds;
import dagger.Module;

@Module
public interface Activity2Module {
    @ActivityScope
    @Binds
    Router router(Activity2Router router);
}
