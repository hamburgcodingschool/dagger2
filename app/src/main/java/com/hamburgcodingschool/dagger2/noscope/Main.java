package com.hamburgcodingschool.dagger2.noscope;

import timber.log.Timber;

public class Main {
  public void something() {
    final ApplicationComponent component = DaggerApplicationComponent.create();
    final Timber.Tree timberTree = component.timberTree();
  }
}
