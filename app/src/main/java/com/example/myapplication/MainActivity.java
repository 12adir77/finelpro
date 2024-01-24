package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    EditText etFirstName,etLastName,etplacment;
    TextView tvDisplay;
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etplacment = (EditText)findViewById(R.id.etplace);
        etFirstName = (EditText)findViewById(R.id.etFname);
        etLastName = (EditText)findViewById(R.id.etLname);
        btnSave = (Button)findViewById(R.id.btnSave);
        tvDisplay=(TextView)findViewById(R.id.tvDisplay);
        btnSave.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        if (v == btnSave) {
            if (  etplacment.getText().toString().length()>0 &&   etLastName.getText().toString().length() > 0 && etFirstName.getText().toString().length() > 0) {
                tvDisplay.setText(etFirstName.getText().toString() + "  " + etLastName.getText().toString()+" "+etplacment.getText().toString());
                etFirstName.setText("");
                etLastName.setText("");
                etplacment.setText("");
            }
        }
    }}