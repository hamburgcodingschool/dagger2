package com.hamburgcodingschool.dagger2.complex.home;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.hamburgcodingschool.dagger2.R;
import com.hamburgcodingschool.dagger2.complex.logout.LogoutActivity;
import com.hamburgcodingschool.dagger2.complex.user.User;
import javax.inject.Inject;

import static com.hamburgcodingschool.dagger2.complex.application.ComplexApplication.userComponent;

public class HomeActivity extends Activity {
  @Inject User user;

  private TextView textView;
  private Button button;

  @Override protected void onCreate(@Nullable final Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    userComponent(this)
        .homeComponentBuilder()
        .activity(this)
        .build()
        .inject(this);

    setContentView(R.layout.activity_home);
    textView = findViewById(R.id.activityHomeTextView);
    textView.setText(user.toString());

    button = findViewById(R.id.activityHomeButton);
    button.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(final View v) {
        startActivity(new Intent(HomeActivity.this, LogoutActivity.class));
      }
    });
  }
}
