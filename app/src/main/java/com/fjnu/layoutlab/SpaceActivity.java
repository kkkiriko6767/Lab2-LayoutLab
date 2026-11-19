package com.fjnu.layoutlab;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * 4. 约束布局（二）：太空旅行订票界面。
 * 顶部三个入口、航线、单程开关、乘客数、星球图片和底部 DEPART 按钮全部用约束定位，
 * 保证在不同屏幕尺寸下相对位置不变。
 */
public class SpaceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space);
        setTitle("约束布局 · 太空旅行");

        Switch oneWay = findViewById(R.id.switch_one_way);
        oneWay.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(SpaceActivity.this,
                        isChecked ? "已选择单程" : "已选择往返", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
