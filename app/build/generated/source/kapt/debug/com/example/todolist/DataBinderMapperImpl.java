package com.example.todolist;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.todolist.databinding.ActivityMainBindingImpl;
import com.example.todolist.databinding.AppBarMainBindingImpl;
import com.example.todolist.databinding.FragmentBaseBindingImpl;
import com.example.todolist.databinding.FragmentCompletedTasksBindingImpl;
import com.example.todolist.databinding.FragmentNewTaskBindingImpl;
import com.example.todolist.databinding.FragmentSettingsBindingImpl;
import com.example.todolist.databinding.FragmentTaskCategoryBindingImpl;
import com.example.todolist.databinding.ItemCategoriesBindingImpl;
import com.example.todolist.databinding.ItemTaskBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_APPBARMAIN = 2;

  private static final int LAYOUT_FRAGMENTBASE = 3;

  private static final int LAYOUT_FRAGMENTCOMPLETEDTASKS = 4;

  private static final int LAYOUT_FRAGMENTNEWTASK = 5;

  private static final int LAYOUT_FRAGMENTSETTINGS = 6;

  private static final int LAYOUT_FRAGMENTTASKCATEGORY = 7;

  private static final int LAYOUT_ITEMCATEGORIES = 8;

  private static final int LAYOUT_ITEMTASK = 9;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(9);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.todolist.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.todolist.R.layout.app_bar_main, LAYOUT_APPBARMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.todolist.R.layout.fragment_base, LAYOUT_FRAGMENTBASE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.todolist.R.layout.fragment_completed_tasks, LAYOUT_FRAGMENTCOMPLETEDTASKS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.todolist.R.layout.fragment_new_task, LAYOUT_FRAGMENTNEWTASK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.todolist.R.layout.fragment_settings, LAYOUT_FRAGMENTSETTINGS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.todolist.R.layout.fragment_task_category, LAYOUT_FRAGMENTTASKCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.todolist.R.layout.item_categories, LAYOUT_ITEMCATEGORIES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.todolist.R.layout.item_task, LAYOUT_ITEMTASK);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_APPBARMAIN: {
          if ("layout/app_bar_main_0".equals(tag)) {
            return new AppBarMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for app_bar_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTBASE: {
          if ("layout/fragment_base_0".equals(tag)) {
            return new FragmentBaseBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_base is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCOMPLETEDTASKS: {
          if ("layout/fragment_completed_tasks_0".equals(tag)) {
            return new FragmentCompletedTasksBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_completed_tasks is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTNEWTASK: {
          if ("layout/fragment_new_task_0".equals(tag)) {
            return new FragmentNewTaskBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_new_task is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSETTINGS: {
          if ("layout/fragment_settings_0".equals(tag)) {
            return new FragmentSettingsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_settings is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTASKCATEGORY: {
          if ("layout/fragment_task_category_0".equals(tag)) {
            return new FragmentTaskCategoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_task_category is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCATEGORIES: {
          if ("layout/item_categories_0".equals(tag)) {
            return new ItemCategoriesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_categories is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMTASK: {
          if ("layout/item_task_0".equals(tag)) {
            return new ItemTaskBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_task is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "noOfTaskOfCategory");
      sKeys.put(2, "taskCategoryInfo");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(9);

    static {
      sKeys.put("layout/activity_main_0", com.example.todolist.R.layout.activity_main);
      sKeys.put("layout/app_bar_main_0", com.example.todolist.R.layout.app_bar_main);
      sKeys.put("layout/fragment_base_0", com.example.todolist.R.layout.fragment_base);
      sKeys.put("layout/fragment_completed_tasks_0", com.example.todolist.R.layout.fragment_completed_tasks);
      sKeys.put("layout/fragment_new_task_0", com.example.todolist.R.layout.fragment_new_task);
      sKeys.put("layout/fragment_settings_0", com.example.todolist.R.layout.fragment_settings);
      sKeys.put("layout/fragment_task_category_0", com.example.todolist.R.layout.fragment_task_category);
      sKeys.put("layout/item_categories_0", com.example.todolist.R.layout.item_categories);
      sKeys.put("layout/item_task_0", com.example.todolist.R.layout.item_task);
    }
  }
}
