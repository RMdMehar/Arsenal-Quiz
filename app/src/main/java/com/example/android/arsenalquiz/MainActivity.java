package com.example.android.arsenalquiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    int scq1, scq2, scq3, scq4;
    int mcq1, mcq2, mcq3, mcq4;
    int txt1, txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void evaluateSCQ1(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        boolean correct = false;
        switch (view.getId()) {
            case R.id.rb_1_1:
                if (checked) {
                    correct = false;
                }
                break;
            case R.id.rb_1_2:
                if (checked) {
                    correct = true;
                }
                break;
            case R.id.rb_1_3:
                if (checked) {
                    correct = false;
                }
                break;
            case R.id.rb_1_4:
                if (checked) {
                    correct = false;
                }
                break;
        }
        if (correct) {
            scq1 = 1;
        } else {
            scq1 = 0;
        }
    }

    public void evaluateSCQ2(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        boolean correct = false;
        switch (view.getId()) {
            case R.id.rb_2_1:
                if (checked) {
                    correct = false;
                }
                break;
            case R.id.rb_2_2:
                if (checked) {
                    correct = false;
                }
                break;
            case R.id.rb_2_3:
                if (checked) {
                    correct = true;
                }
                break;
            case R.id.rb_2_4:
                if (checked) {
                    correct = false;
                }
                break;
        }

        if (correct) {
            scq2 = 1;
        } else {
            scq2 = 0;
        }
    }

    public void evaluateSCQ3(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        boolean correct = false;
        switch (view.getId()) {
            case R.id.rb_3_1:
                if (checked) {
                    correct = true;
                }
                break;
            case R.id.rb_3_2:
                if (checked) {
                    correct = false;
                }
                break;
            case R.id.rb_3_3:
                if (checked) {
                    correct = false;
                }
                break;
            case R.id.rb_3_4:
                if (checked) {
                    correct = false;
                }
                break;
        }

        if (correct) {
            scq3 = 1;
        } else {
            scq3 = 0;
        }
    }

    public void evaluateSCQ4(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        boolean correct = false;
        switch (view.getId()) {
            case R.id.rb_4_1:
                if (checked) {
                    correct = false;
                }
                break;
            case R.id.rb_4_2:
                if (checked) {
                    correct = false;
                }
                break;
            case R.id.rb_4_3:
                if (checked) {
                    correct = true;
                }
                break;
            case R.id.rb_4_4:
                if (checked) {
                    correct = false;
                }
                break;
        }
        if (correct) {
            scq4 = 1;
        } else {
            scq4 = 0;
        }
    }

    public void evaluateMCQ1(View view) {
        CheckBox chbox1 = (CheckBox) findViewById(R.id.chbox_1_1);
        boolean check1 = chbox1.isChecked();
        CheckBox chbox2 = (CheckBox) findViewById(R.id.chbox_1_2);
        boolean check2 = chbox2.isChecked();
        CheckBox chbox3 = (CheckBox) findViewById(R.id.chbox_1_3);
        boolean check3 = chbox3.isChecked();
        CheckBox chbox4 = (CheckBox) findViewById(R.id.chbox_1_4);
        boolean check4 = chbox4.isChecked();
        if ((!check1) && (check2) && (check3) && (check4)) {
            mcq1 = 1;
        } else {
            mcq1 = 0;
        }
    }

    public void evaluateMCQ2(View view) {
        CheckBox chbox1 = (CheckBox) findViewById(R.id.chbox_2_1);
        boolean check1 = chbox1.isChecked();
        CheckBox chbox2 = (CheckBox) findViewById(R.id.chbox_2_2);
        boolean check2 = chbox2.isChecked();
        CheckBox chbox3 = (CheckBox) findViewById(R.id.chbox_2_3);
        boolean check3 = chbox3.isChecked();
        CheckBox chbox4 = (CheckBox) findViewById(R.id.chbox_2_4);
        boolean check4 = chbox4.isChecked();
        if ((check1) && (!check2) && (!check3) && (check4)) {
            mcq2 = 1;
        } else {
            mcq2 = 0;
        }
    }

    public void evaluateMCQ3(View view) {
        CheckBox chbox1 = (CheckBox) findViewById(R.id.chbox_3_1);
        boolean check1 = chbox1.isChecked();
        CheckBox chbox2 = (CheckBox) findViewById(R.id.chbox_3_2);
        boolean check2 = chbox2.isChecked();
        CheckBox chbox3 = (CheckBox) findViewById(R.id.chbox_3_3);
        boolean check3 = chbox3.isChecked();
        CheckBox chbox4 = (CheckBox) findViewById(R.id.chbox_3_4);
        boolean check4 = chbox4.isChecked();
        if ((check1) && (check2) && (check3) && (check4)) {
            mcq3 = 1;
        } else {
            mcq3 = 0;
        }
    }

    public void evaluateMCQ4(View view) {
        CheckBox chbox1 = (CheckBox) findViewById(R.id.chbox_4_1);
        boolean check1 = chbox1.isChecked();
        CheckBox chbox2 = (CheckBox) findViewById(R.id.chbox_4_2);
        boolean check2 = chbox2.isChecked();
        CheckBox chbox3 = (CheckBox) findViewById(R.id.chbox_4_3);
        boolean check3 = chbox3.isChecked();
        CheckBox chbox4 = (CheckBox) findViewById(R.id.chbox_4_4);
        boolean check4 = chbox4.isChecked();
        if ((!check1) && (check2) && (check3) && (check4)) {
            mcq4 = 1;
        } else {
            mcq4 = 0;
        }
    }

    public void evaluateTXTQ1(View view) {
        EditText ed1 = (EditText) findViewById(R.id.txt_1_1);
        EditText ed2 = (EditText) findViewById(R.id.txt_1_2);
        String firstName = ed1.getText().toString();
        String lastName = ed2.getText().toString();
        if ((firstName.equals("Thierry")) && (lastName.equals("Henry"))) {

            txt1 = 1;
        } else {
            txt1 = 0;
        }
    }

    public void evaluateTXTQ2(View view) {
        EditText ed = (EditText) findViewById(R.id.txt_2);
        String tenure = ed.getText().toString();
        if (tenure.equals("22")) {
            txt2 = 1;
        } else {
            txt2 = 0;
        }
    }

    public void submitAnswer(View view) {
        EditText name = (EditText) findViewById(R.id.user_name);
        String userName = name.getText().toString();
        score = scq1 + scq2 + scq3 + scq4 + mcq1 + mcq2 + mcq3 + mcq4 + txt1 + txt2;
        Context context = getApplicationContext();
        CharSequence text;
        if ((score >= 0) && (score <= 3)) {
            text = "You are approaching relegation,  " + userName + "\nYou scored " + score + " points";
        } else if ((score >= 4) && (score <= 6)) {
            text = "Your place is secure in mid-field, " + userName + "\nYou scored " + score + " points";
        } else if ((score >= 7) && (score <= 9)) {
            text = "You are a top contender for the title, " + userName + "\nYou scored " + score + " points";
        } else {
            text = "Congratulations, Champion " + userName + "!\nYou scored " + score + " points";
        }
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

}
