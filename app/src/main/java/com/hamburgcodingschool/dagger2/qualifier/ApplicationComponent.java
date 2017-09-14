package com.hamburgcodingschool.dagger2.qualifier;

import dagger.Component;
import javax.inject.Singleton;
import timber.log.Timber;

@Singleton @Component(modules = TimberModule.class)
public interface ApplicationComponent {
  @TreeDebug Timber.Tree debugTree();

  @TreeRelease Timber.Tree releaseTree();
}
