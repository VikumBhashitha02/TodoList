package com.example.todolist.presentation.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0015H\u0002J\b\u0010\u001c\u001a\u00020\u0015H\u0002J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u001a\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016R$\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/example/todolist/presentation/fragments/BaseFragment;", "Lcom/example/todolist/presentation/fragments/ParentFragment;", "()V", "adapter", "Lcom/example/todolist/presentation/adapter/TasksAdapter;", "getAdapter$annotations", "getAdapter", "()Lcom/example/todolist/presentation/adapter/TasksAdapter;", "setAdapter", "(Lcom/example/todolist/presentation/adapter/TasksAdapter;)V", "adapter2", "Lcom/example/todolist/presentation/adapter/CategoryAdapter;", "getAdapter2", "()Lcom/example/todolist/presentation/adapter/CategoryAdapter;", "setAdapter2", "(Lcom/example/todolist/presentation/adapter/CategoryAdapter;)V", "binding", "Lcom/example/todolist/databinding/FragmentBaseBinding;", "viewModel", "Lcom/example/todolist/presentation/MainActivityViewModel;", "editTaskInformation", "", "taskCategoryInfo", "Lcom/example/todolist/data/model/TaskCategoryInfo;", "goToTaskCategoryFragment", "category", "", "initRecyclerView1", "initRecyclerView2", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class BaseFragment extends com.example.todolist.presentation.fragments.ParentFragment {
    private com.example.todolist.presentation.MainActivityViewModel viewModel;
    private com.example.todolist.databinding.FragmentBaseBinding binding;
    @javax.inject.Inject
    public com.example.todolist.presentation.adapter.TasksAdapter adapter;
    @javax.inject.Inject
    public com.example.todolist.presentation.adapter.CategoryAdapter adapter2;
    
    public BaseFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.todolist.presentation.adapter.TasksAdapter getAdapter() {
        return null;
    }
    
    @javax.inject.Named(value = "base_fragment")
    @java.lang.Deprecated
    public static void getAdapter$annotations() {
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull
    com.example.todolist.presentation.adapter.TasksAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.todolist.presentation.adapter.CategoryAdapter getAdapter2() {
        return null;
    }
    
    public final void setAdapter2(@org.jetbrains.annotations.NotNull
    com.example.todolist.presentation.adapter.CategoryAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void editTaskInformation(com.example.todolist.data.model.TaskCategoryInfo taskCategoryInfo) {
    }
    
    private final void goToTaskCategoryFragment(java.lang.String category) {
    }
    
    private final void initRecyclerView2() {
    }
    
    private final void initRecyclerView1() {
    }
}