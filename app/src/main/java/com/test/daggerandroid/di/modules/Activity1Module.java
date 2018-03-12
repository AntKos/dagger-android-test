package com.test.daggerandroid.di.modules;

import com.test.daggerandroid.di.scopes.ActivityScope;
import com.test.daggerandroid.router.Router;
import com.test.daggerandroid.router.Activity1Router;
import com.test.daggerandroid.tools.Tool;
import com.test.daggerandroid.tools.ToolImpl;

import dagger.Binds;
import dagger.Module;

@Module
public interface Activity1Module {
    @ActivityScope
    @Binds
    Tool tool(ToolImpl tool);

    @ActivityScope
    @Binds
    Router router(Activity1Router router);
}
