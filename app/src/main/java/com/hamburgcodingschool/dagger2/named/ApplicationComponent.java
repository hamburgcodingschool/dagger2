package com.hamburgcodingschool.dagger2.named;

import dagger.Component;
import javax.inject.Named;
import javax.inject.Singleton;
import timber.log.Timber;

import static com.hamburgcodingschool.dagger2.named.TimberModule.DEBUG_TREE;
import static com.hamburgcodingschool.dagger2.named.TimberModule.RELEASE_TREE;

@Singleton @Component(modules = TimberModule.class)
public interface ApplicationComponent {
  @Named(DEBUG_TREE) Timber.Tree debugTree();

  @Named(RELEASE_TREE) Timber.Tree releaseTree();
}
