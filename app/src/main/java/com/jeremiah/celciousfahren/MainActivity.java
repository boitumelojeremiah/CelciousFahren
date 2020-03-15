package com.jeremiah.celciousfahren;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText firstEdt, secondEdt;
    TextView firstTxtV, secondTxt;
    Spinner spinner;
    String firstString, secondString;
    float firstFloat, secondFloat, resultFloat;
    double firstDouble, secondDouble, resultDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        firstEdt = findViewById(R.id.editText);
        secondEdt = findViewById(R.id.editText2);
        firstTxtV = findViewById(R.id.textView);
        secondTxt = findViewById(R.id.textView2);
        spinner = findViewById(R.id.spinner);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstEdt.getText().toString().equalsIgnoreCase("")||secondEdt.getText().toString().equalsIgnoreCase("")){
                    Toast.makeText(getApplicationContext(), "Please Enter some Parameters", Toast.LENGTH_LONG).show();
                }if (spinner.getSelectedItem().equals("Fahrenheit to Celsius")){
                   firstString = "Fahrenheit";
                   secondString = "Celsius";
                    firstFloat = Float.parseFloat(firstEdt.getText().toString());
                    secondFloat = Float.parseFloat(secondEdt.getText().toString());
                    resultFloat = firstFloat-32*5/9;
                    secondEdt.setText(String.valueOf(resultFloat));
                    firstTxtV.setText(firstString);
                    secondTxt.setText(secondString);
                }if (spinner.getSelectedItem().equals("Inches to Meters")){
                    firstString = "Inches";
                    secondString = "Meters";
                    firstDouble = Double.parseDouble(firstEdt.getText().toString());
                    secondDouble = Double.parseDouble(secondEdt.getText().toString());
                    resultDouble = firstDouble/39.37;
                    secondEdt.setText(String.valueOf(resultDouble));
                    firstTxtV.setText(firstString);
                    secondTxt.setText(secondString);
                }if (spinner.getSelectedItem().equals("Pounds to Kilograms")){
                    firstString = "Pounds";
                    secondString = "Kilograms";
                    firstDouble = Double.parseDouble(firstEdt.getText().toString());
                    secondDouble = Double.parseDouble(secondEdt.getText().toString());
                    resultDouble = firstDouble/2.205;
                    secondEdt.setText(String.valueOf(resultDouble));
                    firstTxtV.setText(firstString);
                    secondTxt.setText(secondString);
                }if (spinner.getSelectedItem().equals("Celsius to Fahrenheit")){
                    secondString = "Fahrenheit";
                    firstString = "Celsius";
                    firstFloat = Float.parseFloat(firstEdt.getText().toString());
                    secondFloat = Float.parseFloat(secondEdt.getText().toString());
                    resultFloat = firstFloat*5/9+32;
                    secondEdt.setText(String.valueOf(resultFloat));
                    firstTxtV.setText(firstString);
                    secondTxt.setText(secondString);
                }if (spinner.getSelectedItem().equals("Meters to Inches")){
                    secondString = "Inches";
                    firstString = "Meters";
                    firstDouble = Double.parseDouble(firstEdt.getText().toString());
                    secondDouble = Double.parseDouble(secondEdt.getText().toString());
                    resultDouble = firstDouble*39.37;
                    secondEdt.setText(String.valueOf(resultDouble));
                    firstTxtV.setText(firstString);
                    secondTxt.setText(secondString);
                }if (spinner.getSelectedItem().equals("Kilograms to Pounds")){
                    secondString = "Pounds";
                    firstString = "Kilograms";
                    firstDouble = Double.parseDouble(firstEdt.getText().toString());
                    secondDouble = Double.parseDouble(secondEdt.getText().toString());
                    resultDouble = firstDouble*2.205;
                    secondEdt.setText(String.valueOf(resultDouble));
                    firstTxtV.setText(firstString);
                    secondTxt.setText(secondString);
                }
            }
        });
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                firstEdt.setText(String.valueOf(0.00));
                secondEdt.setText(String.valueOf(0.00));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
