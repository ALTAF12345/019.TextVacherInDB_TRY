package org.sawhers.altafhussain.textvacherindb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements TextWatcher{
    EditText etText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etText= (EditText) findViewById(R.id.edtext);
        etText.addTextChangedListener(this);


    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        Toast.makeText(this, "text changing "+count++, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}
