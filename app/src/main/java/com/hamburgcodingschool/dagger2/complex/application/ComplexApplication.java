package com.hamburgcodingschool.dagger2.complex.application;

import android.app.Application;
import android.content.Context;
import com.hamburgcodingschool.dagger2.complex.user.User;
import com.hamburgcodingschool.dagger2.complex.user.UserComponent;

public final class ComplexApplication extends Application {
  public static ApplicationComponent applicationComponent(final Context context) {
    return application(context).applicationComponent;
  }

  public static UserComponent userComponent(final Context context) {
    return application(context).userComponent;
  }

  public static void buildUserComponent(final Context context, final User user) {
    final ComplexApplication application = application(context);
    application.userComponent = application.applicationComponent
        .userComponentBuilder()
        .user(user)
        .build();
  }

  public static void releaseUserComponent(final Context context) {
    application(context).userComponent = null; // Force GC.
  }

  private static ComplexApplication application(final Context context) {
    return (ComplexApplication) context.getApplicationContext();
  }

  private ApplicationComponent applicationComponent;
  private UserComponent userComponent;

  @Override public void onCreate() {
    super.onCreate();

    applicationComponent = DaggerApplicationComponent.builder()
        .application(this)
        .build();
  }
}
