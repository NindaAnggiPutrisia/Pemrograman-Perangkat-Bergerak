package com.example.biodataku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.net.Uri.fromParts;

public class MainActivity extends AppCompatActivity {

    Button btnhp, btnalamat, btnemail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnhp = findViewById(R.id.btn_nohp);
        btnhp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nomor = "081218586946";
                Intent memanggil = new Intent(Intent.ACTION_DIAL);
                memanggil.setData(fromParts("tel", nomor, null));
                startActivity(memanggil);
            }
        });

        btnalamat = findViewById(R.id.btn_alamat);
        btnalamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent views = new Intent(Intent.ACTION_VIEW);
                views.setData(Uri.parse("https://www.google.com/maps/place/Rembang,+Kec.+Rembang,+Kabupaten+Rembang,+Jawa+Tengah/@-6.7042633,111.3521668,48m/data=!3m1!1e3!4m5!3m4!1s0x2e7724380a162e63:0xbc8117e0521e1119!8m2!3d-6.7093739!4d111.3413151"));
                startActivity(views);
            }
        });

        btnemail = findViewById(R.id.btn_email);
        btnemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = "111201912113@mhs.dinus.ac.id";
                Intent panggil = new Intent(Intent.ACTION_SENDTO);
                panggil.setData(fromParts("mailto", email, null));
                startActivity(panggil);
            }
        });
    }
}