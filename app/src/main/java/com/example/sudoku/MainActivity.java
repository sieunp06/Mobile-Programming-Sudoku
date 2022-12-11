package com.example.sudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

public class MainActivity extends AppCompatActivity {
    BoardGenerator board = new BoardGenerator();
    TableLayout table;
    private final int left = 4;
    private final int top = 4;
    private final int right = 4;
    private final int bottom = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TableRow.LayoutParams layoutParams =
                new TableRow.LayoutParams(
                        TableRow.LayoutParams.WRAP_CONTENT,
                        TableRow.LayoutParams.WRAP_CONTENT,
                        1.0f);
        layoutParams.setMargins(left, top, right, bottom);

        CustomButton[][] buttons = new CustomButton[9][9];
        for (int i = 0; i < 9; i++) {
            table = (TableLayout) findViewById(R.id.tableLayout);
            TableRow tableRow = new TableRow(this);
                table.addView(tableRow);
                for (int j = 0; j < 9; j++) {
                    buttons[i][j] = new CustomButton(this, i, j);
                    buttons[i][j].setLayoutParams(layoutParams);
                    buttons[i][j].setBackgroundColor(Color.WHITE);
                    tableRow.addView(buttons[i][j]);
                    int isDisplayNumber = (int) (Math.random() * 2);
                    int number = board.get(i, j);
                    String buttonText = Integer.toString(number);
                    buttons[i][j].set(isDisplayNumber, buttonText);
            }
        }

    }
}