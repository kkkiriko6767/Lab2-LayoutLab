package com.fjnu.layoutlab;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

/**
 * 2. 表格布局：模仿一个下拉菜单（Open / Save / Save As / Import / Export / Quit）。
 * 每一项占一个 TableRow，右侧的快捷键单元格通过 layout_weight 占满剩余宽度并靠右对齐。
 */
public class TableLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        setTitle("表格布局");
    }
}
