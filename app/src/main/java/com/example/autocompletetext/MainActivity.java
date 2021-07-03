package com.example.autocompletetext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView a;
   String [] city={"shahdol","anuppur","delhi","kolkata","laoos angele"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=findViewById(R.id.autoCompleteTextView);

        ArrayAdapter<String> arr=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.select_dialog_item,city);
        a.setAdapter(arr);
        a.setThreshold(1);

    }
}