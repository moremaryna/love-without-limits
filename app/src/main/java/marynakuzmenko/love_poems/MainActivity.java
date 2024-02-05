package marynakuzmenko.love_poems;


import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/PT_Sans-Web-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }


    public void onClick(View view) {
        Intent intent = null;

        switch (view.getId()) {
            case R.id.yakbytyznav:
                intent = new Intent(this, YakbyTyZnav.class);
                break;
            case R.id.imageYakbytyznav:
                intent = new Intent(this, YakbyTyZnav.class);
                break;
            case R.id.yakbytyznav_title:
                intent = new Intent(this, YakbyTyZnav.class);
                break;
            case R.id.kazkazhittya:
                intent = new Intent(this, Kazka.class);
                break;
            case R.id.kazkazhittya_title:
                intent = new Intent(this, Kazka.class);
                break;
            case R.id.imageKazka:
                intent = new Intent(this, Kazka.class);
                break;
            case R.id.kazhit:
                intent = new Intent(this, Kazhit.class);
                break;
            case R.id.imageKazhit:
                intent = new Intent(this, Kazhit.class);
                break;
            case R.id.kazhit_title:
                intent = new Intent(this, Kazhit.class);
                break;
            case R.id.dobeztyamy:
                intent = new Intent(this, Dobeztyamy.class);
                break;
            case R.id.imageDobeztyamy:
                intent = new Intent(this, Dobeztyamy.class);
                break;
            case R.id.dobeztyamy_title:
                intent = new Intent(this, Dobeztyamy.class);
                break;
            case R.id.yatebelublu:
                intent = new Intent(this, YaTebe.class);
                break;
            case R.id.imageYatebe:
                intent = new Intent(this, YaTebe.class);
                break;
            case R.id.yatebe_title:
                intent = new Intent(this, YaTebe.class);
                break;
            case R.id.nemozhu:
                intent = new Intent(this, NeChekaty.class);
                break;
            case R.id.imageNemozhu:
                intent = new Intent(this, NeChekaty.class);
                break;
            case R.id.nemozhu_title:
                intent = new Intent(this, NeChekaty.class);
                break;
            case R.id.schaslyviy:
                intent = new Intent(this, Schaslyviy.class);
                break;
            case R.id.imageSchaslyviy:
                intent = new Intent(this, Schaslyviy.class);
                break;
            case R.id.schaslyviy_title:
                intent = new Intent(this, Schaslyviy.class);
                break;
            case R.id.rozkishna:
                intent = new Intent(this, LubovRozkishna.class);
                break;
            case R.id.imageLubovRozkishna:
                intent = new Intent(this, LubovRozkishna.class);
                break;
            case R.id.lubovrozkishna_title:
                intent = new Intent(this, LubovRozkishna.class);
                break;
            case R.id.alubov:
                intent = new Intent(this, ALubov.class);
                break;
            case R.id.imageAlubov:
                intent = new Intent(this, ALubov.class);
                break;
            case R.id.alubov_title:
                intent = new Intent(this, ALubov.class);
                break;
            case R.id.akrovirsh:
                intent = new Intent(this, Akrovirsh.class);
                break;
            case R.id.imageAkrovirsh:
                intent = new Intent(this, Akrovirsh.class);
                break;
            case R.id.akrovirsh_text:
                intent = new Intent(this, Akrovirsh.class);
                break;
            case R.id.pro_platonichne:
                intent = new Intent(this, ProPlatonichne.class);
                break;
            case R.id.imageProplatonichne:
                intent = new Intent(this, ProPlatonichne.class);
                break;
            case R.id.pro_platonichne_title:
                intent = new Intent(this, ProPlatonichne.class);
                break;
            case R.id.schastu_zhittevoi_oseni:
                intent = new Intent(this, SchastuZhittevoiOseni.class);
                break;
            case R.id.imageSchastuZhittevoiOseni:
                intent = new Intent(this, SchastuZhittevoiOseni.class);
                break;
            case R.id.schastu_zhittevoi_oseni_title:
                intent = new Intent(this, SchastuZhittevoiOseni.class);
                break;
            case R.id.about_author:
                intent = new Intent(this, AboutAuthor.class);
                break;
            case R.id.imageProAvtorku:
                intent = new Intent(this, AboutAuthor.class);
                break;
            case R.id.proavtorku_title:
                intent = new Intent(this, AboutAuthor.class);
        }

        startActivity(intent);

    }
}