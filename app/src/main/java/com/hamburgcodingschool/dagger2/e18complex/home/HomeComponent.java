package com.hamburgcodingschool.dagger2.e18complex.home;

import dagger.BindsInstance;
import dagger.Subcomponent;

@HomeScope @Subcomponent
public interface HomeComponent {
  void inject(HomeActivity homeActivity);

  @Subcomponent.Builder interface Builder {
    @BindsInstance Builder activity(HomeActivity activity);

    HomeComponent build();
  }
}
