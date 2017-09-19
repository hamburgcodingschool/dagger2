package com.hamburgcodingschool.dagger2.complex.application;

import com.hamburgcodingschool.dagger2.complex.sharedprefs.DefaultSharedPreferences;
import com.hamburgcodingschool.dagger2.complex.sharedprefs.SharedPreferences;
import dagger.Binds;
import dagger.Module;
import javax.inject.Singleton;

@Module public abstract class ApplicationModule {
  @Binds @Singleton public abstract SharedPreferences bindSharedPreferences(DefaultSharedPreferences defaultSharedPreferences);
}
