package com.hamburgcodingschool.dagger2.e09binds;

import com.hamburgcodingschool.dagger2.Database;
import com.hamburgcodingschool.dagger2.User;
import javax.inject.Inject;

public final class SqlDatabase implements Database {
  @Inject SqlDatabase() {

  }

  @Override public User getUser() {
    return null;
  }
}
