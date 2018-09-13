package net.amirsayonara.syrmorseencoder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String mode = "decode";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ubah_mode(null);
    }

    public void ubah_mode(View view) {
        if (this.mode=="encode") this.mode="decode";
        else this.mode="encode";
        Button btn = (Button) findViewById(R.id.button);
        Button t = (Button) findViewById(R.id.titik);
        Button s = (Button) findViewById(R.id.strip);
        Button p = (Button) findViewById(R.id.pemisah);
        btn.setText(this.mode);
        t.setEnabled(!t.isEnabled());s.setEnabled(!s.isEnabled());p.setEnabled(!p.isEnabled());
    }

    public void ketik(View view) {
        view.getClass();
    }

    public void kerjakan(View view) {
        SyrMorseEncoder morse = new SyrMorseEncoder();
        EditText titik = (EditText) findViewById(R.id.tandatitik);
        EditText strip = (EditText) findViewById(R.id.tandastrip);
        EditText pemisah = (EditText) findViewById(R.id.tandapemisah);
        morse.setTitik(titik.getText().toString());
        morse.setStrip(strip.getText().toString());
        morse.setPemisah(pemisah.getText().toString());
        EditText input = (EditText) findViewById(R.id.teks_input);
        EditText output = (EditText) findViewById(R.id.teks_output);
        if (this.mode=="encode") output.setText(morse.encode(input.getText().toString()));
        else output.setText(morse.decode(input.getText().toString()));
    }
}
