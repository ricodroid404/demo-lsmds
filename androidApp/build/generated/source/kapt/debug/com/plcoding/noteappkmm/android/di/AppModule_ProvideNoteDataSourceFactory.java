// Generated by Dagger (https://dagger.dev).
package com.plcoding.noteappkmm.android.di;

import com.plcoding.noteappkmm.domain.note.NoteDataSource;
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
public final class AppModule_ProvideNoteDataSourceFactory implements Factory<NoteDataSource> {
  private final Provider<SqlDriver> driverProvider;

  public AppModule_ProvideNoteDataSourceFactory(Provider<SqlDriver> driverProvider) {
    this.driverProvider = driverProvider;
  }

  @Override
  public NoteDataSource get() {
    return provideNoteDataSource(driverProvider.get());
  }

  public static AppModule_ProvideNoteDataSourceFactory create(Provider<SqlDriver> driverProvider) {
    return new AppModule_ProvideNoteDataSourceFactory(driverProvider);
  }

  public static NoteDataSource provideNoteDataSource(SqlDriver driver) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideNoteDataSource(driver));
  }
}