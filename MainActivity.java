package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText Angka1, Angka2, Operasi;
    Button button;
    TextView Texthasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Angka1 = findViewById(R.id.Angka1);
        Angka2 = findViewById(R.id.Angka2);
        Operasi = findViewById(R.id.Operasi);
        button = findViewById(R.id.button);
        Texthasil  = findViewById(R.id.Texthasil);
    }

    public void Hasil (View a) {
        double Hasil ;
        int inputan_1 = Integer.parseInt(Angka1.getText().toString());
        int inputan_2 = Integer.parseInt(Angka2.getText().toString());
        String Aritmatika = Operasi.getText().toString();
        if (Aritmatika.equals("+")) {
            Hasil = inputan_1 + inputan_2;
            Texthasil.setText(String.valueOf(Hasil));
        } else if (Aritmatika.equals("-")) {
            Hasil = inputan_1 - inputan_2;
            Texthasil.setText(String.valueOf(Hasil));
        } else if (Aritmatika.equals("*")) {
            Hasil = inputan_1 * inputan_2;
            Texthasil.setText(String.valueOf(Hasil));
        } else if (Aritmatika.equals("/")) {
            Hasil = inputan_1 / inputan_2;
            Texthasil.setText(String.valueOf(Hasil));
        } else {
            Texthasil.setText("Operasi Aritmatika Salah");
        }
    }
}