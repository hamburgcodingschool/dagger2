package com.hamburgcodingschool.dagger2.timber;

import timber.log.Timber;

public final class ReleaseTree extends Timber.Tree {
  @Override protected void log(final int priority, final String tag, final String message, final Throwable t) {
    // For simplicity we'll do nothing.
  }
}
