package edu.wmich.cs.johnharvey.hw2calculator;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.app.Activity;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FragmentManager fragmentManager = getFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Configuration configInfo = getResources().getConfiguration();

        if(configInfo.orientation == Configuration.ORIENTATION_LANDSCAPE){

            FragmentLandscape fragmentLandscape = new FragmentLandscape();

            fragmentTransaction.replace(android.R.id.content, fragmentLandscape);


        }else{
            FragmentPortrait fragmentPortrait = new FragmentPortrait();

            fragmentTransaction.replace(android.R.id.content, fragmentPortrait);
        }

        fragmentTransaction.commit();
    }


    public void add(View v){
        EditText input1 = (EditText)findViewById(R.id.userInt);
        EditText input2 = (EditText)findViewById(R.id.userInt2);

        TextView output = (TextView)findViewById(R.id.outputTV);

        double num1 = Double.parseDouble(String.valueOf(input1.getText()));
        double num2 = Double.parseDouble(String.valueOf(input2.getText()));

        output.setText(addition(num1,num2));



    }

    public void subtract(View v){
        EditText input1 = (EditText)findViewById(R.id.userInt);
        EditText input2 = (EditText)findViewById(R.id.userInt2);

        TextView output = (TextView)findViewById(R.id.outputTV);

        double num1 = Double.parseDouble(String.valueOf(input1.getText()));
        double num2 = Double.parseDouble(String.valueOf(input2.getText()));

        output.setText(subtraction(num1,num2));

    }

    public void multiply(View v){
        EditText input1 = (EditText)findViewById(R.id.userInt);
        EditText input2 = (EditText)findViewById(R.id.userInt2);

        TextView output = (TextView)findViewById(R.id.outputTV);

        double num1 = Double.parseDouble(String.valueOf(input1.getText()));
        double num2 = Double.parseDouble(String.valueOf(input2.getText()));

        output.setText(multiplication(num1,num2));

    }

    public void divide(View v){
        EditText input1 = (EditText)findViewById(R.id.userInt);
        EditText input2 = (EditText)findViewById(R.id.userInt2);

        TextView output = (TextView)findViewById(R.id.outputTV);

        double num1 = Double.parseDouble(String.valueOf(input1.getText()));
        double num2 = Double.parseDouble(String.valueOf(input2.getText()));

        output.setText(division(num1,num2));

    }

    private String addition (double num1, double num2){

        return Double.toString(num1 + num2);
    }

    private String subtraction (double num1, double num2){

        return Double.toString(num1 - num2);
    }

    private String multiplication (double num1, double num2){

        return Double.toString(num1 * num2);
    }

    private String division (double num1, double num2){

        return Double.toString(num1 / num2);
    }







}
