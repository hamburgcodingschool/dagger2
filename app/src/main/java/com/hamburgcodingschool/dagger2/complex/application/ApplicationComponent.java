package com.hamburgcodingschool.dagger2.complex.application;

import android.app.Application;
import com.hamburgcodingschool.dagger2.complex.MainComponent;
import com.hamburgcodingschool.dagger2.complex.login.LoginComponent;
import com.hamburgcodingschool.dagger2.complex.user.UserComponent;
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
