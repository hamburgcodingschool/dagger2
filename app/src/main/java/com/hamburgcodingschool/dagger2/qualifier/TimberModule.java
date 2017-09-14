package com.hamburgcodingschool.dagger2.qualifier;

import com.hamburgcodingschool.dagger2.timber.ReleaseTree;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import timber.log.Timber;

@Module public final class TimberModule {
  @Provides @Singleton @TreeDebug static Timber.Tree provideDebugTree() {
    return new Timber.DebugTree();
  }

  @Provides @Singleton @TreeRelease static Timber.Tree provideReleaseTree() {
    return new ReleaseTree();
  }
}
