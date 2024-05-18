package com.example.todolist.presentation.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0002J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R$\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/example/todolist/presentation/fragments/CompletedTasksFragment;", "Lcom/example/todolist/presentation/fragments/ParentFragment;", "()V", "adapter", "Lcom/example/todolist/presentation/adapter/TasksAdapter;", "getAdapter$annotations", "getAdapter", "()Lcom/example/todolist/presentation/adapter/TasksAdapter;", "setAdapter", "(Lcom/example/todolist/presentation/adapter/TasksAdapter;)V", "binding", "Lcom/example/todolist/databinding/FragmentCompletedTasksBinding;", "simpleItemTouchCallback", "Landroidx/recyclerview/widget/ItemTouchHelper$SimpleCallback;", "viewModel", "Lcom/example/todolist/presentation/MainActivityViewModel;", "editTaskInformation", "", "taskCategoryInfo", "Lcom/example/todolist/data/model/TaskCategoryInfo;", "initRecyclerView", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class CompletedTasksFragment extends com.example.todolist.presentation.fragments.ParentFragment {
    private com.example.todolist.presentation.MainActivityViewModel viewModel;
    private com.example.todolist.databinding.FragmentCompletedTasksBinding binding;
    @javax.inject.Inject
    public com.example.todolist.presentation.adapter.TasksAdapter adapter;
    private final androidx.recyclerview.widget.ItemTouchHelper.SimpleCallback simpleItemTouchCallback = null;
    
    public CompletedTasksFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.todolist.presentation.adapter.TasksAdapter getAdapter() {
        return null;
    }
    
    @javax.inject.Named(value = "completed_task_fragment")
    @java.lang.Deprecated
    public static void getAdapter$annotations() {
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull
    com.example.todolist.presentation.adapter.TasksAdapter p0) {
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
    
    private final void initRecyclerView() {
    }
    
    private final void editTaskInformation(com.example.todolist.data.model.TaskCategoryInfo taskCategoryInfo) {
    }
}