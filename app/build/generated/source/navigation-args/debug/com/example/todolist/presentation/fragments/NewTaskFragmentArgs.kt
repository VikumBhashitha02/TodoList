package com.example.todolist.presentation.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.example.todolist.`data`.model.TaskCategoryInfo
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class NewTaskFragmentArgs(
  public val newTaskArg: TaskCategoryInfo?
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(TaskCategoryInfo::class.java)) {
      result.putParcelable("newTaskArg", this.newTaskArg as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(TaskCategoryInfo::class.java)) {
      result.putSerializable("newTaskArg", this.newTaskArg as Serializable?)
    } else {
      throw UnsupportedOperationException(TaskCategoryInfo::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(TaskCategoryInfo::class.java)) {
      result.set("newTaskArg", this.newTaskArg as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(TaskCategoryInfo::class.java)) {
      result.set("newTaskArg", this.newTaskArg as Serializable?)
    } else {
      throw UnsupportedOperationException(TaskCategoryInfo::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): NewTaskFragmentArgs {
      bundle.setClassLoader(NewTaskFragmentArgs::class.java.classLoader)
      val __newTaskArg : TaskCategoryInfo?
      if (bundle.containsKey("newTaskArg")) {
        if (Parcelable::class.java.isAssignableFrom(TaskCategoryInfo::class.java) ||
            Serializable::class.java.isAssignableFrom(TaskCategoryInfo::class.java)) {
          __newTaskArg = bundle.get("newTaskArg") as TaskCategoryInfo?
        } else {
          throw UnsupportedOperationException(TaskCategoryInfo::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"newTaskArg\" is missing and does not have an android:defaultValue")
      }
      return NewTaskFragmentArgs(__newTaskArg)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): NewTaskFragmentArgs {
      val __newTaskArg : TaskCategoryInfo?
      if (savedStateHandle.contains("newTaskArg")) {
        if (Parcelable::class.java.isAssignableFrom(TaskCategoryInfo::class.java) ||
            Serializable::class.java.isAssignableFrom(TaskCategoryInfo::class.java)) {
          __newTaskArg = savedStateHandle.get<TaskCategoryInfo?>("newTaskArg")
        } else {
          throw UnsupportedOperationException(TaskCategoryInfo::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"newTaskArg\" is missing and does not have an android:defaultValue")
      }
      return NewTaskFragmentArgs(__newTaskArg)
    }
  }
}
