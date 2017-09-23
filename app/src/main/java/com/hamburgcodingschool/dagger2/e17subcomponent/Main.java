package com.hamburgcodingschool.dagger2.e17subcomponent;

import android.app.Activity;

public class Main {
  public void something() {
    final ApplicationComponent component = DaggerApplicationComponent.create();
    final ActivityComponent activityComponent = component.activityComponentBuilder()
        .activity(null) // In the real world this would be an actual Activity.
        .build();

    final Activity activity = activityComponent.activity();
  }
}
