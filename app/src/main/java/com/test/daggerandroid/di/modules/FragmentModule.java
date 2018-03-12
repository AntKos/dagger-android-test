package com.test.daggerandroid.di.modules;

import com.test.daggerandroid.di.qualifiers.FragmentRouterQualifier;
import com.test.daggerandroid.di.scopes.FragmentScope;
import com.test.daggerandroid.router.FragmentRouter;
import com.test.daggerandroid.router.Router;
import com.test.daggerandroid.tools.FragmentTool;
import com.test.daggerandroid.tools.Tool;

import dagger.Binds;
import dagger.Module;

@Module
public interface FragmentModule {

    @FragmentScope
    @Binds
    Tool bindTool(FragmentTool tool);

    @FragmentScope
    @Binds
    @FragmentRouterQualifier
    Router bindRouter(FragmentRouter router);
}
