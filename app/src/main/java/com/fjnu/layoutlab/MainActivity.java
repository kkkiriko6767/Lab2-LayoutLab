package com.fjnu.layoutlab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

/**
 * 实验二入口界面：四个按钮分别进入四种布局的实验界面。
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("实验二 Android 界面布局");

        bind(R.id.btn_linear, LinearLayoutActivity.class);
        bind(R.id.btn_table, TableLayoutActivity.class);
        bind(R.id.btn_calc, CalculatorActivity.class);
        bind(R.id.btn_space, SpaceActivity.class);
    }

    private void bind(int id, final Class<?> target) {
        Button button = findViewById(id);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, target));
            }
        });
    }
}
