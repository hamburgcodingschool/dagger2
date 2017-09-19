package com.hamburgcodingschool.dagger2.complex.user;

import com.hamburgcodingschool.dagger2.complex.home.HomeComponent;
import com.hamburgcodingschool.dagger2.complex.logout.LogoutComponent;
import dagger.BindsInstance;
import dagger.Subcomponent;

@UserScope @Subcomponent
public interface UserComponent {
  HomeComponent.Builder homeComponentBuilder();

  LogoutComponent.Builder logoutComponentBuilder();

  @Subcomponent.Builder interface Builder {
    @BindsInstance Builder user(User user);

    UserComponent build();
  }
}
