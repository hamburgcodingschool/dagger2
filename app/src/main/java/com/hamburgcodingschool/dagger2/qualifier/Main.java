package com.hamburgcodingschool.dagger2.qualifier;

import timber.log.Timber;

public class Main {
  public void something() {
    final ApplicationComponent component = DaggerApplicationComponent.create();
    final Timber.Tree debugTree = component.debugTree();
    final Timber.Tree releaseTree = component.releaseTree();
  }
}
