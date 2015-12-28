package com.rabiulkhan.checkyourfitness;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class Your_Result extends ActionBarActivity {
    TextView finalText;
    double weight = 0;
    double height = 0;
    double recent = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your__result);

        weight = Double.parseDouble(getIntent().getStringExtra("weight"));
        height = Double.parseDouble(getIntent().getStringExtra("height"));
        finalText = (TextView) findViewById(R.id.textView_final);

        switch (getIntent().getStringExtra("radioBtn")){
            case "Male" :
                        if(height == 137){
                            if(weight >= 28.5 && weight <= 34){
                                finalText.setText("hey "+getIntent().getStringExtra("name")+" you are totally fit. you should keet it up.");
                            }
                            else{
                                if(weight < 28.5){
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must increase your" +
                                            "weight. your weight is below the fitness line");
                                }
                                else{
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must decrease your" +
                                            "weight. your weight is up the fitness line");
                                }
                            }
                        }
                        if(height == 140){
                            if(weight >= 31 && weight <= 39){
                                finalText.setText("hey "+getIntent().getStringExtra("name")+" you are totally fit. you should keet it up.");
                            }
                            else{
                                if(weight < 31){
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must increase your" +
                                            "weight. your weight is below the fitness line");
                                }
                                else{
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must decrease your" +
                                            "weight. your weight is up the fitness line");
                                }
                            }
                        }
                        if(height == 142){
                            if(weight >= 34 && weight <= 41){
                                finalText.setText("hey "+getIntent().getStringExtra("name")+" you are totally fit. you should keet it up.");
                            }
                            else{
                                if(weight < 34){
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must increase your" +
                                            "weight. your weight is below the fitness line");
                                }
                                else{
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must decrease your" +
                                            "weight. your weight is up the fitness line");
                                }
                            }
                        }
                        if(height == 145){
                            if(weight >= 36 && weight <= 44){
                                finalText.setText("hey "+getIntent().getStringExtra("name")+" you are totally fit. you should keet it up.");
                            }
                            else{
                                if(weight < 36){
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must increase your" +
                                            "weight. your weight is below the fitness line");
                                }
                                else{
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must decrease your" +
                                            "weight. your weight is up the fitness line");
                                }
                            }
                        }
                        if(height == 147){
                            if(weight >= 39 && weight <= 47){
                                finalText.setText("hey "+getIntent().getStringExtra("name")+" you are totally fit. you should keet it up.");
                            }
                            else{
                                if(weight < 39){
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must increase your" +
                                            "weight. your weight is below the fitness line");
                                }
                                else{
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must decrease your" +
                                            "weight. your weight is up the fitness line");
                                }
                            }
                        }
                        if(height == 150){
                            if(weight >= 41 && weight <= 50){
                                finalText.setText("hey "+getIntent().getStringExtra("name")+" you are totally fit. you should keet it up.");
                            }
                            else{
                                if(weight < 39){
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must increase your" +
                                            "weight. your weight is below the fitness line");
                                }
                                else{
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must decrease your" +
                                            "weight. your weight is up the fitness line");
                                }
                            }
                        }
                        if(height == 152){
                            if(weight >= 43 && weight <= 54){
                                finalText.setText("hey "+getIntent().getStringExtra("name")+" you are totally fit. you should keet it up.");
                            }
                            else{
                                if(weight < 43){
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must increase your" +
                                            "weight. your weight is below the fitness line");
                                }
                                else{
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must decrease your" +
                                            "weight. your weight is up the fitness line");
                                }
                            }
                        }
                        if(height == 155){
                            if(weight >= 46 && weight <= 56){
                                finalText.setText("hey "+getIntent().getStringExtra("name")+" you are totally fit. you should keet it up.");
                            }
                            else{
                                if(weight < 46){
                                    finalText.setText("hey Mr. "+getIntent().getStringExtra("name")+" you should must increase your" +
                                            "weight. your weight is below the fitness line");
                                }
                                else{
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must decrease your" +
                                            "weight. your weight is up the fitness line");
                                }
                            }
                        }
                        if(height == 157){
                            if(weight >= 48 && weight <= 59){
                                finalText.setText("hey "+getIntent().getStringExtra("name")+" you are totally fit. you should keet it up.");
                            }
                            else{
                                if(weight < 48){
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must increase your" +
                                            "weight. your weight is below the fitness line");
                                }
                                else{
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must decrease your" +
                                            "weight. your weight is up the fitness line");
                                }
                            }
                        }
                        if(height == 160){
                            if(weight >= 51 && weight <= 62){
                                finalText.setText("hey "+getIntent().getStringExtra("name")+" you are totally fit. you should keet it up.");
                            }
                            else{
                                if(weight < 51){
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must increase your" +
                                            "weight. your weight is below the fitness line");
                                }
                                else{
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must decrease your" +
                                            "weight. your weight is up the fitness line");
                                }
                            }
                        }
                        if(height == 163){
                            if(weight >= 53 && weight <= 65){
                                finalText.setText("hey "+getIntent().getStringExtra("name")+" you are totally fit. you should keet it up.");
                            }
                            else{
                                if(weight < 53){
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must increase your" +
                                            "weight. your weight is below the fitness line");
                                }
                                else{
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must decrease your" +
                                            "weight. your weight is up the fitness line");
                                }
                            }
                        }
                        if(height == 165){
                            if(weight >= 55 && weight <= 68){
                                finalText.setText("hey "+getIntent().getStringExtra("name")+" you are totally fit. you should keet it up.");
                            }
                            else{
                                if(weight < 55){
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must increase your" +
                                            "weight. your weight is below the fitness line");
                                }
                                else{
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must decrease your" +
                                            "weight. your weight is up the fitness line");
                                }
                            }
                        }

                        break;


            case "FeMale" :
                        if(height == 137){
                            if(weight >= 28.5 && weight <= 34){
                                finalText.setText("hey Ms. "+getIntent().getStringExtra("name")+" you are totally fit. you should keet it up.");
                            }
                            else{
                                if(weight < 28.5){
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must increase your" +
                                            "weight. your weight is below the fitness line");
                                }
                                else{
                                    finalText.setText("hey  "+getIntent().getStringExtra("name")+" you should must decrease your" +
                                            "weight. your weight is up the fitness line");
                                }
                            }
                        }
                        if(height == 140){
                            if(weight >= 31 && weight <= 38){
                                finalText.setText("hey "+getIntent().getStringExtra("name")+" you are totally fit. you should keet it up.");
                            }
                            else{
                                if(weight < 31){
                                    finalText.setText("hey Mr. "+getIntent().getStringExtra("name")+" you should must increase your" +
                                            "weight. your weight is below the fitness line");
                                }
                                else{
                                    finalText.setText("hey Mr. "+getIntent().getStringExtra("name")+" you should must decrease your" +
                                            "weight. your weight is up the fitness line");
                                }
                            }
                        }
                        if(height == 142){
                            if(weight >= 33 && weight <= 40){
                                finalText.setText("hey "+getIntent().getStringExtra("name")+" you are totally fit. you should keet it up.");
                            }
                            else{
                                if(weight < 33){
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must increase your" +
                                            "weight. your weight is below the fitness line");
                                }
                                else{
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must decrease your" +
                                            "weight. your weight is up the fitness line");
                                }
                            }
                        }
                        if(height == 145){
                            if(weight >= 35 && weight <= 43){
                                finalText.setText("hey "+getIntent().getStringExtra("name")+" you are totally fit. you should keet it up.");
                            }
                            else{
                                if(weight < 35){
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must increase your" +
                                            "weight. your weight is below the fitness line");
                                }
                                else{
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must decrease your" +
                                            "weight. your weight is up the fitness line");
                                }
                            }
                        }
                        if(height == 147){
                            if(weight >= 37 && weight <= 45){
                                finalText.setText("hey "+getIntent().getStringExtra("name")+" you are totally fit. you should keet it up.");
                            }
                            else{
                                if(weight < 37){
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must increase your" +
                                            "weight. your weight is below the fitness line");
                                }
                                else{
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must decrease your" +
                                            "weight. your weight is up the fitness line");
                                }
                            }
                        }
                        if(height == 150){
                            if(weight >= 40 && weight <= 48){
                                finalText.setText("hey "+getIntent().getStringExtra("name")+" you are totally fit. you should keet it up.");
                            }
                            else{
                                if(weight < 40){
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must increase your" +
                                            "weight. your weight is below the fitness line");
                                }
                                else{
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must decrease your" +
                                            "weight. your weight is up the fitness line");
                                }
                            }
                        }
                        if(height == 152){
                            if(weight >= 41 && weight <= 50){
                                finalText.setText("hey "+getIntent().getStringExtra("name")+" you are totally fit. you should keet it up.");
                            }
                            else{
                                if(weight < 41){
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must increase your" +
                                            "weight. your weight is below the fitness line");
                                }
                                else{
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must decrease your" +
                                            "weight. your weight is up the fitness line");
                                }
                            }
                        }
                        if(height == 155){
                            if(weight >= 43 && weight <= 53){
                                finalText.setText("hey "+getIntent().getStringExtra("name")+" you are totally fit. you should keet it up.");
                            }
                            else{
                                if(weight < 43){
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must increase your" +
                                            "weight. your weight is below the fitness line");
                                }
                                else{
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must decrease your" +
                                            "weight. your weight is up the fitness line");
                                }
                            }
                        }
                        if(height == 157){
                            if(weight >= 45 && weight <= 55){
                                finalText.setText("hey "+getIntent().getStringExtra("name")+" you are totally fit. you should keet it up.");
                            }
                            else{
                                if(weight < 45){
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must increase your" +
                                            "weight. your weight is below the fitness line");
                                }
                                else{
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must decrease your" +
                                            "weight. your weight is up the fitness line");
                                }
                            }
                        }
                        if(height == 160){
                            if(weight >= 47 && weight <= 58){
                                finalText.setText("hey "+getIntent().getStringExtra("name")+" you are totally fit. you should keet it up.");
                            }
                            else{
                                if(weight < 47){
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must increase your" +
                                            "weight. your weight is below the fitness line");
                                }
                                else{
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must decrease your" +
                                            "weight. your weight is up the fitness line");
                                }
                            }
                        }
                        if(height == 163){
                            if(weight >= 49 && weight <= 60){
                                finalText.setText("hey "+getIntent().getStringExtra("name")+" you are totally fit. you should keet it up.");
                            }
                            else{
                                if(weight < 49){
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must increase your" +
                                            "weight. your weight is below the fitness line");
                                }
                                else{
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must decrease your" +
                                            "weight. your weight is up the fitness line");
                                }
                            }
                        }
                        if(height == 165){
                            if(weight >= 51 && weight <= 63){
                                finalText.setText("hey "+getIntent().getStringExtra("name")+" you are totally fit. you should keet it up.");
                            }
                            else{
                                if(weight < 51){
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must increase your" +
                                            "weight. your weight is below the fitness line");
                                }
                                else{
                                    finalText.setText("hey "+getIntent().getStringExtra("name")+" you should must decrease your" +
                                            "weight. your weight is up the fitness line");
                                }
                            }
                        }

                        break;
            default :  finalText.setText("sorry");
        }

       /* finalText.setText("Welcome \n"+getIntent().getStringExtra("name")
                           +" \n "+"you r "+getIntent().getStringExtra("age")
                        +" years old \n "+"your weight is "+getIntent().getStringExtra("weight")
                        +" kg \n "+"you r "+getIntent().getStringExtra("radioBtn")
                            );*/
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_your__result, menu);
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
