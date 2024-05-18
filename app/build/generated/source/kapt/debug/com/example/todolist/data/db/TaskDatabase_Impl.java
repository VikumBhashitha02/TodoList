package com.example.todolist.data.db;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TaskDatabase_Impl extends TaskDatabase {
  private volatile TaskCategoryDao _taskCategoryDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `taskInfo` (`id` INTEGER NOT NULL, `description` TEXT NOT NULL, `date` INTEGER NOT NULL, `priority` INTEGER NOT NULL, `status` INTEGER NOT NULL, `category` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `categoryInfo` (`categoryInformation` TEXT NOT NULL, `color` TEXT NOT NULL, PRIMARY KEY(`categoryInformation`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8da68e5093cb25a0885812e4a55049f1')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `taskInfo`");
        _db.execSQL("DROP TABLE IF EXISTS `categoryInfo`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsTaskInfo = new HashMap<String, TableInfo.Column>(6);
        _columnsTaskInfo.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTaskInfo.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTaskInfo.put("date", new TableInfo.Column("date", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTaskInfo.put("priority", new TableInfo.Column("priority", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTaskInfo.put("status", new TableInfo.Column("status", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTaskInfo.put("category", new TableInfo.Column("category", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTaskInfo = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTaskInfo = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTaskInfo = new TableInfo("taskInfo", _columnsTaskInfo, _foreignKeysTaskInfo, _indicesTaskInfo);
        final TableInfo _existingTaskInfo = TableInfo.read(_db, "taskInfo");
        if (! _infoTaskInfo.equals(_existingTaskInfo)) {
          return new RoomOpenHelper.ValidationResult(false, "taskInfo(com.example.todolist.data.model.TaskInfo).\n"
                  + " Expected:\n" + _infoTaskInfo + "\n"
                  + " Found:\n" + _existingTaskInfo);
        }
        final HashMap<String, TableInfo.Column> _columnsCategoryInfo = new HashMap<String, TableInfo.Column>(2);
        _columnsCategoryInfo.put("categoryInformation", new TableInfo.Column("categoryInformation", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCategoryInfo.put("color", new TableInfo.Column("color", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCategoryInfo = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCategoryInfo = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCategoryInfo = new TableInfo("categoryInfo", _columnsCategoryInfo, _foreignKeysCategoryInfo, _indicesCategoryInfo);
        final TableInfo _existingCategoryInfo = TableInfo.read(_db, "categoryInfo");
        if (! _infoCategoryInfo.equals(_existingCategoryInfo)) {
          return new RoomOpenHelper.ValidationResult(false, "categoryInfo(com.example.todolist.data.model.CategoryInfo).\n"
                  + " Expected:\n" + _infoCategoryInfo + "\n"
                  + " Found:\n" + _existingCategoryInfo);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "8da68e5093cb25a0885812e4a55049f1", "4793d44250fb716acf2f1ae3fbaa0b03");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "taskInfo","categoryInfo");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `taskInfo`");
      _db.execSQL("DELETE FROM `categoryInfo`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(TaskCategoryDao.class, TaskCategoryDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public TaskCategoryDao getTaskCategoryDao() {
    if (_taskCategoryDao != null) {
      return _taskCategoryDao;
    } else {
      synchronized(this) {
        if(_taskCategoryDao == null) {
          _taskCategoryDao = new TaskCategoryDao_Impl(this);
        }
        return _taskCategoryDao;
      }
    }
  }
}
