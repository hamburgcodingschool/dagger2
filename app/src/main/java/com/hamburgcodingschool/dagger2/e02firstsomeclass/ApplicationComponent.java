package com.hamburgcodingschool.dagger2.e02firstsomeclass;

import dagger.Component;
import javax.inject.Singleton;

@Singleton @Component(modules = { DatabaseModule.class, SomeClassModule.class })
public interface ApplicationComponent {
  SomeClass someClass();
}
