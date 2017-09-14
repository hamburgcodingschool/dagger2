package com.hamburgcodingschool.dagger2.lazy;

import com.hamburgcodingschool.dagger2.Database;
import com.hamburgcodingschool.dagger2.User;

public final class SqlDatabase implements Database {
  @Override public User getUser() {
    return null;
  }
}
