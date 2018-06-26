package com.vlayout.adpater;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.LayoutHelper;

/**
 * Created by ZXY on 2018-6-25.
 */

public class Vadapter extends DelegateAdapter.Adapter<RecyclerView.ViewHolder>{
    @Override
    public LayoutHelper onCreateLayoutHelper() {
        return null;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
