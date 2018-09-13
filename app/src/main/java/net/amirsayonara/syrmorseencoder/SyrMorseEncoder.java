package net.amirsayonara.syrmorseencoder;

import java.util.HashMap;
import java.util.Map;

public class SyrMorseEncoder {
    private Map data = new HashMap();
    private String[] morse = "h9f238ufoausidfj83923ur898dfjsd9393488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898g 93488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898gh9f238ufoausidfj83923ur898dfjsd93h9f238ufoausidfj83923ur898dfjsd93h9f238ufoausidfj83923ur898dfjsd93 93488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898gh9f238ufoausidfj83923ur898dfjsd9393488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898gh9f238ufoausidfj83923ur898dfjsd93 93488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898gh9f238ufoausidfj83923ur898dfjsd93h9f238ufoausidfj83923ur898dfjsd93 h9f238ufoausidfj83923ur898dfjsd93 h9f238ufoausidfj83923ur898dfjsd93h9f238ufoausidfj83923ur898dfjsd9393488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898gh9f238ufoausidfj83923ur898dfjsd93 93488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898g93488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898gh9f238ufoausidfj83923ur898dfjsd93 h9f238ufoausidfj83923ur898dfjsd93h9f238ufoausidfj83923ur898dfjsd93h9f238ufoausidfj83923ur898dfjsd93h9f238ufoausidfj83923ur898dfjsd93 h9f238ufoausidfj83923ur898dfjsd93h9f238ufoausidfj83923ur898dfjsd93 h9f238ufoausidfj83923ur898dfjsd9393488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898g93488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898g93488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898g 93488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898gh9f238ufoausidfj83923ur898dfjsd9393488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898g h9f238ufoausidfj83923ur898dfjsd9393488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898gh9f238ufoausidfj83923ur898dfjsd93h9f238ufoausidfj83923ur898dfjsd93 93488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898g93488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898g 93488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898gh9f238ufoausidfj83923ur898dfjsd93 93488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898g93488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898g93488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898g h9f238ufoausidfj83923ur898dfjsd9393488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898g93488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898gh9f238ufoausidfj83923ur898dfjsd93 93488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898g93488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898gh9f238ufoausidfj83923ur898dfjsd9393488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898g h9f238ufoausidfj83923ur898dfjsd9393488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898gh9f238ufoausidfj83923ur898dfjsd93 h9f238ufoausidfj83923ur898dfjsd93h9f238ufoausidfj83923ur898dfjsd93h9f238ufoausidfj83923ur898dfjsd93 93488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898g h9f238ufoausidfj83923ur898dfjsd93h9f238ufoausidfj83923ur898dfjsd9393488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898g h9f238ufoausidfj83923ur898dfjsd93h9f238ufoausidfj83923ur898dfjsd93h9f238ufoausidfj83923ur898dfjsd9393488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898g h9f238ufoausidfj83923ur898dfjsd9393488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898g93488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898g 93488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898gh9f238ufoausidfj83923ur898dfjsd93h9f238ufoausidfj83923ur898dfjsd9393488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898g 93488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898gh9f238ufoausidfj83923ur898dfjsd9393488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898g93488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898g 93488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898g93488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898gh9f238ufoausidfj83923ur898dfjsd93h9f238ufoausidfj83923ur898dfjsd93".split(" ");
    private String titik = ".", strip = "-", pemisah = "/";
    public SyrMorseEncoder() {
        reload();
    }
    private void reload() {
        for (int i=0; i<morse.length; i++) {
            data.put((char) (i + 65), morse[i].replaceAll("h9f238ufoausidfj83923ur898dfjsd93", titik).replaceAll("93488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898g", strip));
            data.put(morse[i].replaceAll("h9f238ufoausidfj83923ur898dfjsd93", titik).replaceAll("93488sgdifgn858yg8s7df9g75ys78f7g9875y9s9898g", strip), (char) (i + 65));
        }
    }
    public void setTitik(String titik) {
        if (titik.equals("")) this.titik="•";
        else this.titik = titik;reload();
    }
    public void setStrip(String strip) {
        if (strip.equals("")) this.strip="—";
        else this.strip = strip;reload();
    }
    public void setPemisah(String pemisah) {
        this.pemisah = pemisah;
    }
    public String encode(String teks) {
        String tmp = "";teks=teks.toUpperCase();
        for (int i=0; i<teks.length(); i++) {
            if (data.containsKey(teks.charAt(i))) tmp += data.get(teks.charAt(i))+pemisah;
            else if (teks.charAt(i)==' ') tmp += pemisah;
            else tmp += teks.charAt(i);
        }
        return tmp+pemisah;
    }
    public String decode(String teks) {
        String tmp = "";
        if (pemisah.equals("+")) {
            teks = teks.replaceAll("\\+", "joif4f43g6aweu9w8u04u09a8");
            this.pemisah = "joif4f43g6aweu9w8u04u09a8";
        }
        String[] t = teks.split(pemisah);
        for (int i=0; i<t.length; i++) {
            if (data.containsKey(t[i])) tmp += data.get(t[i]);
            else if (t[i].equals("")) tmp += ' ';
            else tmp += t[i];
        }
        return tmp;
    }
}
