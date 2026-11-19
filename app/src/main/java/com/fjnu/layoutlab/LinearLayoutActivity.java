package com.fjnu.layoutlab;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

/**
 * 1. 线性布局：四行四列、共 16 个方格的界面。
 * 外层 LinearLayout 垂直排列四个行容器，每个行容器内部水平排列四个 TextView，
 * 通过 layout_weight 让 16 个方格在屏幕宽度上按比例铺满。
 */
public class LinearLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
        setTitle("线性布局");
    }
}
