package com.hamburgcodingschool.dagger2.e02firstsomeclass;

import com.hamburgcodingschool.dagger2.Database;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module public final class SomeClassModule {
  @Provides @Singleton static SomeClass provideSomeClass(final Database database) {
    return new SomeClass(database);
  }
}
