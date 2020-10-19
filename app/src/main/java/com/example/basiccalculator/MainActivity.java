package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bAdd,bSub,bMul,bDiv,bDot,bClear,bEqual;
    EditText ed1;
    float res1, res2;
    boolean Add,Sub,Mul,Div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);
        b0=(Button)findViewById(R.id.b0);
        bAdd=(Button)findViewById(R.id.bAdd);
        bSub=(Button)findViewById(R.id.bSub);
        bMul=(Button)findViewById(R.id.bMul);
        bDiv=(Button)findViewById(R.id.bDiv);
        bDot=(Button)findViewById(R.id.bDot);
        bClear=(Button)findViewById(R.id.bClear);
        bEqual=(Button)findViewById(R.id.bEqual);
        ed1=(EditText)findViewById(R.id.editText);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               ed1.setText(ed1.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"0");
            }
        });
        bDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+".");
            }
        });
        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1 == null){
                    ed1.setText("");
                }
                else{
                    res1 = Float.parseFloat(ed1.getText()+"");//Stores the 1st value
                    Add = true;
                    ed1.setText(null);//Shows null text
                }
            }
        });
        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1 == null){
                    ed1.setText("");
                }
                else{
                    res1 = Float.parseFloat(ed1.getText()+"");
                    Sub = true;
                    ed1.setText(null);
                }
            }
        });
        bMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1 == null){
                    ed1.setText("");
                }
                else{
                    res1 = Float.parseFloat(ed1.getText()+"");
                    Mul = true;
                    ed1.setText(null);
                }
            }
        });
        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1 == null){
                    ed1.setText("");
                }
                else{
                    res1 = Float.parseFloat(ed1.getText()+"");
                    Div = true;
                    ed1.setText(null);
                }
            }
        });
        bEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res2 = Float.parseFloat(ed1.getText() + "");//Stores the 2nd value
                if (Add == true){
                    ed1.setText(res1 + res2 + "");
                    Add = false;
                }
                if (Sub == true){
                    ed1.setText(res1 - res2 + "");
                    Sub = false;
                }
                if (Mul == true){
                    ed1.setText(res1 * res2 + "");
                    Mul = false;
                }
                if (Div == true){
                    ed1.setText(res1 / res2 + "");
                    Div = false;
                }
            }
        });
        bClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
            }
        });

    }
}