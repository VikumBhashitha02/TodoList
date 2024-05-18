package com.example.todolist.presentation.br;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0011"}, d2 = {"Lcom/example/todolist/presentation/br/AlarmReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "notificationManager", "Landroidx/core/app/NotificationManagerCompat;", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "onReceive", "", "p0", "Landroid/content/Context;", "p1", "Landroid/content/Intent;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class AlarmReceiver extends android.content.BroadcastReceiver {
    private androidx.core.app.NotificationManagerCompat notificationManager;
    @javax.inject.Inject
    public android.content.SharedPreferences sharedPreferences;
    
    public AlarmReceiver() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.SharedPreferences getSharedPreferences() {
        return null;
    }
    
    public final void setSharedPreferences(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences p0) {
    }
    
    @java.lang.Override
    public void onReceive(@org.jetbrains.annotations.Nullable
    android.content.Context p0, @org.jetbrains.annotations.Nullable
    android.content.Intent p1) {
    }
}