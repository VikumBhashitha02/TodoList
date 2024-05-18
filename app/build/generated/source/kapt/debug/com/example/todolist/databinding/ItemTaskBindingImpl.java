package com.example.todolist.databinding;
import com.example.todolist.R;
import com.example.todolist.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemTaskBindingImpl extends ItemTaskBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.relativeLayout, 5);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemTaskBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ItemTaskBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.card.MaterialCardView) bindings[0]
            , (com.google.android.material.textview.MaterialTextView) bindings[2]
            , (com.google.android.material.textview.MaterialTextView) bindings[3]
            , (com.google.android.material.checkbox.MaterialCheckBox) bindings[1]
            , (com.google.android.material.chip.Chip) bindings[4]
            , (android.widget.RelativeLayout) bindings[5]
            );
        this.cardView.setTag(null);
        this.desciption.setTag(null);
        this.dueDate.setTag(null);
        this.isCompleted.setTag(null);
        this.priority.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.taskCategoryInfo == variableId) {
            setTaskCategoryInfo((com.example.todolist.data.model.TaskCategoryInfo) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTaskCategoryInfo(@Nullable com.example.todolist.data.model.TaskCategoryInfo TaskCategoryInfo) {
        this.mTaskCategoryInfo = TaskCategoryInfo;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.taskCategoryInfo);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.todolist.data.model.TaskCategoryInfo taskCategoryInfo = mTaskCategoryInfo;
        java.util.Date taskCategoryInfoTaskInfoDate = null;
        int taskCategoryInfoTaskInfoPriority = 0;
        boolean taskCategoryInfoTaskInfoStatus = false;
        java.lang.String taskCategoryInfoCategoryInfo0Color = null;
        com.example.todolist.data.model.TaskInfo taskCategoryInfoTaskInfo = null;
        java.util.List<com.example.todolist.data.model.CategoryInfo> taskCategoryInfoCategoryInfo = null;
        com.example.todolist.data.model.CategoryInfo taskCategoryInfoCategoryInfo0 = null;
        java.lang.String taskCategoryInfoTaskInfoDescription = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (taskCategoryInfo != null) {
                    // read taskCategoryInfo.taskInfo
                    taskCategoryInfoTaskInfo = taskCategoryInfo.getTaskInfo();
                    // read taskCategoryInfo.categoryInfo
                    taskCategoryInfoCategoryInfo = taskCategoryInfo.getCategoryInfo();
                }


                if (taskCategoryInfoTaskInfo != null) {
                    // read taskCategoryInfo.taskInfo.date
                    taskCategoryInfoTaskInfoDate = taskCategoryInfoTaskInfo.getDate();
                    // read taskCategoryInfo.taskInfo.priority
                    taskCategoryInfoTaskInfoPriority = taskCategoryInfoTaskInfo.getPriority();
                    // read taskCategoryInfo.taskInfo.status
                    taskCategoryInfoTaskInfoStatus = taskCategoryInfoTaskInfo.getStatus();
                    // read taskCategoryInfo.taskInfo.description
                    taskCategoryInfoTaskInfoDescription = taskCategoryInfoTaskInfo.getDescription();
                }
                if (taskCategoryInfoCategoryInfo != null) {
                    // read taskCategoryInfo.categoryInfo[0]
                    taskCategoryInfoCategoryInfo0 = getFromList(taskCategoryInfoCategoryInfo, 0);
                }


                if (taskCategoryInfoCategoryInfo0 != null) {
                    // read taskCategoryInfo.categoryInfo[0].color
                    taskCategoryInfoCategoryInfo0Color = taskCategoryInfoCategoryInfo0.getColor();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.desciption, taskCategoryInfoTaskInfoDescription);
            com.example.todolist.presentation.adapter.BindingAdapterKt.setDate(this.dueDate, taskCategoryInfoTaskInfoDate);
            com.example.todolist.presentation.adapter.BindingAdapterKt.setCheckStatus(this.isCompleted, taskCategoryInfoTaskInfoStatus, taskCategoryInfoCategoryInfo0Color);
            com.example.todolist.presentation.adapter.BindingAdapterKt.setPriority(this.priority, taskCategoryInfoTaskInfoPriority, taskCategoryInfoCategoryInfo0Color);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): taskCategoryInfo
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}