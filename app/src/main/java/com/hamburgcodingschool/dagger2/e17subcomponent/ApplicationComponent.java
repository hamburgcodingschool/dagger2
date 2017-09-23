package com.hamburgcodingschool.dagger2.e17subcomponent;

import dagger.Component;
import javax.inject.Singleton;

@Singleton @Component
public interface ApplicationComponent {
  ActivityComponent.Builder activityComponentBuilder();
}
