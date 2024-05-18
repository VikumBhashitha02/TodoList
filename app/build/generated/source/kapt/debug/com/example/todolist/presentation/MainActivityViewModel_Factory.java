// Generated by Dagger (https://dagger.dev).
package com.example.todolist.presentation;

import com.example.todolist.domain.TaskCategoryRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainActivityViewModel_Factory implements Factory<MainActivityViewModel> {
  private final Provider<TaskCategoryRepository> repositoryProvider;

  public MainActivityViewModel_Factory(Provider<TaskCategoryRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public MainActivityViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static MainActivityViewModel_Factory create(
      Provider<TaskCategoryRepository> repositoryProvider) {
    return new MainActivityViewModel_Factory(repositoryProvider);
  }

  public static MainActivityViewModel newInstance(TaskCategoryRepository repository) {
    return new MainActivityViewModel(repository);
  }
}