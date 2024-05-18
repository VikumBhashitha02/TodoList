package com.example.todolist.presentation.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.FragmentComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lcom/example/todolist/presentation/di/FragmentAdapterModule;", "", "()V", "provideTaskAdapterToTaskCategoryFragment", "Lcom/example/todolist/presentation/adapter/TasksAdapter;", "app_debug"})
@dagger.Module
public final class FragmentAdapterModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.todolist.presentation.di.FragmentAdapterModule INSTANCE = null;
    
    private FragmentAdapterModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.hilt.android.scopes.FragmentScoped
    @javax.inject.Named(value = "task_category_fragment")
    @dagger.Provides
    public final com.example.todolist.presentation.adapter.TasksAdapter provideTaskAdapterToTaskCategoryFragment() {
        return null;
    }
}