package com.hamburgcodingschool.dagger2.e18complex.login;

import dagger.BindsInstance;
import dagger.Subcomponent;

@LoginScope @Subcomponent
public interface LoginComponent {
  void inject(LoginActivity loginActivity);

  @Subcomponent.Builder interface Builder {
    @BindsInstance Builder activity(LoginActivity activity);

    LoginComponent build();
  }
}
