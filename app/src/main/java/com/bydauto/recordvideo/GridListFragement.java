package com.bydauto.recordvideo;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

/**
 * Created by byd_tw on 2017/8/11.
 */

public class GridListFragement extends Fragment{
    private static final String TAG = "GridListFragement";
    private GridView mGridView;
    private GridViewAdapter adapter;

    @Override
    public void onAttach(Context context) {
        Log.e(TAG, "onAttach:jiazai " );
        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        Log.e(TAG, "onCreateView");
        View view = inflater.inflate(R.layout.gridview_layout, null, false);
        initView(view);
        return view;

    }

    private void initView(View view) {
        mGridView = (GridView) view.findViewById(R.id.gv_list);
//        adapter = new GridViewAdapter(this, 0, Images.imageThumbUrls, mGridView);
        mGridView.setAdapter(adapter);
    }
}
