package com.hamburgcodingschool.dagger2.e12intoset;

import com.hamburgcodingschool.dagger2.timber.ReleaseTree;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;
import javax.inject.Singleton;
import timber.log.Timber;

@Module public final class TimberModule {
  @Provides @Singleton @IntoSet static Timber.Tree provideDebugTree() {
    return new Timber.DebugTree();
  }

  @Provides @Singleton @IntoSet static Timber.Tree provideReleaseTree() {
    return new ReleaseTree();
  }
}
