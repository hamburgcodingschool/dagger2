package com.hamburgcodingschool.dagger2.intoset;

import java.util.Set;
import timber.log.Timber;

public class Main {
  public void something() {
    final ApplicationComponent component = DaggerApplicationComponent.create();
    final Set<Timber.Tree> timberTrees = component.timberTrees();
  }
}
