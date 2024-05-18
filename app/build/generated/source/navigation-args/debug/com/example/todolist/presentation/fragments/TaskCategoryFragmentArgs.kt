package com.example.todolist.presentation.fragments

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class TaskCategoryFragmentArgs(
  public val categoryString: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("categoryString", this.categoryString)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("categoryString", this.categoryString)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): TaskCategoryFragmentArgs {
      bundle.setClassLoader(TaskCategoryFragmentArgs::class.java.classLoader)
      val __categoryString : String?
      if (bundle.containsKey("categoryString")) {
        __categoryString = bundle.getString("categoryString")
        if (__categoryString == null) {
          throw IllegalArgumentException("Argument \"categoryString\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"categoryString\" is missing and does not have an android:defaultValue")
      }
      return TaskCategoryFragmentArgs(__categoryString)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): TaskCategoryFragmentArgs {
      val __categoryString : String?
      if (savedStateHandle.contains("categoryString")) {
        __categoryString = savedStateHandle["categoryString"]
        if (__categoryString == null) {
          throw IllegalArgumentException("Argument \"categoryString\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"categoryString\" is missing and does not have an android:defaultValue")
      }
      return TaskCategoryFragmentArgs(__categoryString)
    }
  }
}
