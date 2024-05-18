package com.example.todolist.presentation.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u001a\u0018\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u001a\u0018\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007\u001a\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007\u001a \u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u00a8\u0006\u0018"}, d2 = {"setCheckStatus", "", "materialCheckBox", "Lcom/google/android/material/checkbox/MaterialCheckBox;", "status", "", "color", "", "setColor", "view", "Landroid/view/View;", "setCount", "materialTextView", "Lcom/google/android/material/textview/MaterialTextView;", "count", "", "setDate", "dueDate", "date", "Ljava/util/Date;", "setPriority", "chip", "Lcom/google/android/material/chip/Chip;", "priority", "app_debug"})
public final class BindingAdapterKt {
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @androidx.databinding.BindingAdapter(value = {"count"})
    public static final void setCount(@org.jetbrains.annotations.NotNull
    com.google.android.material.textview.MaterialTextView materialTextView, int count) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"view_color"})
    public static final void setColor(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.NotNull
    java.lang.String color) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"check_status", "view_color"})
    public static final void setCheckStatus(@org.jetbrains.annotations.NotNull
    com.google.android.material.checkbox.MaterialCheckBox materialCheckBox, boolean status, @org.jetbrains.annotations.NotNull
    java.lang.String color) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @androidx.databinding.BindingAdapter(value = {"set_date"})
    public static final void setDate(@org.jetbrains.annotations.NotNull
    com.google.android.material.textview.MaterialTextView dueDate, @org.jetbrains.annotations.NotNull
    java.util.Date date) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @androidx.databinding.BindingAdapter(value = {"priority", "view_color"})
    public static final void setPriority(@org.jetbrains.annotations.NotNull
    com.google.android.material.chip.Chip chip, int priority, @org.jetbrains.annotations.NotNull
    java.lang.String color) {
    }
}