package com.example.todolist.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ!\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00100\u0015H\u0016J\u0014\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00100\u0015H\u0016J\u001c\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00100\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001aH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0014\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00100\u0015H\u0016J\u0014\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00100\u0015H\u0016J\u001c\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00100\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J!\u0010\"\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ!\u0010#\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ)\u0010$\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u0019\u0010(\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006)"}, d2 = {"Lcom/example/todolist/data/repository/TaskCategoryRepositoryImpl;", "Lcom/example/todolist/domain/TaskCategoryRepository;", "taskCategoryDao", "Lcom/example/todolist/data/db/TaskCategoryDao;", "(Lcom/example/todolist/data/db/TaskCategoryDao;)V", "deleteTask", "", "task", "Lcom/example/todolist/data/model/TaskInfo;", "(Lcom/example/todolist/data/model/TaskInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTaskAndCategory", "taskInfo", "categoryInfo", "Lcom/example/todolist/data/model/CategoryInfo;", "(Lcom/example/todolist/data/model/TaskInfo;Lcom/example/todolist/data/model/CategoryInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getActiveAlarms", "", "currentTime", "Ljava/util/Date;", "(Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCategories", "Landroidx/lifecycle/LiveData;", "getCompletedTask", "Lcom/example/todolist/data/model/TaskCategoryInfo;", "getCompletedTaskOfCategory", "category", "", "getCountOfCategory", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNoOfTaskForEachCategory", "Lcom/example/todolist/data/model/NoOfTaskForEachCategory;", "getUncompletedTask", "getUncompletedTaskOfCategory", "insertTaskAndCategory", "updateTaskAndAddCategory", "updateTaskAndAddDeleteCategory", "categoryInfoAdd", "categoryInfoDelete", "(Lcom/example/todolist/data/model/TaskInfo;Lcom/example/todolist/data/model/CategoryInfo;Lcom/example/todolist/data/model/CategoryInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTaskStatus", "app_debug"})
public final class TaskCategoryRepositoryImpl implements com.example.todolist.domain.TaskCategoryRepository {
    private final com.example.todolist.data.db.TaskCategoryDao taskCategoryDao = null;
    
    @javax.inject.Inject
    public TaskCategoryRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.db.TaskCategoryDao taskCategoryDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object updateTaskStatus(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.TaskInfo task, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteTask(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.TaskInfo task, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object insertTaskAndCategory(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.TaskInfo taskInfo, @org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.CategoryInfo categoryInfo, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteTaskAndCategory(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.TaskInfo taskInfo, @org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.CategoryInfo categoryInfo, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object updateTaskAndAddDeleteCategory(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.TaskInfo taskInfo, @org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.CategoryInfo categoryInfoAdd, @org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.CategoryInfo categoryInfoDelete, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object updateTaskAndAddCategory(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.TaskInfo taskInfo, @org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.CategoryInfo categoryInfo, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.lifecycle.LiveData<java.util.List<com.example.todolist.data.model.TaskCategoryInfo>> getUncompletedTask() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.lifecycle.LiveData<java.util.List<com.example.todolist.data.model.TaskCategoryInfo>> getCompletedTask() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.lifecycle.LiveData<java.util.List<com.example.todolist.data.model.TaskCategoryInfo>> getUncompletedTaskOfCategory(@org.jetbrains.annotations.NotNull
    java.lang.String category) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.lifecycle.LiveData<java.util.List<com.example.todolist.data.model.TaskCategoryInfo>> getCompletedTaskOfCategory(@org.jetbrains.annotations.NotNull
    java.lang.String category) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.lifecycle.LiveData<java.util.List<com.example.todolist.data.model.NoOfTaskForEachCategory>> getNoOfTaskForEachCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.lifecycle.LiveData<java.util.List<com.example.todolist.data.model.CategoryInfo>> getCategories() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getCountOfCategory(@org.jetbrains.annotations.NotNull
    java.lang.String category, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getActiveAlarms(@org.jetbrains.annotations.NotNull
    java.util.Date currentTime, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.todolist.data.model.TaskInfo>> continuation) {
        return null;
    }
}