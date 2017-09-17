package com.hamburgcodingschool.dagger2.singleton;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import timber.log.Timber;

@Module public final class TimberModule {
  @Provides @Singleton static Timber.Tree provideTimberTree() {
    return new Timber.DebugTree();
  }
}
