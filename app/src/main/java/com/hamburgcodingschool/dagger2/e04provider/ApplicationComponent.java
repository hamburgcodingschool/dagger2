package com.hamburgcodingschool.dagger2.e04provider;

import com.hamburgcodingschool.dagger2.Database;
import dagger.Component;
import javax.inject.Provider;
import javax.inject.Singleton;

@Singleton @Component(modules = DatabaseModule.class)
public interface ApplicationComponent {
  Provider<Database> database();
}
