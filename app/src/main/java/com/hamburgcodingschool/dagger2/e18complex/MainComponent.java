package com.hamburgcodingschool.dagger2.e18complex;

import dagger.BindsInstance;
import dagger.Subcomponent;

@MainScope @Subcomponent
public interface MainComponent {
  void inject(MainActivity loginActivity);

  @Subcomponent.Builder interface Builder {
    @BindsInstance Builder activity(MainActivity activity);

    MainComponent build();
  }
}
