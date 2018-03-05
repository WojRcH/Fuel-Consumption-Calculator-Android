package com.example.w.kalkulatorspalania;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;


public class spal_100_km extends AppCompatActivity{
    private EditText spalone;
    private EditText ilosc;
    private EditText cena;
    private Switch czyliczz;
    private TextView podajcene;
    private TextView tvspal100;
    private TextView tvkoszt;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spal_100_km);
            Toast.makeText(getApplicationContext(),"Liczby wymierne podawaj po kropce!",Toast.LENGTH_LONG).show();
            spalone=(EditText) findViewById(R.id.spal);
            ilosc =(EditText) findViewById(R.id.ilee);
            cena = (EditText) findViewById(R.id.cen);
            podajcene=(TextView) findViewById(R.id.tvcena);
            czyliczz =(Switch) findViewById(R.id.swcena);
            tvspal100=(TextView) findViewById(R.id.txtspal100);
            tvkoszt=(TextView) findViewById(R.id.txtkosz);}



    public void switchclick(View v)
            {
                if(czyliczz.isChecked()) {
                    podajcene.setVisibility(View.VISIBLE);
                    cena.setVisibility(View.VISIBLE);
                }
                else
                {
                    podajcene.setVisibility(View.GONE);
                    cena.setVisibility(View.GONE);
                }
            }
    public void czysc(View v)
            {
                spalone.setText("");
                ilosc.setText("");
                cena.setText("");
                tvspal100.setText("");
                tvkoszt.setText("");
            }



    public void licz(View v)
            {


                double sred_spal;
                if(czyliczz.isChecked() && spalone.length()>0 && ilosc.length()>0 && cena.length()>0)
                {
                    double spalonee = Double.parseDouble(spalone.getText().toString());
                    double iloscc = Double.parseDouble(ilosc.getText().toString());
                    double cenaa = Double.parseDouble(cena.getText().toString());
                    double koszt;
                    sred_spal=spalonee/iloscc*100;
                    koszt=sred_spal*cenaa;
                    sred_spal=Math.round(sred_spal*100.00)/100.00;
                    koszt=Math.round(koszt*100.00)/100.00;
                    tvspal100.setText("Spalanie wynosi: "+sred_spal+" [l/100km] ");
                    tvkoszt.setText("Koszt przejechania 100 km wynosi: "+koszt+" [zł]");

                }
                else if(spalone.length()>0 && ilosc.length()>0)
                {
                    double spalonee = Double.parseDouble(spalone.getText().toString());
                    double iloscc = Double.parseDouble(ilosc.getText().toString());
                    sred_spal=spalonee/iloscc*100;
                    sred_spal=Math.round(sred_spal*100.00)/100.00;
                    tvspal100.setText("Spalanie wynosi: "+sred_spal+" [l/100km] ");//2
                }
                else {
                    Toast.makeText(getApplicationContext(), "Brak Danych!", Toast.LENGTH_LONG).show();
                }




            }



}
