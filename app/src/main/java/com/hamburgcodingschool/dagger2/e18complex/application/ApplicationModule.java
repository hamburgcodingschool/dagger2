package com.hamburgcodingschool.dagger2.e18complex.application;

import com.hamburgcodingschool.dagger2.e18complex.sharedprefs.DefaultSharedPreferences;
import com.hamburgcodingschool.dagger2.e18complex.sharedprefs.SharedPreferences;
import dagger.Binds;
import dagger.Module;
import javax.inject.Singleton;

@Module public abstract class ApplicationModule {
  @Binds @Singleton public abstract SharedPreferences bindSharedPreferences(DefaultSharedPreferences defaultSharedPreferences);
}
