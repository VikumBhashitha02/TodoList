package com.example.todolist.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J!\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\u0012H&J\u0014\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\r0\u0012H&J\u001c\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\r0\u00122\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0017H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0014\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\r0\u0012H&J\u0014\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\r0\u0012H&J\u001c\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\r0\u00122\u0006\u0010\u0016\u001a\u00020\u0017H&J!\u0010\u001f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ!\u0010 \u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ)\u0010!\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u0019\u0010%\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006&"}, d2 = {"Lcom/example/todolist/domain/TaskCategoryRepository;", "", "deleteTask", "", "task", "Lcom/example/todolist/data/model/TaskInfo;", "(Lcom/example/todolist/data/model/TaskInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTaskAndCategory", "taskInfo", "categoryInfo", "Lcom/example/todolist/data/model/CategoryInfo;", "(Lcom/example/todolist/data/model/TaskInfo;Lcom/example/todolist/data/model/CategoryInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getActiveAlarms", "", "currentTime", "Ljava/util/Date;", "(Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCategories", "Landroidx/lifecycle/LiveData;", "getCompletedTask", "Lcom/example/todolist/data/model/TaskCategoryInfo;", "getCompletedTaskOfCategory", "category", "", "getCountOfCategory", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNoOfTaskForEachCategory", "Lcom/example/todolist/data/model/NoOfTaskForEachCategory;", "getUncompletedTask", "getUncompletedTaskOfCategory", "insertTaskAndCategory", "updateTaskAndAddCategory", "updateTaskAndAddDeleteCategory", "categoryInfoAdd", "categoryInfoDelete", "(Lcom/example/todolist/data/model/TaskInfo;Lcom/example/todolist/data/model/CategoryInfo;Lcom/example/todolist/data/model/CategoryInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTaskStatus", "app_debug"})
public abstract interface TaskCategoryRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateTaskStatus(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.TaskInfo task, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteTask(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.TaskInfo task, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertTaskAndCategory(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.TaskInfo taskInfo, @org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.CategoryInfo categoryInfo, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteTaskAndCategory(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.TaskInfo taskInfo, @org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.CategoryInfo categoryInfo, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateTaskAndAddDeleteCategory(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.TaskInfo taskInfo, @org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.CategoryInfo categoryInfoAdd, @org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.CategoryInfo categoryInfoDelete, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateTaskAndAddCategory(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.TaskInfo taskInfo, @org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.CategoryInfo categoryInfo, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.todolist.data.model.TaskCategoryInfo>> getUncompletedTask();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.todolist.data.model.TaskCategoryInfo>> getCompletedTask();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.todolist.data.model.TaskCategoryInfo>> getUncompletedTaskOfCategory(@org.jetbrains.annotations.NotNull
    java.lang.String category);
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.todolist.data.model.TaskCategoryInfo>> getCompletedTaskOfCategory(@org.jetbrains.annotations.NotNull
    java.lang.String category);
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.todolist.data.model.NoOfTaskForEachCategory>> getNoOfTaskForEachCategory();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.todolist.data.model.CategoryInfo>> getCategories();
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getCountOfCategory(@org.jetbrains.annotations.NotNull
    java.lang.String category, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getActiveAlarms(@org.jetbrains.annotations.NotNull
    java.util.Date currentTime, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.todolist.data.model.TaskInfo>> continuation);
}