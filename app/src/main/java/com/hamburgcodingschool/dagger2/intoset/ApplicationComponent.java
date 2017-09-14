package com.hamburgcodingschool.dagger2.intoset;

import dagger.Component;
import java.util.Set;
import javax.inject.Singleton;
import timber.log.Timber;

@Singleton @Component(modules = TimberModule.class)
public interface ApplicationComponent {
  Set<Timber.Tree> timberTrees();
}
