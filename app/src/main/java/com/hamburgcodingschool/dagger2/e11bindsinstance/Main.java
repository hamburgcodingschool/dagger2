package com.hamburgcodingschool.dagger2.e11bindsinstance;

import android.app.Application;

public final class Main {
  public void something() {
    final ApplicationComponent component = DaggerApplicationComponent.builder()
        .application(null) // In the real world this would be an actual application.
        .build();

    final Application application = component.application();
  }
}
