package com.hamburgcodingschool.dagger2.first;

import com.hamburgcodingschool.dagger2.Database;
import dagger.Component;
import javax.inject.Singleton;

@Singleton @Component(modules = DatabaseModule.class)
public interface ApplicationComponent {
  Database database();
}
