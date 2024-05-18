package com.example.todolist.databinding;
import com.example.todolist.R;
import com.example.todolist.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentNewTaskBindingImpl extends FragmentNewTaskBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.editText, 1);
        sViewsWithIds.put(R.id.dateAndTimePicker, 2);
        sViewsWithIds.put(R.id.isCompleted, 3);
        sViewsWithIds.put(R.id.priorityText, 4);
        sViewsWithIds.put(R.id.priorityChipGroup, 5);
        sViewsWithIds.put(R.id.low, 6);
        sViewsWithIds.put(R.id.mid, 7);
        sViewsWithIds.put(R.id.high, 8);
        sViewsWithIds.put(R.id.categoryText, 9);
        sViewsWithIds.put(R.id.categoryChipGroup, 10);
        sViewsWithIds.put(R.id.fab, 11);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentNewTaskBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentNewTaskBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.chip.ChipGroup) bindings[10]
            , (com.google.android.material.chip.Chip) bindings[9]
            , (com.google.android.material.chip.Chip) bindings[2]
            , (com.google.android.material.textfield.TextInputEditText) bindings[1]
            , (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) bindings[11]
            , (com.google.android.material.chip.Chip) bindings[8]
            , (com.google.android.material.checkbox.MaterialCheckBox) bindings[3]
            , (com.google.android.material.chip.Chip) bindings[6]
            , (com.google.android.material.chip.Chip) bindings[7]
            , (com.google.android.material.chip.ChipGroup) bindings[5]
            , (com.google.android.material.chip.Chip) bindings[4]
            );
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}