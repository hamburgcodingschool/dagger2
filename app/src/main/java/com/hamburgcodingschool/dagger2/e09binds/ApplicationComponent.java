package com.hamburgcodingschool.dagger2.e09binds;

import com.hamburgcodingschool.dagger2.Database;
import com.hamburgcodingschool.dagger2.e01first.DatabaseModule;
import dagger.Component;
import javax.inject.Singleton;

@Singleton @Component(modules = DatabaseModule.class)
public interface ApplicationComponent {
  Database database();
}
