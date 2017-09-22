package com.hamburgcodingschool.dagger2.e13intomap;

import dagger.Component;
import java.util.Map;
import javax.inject.Provider;
import javax.inject.Singleton;
import timber.log.Timber;

@Singleton @Component(modules = TimberModule.class)
public interface ApplicationComponent {
  Map<ApplicationType, Provider<Timber.Tree>> timberTrees();
}
