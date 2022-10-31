package com.example.pendaftaran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText etNamaLengkap,etNomorPendaftaraan;
    Spinner spJalurPendaftaraan;
    CheckBox cbKonfirmasiDaftar;
    Button btnDaftar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("UTS Robet");
        etNamaLengkap = findViewById(R.id.et_nama_lengkap);
        etNomorPendaftaraan = findViewById(R.id.et_nomor_pendaftaraan);
        spJalurPendaftaraan = findViewById(R.id.sp_jalur_pendaftaran);
        cbKonfirmasiDaftar = findViewById(R.id.cb_konfirmasi_dafar);
        btnDaftar = findViewById(R.id.btn_daftar);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = etNamaLengkap.getText().toString();
                String nomorPendaftaran = etNomorPendaftaraan.getText().toString();
                String jalurPendaftaraan = spJalurPendaftaraan.getSelectedItem().toString();
                Boolean konfirmasipendaftaraan = cbKonfirmasiDaftar.isChecked();


                if (nama.trim().equals(""))
                {
                    etNamaLengkap.setError("Nama Harus Di isi!");

                }else if(nomorPendaftaran.trim().equals("")){
                    etNomorPendaftaraan.setError("Nomor Pendaftaran Harus Di isi");

                }else if(jalurPendaftaraan.trim().equals("Jalur Pendaftaran")){
                    Toast.makeText(MainActivity.this, "Jalur Pendaftaran Harus Dilih!", Toast.LENGTH_SHORT).show();

                }else if(konfirmasipendaftaraan == Boolean.FALSE){
                    Toast.makeText(MainActivity.this, "Konfirmasi Daftar Harus Dicentang!", Toast.LENGTH_SHORT).show();
                }

                else{
                    Intent pindah = new Intent(MainActivity.this, SecondActivity.class);
                    pindah.putExtra("xNama",nama);
                    pindah.putExtra("xNomorPendaftaran",nomorPendaftaran);
                    pindah.putExtra("xJalurPendaftaran",jalurPendaftaraan);
                    startActivity(pindah);
                }


            }
        });
    }
}