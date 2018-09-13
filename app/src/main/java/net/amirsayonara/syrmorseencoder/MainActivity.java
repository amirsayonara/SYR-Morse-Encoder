package net.amirsayonara.syrmorseencoder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    SyrMorseEncoder morse = new SyrMorseEncoder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ubah_mode(View view) {
        EditText input = (EditText) findViewById(R.id.teks_input);
        Button btn = (Button) findViewById(R.id.button);
        Button t = (Button) findViewById(R.id.titik);
        Button s = (Button) findViewById(R.id.strip);
        Button p = (Button) findViewById(R.id.pemisah);
        Switch pengaturan = findViewById(R.id.pengaturan);
        if (pengaturan.isChecked()) {
            btn.setText("decode");
            t.setEnabled(true);
            s.setEnabled(true);
            p.setEnabled(true);
            input.setShowSoftInputOnFocus(false);
        } else {
            btn.setText("encode");
            t.setEnabled(false);
            s.setEnabled(false);
            p.setEnabled(false);
            input.setShowSoftInputOnFocus(true);
        }
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
        if (b.getText().toString().equals("BCK")) {
            if (input.getText().toString().length()>0) {
                int cur = input.getSelectionStart();
                try{
                    if (input.getSelectionStart()==input.getSelectionEnd()) {
                        input.setText(input.getText().delete(cur-1, input.getSelectionEnd()));
                        input.setSelection(cur-1);
                    } else {
                        input.setText(input.getText().delete(cur, input.getSelectionEnd()));
                        input.setSelection(cur);
                    }
                } catch (Exception e) {}

            }
        } else input.setText("");
    }

    public void kerjakan(View view) {
        Switch pengaturan = findViewById(R.id.pengaturan);
        EditText titik = (EditText) findViewById(R.id.tandatitik);
        EditText strip = (EditText) findViewById(R.id.tandastrip);
        EditText pemisah = (EditText) findViewById(R.id.tandapemisah);
        morse.setTitik(titik.getText().toString());
        morse.setStrip(strip.getText().toString());
        morse.setPemisah(pemisah.getText().toString());
        EditText input = (EditText) findViewById(R.id.teks_input);
        EditText output = (EditText) findViewById(R.id.teks_output);
        if (!pengaturan.isChecked()) output.setText(morse.encode(input.getText().toString()));
        else output.setText(morse.decode(input.getText().toString()));
    }
}
