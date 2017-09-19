package com.hamburgcodingschool.dagger2.complex.sharedprefs;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.hamburgcodingschool.dagger2.complex.user.User;

public interface SharedPreferences {
  @Nullable User getUser();

  void saveUser(@NonNull User user);

  void logoutUser();
}
