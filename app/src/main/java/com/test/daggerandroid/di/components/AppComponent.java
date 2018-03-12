package com.test.daggerandroid.di.components;

import com.test.daggerandroid.App;
import com.test.daggerandroid.di.modules.AppModule;
import com.test.daggerandroid.di.scopes.Singletone;

import dagger.Component;

@Singletone
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(App app);
}
