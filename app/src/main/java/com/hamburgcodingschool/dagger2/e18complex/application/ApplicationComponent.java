package com.hamburgcodingschool.dagger2.e18complex.application;

import android.app.Application;
import com.hamburgcodingschool.dagger2.e18complex.MainComponent;
import com.hamburgcodingschool.dagger2.e18complex.login.LoginComponent;
import com.hamburgcodingschool.dagger2.e18complex.user.UserComponent;
import dagger.BindsInstance;
import dagger.Component;
import javax.inject.Singleton;

@Singleton @Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
  LoginComponent.Builder loginComponentBuilder();

  UserComponent.Builder userComponentBuilder();

  MainComponent.Builder mainComponentBuilder();

  @Component.Builder interface Builder {
    @BindsInstance Builder application(Application application);

    ApplicationComponent build();
  }
}
