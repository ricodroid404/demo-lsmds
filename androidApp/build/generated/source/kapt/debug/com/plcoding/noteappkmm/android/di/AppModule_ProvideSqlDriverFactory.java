// Generated by Dagger (https://dagger.dev).
package com.plcoding.noteappkmm.android.di;

import android.app.Application;
import com.squareup.sqldelight.db.SqlDriver;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideSqlDriverFactory implements Factory<SqlDriver> {
  private final Provider<Application> appProvider;

  public AppModule_ProvideSqlDriverFactory(Provider<Application> appProvider) {
    this.appProvider = appProvider;
  }

  @Override
  public SqlDriver get() {
    return provideSqlDriver(appProvider.get());
  }

  public static AppModule_ProvideSqlDriverFactory create(Provider<Application> appProvider) {
    return new AppModule_ProvideSqlDriverFactory(appProvider);
  }

  public static SqlDriver provideSqlDriver(Application app) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideSqlDriver(app));
  }
}