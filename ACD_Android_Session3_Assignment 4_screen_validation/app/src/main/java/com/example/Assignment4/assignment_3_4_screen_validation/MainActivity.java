package com.example.pravar_ag.assignment_3_4_screen_validation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText value;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        value=(EditText)findViewById(R.id.et_enter_value);
        btn = (Button)findViewById(R.id.bt_display);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            try {
                if (Integer.parseInt(value.getText().toString()) == 0) {
                    Toast.makeText(getApplicationContext(), "Wrong Input".toString(), Toast.LENGTH_SHORT).show();
                } else if (Double.parseDouble(value.getText().toString()) == 0) {
                    Toast.makeText(getApplicationContext(), "Wrong Input".toString(), Toast.LENGTH_SHORT).show();
                } else if (value.getText().toString() == "0") {
                    Toast.makeText(getApplicationContext(), "Wrong Input".toString(), Toast.LENGTH_SHORT).show();
                }
                else if (value.getText().toString()=="" || value.getText().toString()=="NULL" ){

                    Toast.makeText(getApplicationContext(), "Wrong Input".toString(), Toast.LENGTH_SHORT).show();

                }
            }
            catch(Exception e)
                {
                    Toast.makeText(getApplicationContext(),value.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });


    }























}
