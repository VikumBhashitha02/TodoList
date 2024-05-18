// Generated by data binding compiler. Do not edit!
package com.example.todolist.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.example.todolist.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentBaseBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView categoriesRecyclerView;

  @NonNull
  public final LottieAnimationView categoryAnimationView;

  @NonNull
  public final TextView categoryText;

  @NonNull
  public final FloatingActionButton fab;

  @NonNull
  public final LottieAnimationView noResultAnimationView;

  @NonNull
  public final RecyclerView tasksRecyclerView;

  @NonNull
  public final TextView tasksText;

  protected FragmentBaseBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView categoriesRecyclerView, LottieAnimationView categoryAnimationView,
      TextView categoryText, FloatingActionButton fab, LottieAnimationView noResultAnimationView,
      RecyclerView tasksRecyclerView, TextView tasksText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.categoriesRecyclerView = categoriesRecyclerView;
    this.categoryAnimationView = categoryAnimationView;
    this.categoryText = categoryText;
    this.fab = fab;
    this.noResultAnimationView = noResultAnimationView;
    this.tasksRecyclerView = tasksRecyclerView;
    this.tasksText = tasksText;
  }

  @NonNull
  public static FragmentBaseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_base, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentBaseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentBaseBinding>inflateInternal(inflater, R.layout.fragment_base, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentBaseBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_base, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentBaseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentBaseBinding>inflateInternal(inflater, R.layout.fragment_base, null, false, component);
  }

  public static FragmentBaseBinding bind(@NonNull View view) {
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
  public static FragmentBaseBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentBaseBinding)bind(component, view, R.layout.fragment_base);
  }
}