package com.example.w.kalkulatorspalania;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class koszt extends AppCompatActivity {
    private EditText trasa;
    private EditText srednie;
    private EditText cena;
    private TextView tvkoszt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.koszt);
        Toast.makeText(getApplicationContext(),"Liczby wymierne podawaj po kropce!",Toast.LENGTH_LONG).show();
        trasa=(EditText) findViewById(R.id.trasa);
        srednie=(EditText) findViewById(R.id.srspal);
        cena=(EditText) findViewById(R.id.cenalitr);
        tvkoszt=(TextView) findViewById(R.id.txtkoszt);
    }
    public void czysc(View v)
    {
        trasa.setText("");
        srednie.setText("");
        cena.setText("");
        tvkoszt.setText("");

    }
    public void liczcene(View v)
    {
        double koszt;
        if(trasa.length()>0 && srednie.length()>0 && cena.length()>0)
        {
            double km=Double.parseDouble(trasa.getText().toString());
            double sr=Double.parseDouble(srednie.getText().toString());
            double pr=Double.parseDouble(cena.getText().toString());
            koszt=sr*(km/100)*pr;
            koszt=Math.round(koszt*100.00)/100.00;
            tvkoszt.setText("Koszt przejechania "+km+" km wynosi: "+koszt+" [zł]");

        }
        else Toast.makeText(getApplicationContext(),"Brak danych!",Toast.LENGTH_LONG).show();
    }
}

