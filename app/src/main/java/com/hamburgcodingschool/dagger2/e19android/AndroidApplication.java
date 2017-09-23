package com.hamburgcodingschool.dagger2.e19android;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public final class AndroidApplication extends DaggerApplication {
  @Override protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
    return DaggerApplicationComponent.create();
  }
}
