package com.hamburgcodingschool.dagger2.e10componentbuilder;

import dagger.Component;
import javax.inject.Singleton;

@Singleton @Component
public interface ApplicationComponent {
  @Component.Builder interface Builder {
    ApplicationComponent build();
  }
}
