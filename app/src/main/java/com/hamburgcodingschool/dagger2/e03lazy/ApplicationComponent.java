package com.hamburgcodingschool.dagger2.e03lazy;

import com.hamburgcodingschool.dagger2.Database;
import dagger.Component;
import dagger.Lazy;
import javax.inject.Singleton;

@Singleton @Component(modules = DatabaseModule.class)
public interface ApplicationComponent {
  Lazy<Database> database();
}
