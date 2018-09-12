package net.amirsayonara.syrmorseencoder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SyrMorseEncoder {
    private Map data = new HashMap();
    private String[] morse = "10 0111 0101 011 1 1101 001 1111 11 1000 010 1011 00 01 000 1001 0010 101 111 0 110 1110 100 0110 0100 0011".split(" ");
    private String titik=".", strip="-", pemisah="/";
    public SyrMorseEncoder() {
        for (int i=0; i<morse.length; i++) {
            data.put((char) (i + 65), morse[i].replace('1', titik.charAt(0)).replace('0', strip.charAt(0)));
        }
    }
    public void setTitik(String titik) {
        this.titik = titik;
    }
    public void setStrip(String strip) {
        this.strip = strip;
    }
    public void setPemisah(String pemisah) {
        this.pemisah = pemisah;
    }
    public String encode(String teks) {
        String tmp = "";teks=teks.toUpperCase();
        Set alpha = data.keySet();
        for (int i=0; i<teks.length(); i++) {
            if (alpha.contains(teks.charAt(i))) tmp += data.get(teks.charAt(i))+ "/";
            else if (teks.charAt(i)==' ') tmp += '/';
            else tmp += teks.charAt(i);
        }
        return tmp+'/';
    }
}
