package com.rabiulkhan.checkyourfitness;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Converter extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);
    }

    public void onButtonClick(View v){
        EditText e1 = (EditText) findViewById(R.id.editText_feet);
        EditText e2 = (EditText) findViewById(R.id.editText_inch);
        Button btn = (Button) findViewById(R.id.button_converter);
        TextView res = (TextView) findViewById(R.id.textView_result);

        double feet = Double.parseDouble(e1.getText().toString());
        double inch = Double.parseDouble(e2.getText().toString());

        double x = feet * 12 + inch;
        double y = x * 2.54;

        res.setText(Double.toString(y));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_converter, menu);
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
