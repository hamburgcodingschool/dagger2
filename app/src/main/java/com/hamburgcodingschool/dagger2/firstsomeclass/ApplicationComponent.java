package com.hamburgcodingschool.dagger2.firstsomeclass;

import dagger.Component;
import javax.inject.Singleton;

@Singleton @Component(modules = { DatabaseModule.class, SomeClassModule.class })
public interface ApplicationComponent {
  SomeClass someClass();
}
