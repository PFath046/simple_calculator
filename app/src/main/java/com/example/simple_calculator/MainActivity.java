package com.example.simple_calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnSub,btnAdd,btnDiv,btnEqual,btnDec,btnC,btnMul;
    TextView screen;
    float num1,num2;
    boolean add,sub,mul,div;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen = (TextView) findViewById(R.id.screen);

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnEqual = (Button) findViewById(R.id.btnEqual);
        btnDec = (Button) findViewById(R.id.btnDec);
        btnC = (Button) findViewById(R.id.btnC);
        btnMul = (Button) findViewById(R.id.btnMul);


        btn0.setOnClickListener((v) -> {
            screen.setText(screen.getText() + "0");
        });
        btn1.setOnClickListener((v) -> {
            screen.setText(screen.getText() + "1");
        });
        btn2.setOnClickListener((v) -> {
            screen.setText(screen.getText() + "2");
        });
        btn3.setOnClickListener((v) -> {
            screen.setText(screen.getText() + "3");
        });
        btn4.setOnClickListener((v) -> {
            screen.setText(screen.getText() + "4");
        });
        btn5.setOnClickListener((v) -> {
            screen.setText(screen.getText() + "5");
        });
        btn6.setOnClickListener((v) -> {
            screen.setText(screen.getText() + "6");
        });
        btn7.setOnClickListener((v) -> {
            screen.setText(screen.getText() + "7");
        });
        btn8.setOnClickListener((v) -> {
            screen.setText(screen.getText() + "8");
        });
        btn9.setOnClickListener((v) -> {
            screen.setText(screen.getText() + "9");
        });

        btnSub.setOnClickListener((v) -> {
            if (screen.getText() == "" || screen==null){
                screen.setText("");
            }
            else{
                num1 = Float.parseFloat((String) screen.getText());
                screen.setText(null);
                sub = true;
            }
        });

        btnAdd.setOnClickListener((v) -> {
            if (screen.getText() == "" || screen == null){
                screen.setText("");
            }
            else{
                num1 = Float.parseFloat((String) screen.getText());
                screen.setText(null);
                add = true;
            }

        });

        btnDiv.setOnClickListener((v) -> {
            if (screen.getText() == "" || screen==null){
                screen.setText("");
            }
            else{
                num1 = Float.parseFloat((String) screen.getText());
                screen.setText(null);
                div = true;
            }
        });

        btnMul.setOnClickListener((v) -> {
            if (screen.getText() == "" || screen==null){
                screen.setText("");
            }
            else{
                num1 = Float.parseFloat((String) screen.getText());
                screen.setText(null);
                mul = true;
            }
        });

        btnDec.setOnClickListener((v) -> {
            screen.setText(screen.getText() + ".");
        });

        btnC.setOnClickListener((v) -> {
            screen.setText("");
        });

        btnEqual.setOnClickListener((v) -> {
            if (screen.getText() == "" || screen==null){
                screen.setText("");
            }
            else{
                num2 = Float.parseFloat((String) screen.getText());
                if (add) {
                    screen.setText(Float.toString(num1 + num2));
                    add = false;
                }
                if (sub) {
                    screen.setText(Float.toString(num1 - num2));
                    sub = false;
                }
                if (mul) {
                    screen.setText(Float.toString(num1 * num2));
                    mul = false;
                }
                if (div) {
                    screen.setText(Float.toString(num1 / num2));
                    div = false;
                }
            }

        });
    }
}