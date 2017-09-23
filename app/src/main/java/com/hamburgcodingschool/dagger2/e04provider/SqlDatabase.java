package com.hamburgcodingschool.dagger2.e04provider;

import com.hamburgcodingschool.dagger2.Database;
import com.hamburgcodingschool.dagger2.User;

public final class SqlDatabase implements Database {
  @Override public User getUser() {
    return null;
  }
}
