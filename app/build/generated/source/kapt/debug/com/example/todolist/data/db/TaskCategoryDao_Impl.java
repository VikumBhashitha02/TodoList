package com.example.todolist.data.db;

import android.database.Cursor;
import androidx.collection.ArrayMap;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.todolist.data.model.CategoryInfo;
import com.example.todolist.data.model.NoOfTaskForEachCategory;
import com.example.todolist.data.model.TaskCategoryInfo;
import com.example.todolist.data.model.TaskInfo;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TaskCategoryDao_Impl implements TaskCategoryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<TaskInfo> __insertionAdapterOfTaskInfo;

  private final DateConverter __dateConverter = new DateConverter();

  private final EntityInsertionAdapter<CategoryInfo> __insertionAdapterOfCategoryInfo;

  private final EntityDeletionOrUpdateAdapter<TaskInfo> __deletionAdapterOfTaskInfo;

  private final EntityDeletionOrUpdateAdapter<CategoryInfo> __deletionAdapterOfCategoryInfo;

  private final EntityDeletionOrUpdateAdapter<TaskInfo> __updateAdapterOfTaskInfo;

  public TaskCategoryDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTaskInfo = new EntityInsertionAdapter<TaskInfo>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `taskInfo` (`id`,`description`,`date`,`priority`,`status`,`category`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TaskInfo value) {
        stmt.bindLong(1, value.getId());
        if (value.getDescription() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDescription());
        }
        final long _tmp = __dateConverter.dateToTimeStamp(value.getDate());
        stmt.bindLong(3, _tmp);
        stmt.bindLong(4, value.getPriority());
        final int _tmp_1 = value.getStatus() ? 1 : 0;
        stmt.bindLong(5, _tmp_1);
        if (value.getCategory() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getCategory());
        }
      }
    };
    this.__insertionAdapterOfCategoryInfo = new EntityInsertionAdapter<CategoryInfo>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `categoryInfo` (`categoryInformation`,`color`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CategoryInfo value) {
        if (value.getCategoryInformation() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCategoryInformation());
        }
        if (value.getColor() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getColor());
        }
      }
    };
    this.__deletionAdapterOfTaskInfo = new EntityDeletionOrUpdateAdapter<TaskInfo>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `taskInfo` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TaskInfo value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__deletionAdapterOfCategoryInfo = new EntityDeletionOrUpdateAdapter<CategoryInfo>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `categoryInfo` WHERE `categoryInformation` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CategoryInfo value) {
        if (value.getCategoryInformation() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCategoryInformation());
        }
      }
    };
    this.__updateAdapterOfTaskInfo = new EntityDeletionOrUpdateAdapter<TaskInfo>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `taskInfo` SET `id` = ?,`description` = ?,`date` = ?,`priority` = ?,`status` = ?,`category` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TaskInfo value) {
        stmt.bindLong(1, value.getId());
        if (value.getDescription() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDescription());
        }
        final long _tmp = __dateConverter.dateToTimeStamp(value.getDate());
        stmt.bindLong(3, _tmp);
        stmt.bindLong(4, value.getPriority());
        final int _tmp_1 = value.getStatus() ? 1 : 0;
        stmt.bindLong(5, _tmp_1);
        if (value.getCategory() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getCategory());
        }
        stmt.bindLong(7, value.getId());
      }
    };
  }

  @Override
  public Object insertTask(final TaskInfo task, final Continuation<? super Long> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfTaskInfo.insertAndReturnId(task);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object insertCategory(final CategoryInfo categoryInfo,
      final Continuation<? super Long> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfCategoryInfo.insertAndReturnId(categoryInfo);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteTask(final TaskInfo task, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfTaskInfo.handle(task);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteCategory(final CategoryInfo categoryInfo,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfCategoryInfo.handle(categoryInfo);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object updateTaskStatus(final TaskInfo task,
      final Continuation<? super Integer> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        int _total = 0;
        __db.beginTransaction();
        try {
          _total +=__updateAdapterOfTaskInfo.handle(task);
          __db.setTransactionSuccessful();
          return _total;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object insertTaskAndCategory(final TaskInfo taskInfo, final CategoryInfo categoryInfo,
      final Continuation<? super Unit> continuation) {
    return RoomDatabaseKt.withTransaction(__db, (__cont) -> TaskCategoryDao.DefaultImpls.insertTaskAndCategory(TaskCategoryDao_Impl.this, taskInfo, categoryInfo, __cont), continuation);
  }

  @Override
  public Object updateTaskAndAddCategory(final TaskInfo taskInfo, final CategoryInfo categoryInfo,
      final Continuation<? super Unit> continuation) {
    return RoomDatabaseKt.withTransaction(__db, (__cont) -> TaskCategoryDao.DefaultImpls.updateTaskAndAddCategory(TaskCategoryDao_Impl.this, taskInfo, categoryInfo, __cont), continuation);
  }

  @Override
  public Object updateTaskAndAddDeleteCategory(final TaskInfo taskInfo,
      final CategoryInfo categoryInfoAdd, final CategoryInfo categoryInfoDelete,
      final Continuation<? super Unit> continuation) {
    return RoomDatabaseKt.withTransaction(__db, (__cont) -> TaskCategoryDao.DefaultImpls.updateTaskAndAddDeleteCategory(TaskCategoryDao_Impl.this, taskInfo, categoryInfoAdd, categoryInfoDelete, __cont), continuation);
  }

  @Override
  public Object deleteTaskAndCategory(final TaskInfo taskInfo, final CategoryInfo categoryInfo,
      final Continuation<? super Unit> continuation) {
    return RoomDatabaseKt.withTransaction(__db, (__cont) -> TaskCategoryDao.DefaultImpls.deleteTaskAndCategory(TaskCategoryDao_Impl.this, taskInfo, categoryInfo, __cont), continuation);
  }

  @Override
  public LiveData<List<TaskCategoryInfo>> getUncompletedTask() {
    final String _sql = "SELECT * FROM taskInfo WHERE status = 0 ORDER BY date";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"categoryInfo","taskInfo"}, true, new Callable<List<TaskCategoryInfo>>() {
      @Override
      public List<TaskCategoryInfo> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
            final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
            final int _cursorIndexOfPriority = CursorUtil.getColumnIndexOrThrow(_cursor, "priority");
            final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
            final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
            final ArrayMap<String, ArrayList<CategoryInfo>> _collectionCategoryInfo = new ArrayMap<String, ArrayList<CategoryInfo>>();
            while (_cursor.moveToNext()) {
              final String _tmpKey = _cursor.getString(_cursorIndexOfCategory);
              ArrayList<CategoryInfo> _tmpCategoryInfoCollection = _collectionCategoryInfo.get(_tmpKey);
              if (_tmpCategoryInfoCollection == null) {
                _tmpCategoryInfoCollection = new ArrayList<CategoryInfo>();
                _collectionCategoryInfo.put(_tmpKey, _tmpCategoryInfoCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipcategoryInfoAscomExampleTodolistDataModelCategoryInfo(_collectionCategoryInfo);
            final List<TaskCategoryInfo> _result = new ArrayList<TaskCategoryInfo>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final TaskCategoryInfo _item;
              final TaskInfo _tmpTaskInfo;
              if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfDescription) && _cursor.isNull(_cursorIndexOfDate) && _cursor.isNull(_cursorIndexOfPriority) && _cursor.isNull(_cursorIndexOfStatus) && _cursor.isNull(_cursorIndexOfCategory))) {
                final int _tmpId;
                _tmpId = _cursor.getInt(_cursorIndexOfId);
                final String _tmpDescription;
                if (_cursor.isNull(_cursorIndexOfDescription)) {
                  _tmpDescription = null;
                } else {
                  _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
                }
                final Date _tmpDate;
                final long _tmp;
                _tmp = _cursor.getLong(_cursorIndexOfDate);
                _tmpDate = __dateConverter.fromTimeStamp(_tmp);
                final int _tmpPriority;
                _tmpPriority = _cursor.getInt(_cursorIndexOfPriority);
                final boolean _tmpStatus;
                final int _tmp_1;
                _tmp_1 = _cursor.getInt(_cursorIndexOfStatus);
                _tmpStatus = _tmp_1 != 0;
                final String _tmpCategory;
                if (_cursor.isNull(_cursorIndexOfCategory)) {
                  _tmpCategory = null;
                } else {
                  _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
                }
                _tmpTaskInfo = new TaskInfo(_tmpId,_tmpDescription,_tmpDate,_tmpPriority,_tmpStatus,_tmpCategory);
              }  else  {
                _tmpTaskInfo = null;
              }
              ArrayList<CategoryInfo> _tmpCategoryInfoCollection_1 = null;
              final String _tmpKey_1 = _cursor.getString(_cursorIndexOfCategory);
              _tmpCategoryInfoCollection_1 = _collectionCategoryInfo.get(_tmpKey_1);
              if (_tmpCategoryInfoCollection_1 == null) {
                _tmpCategoryInfoCollection_1 = new ArrayList<CategoryInfo>();
              }
              _item = new TaskCategoryInfo(_tmpTaskInfo,_tmpCategoryInfoCollection_1);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<TaskCategoryInfo>> getCompletedTask() {
    final String _sql = "SELECT * FROM taskInfo WHERE status = 1 ORDER BY date";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"categoryInfo","taskInfo"}, true, new Callable<List<TaskCategoryInfo>>() {
      @Override
      public List<TaskCategoryInfo> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
            final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
            final int _cursorIndexOfPriority = CursorUtil.getColumnIndexOrThrow(_cursor, "priority");
            final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
            final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
            final ArrayMap<String, ArrayList<CategoryInfo>> _collectionCategoryInfo = new ArrayMap<String, ArrayList<CategoryInfo>>();
            while (_cursor.moveToNext()) {
              final String _tmpKey = _cursor.getString(_cursorIndexOfCategory);
              ArrayList<CategoryInfo> _tmpCategoryInfoCollection = _collectionCategoryInfo.get(_tmpKey);
              if (_tmpCategoryInfoCollection == null) {
                _tmpCategoryInfoCollection = new ArrayList<CategoryInfo>();
                _collectionCategoryInfo.put(_tmpKey, _tmpCategoryInfoCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipcategoryInfoAscomExampleTodolistDataModelCategoryInfo(_collectionCategoryInfo);
            final List<TaskCategoryInfo> _result = new ArrayList<TaskCategoryInfo>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final TaskCategoryInfo _item;
              final TaskInfo _tmpTaskInfo;
              if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfDescription) && _cursor.isNull(_cursorIndexOfDate) && _cursor.isNull(_cursorIndexOfPriority) && _cursor.isNull(_cursorIndexOfStatus) && _cursor.isNull(_cursorIndexOfCategory))) {
                final int _tmpId;
                _tmpId = _cursor.getInt(_cursorIndexOfId);
                final String _tmpDescription;
                if (_cursor.isNull(_cursorIndexOfDescription)) {
                  _tmpDescription = null;
                } else {
                  _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
                }
                final Date _tmpDate;
                final long _tmp;
                _tmp = _cursor.getLong(_cursorIndexOfDate);
                _tmpDate = __dateConverter.fromTimeStamp(_tmp);
                final int _tmpPriority;
                _tmpPriority = _cursor.getInt(_cursorIndexOfPriority);
                final boolean _tmpStatus;
                final int _tmp_1;
                _tmp_1 = _cursor.getInt(_cursorIndexOfStatus);
                _tmpStatus = _tmp_1 != 0;
                final String _tmpCategory;
                if (_cursor.isNull(_cursorIndexOfCategory)) {
                  _tmpCategory = null;
                } else {
                  _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
                }
                _tmpTaskInfo = new TaskInfo(_tmpId,_tmpDescription,_tmpDate,_tmpPriority,_tmpStatus,_tmpCategory);
              }  else  {
                _tmpTaskInfo = null;
              }
              ArrayList<CategoryInfo> _tmpCategoryInfoCollection_1 = null;
              final String _tmpKey_1 = _cursor.getString(_cursorIndexOfCategory);
              _tmpCategoryInfoCollection_1 = _collectionCategoryInfo.get(_tmpKey_1);
              if (_tmpCategoryInfoCollection_1 == null) {
                _tmpCategoryInfoCollection_1 = new ArrayList<CategoryInfo>();
              }
              _item = new TaskCategoryInfo(_tmpTaskInfo,_tmpCategoryInfoCollection_1);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<TaskCategoryInfo>> getUncompletedTaskOfCategory(final String category) {
    final String _sql = "SELECT * FROM taskInfo WHERE status = 0 AND category =? ORDER BY date";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (category == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, category);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"categoryInfo","taskInfo"}, true, new Callable<List<TaskCategoryInfo>>() {
      @Override
      public List<TaskCategoryInfo> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
            final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
            final int _cursorIndexOfPriority = CursorUtil.getColumnIndexOrThrow(_cursor, "priority");
            final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
            final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
            final ArrayMap<String, ArrayList<CategoryInfo>> _collectionCategoryInfo = new ArrayMap<String, ArrayList<CategoryInfo>>();
            while (_cursor.moveToNext()) {
              final String _tmpKey = _cursor.getString(_cursorIndexOfCategory);
              ArrayList<CategoryInfo> _tmpCategoryInfoCollection = _collectionCategoryInfo.get(_tmpKey);
              if (_tmpCategoryInfoCollection == null) {
                _tmpCategoryInfoCollection = new ArrayList<CategoryInfo>();
                _collectionCategoryInfo.put(_tmpKey, _tmpCategoryInfoCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipcategoryInfoAscomExampleTodolistDataModelCategoryInfo(_collectionCategoryInfo);
            final List<TaskCategoryInfo> _result = new ArrayList<TaskCategoryInfo>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final TaskCategoryInfo _item;
              final TaskInfo _tmpTaskInfo;
              if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfDescription) && _cursor.isNull(_cursorIndexOfDate) && _cursor.isNull(_cursorIndexOfPriority) && _cursor.isNull(_cursorIndexOfStatus) && _cursor.isNull(_cursorIndexOfCategory))) {
                final int _tmpId;
                _tmpId = _cursor.getInt(_cursorIndexOfId);
                final String _tmpDescription;
                if (_cursor.isNull(_cursorIndexOfDescription)) {
                  _tmpDescription = null;
                } else {
                  _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
                }
                final Date _tmpDate;
                final long _tmp;
                _tmp = _cursor.getLong(_cursorIndexOfDate);
                _tmpDate = __dateConverter.fromTimeStamp(_tmp);
                final int _tmpPriority;
                _tmpPriority = _cursor.getInt(_cursorIndexOfPriority);
                final boolean _tmpStatus;
                final int _tmp_1;
                _tmp_1 = _cursor.getInt(_cursorIndexOfStatus);
                _tmpStatus = _tmp_1 != 0;
                final String _tmpCategory;
                if (_cursor.isNull(_cursorIndexOfCategory)) {
                  _tmpCategory = null;
                } else {
                  _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
                }
                _tmpTaskInfo = new TaskInfo(_tmpId,_tmpDescription,_tmpDate,_tmpPriority,_tmpStatus,_tmpCategory);
              }  else  {
                _tmpTaskInfo = null;
              }
              ArrayList<CategoryInfo> _tmpCategoryInfoCollection_1 = null;
              final String _tmpKey_1 = _cursor.getString(_cursorIndexOfCategory);
              _tmpCategoryInfoCollection_1 = _collectionCategoryInfo.get(_tmpKey_1);
              if (_tmpCategoryInfoCollection_1 == null) {
                _tmpCategoryInfoCollection_1 = new ArrayList<CategoryInfo>();
              }
              _item = new TaskCategoryInfo(_tmpTaskInfo,_tmpCategoryInfoCollection_1);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<TaskCategoryInfo>> getCompletedTaskOfCategory(final String category) {
    final String _sql = "SELECT * FROM taskInfo WHERE status = 1 AND category = ? ORDER BY date";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (category == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, category);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"categoryInfo","taskInfo"}, true, new Callable<List<TaskCategoryInfo>>() {
      @Override
      public List<TaskCategoryInfo> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
            final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
            final int _cursorIndexOfPriority = CursorUtil.getColumnIndexOrThrow(_cursor, "priority");
            final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
            final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
            final ArrayMap<String, ArrayList<CategoryInfo>> _collectionCategoryInfo = new ArrayMap<String, ArrayList<CategoryInfo>>();
            while (_cursor.moveToNext()) {
              final String _tmpKey = _cursor.getString(_cursorIndexOfCategory);
              ArrayList<CategoryInfo> _tmpCategoryInfoCollection = _collectionCategoryInfo.get(_tmpKey);
              if (_tmpCategoryInfoCollection == null) {
                _tmpCategoryInfoCollection = new ArrayList<CategoryInfo>();
                _collectionCategoryInfo.put(_tmpKey, _tmpCategoryInfoCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipcategoryInfoAscomExampleTodolistDataModelCategoryInfo(_collectionCategoryInfo);
            final List<TaskCategoryInfo> _result = new ArrayList<TaskCategoryInfo>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final TaskCategoryInfo _item;
              final TaskInfo _tmpTaskInfo;
              if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfDescription) && _cursor.isNull(_cursorIndexOfDate) && _cursor.isNull(_cursorIndexOfPriority) && _cursor.isNull(_cursorIndexOfStatus) && _cursor.isNull(_cursorIndexOfCategory))) {
                final int _tmpId;
                _tmpId = _cursor.getInt(_cursorIndexOfId);
                final String _tmpDescription;
                if (_cursor.isNull(_cursorIndexOfDescription)) {
                  _tmpDescription = null;
                } else {
                  _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
                }
                final Date _tmpDate;
                final long _tmp;
                _tmp = _cursor.getLong(_cursorIndexOfDate);
                _tmpDate = __dateConverter.fromTimeStamp(_tmp);
                final int _tmpPriority;
                _tmpPriority = _cursor.getInt(_cursorIndexOfPriority);
                final boolean _tmpStatus;
                final int _tmp_1;
                _tmp_1 = _cursor.getInt(_cursorIndexOfStatus);
                _tmpStatus = _tmp_1 != 0;
                final String _tmpCategory;
                if (_cursor.isNull(_cursorIndexOfCategory)) {
                  _tmpCategory = null;
                } else {
                  _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
                }
                _tmpTaskInfo = new TaskInfo(_tmpId,_tmpDescription,_tmpDate,_tmpPriority,_tmpStatus,_tmpCategory);
              }  else  {
                _tmpTaskInfo = null;
              }
              ArrayList<CategoryInfo> _tmpCategoryInfoCollection_1 = null;
              final String _tmpKey_1 = _cursor.getString(_cursorIndexOfCategory);
              _tmpCategoryInfoCollection_1 = _collectionCategoryInfo.get(_tmpKey_1);
              if (_tmpCategoryInfoCollection_1 == null) {
                _tmpCategoryInfoCollection_1 = new ArrayList<CategoryInfo>();
              }
              _item = new TaskCategoryInfo(_tmpTaskInfo,_tmpCategoryInfoCollection_1);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<NoOfTaskForEachCategory>> getNoOfTaskForEachCategory() {
    final String _sql = "SELECT taskInfo.category as category,Count(*) as count, categoryInfo.color as color  FROM taskInfo, categoryInfo WHERE taskInfo.category == categoryInfo.categoryInformation AND taskInfo.status = 0 GROUP BY category ORDER BY count DESC, category";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"taskInfo","categoryInfo"}, false, new Callable<List<NoOfTaskForEachCategory>>() {
      @Override
      public List<NoOfTaskForEachCategory> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCategory = 0;
          final int _cursorIndexOfCount = 1;
          final int _cursorIndexOfColor = 2;
          final List<NoOfTaskForEachCategory> _result = new ArrayList<NoOfTaskForEachCategory>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final NoOfTaskForEachCategory _item;
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            final int _tmpCount;
            _tmpCount = _cursor.getInt(_cursorIndexOfCount);
            final String _tmpColor;
            if (_cursor.isNull(_cursorIndexOfColor)) {
              _tmpColor = null;
            } else {
              _tmpColor = _cursor.getString(_cursorIndexOfColor);
            }
            _item = new NoOfTaskForEachCategory(_tmpCategory,_tmpColor,_tmpCount);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<CategoryInfo>> getCategories() {
    final String _sql = "SELECT * FROM categoryInfo";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"categoryInfo"}, false, new Callable<List<CategoryInfo>>() {
      @Override
      public List<CategoryInfo> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCategoryInformation = CursorUtil.getColumnIndexOrThrow(_cursor, "categoryInformation");
          final int _cursorIndexOfColor = CursorUtil.getColumnIndexOrThrow(_cursor, "color");
          final List<CategoryInfo> _result = new ArrayList<CategoryInfo>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CategoryInfo _item;
            final String _tmpCategoryInformation;
            if (_cursor.isNull(_cursorIndexOfCategoryInformation)) {
              _tmpCategoryInformation = null;
            } else {
              _tmpCategoryInformation = _cursor.getString(_cursorIndexOfCategoryInformation);
            }
            final String _tmpColor;
            if (_cursor.isNull(_cursorIndexOfColor)) {
              _tmpColor = null;
            } else {
              _tmpColor = _cursor.getString(_cursorIndexOfColor);
            }
            _item = new CategoryInfo(_tmpCategoryInformation,_tmpColor);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<TaskInfo>> getTasks() {
    final String _sql = "SELECT * FROM taskInfo";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"taskInfo"}, false, new Callable<List<TaskInfo>>() {
      @Override
      public List<TaskInfo> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfPriority = CursorUtil.getColumnIndexOrThrow(_cursor, "priority");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final List<TaskInfo> _result = new ArrayList<TaskInfo>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TaskInfo _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final Date _tmpDate;
            final long _tmp;
            _tmp = _cursor.getLong(_cursorIndexOfDate);
            _tmpDate = __dateConverter.fromTimeStamp(_tmp);
            final int _tmpPriority;
            _tmpPriority = _cursor.getInt(_cursorIndexOfPriority);
            final boolean _tmpStatus;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfStatus);
            _tmpStatus = _tmp_1 != 0;
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            _item = new TaskInfo(_tmpId,_tmpDescription,_tmpDate,_tmpPriority,_tmpStatus,_tmpCategory);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public int getCountOfCategory(final String category) {
    final String _sql = "SELECT COUNT(*) FROM taskInfo WHERE category = ? ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (category == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, category);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<TaskInfo> getActiveAlarms(final Date currentTime) {
    final String _sql = "SELECT * FROM taskInfo WHERE status = 0 AND date > ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final long _tmp = __dateConverter.dateToTimeStamp(currentTime);
    _statement.bindLong(_argIndex, _tmp);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final int _cursorIndexOfPriority = CursorUtil.getColumnIndexOrThrow(_cursor, "priority");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
      final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
      final List<TaskInfo> _result = new ArrayList<TaskInfo>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final TaskInfo _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        final Date _tmpDate;
        final long _tmp_1;
        _tmp_1 = _cursor.getLong(_cursorIndexOfDate);
        _tmpDate = __dateConverter.fromTimeStamp(_tmp_1);
        final int _tmpPriority;
        _tmpPriority = _cursor.getInt(_cursorIndexOfPriority);
        final boolean _tmpStatus;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfStatus);
        _tmpStatus = _tmp_2 != 0;
        final String _tmpCategory;
        if (_cursor.isNull(_cursorIndexOfCategory)) {
          _tmpCategory = null;
        } else {
          _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
        }
        _item = new TaskInfo(_tmpId,_tmpDescription,_tmpDate,_tmpPriority,_tmpStatus,_tmpCategory);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private void __fetchRelationshipcategoryInfoAscomExampleTodolistDataModelCategoryInfo(
      final ArrayMap<String, ArrayList<CategoryInfo>> _map) {
    final Set<String> __mapKeySet = _map.keySet();
    if (__mapKeySet.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      ArrayMap<String, ArrayList<CategoryInfo>> _tmpInnerMap = new ArrayMap<String, ArrayList<CategoryInfo>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipcategoryInfoAscomExampleTodolistDataModelCategoryInfo(_tmpInnerMap);
          _tmpInnerMap = new ArrayMap<String, ArrayList<CategoryInfo>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipcategoryInfoAscomExampleTodolistDataModelCategoryInfo(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `categoryInformation`,`color` FROM `categoryInfo` WHERE `categoryInformation` IN (");
    final int _inputSize = __mapKeySet.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (String _item : __mapKeySet) {
      if (_item == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, _item);
      }
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "categoryInformation");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfCategoryInformation = 0;
      final int _cursorIndexOfColor = 1;
      while(_cursor.moveToNext()) {
        final String _tmpKey = _cursor.getString(_itemKeyIndex);
        ArrayList<CategoryInfo> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final CategoryInfo _item_1;
          final String _tmpCategoryInformation;
          if (_cursor.isNull(_cursorIndexOfCategoryInformation)) {
            _tmpCategoryInformation = null;
          } else {
            _tmpCategoryInformation = _cursor.getString(_cursorIndexOfCategoryInformation);
          }
          final String _tmpColor;
          if (_cursor.isNull(_cursorIndexOfColor)) {
            _tmpColor = null;
          } else {
            _tmpColor = _cursor.getString(_cursorIndexOfColor);
          }
          _item_1 = new CategoryInfo(_tmpCategoryInformation,_tmpColor);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
