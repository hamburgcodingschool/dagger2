package com.hamburgcodingschool.dagger2.binds;

import com.hamburgcodingschool.dagger2.Database;
import dagger.Binds;
import dagger.Module;
import javax.inject.Singleton;

@Module public abstract class DatabaseModule {
  @Binds @Singleton abstract Database provideDatabase(final SqlDatabase sqlDatabase);
}
