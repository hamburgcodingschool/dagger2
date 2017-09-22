package com.hamburgcodingschool.dagger2.e17subcomponent;

import android.app.Activity;
import dagger.BindsInstance;
import dagger.Subcomponent;

@ActivityScope @Subcomponent
public interface ActivityComponent {
  Activity activity();

  @Subcomponent.Builder interface Builder {
    @BindsInstance Builder activity(Activity activity);

    ActivityComponent build();
  }
}
