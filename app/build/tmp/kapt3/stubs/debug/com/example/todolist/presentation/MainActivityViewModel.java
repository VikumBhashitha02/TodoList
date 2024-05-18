package com.example.todolist.presentation;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00120\u0011J\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00120\u0011J\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00120\u00112\u0006\u0010\u0016\u001a\u00020\u0017J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00120\u0011J\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00120\u0011J\u001a\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00120\u00112\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u001f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010 \u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fJ\u001e\u0010!\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\fJ\u000e\u0010$\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006%"}, d2 = {"Lcom/example/todolist/presentation/MainActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/todolist/domain/TaskCategoryRepository;", "(Lcom/example/todolist/domain/TaskCategoryRepository;)V", "deleteTask", "", "task", "Lcom/example/todolist/data/model/TaskInfo;", "deleteTaskAndCategory", "taskInfo", "categoryInfo", "Lcom/example/todolist/data/model/CategoryInfo;", "getAlarms", "currentTime", "Ljava/util/Date;", "getCategories", "Landroidx/lifecycle/LiveData;", "", "getCompletedTask", "Lcom/example/todolist/data/model/TaskCategoryInfo;", "getCompletedTaskOfCategory", "category", "", "getCountOfCategory", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNoOfTaskForEachCategory", "Lcom/example/todolist/data/model/NoOfTaskForEachCategory;", "getUncompletedTask", "getUncompletedTaskOfCategory", "insertTaskAndCategory", "updateTaskAndAddCategory", "updateTaskAndAddDeleteCategory", "categoryInfoAdd", "categoryInfoDelete", "updateTaskStatus", "app_debug"})
public final class MainActivityViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.todolist.domain.TaskCategoryRepository repository = null;
    
    @javax.inject.Inject
    public MainActivityViewModel(@org.jetbrains.annotations.NotNull
    com.example.todolist.domain.TaskCategoryRepository repository) {
        super();
    }
    
    public final void updateTaskStatus(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.TaskInfo task) {
    }
    
    public final void deleteTask(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.TaskInfo task) {
    }
    
    public final void insertTaskAndCategory(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.TaskInfo taskInfo, @org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.CategoryInfo categoryInfo) {
    }
    
    public final void updateTaskAndAddCategory(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.TaskInfo taskInfo, @org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.CategoryInfo categoryInfo) {
    }
    
    public final void updateTaskAndAddDeleteCategory(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.TaskInfo taskInfo, @org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.CategoryInfo categoryInfoAdd, @org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.CategoryInfo categoryInfoDelete) {
    }
    
    public final void deleteTaskAndCategory(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.TaskInfo taskInfo, @org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.CategoryInfo categoryInfo) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.todolist.data.model.TaskCategoryInfo>> getUncompletedTask() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.todolist.data.model.TaskCategoryInfo>> getCompletedTask() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.todolist.data.model.TaskCategoryInfo>> getUncompletedTaskOfCategory(@org.jetbrains.annotations.NotNull
    java.lang.String category) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.todolist.data.model.TaskCategoryInfo>> getCompletedTaskOfCategory(@org.jetbrains.annotations.NotNull
    java.lang.String category) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.todolist.data.model.NoOfTaskForEachCategory>> getNoOfTaskForEachCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.todolist.data.model.CategoryInfo>> getCategories() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getCountOfCategory(@org.jetbrains.annotations.NotNull
    java.lang.String category, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return null;
    }
    
    public final void getAlarms(@org.jetbrains.annotations.NotNull
    java.util.Date currentTime) {
    }
}