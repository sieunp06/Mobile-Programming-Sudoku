package com.example.sudoku;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;

public class CustomButton extends FrameLayout {
    TextView textView;
    int row;
    int col;
    int value;

    public CustomButton(Context context, int row, int col) {
        super(context);
        this.row = row;
        this.col = col;
        textView = new TextView(context);
        addView(textView);
        setClickable(true);
        setBackgroundResource(R.drawable.button_selector);
    }
}
