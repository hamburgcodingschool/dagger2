package com.hamburgcodingschool.dagger2.injectconstructor;

import com.hamburgcodingschool.dagger2.first.DatabaseModule;
import dagger.Component;
import javax.inject.Singleton;

@Singleton @Component(modules = DatabaseModule.class)
public interface ApplicationComponent {
  SomeClass someClass();
}
