package com.example.conversordolar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText edtValorDolar, edtQuantDolar;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtValorDolar = findViewById(R.id.edtValorDolar);
        edtQuantDolar = findViewById(R.id.edtQuantDolar);

        txtResultado = findViewById(R.id.txtResultado);

    }
    public void calcular(View view){

        double quantDolar = Double.parseDouble(edtQuantDolar.getText().toString());
        double ValorDolar = Double.parseDouble(edtValorDolar.getText().toString());

        double totalReais = ValorDolar * quantDolar;

        DecimalFormat decimal = new DecimalFormat("0.00");
        String ValorFormatado = decimal.format(totalReais);

        txtResultado.setText("R$: " + ValorFormatado);

    }
}