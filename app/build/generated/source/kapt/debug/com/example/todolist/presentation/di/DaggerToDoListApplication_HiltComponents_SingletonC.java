// Generated by Dagger (https://dagger.dev).
package com.example.todolist.presentation.di;

import android.app.Activity;
import android.app.Service;
import android.content.SharedPreferences;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.example.todolist.data.db.TaskCategoryDao;
import com.example.todolist.data.db.TaskDatabase;
import com.example.todolist.data.repository.TaskCategoryRepositoryImpl;
import com.example.todolist.domain.TaskCategoryRepository;
import com.example.todolist.presentation.MainActivity;
import com.example.todolist.presentation.MainActivityViewModel;
import com.example.todolist.presentation.MainActivityViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.todolist.presentation.adapter.CategoryAdapter;
import com.example.todolist.presentation.adapter.TasksAdapter;
import com.example.todolist.presentation.br.AlarmReceiver;
import com.example.todolist.presentation.br.AlarmReceiver_MembersInjector;
import com.example.todolist.presentation.br.OnCompletedBroadcastReceiver;
import com.example.todolist.presentation.br.OnCompletedBroadcastReceiver_MembersInjector;
import com.example.todolist.presentation.br.RebootBroadcastReceiver;
import com.example.todolist.presentation.br.RebootBroadcastReceiver_MembersInjector;
import com.example.todolist.presentation.fragments.BaseFragment;
import com.example.todolist.presentation.fragments.BaseFragment_MembersInjector;
import com.example.todolist.presentation.fragments.CompletedTasksFragment;
import com.example.todolist.presentation.fragments.CompletedTasksFragment_MembersInjector;
import com.example.todolist.presentation.fragments.SettingsFragment;
import com.example.todolist.presentation.fragments.SettingsFragment_MembersInjector;
import com.example.todolist.presentation.fragments.TaskCategoryFragment;
import com.example.todolist.presentation.fragments.TaskCategoryFragment_MembersInjector;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerToDoListApplication_HiltComponents_SingletonC extends ToDoListApplication_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private final DaggerToDoListApplication_HiltComponents_SingletonC singletonC = this;

  private Provider<SharedPreferences> provideTaskDatabaseProvider;

  private Provider<TaskDatabase> provideTaskDatabaseProvider2;

  private Provider<TaskCategoryDao> provideTaskCategoryDaoProvider;

  private Provider<TasksAdapter> provideTaskAdapterToBaseFragmentProvider;

  private Provider<CategoryAdapter> provideCategoryAdapterProvider;

  private Provider<TasksAdapter> provideTaskAdapterToCompletedTasksFragmentProvider;

  private Provider<TaskCategoryRepository> provideTaskCategoryRepositoryProvider;

  private DaggerToDoListApplication_HiltComponents_SingletonC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
    initialize(applicationContextModuleParam);

  }

  public static Builder builder() {
    return new Builder();
  }

  private SharedPreferences sharedPreferences() {
    return SharedPrefModule_ProvideTaskDatabaseFactory.provideTaskDatabase(ApplicationContextModule_ProvideApplicationFactory.provideApplication(applicationContextModule));
  }

  private TaskDatabase taskDatabase() {
    return DatabaseModule_ProvideTaskDatabaseFactory.provideTaskDatabase(ApplicationContextModule_ProvideApplicationFactory.provideApplication(applicationContextModule));
  }

  private TaskCategoryDao taskCategoryDao() {
    return DatabaseModule_ProvideTaskCategoryDaoFactory.provideTaskCategoryDao(provideTaskDatabaseProvider2.get());
  }

  private TaskCategoryRepositoryImpl taskCategoryRepositoryImpl() {
    return new TaskCategoryRepositoryImpl(provideTaskCategoryDaoProvider.get());
  }

  private TaskCategoryRepository taskCategoryRepository() {
    return RepositoryModule_ProvideTaskCategoryRepositoryFactory.provideTaskCategoryRepository(provideTaskCategoryDaoProvider.get());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final ApplicationContextModule applicationContextModuleParam) {
    this.provideTaskDatabaseProvider = DoubleCheck.provider(new SwitchingProvider<SharedPreferences>(singletonC, 0));
    this.provideTaskDatabaseProvider2 = DoubleCheck.provider(new SwitchingProvider<TaskDatabase>(singletonC, 2));
    this.provideTaskCategoryDaoProvider = DoubleCheck.provider(new SwitchingProvider<TaskCategoryDao>(singletonC, 1));
    this.provideTaskAdapterToBaseFragmentProvider = DoubleCheck.provider(new SwitchingProvider<TasksAdapter>(singletonC, 3));
    this.provideCategoryAdapterProvider = DoubleCheck.provider(new SwitchingProvider<CategoryAdapter>(singletonC, 4));
    this.provideTaskAdapterToCompletedTasksFragmentProvider = DoubleCheck.provider(new SwitchingProvider<TasksAdapter>(singletonC, 5));
    this.provideTaskCategoryRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<TaskCategoryRepository>(singletonC, 6));
  }

  @Override
  public void injectAlarmReceiver(AlarmReceiver alarmReceiver) {
    injectAlarmReceiver2(alarmReceiver);
  }

  @Override
  public void injectOnCompletedBroadcastReceiver(
      OnCompletedBroadcastReceiver onCompletedBroadcastReceiver) {
    injectOnCompletedBroadcastReceiver2(onCompletedBroadcastReceiver);
  }

  @Override
  public void injectRebootBroadcastReceiver(RebootBroadcastReceiver rebootBroadcastReceiver) {
    injectRebootBroadcastReceiver2(rebootBroadcastReceiver);
  }

  @Override
  public void injectToDoListApplication(ToDoListApplication toDoListApplication) {
    injectToDoListApplication2(toDoListApplication);
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder(singletonC);
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder(singletonC);
  }

  private AlarmReceiver injectAlarmReceiver2(AlarmReceiver instance) {
    AlarmReceiver_MembersInjector.injectSharedPreferences(instance, provideTaskDatabaseProvider.get());
    return instance;
  }

  private OnCompletedBroadcastReceiver injectOnCompletedBroadcastReceiver2(
      OnCompletedBroadcastReceiver instance) {
    OnCompletedBroadcastReceiver_MembersInjector.injectRepository(instance, taskCategoryRepositoryImpl());
    return instance;
  }

  private RebootBroadcastReceiver injectRebootBroadcastReceiver2(RebootBroadcastReceiver instance) {
    RebootBroadcastReceiver_MembersInjector.injectRepository(instance, taskCategoryRepositoryImpl());
    return instance;
  }

  private ToDoListApplication injectToDoListApplication2(ToDoListApplication instance) {
    ToDoListApplication_MembersInjector.injectSharedPreferences(instance, provideTaskDatabaseProvider.get());
    return instance;
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder databaseModule(DatabaseModule databaseModule) {
      Preconditions.checkNotNull(databaseModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder repositoryModule(RepositoryModule repositoryModule) {
      Preconditions.checkNotNull(repositoryModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder sharedPrefModule(SharedPrefModule sharedPrefModule) {
      Preconditions.checkNotNull(sharedPrefModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder singletonAdapterModule(SingletonAdapterModule singletonAdapterModule) {
      Preconditions.checkNotNull(singletonAdapterModule);
      return this;
    }

    public ToDoListApplication_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerToDoListApplication_HiltComponents_SingletonC(applicationContextModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements ToDoListApplication_HiltComponents.ActivityRetainedC.Builder {
    private final DaggerToDoListApplication_HiltComponents_SingletonC singletonC;

    private ActivityRetainedCBuilder(
        DaggerToDoListApplication_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;
    }

    @Override
    public ToDoListApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonC);
    }
  }

  private static final class ActivityCBuilder implements ToDoListApplication_HiltComponents.ActivityC.Builder {
    private final DaggerToDoListApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(DaggerToDoListApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public ToDoListApplication_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonC, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements ToDoListApplication_HiltComponents.FragmentC.Builder {
    private final DaggerToDoListApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(DaggerToDoListApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public ToDoListApplication_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonC, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements ToDoListApplication_HiltComponents.ViewWithFragmentC.Builder {
    private final DaggerToDoListApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(DaggerToDoListApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public ToDoListApplication_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonC, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements ToDoListApplication_HiltComponents.ViewC.Builder {
    private final DaggerToDoListApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(DaggerToDoListApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public ToDoListApplication_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonC, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements ToDoListApplication_HiltComponents.ViewModelC.Builder {
    private final DaggerToDoListApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelCBuilder(DaggerToDoListApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public ToDoListApplication_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      return new ViewModelCImpl(singletonC, activityRetainedCImpl, savedStateHandle);
    }
  }

  private static final class ServiceCBuilder implements ToDoListApplication_HiltComponents.ServiceC.Builder {
    private final DaggerToDoListApplication_HiltComponents_SingletonC singletonC;

    private Service service;

    private ServiceCBuilder(DaggerToDoListApplication_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public ToDoListApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonC, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends ToDoListApplication_HiltComponents.ViewWithFragmentC {
    private final DaggerToDoListApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(DaggerToDoListApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends ToDoListApplication_HiltComponents.FragmentC {
    private final DaggerToDoListApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private Provider<TasksAdapter> provideTaskAdapterToTaskCategoryFragmentProvider;

    private FragmentCImpl(DaggerToDoListApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;

      initialize(fragmentParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final Fragment fragmentParam) {
      this.provideTaskAdapterToTaskCategoryFragmentProvider = DoubleCheck.provider(new SwitchingProvider<TasksAdapter>(singletonC, activityRetainedCImpl, activityCImpl, fragmentCImpl, 0));
    }

    @Override
    public void injectBaseFragment(BaseFragment baseFragment) {
      injectBaseFragment2(baseFragment);
    }

    @Override
    public void injectCompletedTasksFragment(CompletedTasksFragment completedTasksFragment) {
      injectCompletedTasksFragment2(completedTasksFragment);
    }

    @Override
    public void injectSettingsFragment(SettingsFragment settingsFragment) {
      injectSettingsFragment2(settingsFragment);
    }

    @Override
    public void injectTaskCategoryFragment(TaskCategoryFragment taskCategoryFragment) {
      injectTaskCategoryFragment2(taskCategoryFragment);
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonC, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }

    private BaseFragment injectBaseFragment2(BaseFragment instance) {
      BaseFragment_MembersInjector.injectAdapter(instance, singletonC.provideTaskAdapterToBaseFragmentProvider.get());
      BaseFragment_MembersInjector.injectAdapter2(instance, singletonC.provideCategoryAdapterProvider.get());
      return instance;
    }

    private CompletedTasksFragment injectCompletedTasksFragment2(CompletedTasksFragment instance) {
      CompletedTasksFragment_MembersInjector.injectAdapter(instance, singletonC.provideTaskAdapterToCompletedTasksFragmentProvider.get());
      return instance;
    }

    private SettingsFragment injectSettingsFragment2(SettingsFragment instance) {
      SettingsFragment_MembersInjector.injectSharedPreferences(instance, singletonC.provideTaskDatabaseProvider.get());
      return instance;
    }

    private TaskCategoryFragment injectTaskCategoryFragment2(TaskCategoryFragment instance) {
      TaskCategoryFragment_MembersInjector.injectAdapter(instance, provideTaskAdapterToTaskCategoryFragmentProvider.get());
      return instance;
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final DaggerToDoListApplication_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ActivityCImpl activityCImpl;

      private final FragmentCImpl fragmentCImpl;

      private final int id;

      SwitchingProvider(DaggerToDoListApplication_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
          FragmentCImpl fragmentCImpl, int id) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.activityCImpl = activityCImpl;
        this.fragmentCImpl = fragmentCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // @javax.inject.Named("task_category_fragment") com.example.todolist.presentation.adapter.TasksAdapter 
          return (T) FragmentAdapterModule_ProvideTaskAdapterToTaskCategoryFragmentFactory.provideTaskAdapterToTaskCategoryFragment();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ViewCImpl extends ToDoListApplication_HiltComponents.ViewC {
    private final DaggerToDoListApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(DaggerToDoListApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, View viewParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends ToDoListApplication_HiltComponents.ActivityC {
    private final DaggerToDoListApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(DaggerToDoListApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public void injectMainActivity(MainActivity mainActivity) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), getViewModelKeys(), new ViewModelCBuilder(singletonC, activityRetainedCImpl));
    }

    @Override
    public Set<String> getViewModelKeys() {
      return Collections.<String>singleton(MainActivityViewModel_HiltModules_KeyModule_ProvideFactory.provide());
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonC, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonC, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonC, activityRetainedCImpl, activityCImpl);
    }
  }

  private static final class ViewModelCImpl extends ToDoListApplication_HiltComponents.ViewModelC {
    private final DaggerToDoListApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<MainActivityViewModel> mainActivityViewModelProvider;

    private ViewModelCImpl(DaggerToDoListApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam);

    }

    private MainActivityViewModel mainActivityViewModel() {
      return new MainActivityViewModel(singletonC.provideTaskCategoryRepositoryProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam) {
      this.mainActivityViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 0);
    }

    @Override
    public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
      return Collections.<String, Provider<ViewModel>>singletonMap("com.example.todolist.presentation.MainActivityViewModel", (Provider) mainActivityViewModelProvider);
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final DaggerToDoListApplication_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(DaggerToDoListApplication_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, ViewModelCImpl viewModelCImpl, int id) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.example.todolist.presentation.MainActivityViewModel 
          return (T) viewModelCImpl.mainActivityViewModel();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends ToDoListApplication_HiltComponents.ActivityRetainedC {
    private final DaggerToDoListApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    @SuppressWarnings("rawtypes")
    private Provider lifecycleProvider;

    private ActivityRetainedCImpl(DaggerToDoListApplication_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.lifecycleProvider = DoubleCheck.provider(new SwitchingProvider<Object>(singletonC, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonC, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return (ActivityRetainedLifecycle) lifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final DaggerToDoListApplication_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(DaggerToDoListApplication_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, int id) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.Lifecycle 
          return (T) ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends ToDoListApplication_HiltComponents.ServiceC {
    private final DaggerToDoListApplication_HiltComponents_SingletonC singletonC;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(DaggerToDoListApplication_HiltComponents_SingletonC singletonC,
        Service serviceParam) {
      this.singletonC = singletonC;


    }
  }

  private static final class SwitchingProvider<T> implements Provider<T> {
    private final DaggerToDoListApplication_HiltComponents_SingletonC singletonC;

    private final int id;

    SwitchingProvider(DaggerToDoListApplication_HiltComponents_SingletonC singletonC, int id) {
      this.singletonC = singletonC;
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // android.content.SharedPreferences 
        return (T) singletonC.sharedPreferences();

        case 1: // com.example.todolist.data.db.TaskCategoryDao 
        return (T) singletonC.taskCategoryDao();

        case 2: // com.example.todolist.data.db.TaskDatabase 
        return (T) singletonC.taskDatabase();

        case 3: // @javax.inject.Named("base_fragment") com.example.todolist.presentation.adapter.TasksAdapter 
        return (T) SingletonAdapterModule_ProvideTaskAdapterToBaseFragmentFactory.provideTaskAdapterToBaseFragment();

        case 4: // com.example.todolist.presentation.adapter.CategoryAdapter 
        return (T) SingletonAdapterModule_ProvideCategoryAdapterFactory.provideCategoryAdapter();

        case 5: // @javax.inject.Named("completed_task_fragment") com.example.todolist.presentation.adapter.TasksAdapter 
        return (T) SingletonAdapterModule_ProvideTaskAdapterToCompletedTasksFragmentFactory.provideTaskAdapterToCompletedTasksFragment();

        case 6: // com.example.todolist.domain.TaskCategoryRepository 
        return (T) singletonC.taskCategoryRepository();

        default: throw new AssertionError(id);
      }
    }
  }
}