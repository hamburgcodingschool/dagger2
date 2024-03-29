package com.hamburgcodingschool.dagger2.e07qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.inject.Qualifier;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Qualifier @Retention(RUNTIME) @Target(METHOD) public @interface TreeDebug {
}
