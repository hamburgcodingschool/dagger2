package com.hamburgcodingschool.dagger2.e11bindsinstance;

import android.app.Application;
import dagger.BindsInstance;
import dagger.Component;
import javax.inject.Singleton;

@Singleton @Component
public interface ApplicationComponent {
  Application application();

  @Component.Builder interface Builder {
    @BindsInstance Builder application(Application application);

    ApplicationComponent build();
  }
}
