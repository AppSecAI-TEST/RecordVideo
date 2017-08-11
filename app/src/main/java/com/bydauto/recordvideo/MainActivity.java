package com.bydauto.recordvideo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends Activity {
    private static final String TAG = "MainActivity";

    /**
     * 用于展示照片墙的GridView
     */
    private GridView mGridView;

    /**
     * GridView的适配器
     */
    private GridViewAdapter adapter;
    private GridListFragement mGridListFragement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview_layout);
        if (null == mGridListFragement) {
            mGridListFragement = new GridListFragement();
        }
        getFragmentManager().beginTransaction().replace(R.id.fl_list,mGridListFragement).commitAllowingStateLoss();
        mGridView = (GridView) findViewById(R.id.gv_list);
        adapter = new GridViewAdapter(this, 0, Images.imageThumbUrls, mGridView);
        mGridView.setAdapter(adapter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // 退出程序时结束所有的下载任务
        adapter.cancelAllTasks();
    }

}