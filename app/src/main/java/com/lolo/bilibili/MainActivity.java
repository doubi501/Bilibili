package com.lolo.bilibili;

/**
 * Created by Administrator on 2017/2/16.
 */
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    private RecyclerAdapter mRecyclerAdapter;

    private List<Item> viewData = new ArrayList<Item>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadDatas();
        initViews();

    }

    private void loadDatas() {
        viewData.add(new Item("第1张图", R.drawable.item1));
        viewData.add(new Item("第2张图", R.drawable.item2));
        viewData.add(new Item("第3张图", R.drawable.item3));
        viewData.add(new Item("第4张图", R.drawable.item4));
        viewData.add(new Item("第5张图", R.drawable.item5));
        viewData.add(new Item("第6张图", R.drawable.item6));
        viewData.add(new Item("第7张图", R.drawable.item7));
        viewData.add(new Item("第8张图", R.drawable.item8));
    }

    private void initViews() {
        mRecyclerView = (RecyclerView) findViewById(R.id.demo_recyclerView);
        // 设置布局显示方式，这里我使用都是垂直方式——LinearLayoutManager.VERTICAL
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        // 设置添加删除item的时候的动画效果
       // mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        // 初始化适配器
        mRecyclerAdapter = new RecyclerAdapter(this, viewData);
        // 设置适配器
        mRecyclerView.setAdapter(mRecyclerAdapter);
    }
}
