package com.example.yagnik_final;
//name: Yagnik Virani
//ID  : A00227162


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    //to store maximum value
    int max;
    //To store random value
    int random_v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //To get radiogroup by it's id
        RadioGroup radioGroup = findViewById(R.id.radioGroup);

        //To get radiobutton 4 by it's id
        RadioButton Button_4 = findViewById(R.id.sides_4);

        //To get radiobutton 6 by it's id
        RadioButton Button_6 = findViewById(R.id.sides_6);

        //To get radiobutton 8 by it's id
        RadioButton Button_8 = findViewById(R.id.sides_8);

        //To get radiobutton 10 by it's id
        RadioButton Button_10 = findViewById(R.id.sides_10);

        //To get radiobutton 12 by it's id
        RadioButton Button_12 = findViewById(R.id.sides_12);

        //To get radiobutton 20 by it's id
        RadioButton Button_20 = findViewById(R.id.sides_20);

        //To get button_user by it's id
        Button buttton_user = findViewById(R.id.button_user);

        //To get edittext by it's id
        EditText editText = (EditText)findViewById(R.id.editText_userinput);

        //To get textview by it's id
        TextView textView_user_result = findViewById(R.id.textView_user_result);

        //button clicked event for roll a dice based on user choice
        buttton_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get user choice value as a string and convert into integer
                String user_choice = editText.getText().toString();
                int maxValue = new Integer(user_choice).intValue();

                //get random value by formula
                random_v = (int) (Math.random() * maxValue) + 1;
                //set text on textview
                textView_user_result.setText(String.format("result of user choice after roll dice: %d", random_v));
            }
        });

        //To get button_1 by it's id
        Button button_1 = findViewById(R.id.button_firsttime);

        //To get first textview by it's id
        TextView textView_first = findViewById(R.id.textView_first);

        //To get second textview by it's id
        TextView textView_second = findViewById(R.id.textView_second);

        //button clicked event for roll a dice once
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //store value of selected radiobutton value into choice
                int choice = radioGroup.getCheckedRadioButtonId();

                //perform task based on choice
                if (choice == R.id.sides_4) {
                    max = 4;
                } else if (choice == R.id.sides_6) {
                    max = 6;
                } else if (choice == R.id.sides_8) {
                    max = 8;
                } else if (choice == R.id.sides_10) {
                    max = 10;
                } else if (choice == R.id.sides_12) {
                    max = 12;
                } else if (choice == R.id.sides_20) {
                    max = 20;
                }

                //get random value by it's formula
                random_v = (int) (Math.random() * max) + 1;

                //set text on first textview
                textView_first.setText(String.format("first time : %d", random_v));
                //clear text on second textview no need while once roll
                textView_second.setText("");
            }
        });

        //to get second button by it's id
        Button button_2 = findViewById(R.id.button_twice);

        //button clicked event for roll a dice twice
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //store value of selected radiobutton value into choice
                int choice = radioGroup.getCheckedRadioButtonId();

                //perform task based on choice
                if (choice == R.id.sides_4) {
                    max = 4;
                } else if (choice == R.id.sides_6) {
                    max = 6;
                } else if (choice == R.id.sides_8) {
                    max = 8;
                } else if (choice == R.id.sides_10) {
                    max = 10;
                } else if (choice == R.id.sides_12) {
                    max = 12;
                } else if (choice == R.id.sides_20) {
                    max = 20;
                }

                //get random value by it's formula
                random_v = (int) (Math.random() * max) + 1;

                //set text on first textview
                textView_first.setText(String.format("first time : %d", random_v));

                //get random value by it's formula
                random_v = (int) (Math.random() * max) + 1;
                
                //set text on second textview
                textView_second.setText("second time: "+random_v);
            }
        });

    }
}