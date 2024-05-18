package com.example.todolist.presentation.di;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = ToDoListApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface ToDoListApplication_GeneratedInjector {
  void injectToDoListApplication(ToDoListApplication toDoListApplication);
}
