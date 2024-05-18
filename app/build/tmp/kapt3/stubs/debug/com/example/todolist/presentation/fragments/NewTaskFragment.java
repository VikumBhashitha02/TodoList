package com.example.todolist.presentation.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000eH\u0002J\b\u0010\u001e\u001a\u00020\u001cH\u0002J\u001e\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002J\b\u0010%\u001a\u00020\u001cH\u0002J\b\u0010&\u001a\u00020\u001cH\u0002J\b\u0010\'\u001a\u00020\u001cH\u0002J\b\u0010(\u001a\u00020\u000eH\u0002J\b\u0010)\u001a\u00020\u001cH\u0002J\u001e\u0010*\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002J\b\u0010+\u001a\u00020\u001cH\u0002J$\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u001a\u00103\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\u00102\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0010\u00105\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u00106\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u00107\u001a\u00020\u001cH\u0002J\b\u00108\u001a\u00020\u001cH\u0002J\b\u00109\u001a\u00020\u001cH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006:"}, d2 = {"Lcom/example/todolist/presentation/fragments/NewTaskFragment;", "Landroidx/fragment/app/Fragment;", "()V", "args", "Lcom/example/todolist/presentation/fragments/NewTaskFragmentArgs;", "getArgs", "()Lcom/example/todolist/presentation/fragments/NewTaskFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "Lcom/example/todolist/databinding/FragmentNewTaskBinding;", "categoryInfo", "Lcom/example/todolist/data/model/CategoryInfo;", "colorString", "", "colorView", "Landroid/view/View;", "isCategorySelected", "", "navController", "Landroidx/navigation/NavController;", "prevTaskCategory", "Lcom/example/todolist/data/model/TaskCategoryInfo;", "taskInfo", "Lcom/example/todolist/data/model/TaskInfo;", "viewModel", "Lcom/example/todolist/presentation/MainActivityViewModel;", "addNewCategoryChip", "", "category", "addTask", "changePriority", "chipGroup", "Lcom/google/android/material/chip/ChipGroup;", "i", "", "", "createNotification", "displayCategoryChooseDialog", "displayColorPickerDialog", "generateRandomColor", "initUpdate", "listenToCategoryClick", "loadAllCategories", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "removeAlarm", "setAlarm", "setInitialValues", "showDateTimePicker", "updateTask", "app_debug"})
public final class NewTaskFragment extends androidx.fragment.app.Fragment {
    private com.example.todolist.databinding.FragmentNewTaskBinding binding;
    private androidx.navigation.NavController navController;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private com.example.todolist.data.model.TaskInfo taskInfo;
    private com.example.todolist.data.model.CategoryInfo categoryInfo;
    private com.example.todolist.presentation.MainActivityViewModel viewModel;
    private java.lang.String colorString = "#000000";
    private com.example.todolist.data.model.TaskCategoryInfo prevTaskCategory;
    private boolean isCategorySelected = false;
    private android.view.View colorView;
    
    public NewTaskFragment() {
        super();
    }
    
    private final com.example.todolist.presentation.fragments.NewTaskFragmentArgs getArgs() {
        return null;
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
    
    private final void initUpdate() {
    }
    
    private final void setInitialValues() {
    }
    
    private final void loadAllCategories() {
    }
    
    private final void changePriority(com.google.android.material.chip.ChipGroup chipGroup, java.util.List<java.lang.Integer> i) {
    }
    
    private final void listenToCategoryClick(com.google.android.material.chip.ChipGroup chipGroup, java.util.List<java.lang.Integer> i) {
    }
    
    private final void displayCategoryChooseDialog() {
    }
    
    private final java.lang.String generateRandomColor() {
        return null;
    }
    
    private final void displayColorPickerDialog() {
    }
    
    private final void addNewCategoryChip(java.lang.String category) {
    }
    
    private final void addTask() {
    }
    
    private final void updateTask() {
    }
    
    private final void removeAlarm(com.example.todolist.data.model.TaskInfo taskInfo) {
    }
    
    private final void showDateTimePicker() {
    }
    
    private final void setAlarm(com.example.todolist.data.model.TaskInfo taskInfo) {
    }
    
    private final void createNotification() {
    }
}