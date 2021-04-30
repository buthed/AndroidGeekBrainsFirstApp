package com.tematikhonov.androidgeekbrainsfirstapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    String counter;
    String character;
    String resultString;
    String lastActionSymbol;
    String firstNumForAction;
    String secondNumAction;
    Boolean actionChar = false;
    int result;
    private TextView textViewInput;
    private Button button0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button buttonDot;
    private Button buttonPlus;
    private Button buttonMinus;
    private Button buttonMultiply;
    private Button buttonDivision;
    private Button buttonEqual;
    private Button buttonPercent;
    private Button buttonClear;
    private Button buttonClearAll;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewInput = findViewById(R.id.textViewInput);
        button0 = findViewById(R.id.button_0);
        button1 = findViewById(R.id.button_1);
        button2 = findViewById(R.id.button_2);
        button3 = findViewById(R.id.button_3);
        button4 = findViewById(R.id.button_4);
        button5 = findViewById(R.id.button_5);
        button6 = findViewById(R.id.button_6);
        button7 = findViewById(R.id.button_7);
        button8 = findViewById(R.id.button_8);
        button9 = findViewById(R.id.button_9);
        buttonDot = findViewById(R.id.button_dot);
        buttonPlus = findViewById(R.id.button_plus);
        buttonMinus = findViewById(R.id.button_minus);
        buttonMultiply = findViewById(R.id.button_multiply);
        buttonDivision = findViewById(R.id.button_division);
        buttonEqual = findViewById(R.id.button_equal);
        buttonPercent = findViewById(R.id.button_percent);
        buttonClear = findViewById(R.id.button_clear);
        buttonClearAll = findViewById(R.id.button_clear_all);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInput.setText(textViewInput.getText() +"0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInput.setText(textViewInput.getText() + "1");

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInput.setText(textViewInput.getText() + "2");

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInput.setText(textViewInput.getText() +"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInput.setText(textViewInput.getText() + "4");

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInput.setText(textViewInput.getText() +"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInput.setText(textViewInput.getText() + "6");

            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInput.setText(textViewInput.getText() +"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInput.setText(textViewInput.getText() + "8");

            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInput.setText(textViewInput.getText() +"9");
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInput.setText(textViewInput.getText() +",");
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionInput((String) textViewInput.getText(), "+");
                lastActionSymbol = "+";
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionInput((String) textViewInput.getText(), "-");
                lastActionSymbol = "-";
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionInput((String) textViewInput.getText(), "*");

            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionInput((String) textViewInput.getText(), "/");
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInput.setText(firstNumForAction);
            }
        });

        buttonPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionInput((String) textViewInput.getText(), "%");
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInput.setText(clearLastChar((String) textViewInput.getText()));
            }
        });

        buttonClearAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInput.setText(null);
            }
        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public void onClick(View v) {

    }

    public String clearLastChar(String input) {
        input = input.substring(0, input.length()-1);
        return input;
    }

    public void actionInput(String input, String character) {
        if (actionChar != true) {
            firstNumForAction = input;
            resultString = textViewInput.getText() + character;
            actionChar = true;
        } else {
            secondNumAction = input.substring(firstNumForAction.length()+1, input.length());

            switch (lastActionSymbol) {
                case "+" :
                    result = Integer.parseInt(firstNumForAction) + Integer.parseInt(secondNumAction);
                    break;
                case "-" :
                    result = Integer.parseInt(firstNumForAction) - Integer.parseInt(secondNumAction);
                    break;
                case "*" :
                    result = Integer.parseInt(firstNumForAction) * Integer.parseInt(secondNumAction);
                    break;
                case "/" :
                    result = Integer.parseInt(firstNumForAction) / Integer.parseInt(secondNumAction);
                    break;
                case "%" :
                    result = Integer.parseInt(firstNumForAction) * Integer.parseInt(secondNumAction)/100;
                    break;
            }

            resultString = Integer.toString(result );
            firstNumForAction = resultString;
            resultString = Integer.toString(result ) + character;
        }

        textViewInput.setText(resultString);
        textViewInput.getText();
    }

}


