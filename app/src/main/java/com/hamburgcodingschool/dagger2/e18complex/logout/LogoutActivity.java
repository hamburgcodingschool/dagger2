package com.hamburgcodingschool.dagger2.e18complex.logout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.hamburgcodingschool.dagger2.R;
import com.hamburgcodingschool.dagger2.e18complex.login.LoginActivity;
import com.hamburgcodingschool.dagger2.e18complex.sharedprefs.SharedPreferences;
import com.hamburgcodingschool.dagger2.e18complex.user.User;
import javax.inject.Inject;

import static com.hamburgcodingschool.dagger2.e18complex.application.ComplexApplication.releaseUserComponent;
import static com.hamburgcodingschool.dagger2.e18complex.application.ComplexApplication.userComponent;

public class LogoutActivity extends Activity {
  @Inject User user;
  @Inject SharedPreferences sharedPreferences;

  private TextView textView;
  private Button button;

  @Override protected void onCreate(@Nullable final Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    userComponent(this)
        .logoutComponentBuilder()
        .activity(this)
        .build()
        .inject(this);

    setContentView(R.layout.activity_logout);
    textView = findViewById(R.id.activityLogoutTextView);
    textView.setText(user.toString());

    button = findViewById(R.id.activityLogoutButton);
    button.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(final View v) {
        final LogoutActivity activity = LogoutActivity.this;
        releaseUserComponent(activity);
        sharedPreferences.logoutUser();

        startActivity(new Intent(activity, LoginActivity.class)
            .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK));
      }
    });
  }
}
