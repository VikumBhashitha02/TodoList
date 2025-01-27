// Generated by data binding compiler. Do not edit!
package com.example.todolist.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.todolist.R;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentNewTaskBinding extends ViewDataBinding {
  @NonNull
  public final ChipGroup categoryChipGroup;

  @NonNull
  public final Chip categoryText;

  @NonNull
  public final Chip dateAndTimePicker;

  @NonNull
  public final TextInputEditText editText;

  @NonNull
  public final ExtendedFloatingActionButton fab;

  @NonNull
  public final Chip high;

  @NonNull
  public final MaterialCheckBox isCompleted;

  @NonNull
  public final Chip low;

  @NonNull
  public final Chip mid;

  @NonNull
  public final ChipGroup priorityChipGroup;

  @NonNull
  public final Chip priorityText;

  protected FragmentNewTaskBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ChipGroup categoryChipGroup, Chip categoryText, Chip dateAndTimePicker,
      TextInputEditText editText, ExtendedFloatingActionButton fab, Chip high,
      MaterialCheckBox isCompleted, Chip low, Chip mid, ChipGroup priorityChipGroup,
      Chip priorityText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.categoryChipGroup = categoryChipGroup;
    this.categoryText = categoryText;
    this.dateAndTimePicker = dateAndTimePicker;
    this.editText = editText;
    this.fab = fab;
    this.high = high;
    this.isCompleted = isCompleted;
    this.low = low;
    this.mid = mid;
    this.priorityChipGroup = priorityChipGroup;
    this.priorityText = priorityText;
  }

  @NonNull
  public static FragmentNewTaskBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_new_task, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentNewTaskBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentNewTaskBinding>inflateInternal(inflater, R.layout.fragment_new_task, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentNewTaskBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_new_task, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentNewTaskBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentNewTaskBinding>inflateInternal(inflater, R.layout.fragment_new_task, null, false, component);
  }

  public static FragmentNewTaskBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentNewTaskBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentNewTaskBinding)bind(component, view, R.layout.fragment_new_task);
  }
}
