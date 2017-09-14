package com.hamburgcodingschool.dagger2.injectfield;

import com.hamburgcodingschool.dagger2.first.DatabaseModule;
import dagger.Component;
import javax.inject.Singleton;

@Singleton @Component(modules = DatabaseModule.class)
public interface ApplicationComponent {
  void inject(Main main);
}
