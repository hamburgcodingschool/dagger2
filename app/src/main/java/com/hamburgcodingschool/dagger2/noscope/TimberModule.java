package com.hamburgcodingschool.dagger2.noscope;

import dagger.Module;
import dagger.Provides;
import timber.log.Timber;

@Module public final class TimberModule {
  @Provides static Timber.Tree provideTimberTree() {
    return new Timber.DebugTree();
  }
}
