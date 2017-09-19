package com.hamburgcodingschool.dagger2.complex.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.hamburgcodingschool.dagger2.R;
import com.hamburgcodingschool.dagger2.complex.home.HomeActivity;
import com.hamburgcodingschool.dagger2.complex.sharedprefs.SharedPreferences;
import com.hamburgcodingschool.dagger2.complex.user.User;
import javax.inject.Inject;

import static com.hamburgcodingschool.dagger2.complex.application.ComplexApplication.applicationComponent;
import static com.hamburgcodingschool.dagger2.complex.application.ComplexApplication.buildUserComponent;

public class LoginActivity extends Activity {
  @Inject SharedPreferences sharedPreferences;

  private TextView textView;
  private Button button;

  @Override protected void onCreate(final Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    applicationComponent(this)
        .loginComponentBuilder()
        .activity(this)
        .build()
        .inject(this);

    setContentView(R.layout.activity_login);
    textView = findViewById(R.id.activityLoginEditText);
    button = findViewById(R.id.activityLoginButton);

    button.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(final View v) {
        final LoginActivity activity = LoginActivity.this;
        final User user = new User(textView.getText().toString());
        buildUserComponent(activity, user);
        sharedPreferences.saveUser(user);
        startActivity(new Intent(activity, HomeActivity.class));
      }
    });
  }
}
