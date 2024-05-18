package com.example.todolist.databinding;
import com.example.todolist.R;
import com.example.todolist.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemCategoriesBindingImpl extends ItemCategoriesBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearLayout, 5);
    }
    // views
    @NonNull
    private final com.google.android.material.card.MaterialCardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemCategoriesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ItemCategoriesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.view.View) bindings[3]
            , (android.view.View) bindings[4]
            , (com.google.android.material.textview.MaterialTextView) bindings[1]
            , (com.google.android.material.textview.MaterialTextView) bindings[2]
            , (android.widget.LinearLayout) bindings[5]
            );
        this.categoryColor.setTag(null);
        this.categoryColorTop.setTag(null);
        this.categoryCount.setTag(null);
        this.categoryName.setTag(null);
        this.mboundView0 = (com.google.android.material.card.MaterialCardView) bindings[0];
        this.mboundView0.setTag(null);
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
        if (BR.noOfTaskOfCategory == variableId) {
            setNoOfTaskOfCategory((com.example.todolist.data.model.NoOfTaskForEachCategory) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setNoOfTaskOfCategory(@Nullable com.example.todolist.data.model.NoOfTaskForEachCategory NoOfTaskOfCategory) {
        this.mNoOfTaskOfCategory = NoOfTaskOfCategory;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.noOfTaskOfCategory);
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
        java.lang.String noOfTaskOfCategoryColor = null;
        com.example.todolist.data.model.NoOfTaskForEachCategory noOfTaskOfCategory = mNoOfTaskOfCategory;
        int noOfTaskOfCategoryCount = 0;
        java.lang.String noOfTaskOfCategoryCategory = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (noOfTaskOfCategory != null) {
                    // read noOfTaskOfCategory.color
                    noOfTaskOfCategoryColor = noOfTaskOfCategory.getColor();
                    // read noOfTaskOfCategory.count
                    noOfTaskOfCategoryCount = noOfTaskOfCategory.getCount();
                    // read noOfTaskOfCategory.category
                    noOfTaskOfCategoryCategory = noOfTaskOfCategory.getCategory();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.example.todolist.presentation.adapter.BindingAdapterKt.setColor(this.categoryColor, noOfTaskOfCategoryColor);
            com.example.todolist.presentation.adapter.BindingAdapterKt.setColor(this.categoryColorTop, noOfTaskOfCategoryColor);
            com.example.todolist.presentation.adapter.BindingAdapterKt.setCount(this.categoryCount, noOfTaskOfCategoryCount);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.categoryName, noOfTaskOfCategoryCategory);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): noOfTaskOfCategory
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}