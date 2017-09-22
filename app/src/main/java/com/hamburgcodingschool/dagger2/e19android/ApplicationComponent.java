package com.hamburgcodingschool.dagger2.e19android;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import javax.inject.Singleton;

@Singleton @Component(modules = {
    AndroidInjectionModule.class,
    AndroidBindingModule.class
})
public interface ApplicationComponent extends AndroidInjector<AndroidApplication> {
}
