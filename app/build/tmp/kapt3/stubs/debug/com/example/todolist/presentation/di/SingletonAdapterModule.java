package com.example.todolist.presentation.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/todolist/presentation/di/SingletonAdapterModule;", "", "()V", "provideCategoryAdapter", "Lcom/example/todolist/presentation/adapter/CategoryAdapter;", "provideTaskAdapterToBaseFragment", "Lcom/example/todolist/presentation/adapter/TasksAdapter;", "provideTaskAdapterToCompletedTasksFragment", "app_debug"})
@dagger.Module
public final class SingletonAdapterModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.todolist.presentation.di.SingletonAdapterModule INSTANCE = null;
    
    private SingletonAdapterModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Named(value = "base_fragment")
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.todolist.presentation.adapter.TasksAdapter provideTaskAdapterToBaseFragment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Named(value = "completed_task_fragment")
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.todolist.presentation.adapter.TasksAdapter provideTaskAdapterToCompletedTasksFragment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.todolist.presentation.adapter.CategoryAdapter provideCategoryAdapter() {
        return null;
    }
}