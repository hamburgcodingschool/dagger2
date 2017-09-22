package com.hamburgcodingschool.dagger2.e13intomap;

import com.hamburgcodingschool.dagger2.timber.ReleaseTree;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import javax.inject.Singleton;
import timber.log.Timber;

import static com.hamburgcodingschool.dagger2.e13intomap.ApplicationType.DEBUG;
import static com.hamburgcodingschool.dagger2.e13intomap.ApplicationType.RELEASE;

@Module public final class TimberModule {
  @Provides @Singleton @IntoMap @ApplicationTypeKey(DEBUG) static Timber.Tree provideDebugTree() {
    return new Timber.DebugTree();
  }

  @Provides @Singleton @IntoMap @ApplicationTypeKey(RELEASE) static Timber.Tree provideReleaseTree() {
    return new ReleaseTree();
  }
}
