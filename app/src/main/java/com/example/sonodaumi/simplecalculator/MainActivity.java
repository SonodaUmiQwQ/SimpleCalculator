package com.example.sonodaumi.simplecalculator;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private char[] operators;
    private int operatorsTop;

    private char[] temp;
    private int tempTop;

    private float[] numbers;
    private int numbersTop;

    MainActivity(){
        operators = new char[100];
        operatorsTop = 0;

        temp = new char[100];
        tempTop = 0;

        numbers = new float[100];
        numbersTop = 0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        LayoutInflater inflater = getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.login_dialog, null));
        builder.setCancelable(false);
        builder.show();

        setContentView(R.layout.activity_main);


        BtnStart();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_content, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int i = item.getItemId();
        switch (i){
            case R.id.action_settings:
                Toast.makeText(this, "帮助", Toast.LENGTH_SHORT).show();break;
            case R.id.menu_another:
                int id = android.os.Process.myPid();
                if (id != 0) {
                    android.os.Process.killProcess(id);
                }
                break;
        }
        return true;
    }

    private void BtnStart(){
        Button btnOne=(Button)findViewById(R.id.one);
        Button btnTwo=(Button)findViewById(R.id.two);
        Button btnThree=(Button)findViewById(R.id.three);
        Button btnFour=(Button)findViewById(R.id.four);
        Button btnFive=(Button)findViewById(R.id.five);
        Button btnSix=(Button)findViewById(R.id.six);
        Button btnSeven=(Button)findViewById(R.id.seven);
        Button btnEight=(Button)findViewById(R.id.eight);
        Button btnNine=(Button)findViewById(R.id.nine);
        Button btnZero=(Button)findViewById(R.id.zero);
        Button btnPlus=(Button)findViewById(R.id.plus);
        Button btnMinus=(Button)findViewById(R.id.minus);
        Button btnMultiply=(Button)findViewById(R.id.multiply);
        Button btnDivide=(Button)findViewById(R.id.divide);
        Button btnEqual=(Button)findViewById(R.id.equal);
        Button btnAc=(Button)findViewById(R.id.ac);
        Button btnBackspace=(Button)findViewById(R.id.backspace);
        Button btnPoint=(Button)findViewById(R.id.point);
        Button btnLeft=(Button)findViewById(R.id.left);
        Button btnRight=(Button)findViewById(R.id.right);
        final TextView txtResult=(TextView)findViewById(R.id.textResult);


        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(DisplayLimit(txtResult)){
                    return;
                }
                txtResult.setText(txtResult.getText()+ "1");
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(DisplayLimit(txtResult)){
                    return;
                }
                txtResult.setText(txtResult.getText()+ "2");
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(DisplayLimit(txtResult)){
                    return;
                }
                txtResult.setText(txtResult.getText()+ "3");
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(DisplayLimit(txtResult)){
                    return;
                }
                txtResult.setText(txtResult.getText()+ "4");
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(DisplayLimit(txtResult)){
                    return;
                }
                txtResult.setText(txtResult.getText()+ "5");
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(DisplayLimit(txtResult)){
                    return;
                }
                txtResult.setText(txtResult.getText()+ "6");
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(DisplayLimit(txtResult)){
                    return;
                }
                txtResult.setText(txtResult.getText()+ "7");
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(DisplayLimit(txtResult)){
                    return;
                }
                txtResult.setText(txtResult.getText()+ "8");
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(DisplayLimit(txtResult)){
                    return;
                }
                txtResult.setText(txtResult.getText()+ "9");
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(DisplayLimit(txtResult)){
                    return;
                }
                txtResult.setText(txtResult.getText()+ "0");
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(DisplayLimit(txtResult)){
                    return;
                }
                txtResult.setText(txtResult.getText()+ "+");
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(DisplayLimit(txtResult)){
                    return;
                }
                txtResult.setText(txtResult.getText()+ "-");
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(DisplayLimit(txtResult)){
                    return;
                }
                txtResult.setText(txtResult.getText()+ "*");
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(DisplayLimit(txtResult)){
                    return;
                }
                txtResult.setText(txtResult.getText()+ "/");
            }
        });
        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(DisplayLimit(txtResult)){
                    return;
                }
                txtResult.setText(txtResult.getText()+ ".");
            }
        });
        btnAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText("");
            }
        });
        btnBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtResult.getText().toString().isEmpty()) {
                    return;
                }
                txtResult.setText(txtResult.getText().subSequence(0, txtResult.getText().length() - 1));
            }
        });
        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(DisplayLimit(txtResult)){
                    return;
                }
                txtResult.setText(txtResult.getText()+ "(");
            }
        });
        btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(DisplayLimit(txtResult)){
                    return;
                }
                txtResult.setText(txtResult.getText()+ ")");
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtResult.getText().toString().isEmpty()) {
                    return;
                }
                txtResult.setText(txtResult.getText() + "=");
                char[] expression = txtResult.getText().toString().toCharArray();
                try {
                    Operation(expression);
                }
                catch(Exception e){
                    txtResult.setText(txtResult.getText().subSequence(0, txtResult.getText().length()-1));
                    tempTop = 0;
                    operatorsTop = 0;
                    numbersTop = 0;
                    return;
                }
                txtResult.setText(numbers[0] + "");
            }
        });

    }

    private char Compare(char a,char b){
        if(a == '+' || a == '-'){
            if(b == '*' || b == '/' || b == '(')
                return '<'; //乘除和括号优先级大
            else
                return '>'; //相同优先级前面的优先
        }
        if(a == '*' || a == '/'){
            if(b == '(')
                return '<';
            else
                return '>';
        }
        if(a == '('){
            if(b == ')')
                return '=';
            else
                return '<'; //优先运算括号内的
        }
        if(b == '='){
            return '>';
        }
        return '~';
    }

    private boolean Judge(char a){
        return ((a >= '0' && a <= '9' )|| a == '.') ? true : false;
    }

    private void Operation(char[] expression) throws Exception {
        for(int i = 0; i < expression.length;){
            if(Judge(expression[i])){
                temp[tempTop] = expression[i];
                tempTop++;
                i++;
                continue;
            }
            if(tempTop != 0){
                numbers[numbersTop] = Float.parseFloat(String.valueOf(temp).substring(0, tempTop));
                numbersTop++;

                tempTop = 0;
            }
            if(operatorsTop == 0){
                if(expression[i] == ')'){
                    throw new Exception();
                }
                operators[operatorsTop] = expression[i];
                operatorsTop++;
                i++;
            }
            else{
                switch(Compare(operators[operatorsTop-1], expression[i])){
                    case '<': operators[operatorsTop] = expression[i]; operatorsTop++; i++; break;
                    case '>': numbers[numbersTop-2] = Cal(numbers[numbersTop-2], operators[operatorsTop-1], numbers[numbersTop-1]); numbersTop--; operatorsTop--; continue;
                    case'=': operatorsTop--; i++; break;
                    default: throw new Exception();
                }
            }
        }

        tempTop = 0;
        operatorsTop = 0;
        numbersTop = 0;
    }

    private boolean DisplayLimit(TextView txtResult){
        if(!txtResult.getText().toString().isEmpty()){
            if(txtResult.getText().length() > 11){
                return true;
            }
        }
        return false;
    }

    private float Cal(float a,char op,float b){
        switch(op){
            case'+':return a + b;
            case'-':return a - b;
            case'*':return a * b;
            case'/':return a / b;
            default:return -1;
        }
    }
}
