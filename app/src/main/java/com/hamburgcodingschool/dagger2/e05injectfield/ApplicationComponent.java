package com.hamburgcodingschool.dagger2.e05injectfield;

import com.hamburgcodingschool.dagger2.e01first.DatabaseModule;
import dagger.Component;
import javax.inject.Singleton;

@Singleton @Component(modules = DatabaseModule.class)
public interface ApplicationComponent {
  void inject(Main main);
}
