package com.hamburgcodingschool.dagger2.e19android;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module public abstract class AndroidBindingModule {
  @ContributesAndroidInjector abstract SomeActivity contributeActivityInjector();
}
