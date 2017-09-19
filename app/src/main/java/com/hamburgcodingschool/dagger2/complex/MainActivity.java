package com.hamburgcodingschool.dagger2.complex;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.hamburgcodingschool.dagger2.complex.home.HomeActivity;
import com.hamburgcodingschool.dagger2.complex.login.LoginActivity;
import com.hamburgcodingschool.dagger2.complex.sharedprefs.SharedPreferences;
import com.hamburgcodingschool.dagger2.complex.user.User;
import javax.inject.Inject;

import static com.hamburgcodingschool.dagger2.complex.application.ComplexApplication.applicationComponent;
import static com.hamburgcodingschool.dagger2.complex.application.ComplexApplication.buildUserComponent;

public class MainActivity extends Activity {
  @Inject SharedPreferences sharedPreferences;

  @Override protected void onCreate(final Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    applicationComponent(this)
        .mainComponentBuilder()
        .activity(this)
        .build()
        .inject(this);

    final User user = sharedPreferences.getUser();

    if (user != null) {
      buildUserComponent(this, user);
      startActivity(new Intent(this, HomeActivity.class)
          .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK));
    } else {
      startActivity(new Intent(this, LoginActivity.class)
          .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK));
    }
  }
}
