package marynakuzmenko.love_poems;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ALubov extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alubov);

        Intent intent = getIntent();
        TextView textView = (TextView) findViewById(R.id.alubov_text);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/PT_Sans-Web-Regular.ttf");
        textView.setTypeface(typeface);
        textView.setText("Дві людини\n" +
                "І два серця,\n" +
                "Що у ритмі одному б'ється.\n" +
                "Так приємно,\n" +
                "Коли Він сміється.\n" +
                "\n" +
                "Є дві душі,\n" +
                "Геть всі негаразди\n" +
                "Може світ на мить пропасти\n" +
                "Так приємно,\n" +
                "Коли Вона в щасті.\n" +
                "\n" +
                "А любов така солодка\n" +
                "І неслухняна\n" +
                "Світ зникає на мить коротку\n" +
                "Реальність тане\n" +
                "І не треба слів тут\n" +
                "Хай світ зника\n" +
                "Любов для того, щоб гріти\n" +
                "Долоні у руках.\n" +
                "\n" +
                "Просто разом дві людини\n" +
                "Без пояснень, без причини\n" +
                "І в усьому вона лише винна.\n" +
                "Просто разом дві точки зору\n" +
                "Один одному опора\n" +
                "Je t'aime, Amore.");
    }

    public void shareContent(View view) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "А любов\n" +"\n"+
                "Дві людини\n" +
                "І два серця,\n" +
                "Що у ритмі одному б'ється.\n" +
                "Так приємно,\n" +
                "Коли Він сміється.\n" +
                "\n" +
                "Є дві душі,\n" +
                "Геть всі негаразди\n" +
                "Може світ на мить пропасти\n" +
                "Так приємно,\n" +
                "Коли Вона в щасті.\n" +
                "\n" +
                "А любов така солодка\n" +
                "І неслухняна\n" +
                "Світ зникає на мить коротку\n" +
                "Реальність тане і не треба слів тут\n" +
                "Хай світ зника\n" +
                "Любов для того, щоб гріти долоні у руках.\n" +
                "\n" +
                "Просто разом дві людини\n" +
                "Без пояснень, без причини\n" +
                "І в усьому вона лише винна.\n" +
                "Просто разом дві точки зору\n" +
                "Один одному опора\n" +
                "Je t'aime, Amore." + "\n" +
                "Прочитати усю збірку віршів 'Лише до безтями' від Марини Кузьменко можна ось тут: https://play.google.com/store/apps/details?id=marynakuzmenko.love_poems " +
                "\n" + "\n Ще більше проектів Літературної Агенції живуть за адресою: http://agency.meri.kiev.ua :)" );
        sendIntent.setType("text/plain");

        startActivity(Intent.createChooser(sendIntent, getResources().getText(R.string.send_to)));
    }
}
