package com.example.carlo.calculadorac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public EditText resp;
    public int operan1, operan2, res,ope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resp = (EditText) findViewById(R.id.txt_resultado);
    }
    public void bt1(View v) {
        String cap = resp.getText().toString();
        cap = cap + "1";
        resp.setText(cap);
    }

    public void bt2(View v) {
        String cap = resp.getText().toString();
        cap = cap + "2";
        resp.setText(cap);

    }

    public void bt3(View v) {
        String cap = resp.getText().toString();
        cap = cap + "3";
        resp.setText(cap);

    }

    public void bt4(View v) {
        String cap = resp.getText().toString();
        cap = cap + "4";
        resp.setText(cap);

    }

    public void bt5(View v) {
        String cap = resp.getText().toString();
        cap = cap + "5";
        resp.setText(cap);

    }

    public void bt6(View v) {
        String cap = resp.getText().toString();
        cap = cap + "6";
        resp.setText(cap);

    }

    public void bt7(View v) {
        String cap = resp.getText().toString();
        cap = cap + "7";
        resp.setText(cap);

    }

    public void bt8(View v) {
        String cap = resp.getText().toString();
        cap = cap + "8";
        resp.setText(cap);
    }

    public void bt9(View v) {
        String cap = resp.getText().toString();
        cap = cap + "9";
        resp.setText(cap);
    }

    public void bt0(View v) {
        String cap = resp.getText().toString();
        cap = cap + "0";
        resp.setText(cap);

    }

    public void suma(View v) {
        try {
            String aux1 = resp.getText().toString();
            operan1 = Integer.parseInt(aux1);
        } catch (NumberFormatException nfe) { }
        resp.setText("");
        ope = 1;
    }

    public void resta(View v) {
        try {
            String aux1 = resp.getText().toString();
            operan1 = Integer.parseInt(aux1);
        } catch (NumberFormatException nfe){}
        resp.setText("");
        ope = 2;
    }

    public void multiplicacion(View v) {
        try {
            String aux1 = resp.getText().toString();
            operan1 = Integer.parseInt(aux1);
        } catch (NumberFormatException nfe) {}

        resp.setText("");
        ope = 3;
    }

    public void division(View v) {
        try {
            String aux1 = resp.getText().toString();
            operan1 = Integer.parseInt(aux1);
        } catch (NumberFormatException nfe) { }

        resp.setText("");
        ope = 4;
    }

    public void igual(View v) {
        try {
            String aux2 = resp.getText().toString();
            operan2 = Integer.parseInt(aux2);
        } catch(NumberFormatException nfe) { }

        resp.setText("");

        if (ope == 1) {
            res = operan1 + operan2;
        }else if (ope == 2) {
                res = operan1 - operan2;
            } else if (ope == 3) {
                res = operan1 * operan2;
            } else if (ope == 4) {
                if (operan2 == 0) {
                    resp.setText("Numero no se puede dividir para 0");
                } else {
                    res = operan1 / operan2;
                }
            }
        resp.setText(" " + res);
        operan1 = res;
    }
    public void clear (View v){
        resp.setText("");
        operan1=0;
        operan2=0;
        res=0;
    }

    public void borrar (View v){
        if (!resp.getText().toString().equals("")){
            resp.setText(resp.getText().subSequence(0,resp.getText().length()-1)+"");
        }
    }
}

