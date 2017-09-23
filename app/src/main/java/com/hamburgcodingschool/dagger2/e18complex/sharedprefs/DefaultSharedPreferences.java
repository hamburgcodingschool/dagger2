package com.hamburgcodingschool.dagger2.e18complex.sharedprefs;

import android.app.Application;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.hamburgcodingschool.dagger2.e18complex.user.User;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton public final class DefaultSharedPreferences implements SharedPreferences {
  private final Application application;

  @Inject DefaultSharedPreferences(final Application application) {
    this.application = application;
  }

  @Nullable @Override public User getUser() {
    final String userName = prefs().getString("user-name", null);
    return userName != null ? new User(userName) : null;
  }

  @Override public void saveUser(@NonNull final User user) {
    prefs()
        .edit()
        .putString("user-name", user.userName)
        .apply();
  }

  @Override public void logoutUser() {
    prefs()
        .edit()
        .clear()
        .apply();
  }

  private android.content.SharedPreferences prefs() {
    return PreferenceManager.getDefaultSharedPreferences(application);
  }
}
