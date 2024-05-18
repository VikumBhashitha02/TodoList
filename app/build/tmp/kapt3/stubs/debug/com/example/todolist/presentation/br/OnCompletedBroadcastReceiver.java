package com.example.todolist.presentation.br;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lcom/example/todolist/presentation/br/OnCompletedBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "repository", "Lcom/example/todolist/data/repository/TaskCategoryRepositoryImpl;", "getRepository", "()Lcom/example/todolist/data/repository/TaskCategoryRepositoryImpl;", "setRepository", "(Lcom/example/todolist/data/repository/TaskCategoryRepositoryImpl;)V", "onReceive", "", "p0", "Landroid/content/Context;", "p1", "Landroid/content/Intent;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class OnCompletedBroadcastReceiver extends android.content.BroadcastReceiver {
    @javax.inject.Inject
    public com.example.todolist.data.repository.TaskCategoryRepositoryImpl repository;
    
    public OnCompletedBroadcastReceiver() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.todolist.data.repository.TaskCategoryRepositoryImpl getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.repository.TaskCategoryRepositoryImpl p0) {
    }
    
    @java.lang.Override
    public void onReceive(@org.jetbrains.annotations.Nullable
    android.content.Context p0, @org.jetbrains.annotations.Nullable
    android.content.Intent p1) {
    }
}