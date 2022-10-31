package com.example.pendaftaran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tampilNamaLengkap, tampilNomorPendaftaran, tampilJalurPendaftaran;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tampilNamaLengkap =findViewById(R.id.tv_tampil_nama_lengkap);
        tampilNomorPendaftaran = findViewById(R.id.tv_tampil_nomor_daftar);
        tampilJalurPendaftaran = findViewById(R.id.tv_tampil_jalur_pendaftaran);

        Intent terima = getIntent();
        String yNama = terima.getStringExtra("xNama");
        tampilNamaLengkap.setText(yNama);
        String yNomor = terima.getStringExtra("xNomorPendaftaran");
        tampilNomorPendaftaran.setText(yNomor);
        String yJalur = terima.getStringExtra("xJalurPendaftaran");
        tampilJalurPendaftaran.setText(yJalur);
    }
}