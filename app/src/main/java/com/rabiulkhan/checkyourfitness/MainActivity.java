package com.rabiulkhan.checkyourfitness;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    public EditText username;
    public EditText age;
    public EditText weight;
    public EditText height;
    public RadioGroup radioGroup;
    public RadioButton radio_b;
    public Button button_sbm;

    public Button button_converter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onButtonClickListener();
        onClickButtonListener();
    }

    public void onButtonClickListener(){
        username = (EditText) findViewById(R.id.editText_username);
        age = (EditText) findViewById(R.id.editText_age);
        weight = (EditText) findViewById(R.id.editText_weight);
        height = (EditText) findViewById(R.id.editText_height);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        button_sbm = (Button) findViewById(R.id.button_sbm);

        button_sbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int selected_id = radioGroup.getCheckedRadioButtonId();
                        radio_b = (RadioButton) findViewById(selected_id);

                        String name = username.getText().toString();
                        String userage = age.getText().toString();
                        String userWeight = weight.getText().toString();
                        String userHeight = height.getText().toString();
                        String radioBtn = radio_b.getText().toString();

                        Intent intent = new Intent(MainActivity.this,Your_Result.class);
                        intent.putExtra("name",name);
                        intent.putExtra("age",userage);
                        intent.putExtra("weight",userWeight);
                        intent.putExtra("height",userHeight);
                        intent.putExtra("radioBtn",radioBtn);

                        startActivity(intent);
                    }
                }
        );
    }

    public void onClickButtonListener(){
        button_converter = (Button) findViewById(R.id.button_converter);
        button_converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Converter.class);
                startActivity(intent);
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
