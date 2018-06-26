package com.vlayout;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;

import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.layout.LinearLayoutHelper;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.mRecyclerView)
    RecyclerView mRecyclerView;
    @BindView(R.id.activity_main)
    ConstraintLayout activityMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    private void initView() {
        //开始
//        LayoutInflater layoutManager = LayoutInflater.from(MainActivity.this);
//        DelegateAdapter delegateAdapter = new DelegateAdapter(layoutManager, false);
//        mRecyclerView.setAdapter(delegateAdapter);

        //这里先不管，后面再添加
        //        GridLayoutHelper gridHelper = new GridLayoutHelper(5);
        //        gridHelper.setMarginTop(30);
        ////        gridHelper.setWeights(new float[]{20.0f,20.0f,20.0f,20.0f,20.0f});
        //        //设置垂直方向条目的间隔
        //        gridHelper.setVGap(5);
        //        //设置水平方向条目的间隔
        //        gridHelper.setHGap(5);
        //        gridHelper.setMarginLeft(30);
        //        gridHelper.setMarginBottom(30);
        //        //自动填充满布局，在设置完权重，若没有占满，自动填充满布局
        //        gridHelper.setAutoExpand(true);
        //        delegateAdapter.addAdapter(new GridHelperAdapter(imgSrc, gridHelper));
        //
        //        //Linear 布局
        //        LinearLayoutHelper linearHelper1 = new LinearLayoutHelper(5);
        //        delegateAdapter.addAdapter(new LinearAdapter(this, linearHelper1));


        LinearLayoutHelper linearHelper = new LinearLayoutHelper(5);
//        delegateAdapter.addAdapter(new RVAdapter(this, linearHelper));
    }
}
