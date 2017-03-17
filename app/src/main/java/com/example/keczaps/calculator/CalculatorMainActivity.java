package com.example.keczaps.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorMainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonPLUS,buttonMINUS,buttonEQUALS,buttonCLEAR;
    private TextView historyTextView, calculationTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        button0 = (Button) findViewById(R.id.button0);
        button0.setOnClickListener(this);
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);
        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(this);
        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(this);
        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(this);
        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(this);
        buttonPLUS = (Button) findViewById(R.id.buttonPLUS);
        buttonPLUS.setOnClickListener(this);
        buttonMINUS = (Button) findViewById(R.id.buttonMINUS);
        buttonMINUS.setOnClickListener(this);
        buttonEQUALS =  (Button) findViewById(R.id.buttonEQUALS);
        buttonEQUALS.setOnClickListener(this);
        buttonCLEAR = (Button) findViewById(R.id.buttonCLEAR);
        buttonCLEAR.setOnClickListener(this);

        historyTextView = (TextView) findViewById(R.id.history_textview);
        calculationTextView = (TextView) findViewById(R.id.calculation_textview);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculator_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast.makeText(getApplicationContext(),"You've tried to see the settings! Congratulations :)",Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button0:
                Toast.makeText(getApplicationContext(),"You've clicked 0! Congratulations :)",Toast.LENGTH_SHORT).show();
                calculationTextView.setText(button0.getText().toString());
                break;
            case R.id.button1:
                Toast.makeText(getApplicationContext(),"You've clicked 1! Congratulations :)",Toast.LENGTH_SHORT).show();
                calculationTextView.setText(button1.getText().toString());
                break;
            case R.id.button2:
                Toast.makeText(getApplicationContext(),"You've clicked 2! Congratulations :)",Toast.LENGTH_SHORT).show();
                calculationTextView.setText(button2.getText().toString());
                break;
            case R.id.button3:
                Toast.makeText(getApplicationContext(),"You've clicked 3! Congratulations :)",Toast.LENGTH_SHORT).show();
                calculationTextView.setText(button3.getText().toString());
                break;
            case R.id.button4:
                Toast.makeText(getApplicationContext(),"You've clicked 4! Congratulations :)",Toast.LENGTH_SHORT).show();
                calculationTextView.setText(button4.getText().toString());
                break;
            case R.id.button5:
                Toast.makeText(getApplicationContext(),"You've clicked 5! Congratulations :)",Toast.LENGTH_SHORT).show();
                calculationTextView.setText(button5.getText().toString());
                break;
            case R.id.button6:
                Toast.makeText(getApplicationContext(),"You've clicked 6! Congratulations :)",Toast.LENGTH_SHORT).show();
                calculationTextView.setText(button6.getText().toString());
                break;
            case R.id.button7:
                Toast.makeText(getApplicationContext(),"You've clicked 7! Congratulations :)",Toast.LENGTH_SHORT).show();
                calculationTextView.setText(button7.getText().toString());
                break;
            case R.id.button8:
                Toast.makeText(getApplicationContext(),"You've clicked 8! Congratulations :)",Toast.LENGTH_SHORT).show();
                calculationTextView.setText(button8.getText().toString());
                break;
            case R.id.button9:
                Toast.makeText(getApplicationContext(),"You've clicked 9! Congratulations :)",Toast.LENGTH_SHORT).show();
                calculationTextView.setText(button9.getText().toString());
                break;
            case R.id.buttonPLUS:
                Toast.makeText(getApplicationContext(),"You've clicked +! Congratulations :)",Toast.LENGTH_SHORT).show();
                calculationTextView.setText(buttonPLUS.getText().toString());
                break;
            case R.id.buttonMINUS:
                Toast.makeText(getApplicationContext(),"You've clicked -! Congratulations :)",Toast.LENGTH_SHORT).show();
                calculationTextView.setText(buttonMINUS.getText().toString());
                break;
            case R.id.buttonCLEAR:
                Toast.makeText(getApplicationContext(),"You've clicked C! Congratulations :)",Toast.LENGTH_SHORT).show();
                calculationTextView.setText(buttonCLEAR.getText().toString());
                break;
            case R.id.buttonEQUALS:
                Toast.makeText(getApplicationContext(),"You've clicked =! Congratulations :)",Toast.LENGTH_SHORT).show();
                calculationTextView.setText(buttonEQUALS.getText().toString());
                break;

        }

    }
}
