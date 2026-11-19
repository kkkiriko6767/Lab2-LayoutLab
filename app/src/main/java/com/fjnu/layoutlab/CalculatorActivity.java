package com.fjnu.layoutlab;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

/**
 * 3. 约束布局（一）：计算器界面。
 * 所有按钮都用 ConstraintLayout 的约束与链（chain）定位，没有使用嵌套的 LinearLayout。
 */
public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvDisplay;
    private final DecimalFormat format = new DecimalFormat("0.0###");

    private String input = "0";
    private double operand = 0;
    private String operator = "";
    private boolean startNew = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        setTitle("约束布局 · 计算器");

        tvDisplay = findViewById(R.id.tv_display);

        int[] ids = {R.id.btn_0, R.id.btn_1, R.id.btn_2, R.id.btn_3, R.id.btn_4,
                R.id.btn_5, R.id.btn_6, R.id.btn_7, R.id.btn_8, R.id.btn_9,
                R.id.btn_dot, R.id.btn_add, R.id.btn_sub, R.id.btn_mul, R.id.btn_clear,
                R.id.btn_equal};
        for (int id : ids) {
            Button b = findViewById(id);
            b.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        String text = ((Button) v).getText().toString();
        switch (text) {
            case "C":
                input = "0";
                operand = 0;
                operator = "";
                startNew = true;
                updateDisplay(input);
                break;
            case "=":
                compute();
                operator = "";
                startNew = true;
                break;
            case "+":
            case "-":
            case "×":
            case "÷":
                if (!operator.isEmpty()) {
                    compute();
                }
                operand = parse(input);
                operator = text;
                startNew = true;
                break;
            case ".":
                if (startNew) {
                    input = "0.";
                    startNew = false;
                } else if (!input.contains(".")) {
                    input = input + ".";
                }
                updateDisplay(input);
                break;
            default:
                if (startNew) {
                    input = text;
                    startNew = false;
                } else {
                    input = input + text;
                }
                updateDisplay(input);
                break;
        }
    }

    private double parse(String s) {
        try {
            return Double.parseDouble(s);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private void compute() {
        if (operator.isEmpty()) {
            return;
        }
        double value = parse(input);
        double result = operand;
        switch (operator) {
            case "+":
                result = operand + value;
                break;
            case "-":
                result = operand - value;
                break;
            case "×":
                result = operand * value;
                break;
            case "÷":
                if (value == 0) {
                    updateDisplay("除数不能为 0");
                    input = "0";
                    operand = 0;
                    operator = "";
                    return;
                }
                result = operand / value;
                break;
            default:
                break;
        }
        input = format.format(result);
        operand = result;
        updateDisplay(input);
    }

    private void updateDisplay(String s) {
        tvDisplay.setText(s);
    }
}
