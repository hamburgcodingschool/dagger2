package com.hamburgcodingschool.dagger2.intomap;

import dagger.MapKey;

@MapKey public @interface ApplicationTypeKey {
  ApplicationType value();
}
