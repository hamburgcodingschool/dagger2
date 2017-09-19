package com.hamburgcodingschool.dagger2.complex.logout;

import dagger.BindsInstance;
import dagger.Subcomponent;

@LogoutScope @Subcomponent
public interface LogoutComponent {
  void inject(LogoutActivity logoutActivity);

  @Subcomponent.Builder interface Builder {
    @BindsInstance Builder activity(LogoutActivity activity);

    LogoutComponent build();
  }
}
