package com.example.todolist.data.db;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\'J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000f0\u0013H\'J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000f0\u0013H\'J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000f0\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\'J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0018H\'J\u0014\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u000f0\u0013H\'J\u0014\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u0013H\'J\u0014\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000f0\u0013H\'J\u001c\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000f0\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\'J\u0019\u0010 \u001a\u00020!2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\"\u001a\u00020!2\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ!\u0010#\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ!\u0010$\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ)\u0010%\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u00052\u0006\u0010\'\u001a\u00020\u0005H\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(J\u0019\u0010)\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006*"}, d2 = {"Lcom/example/todolist/data/db/TaskCategoryDao;", "", "deleteCategory", "", "categoryInfo", "Lcom/example/todolist/data/model/CategoryInfo;", "(Lcom/example/todolist/data/model/CategoryInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTask", "task", "Lcom/example/todolist/data/model/TaskInfo;", "(Lcom/example/todolist/data/model/TaskInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTaskAndCategory", "taskInfo", "(Lcom/example/todolist/data/model/TaskInfo;Lcom/example/todolist/data/model/CategoryInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getActiveAlarms", "", "currentTime", "Ljava/util/Date;", "getCategories", "Landroidx/lifecycle/LiveData;", "getCompletedTask", "Lcom/example/todolist/data/model/TaskCategoryInfo;", "getCompletedTaskOfCategory", "category", "", "getCountOfCategory", "", "getNoOfTaskForEachCategory", "Lcom/example/todolist/data/model/NoOfTaskForEachCategory;", "getTasks", "getUncompletedTask", "getUncompletedTaskOfCategory", "insertCategory", "", "insertTask", "insertTaskAndCategory", "updateTaskAndAddCategory", "updateTaskAndAddDeleteCategory", "categoryInfoAdd", "categoryInfoDelete", "(Lcom/example/todolist/data/model/TaskInfo;Lcom/example/todolist/data/model/CategoryInfo;Lcom/example/todolist/data/model/CategoryInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTaskStatus", "app_debug"})
public abstract interface TaskCategoryDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert
    public abstract java.lang.Object insertTask(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.TaskInfo task, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Update
    public abstract java.lang.Object updateTaskStatus(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.TaskInfo task, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertCategory(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.CategoryInfo categoryInfo, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Delete
    public abstract java.lang.Object deleteTask(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.TaskInfo task, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Delete
    public abstract java.lang.Object deleteCategory(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.CategoryInfo categoryInfo, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Transaction
    public abstract java.lang.Object insertTaskAndCategory(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.TaskInfo taskInfo, @org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.CategoryInfo categoryInfo, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Transaction
    public abstract java.lang.Object updateTaskAndAddCategory(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.TaskInfo taskInfo, @org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.CategoryInfo categoryInfo, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Transaction
    public abstract java.lang.Object updateTaskAndAddDeleteCategory(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.TaskInfo taskInfo, @org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.CategoryInfo categoryInfoAdd, @org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.CategoryInfo categoryInfoDelete, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Transaction
    public abstract java.lang.Object deleteTaskAndCategory(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.TaskInfo taskInfo, @org.jetbrains.annotations.NotNull
    com.example.todolist.data.model.CategoryInfo categoryInfo, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM taskInfo WHERE status = 0 ORDER BY date")
    @androidx.room.Transaction
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.todolist.data.model.TaskCategoryInfo>> getUncompletedTask();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM taskInfo WHERE status = 1 ORDER BY date")
    @androidx.room.Transaction
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.todolist.data.model.TaskCategoryInfo>> getCompletedTask();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM taskInfo WHERE status = 0 AND category =:category ORDER BY date")
    @androidx.room.Transaction
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.todolist.data.model.TaskCategoryInfo>> getUncompletedTaskOfCategory(@org.jetbrains.annotations.NotNull
    java.lang.String category);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM taskInfo WHERE status = 1 AND category = :category ORDER BY date")
    @androidx.room.Transaction
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.todolist.data.model.TaskCategoryInfo>> getCompletedTaskOfCategory(@org.jetbrains.annotations.NotNull
    java.lang.String category);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT taskInfo.category as category,Count(*) as count, categoryInfo.color as color  FROM taskInfo, categoryInfo WHERE taskInfo.category == categoryInfo.categoryInformation AND taskInfo.status = 0 GROUP BY category ORDER BY count DESC, category")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.todolist.data.model.NoOfTaskForEachCategory>> getNoOfTaskForEachCategory();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM categoryInfo")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.todolist.data.model.CategoryInfo>> getCategories();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM taskInfo")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.todolist.data.model.TaskInfo>> getTasks();
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM taskInfo WHERE category = :category ")
    public abstract int getCountOfCategory(@org.jetbrains.annotations.NotNull
    java.lang.String category);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM taskInfo WHERE status = 0 AND date > :currentTime")
    public abstract java.util.List<com.example.todolist.data.model.TaskInfo> getActiveAlarms(@org.jetbrains.annotations.NotNull
    java.util.Date currentTime);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.Nullable
        @androidx.room.Transaction
        public static java.lang.Object insertTaskAndCategory(@org.jetbrains.annotations.NotNull
        com.example.todolist.data.db.TaskCategoryDao $this, @org.jetbrains.annotations.NotNull
        com.example.todolist.data.model.TaskInfo taskInfo, @org.jetbrains.annotations.NotNull
        com.example.todolist.data.model.CategoryInfo categoryInfo, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super kotlin.Unit> p3) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        @androidx.room.Transaction
        public static java.lang.Object updateTaskAndAddCategory(@org.jetbrains.annotations.NotNull
        com.example.todolist.data.db.TaskCategoryDao $this, @org.jetbrains.annotations.NotNull
        com.example.todolist.data.model.TaskInfo taskInfo, @org.jetbrains.annotations.NotNull
        com.example.todolist.data.model.CategoryInfo categoryInfo, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super kotlin.Unit> p3) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        @androidx.room.Transaction
        public static java.lang.Object updateTaskAndAddDeleteCategory(@org.jetbrains.annotations.NotNull
        com.example.todolist.data.db.TaskCategoryDao $this, @org.jetbrains.annotations.NotNull
        com.example.todolist.data.model.TaskInfo taskInfo, @org.jetbrains.annotations.NotNull
        com.example.todolist.data.model.CategoryInfo categoryInfoAdd, @org.jetbrains.annotations.NotNull
        com.example.todolist.data.model.CategoryInfo categoryInfoDelete, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super kotlin.Unit> p4) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        @androidx.room.Transaction
        public static java.lang.Object deleteTaskAndCategory(@org.jetbrains.annotations.NotNull
        com.example.todolist.data.db.TaskCategoryDao $this, @org.jetbrains.annotations.NotNull
        com.example.todolist.data.model.TaskInfo taskInfo, @org.jetbrains.annotations.NotNull
        com.example.todolist.data.model.CategoryInfo categoryInfo, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super kotlin.Unit> p3) {
            return null;
        }
    }
}