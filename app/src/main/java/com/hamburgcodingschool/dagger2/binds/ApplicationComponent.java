package com.hamburgcodingschool.dagger2.binds;

import com.hamburgcodingschool.dagger2.Database;
import com.hamburgcodingschool.dagger2.first.DatabaseModule;
import dagger.Component;
import javax.inject.Singleton;

@Singleton @Component(modules = DatabaseModule.class)
public interface ApplicationComponent {
  Database database();
}
