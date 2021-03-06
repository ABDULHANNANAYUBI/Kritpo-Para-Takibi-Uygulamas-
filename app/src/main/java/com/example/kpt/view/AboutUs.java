package com.example.kpt.view;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.kpt.R;

public class AboutUs extends AppCompatActivity {

    TextView aboutUs, AboutUsDetail;
    String language;
    SharedPreferences sharedPreferences;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        aboutUs = findViewById(R.id.AboutUs);
        AboutUsDetail = findViewById(R.id.aboutUsDetails);
        button = findViewById(R.id.button);

        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#03DAC6"));
        actionBar.setBackgroundDrawable(colorDrawable);
        button.setBackgroundColor(Color.parseColor("#03DAC6"));

        sharedPreferences = this.getSharedPreferences("com.example.kpt.view", Context.MODE_PRIVATE);
        language = sharedPreferences.getString("LanguageValue","English");

        if(language.equals("English")){
            aboutUs.setText("About Us");
            AboutUsDetail.setText("The general aim of our project is to easily track the price of cryptocurrencies by users.\n" +
                    "to ensure that it is done. Apart from the basic price tracking feature in our application, the application\n" +
                    "Different currency types, language preference, price renewal period with the settings tab in the\n" +
                    "and notification preference options will be presented to the user. However, the application\n" +
                    "In order to use it, the user will need to register with his e-mail address. to user's preference\n" +
                    "When the crypto money chosen by the user reaches the price determined by the user from the e-mail address entered according to\n" +
                    "e-mail will be sent. You can also enter your username, surname and e-mail from the profile tab.\n" +
                    "will be able to view and log out of their account.");
            button.setText("Back");

        }else{
            aboutUs.setText("Hakk??m??zda");
            AboutUsDetail.setText("Projemizin genel amac?? kripto paralar??n fiyat takibinin kullan??c??lar tararf??ndan kolay bir ??ekilde \n" +
                    "yap??lmas??n?? sa??lamakt??r. Uygulamam??zda temel fiyat takibi ??zelli??i d??????nda, uygulama \n" +
                    "i??erisinde bulunacak ayarlar sekmesi ile farkl?? d??viz cinsleri, dil tercihi, fiyat yenileme s??resi\n" +
                    "ve bildirim tercihi se??enekleri kullan??c??ya sunulacakt??r. Bununla beraber uygulamay?? \n" +
                    "kullanabilmek i??in kullan??c??n mail adresi ile kay??t olmas?? gerekecektir. Kullan??c??n??n tercihine \n" +
                    "g??re girdi??i mail adresinden kullanc??n??n belirlemi?? oldu??u f??yata se??ti??i kripto para ula????nca \n" +
                    "mail g??nderilecektir. Ayr??ca profil sekmesinden kullan??c?? ad??n??, soyad??n?? ve mailini \n" +
                    "g??r??nt??leyebilecek ve hesab??ndan ????k???? yapabilecektir.");
            button.setText("Geri D??n");
        }


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
