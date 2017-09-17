package com.hamburgcodingschool.dagger2.reusable;

import dagger.Component;
import javax.inject.Singleton;
import timber.log.Timber;

@Singleton @Component(modules = TimberModule.class)
public interface ApplicationComponent {
  Timber.Tree timberTree();
}
