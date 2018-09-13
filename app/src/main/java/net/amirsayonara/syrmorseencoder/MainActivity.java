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
        Button b = (Button) view;
        EditText input = (EditText) findViewById(R.id.teks_input);
        int cur = input.getSelectionStart();
        if (b.getText().toString().equals("•")) {
            EditText t = (EditText) findViewById(R.id.tandatitik);
            input.setText(input.getText().toString().substring(0, cur) + t.getText().toString() + input.getText().toString().substring(cur, input.getText().toString().length()));
        } else if (b.getText().toString().equals("—")) {
            EditText s = (EditText) findViewById(R.id.tandastrip);
            input.setText(input.getText().toString().substring(0, cur) + s.getText().toString() + input.getText().toString().substring(cur, input.getText().toString().length()));
        } else {
            EditText p = (EditText) findViewById(R.id.tandapemisah);
            input.setText(input.getText().toString().substring(0, cur) + p.getText().toString() + input.getText().toString().substring(cur, input.getText().toString().length()));
        } input.setSelection(cur+1);
    }

    public void hapus(View view) {
        Button b = (Button) view;
        EditText input = (EditText) findViewById(R.id.teks_input);
        EditText tmp = (EditText) findViewById(R.id.teks_output);
        tmp.setText(String.valueOf(input.getSelectionStart()));
        if (b.getText().toString().equals("BCK")) {
            if (input.getText().toString().length()>0) {
                int cur = input.getSelectionStart();
                if (cur-1<0) cur = 1;
                input.setText(input.getText().delete(cur-1, input.getSelectionEnd()));
                input.setSelection(cur-1);
            }
        } else input.setText("");
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
