package com.hamburgcodingschool.dagger2.reusable;

import dagger.Module;
import dagger.Provides;
import dagger.Reusable;
import timber.log.Timber;

@Module public final class TimberModule {
  @Provides @Reusable static Timber.Tree provideTimberTree() {
    return new Timber.DebugTree();
  }
}
