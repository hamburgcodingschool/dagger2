package com.hamburgcodingschool.dagger2.intomap;

import java.util.Map;
import javax.inject.Provider;
import timber.log.Timber;

public class Main {
  public void something() {
    final ApplicationComponent component = DaggerApplicationComponent.create();
    final Map<ApplicationType, Provider<Timber.Tree>> timberTrees = component.timberTrees();
    final Timber.Tree debugTree = timberTrees.get(ApplicationType.DEBUG).get();
    final Timber.Tree releaseTree = timberTrees.get(ApplicationType.RELEASE).get();
  }
}
