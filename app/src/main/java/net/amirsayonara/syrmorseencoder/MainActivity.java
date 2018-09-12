package net.amirsayonara.syrmorseencoder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void kerjakan(View view) {
        SyrMorseEncoder morse = new SyrMorseEncoder();
        EditText input = (EditText) findViewById(R.id.teks_input);
        EditText output = (EditText) findViewById(R.id.teks_output);
        output.setText(morse.encode(input.getText().toString()));
    }
}
