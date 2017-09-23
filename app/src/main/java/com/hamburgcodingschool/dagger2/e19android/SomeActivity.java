package com.hamburgcodingschool.dagger2.e19android;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.hamburgcodingschool.dagger2.e19android.AndroidBindingModule_ContributeActivityInjector.SomeActivitySubcomponent;
import dagger.android.AndroidInjection;
import javax.inject.Inject;

public class SomeActivity extends Activity {
  @Inject SomeActivity someActivity;
  @Inject SomeActivitySubcomponent someActivitySubcomponent;

  @Override protected void onCreate(@Nullable final Bundle savedInstanceState) {
    AndroidInjection.inject(this);
    super.onCreate(savedInstanceState);
  }
}
