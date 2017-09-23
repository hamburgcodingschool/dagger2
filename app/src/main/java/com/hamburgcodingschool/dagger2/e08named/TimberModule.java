package com.hamburgcodingschool.dagger2.e08named;

import com.hamburgcodingschool.dagger2.timber.ReleaseTree;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Singleton;
import timber.log.Timber;

@Module public final class TimberModule {
  static final String DEBUG_TREE = "debug-tree";
  static final String RELEASE_TREE = "release-tree";

  @Provides @Singleton @Named(DEBUG_TREE) static Timber.Tree provideDebugTree() {
    return new Timber.DebugTree();
  }

  @Provides @Singleton @Named(RELEASE_TREE) static Timber.Tree provideReleaseTree() {
    return new ReleaseTree();
  }
}
