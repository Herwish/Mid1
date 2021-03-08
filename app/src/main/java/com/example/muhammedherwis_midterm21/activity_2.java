package com.example.muhammedherwis_midterm21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class activity_2 extends AppCompatActivity {
    String strgName;
    int birthDate;
    String gender;
    String profession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Button bttnSubmit=(Button)findViewById(R.id.Done);
        Button bttn1=(Button)findViewById(R.id.button1);
        Button bttn2=(Button)findViewById(R.id.button3);

        EditText name=(EditText)findViewById(R.id.editTextTextPersonName);
        EditText birth=(EditText)findViewById(R.id.birth);
        RadioButton radButtonMale=(RadioButton)findViewById(R.id.radioBttn1);
        RadioButton radButtonFemale=(RadioButton)findViewById(R.id.radioBttn2);
        RadioButton radButtonStudent=(RadioButton)findViewById(R.id.radioBttn4);
        RadioButton radButtonProfessor=(RadioButton)findViewById(R.id.radioBttn3);
        TextView rslt=(TextView)findViewById(R.id.result);

        bttnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                strgName=name.getText().toString();
                birthDate=Integer.parseInt(birth.getText().toString());

                if(radButtonFemale.isChecked())
                    gender="Mrs.";
                else if (radButtonMale.isChecked())
                    gender="Mr.";
                if(radButtonStudent.isChecked())
                    profession="Student";
                else if (radButtonProfessor.isChecked())
                    profession="Professor";

                rslt.setText("Name is "+gender+" "+strgName+" "+" Hi "+profession+" "+strgName);



            }
        });
    }
}