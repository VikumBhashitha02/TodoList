package com.example.todolist.presentation.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.example.todolist.R
import com.example.todolist.`data`.model.TaskCategoryInfo
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.String
import kotlin.Suppress

public class BaseFragmentDirections private constructor() {
  private data class ActionBaseFragmentToTaskCategoryFragment(
    public val categoryString: String
  ) : NavDirections {
    public override val actionId: Int = R.id.action_baseFragment_to_taskCategoryFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("categoryString", this.categoryString)
        return result
      }
  }

  private data class ActionBaseFragmentToNewTaskFragment(
    public val newTaskArg: TaskCategoryInfo?
  ) : NavDirections {
    public override val actionId: Int = R.id.action_baseFragment_to_newTaskFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
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
  }

  public companion object {
    public fun actionBaseFragmentToTaskCategoryFragment(categoryString: String): NavDirections =
        ActionBaseFragmentToTaskCategoryFragment(categoryString)

    public fun actionBaseFragmentToNewTaskFragment(newTaskArg: TaskCategoryInfo?): NavDirections =
        ActionBaseFragmentToNewTaskFragment(newTaskArg)
  }
}
