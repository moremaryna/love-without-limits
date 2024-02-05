package marynakuzmenko.love_poems;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Kazhit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kazhit);

        Intent intent = getIntent();
        TextView textView = (TextView) findViewById(R.id.kazhit_text);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/PT_Sans-Web-Regular.ttf");
        textView.setTypeface(typeface);
        textView.setText("Кажіть, що любите.\n" +
                "І не мовчіть про щире.\n" +
                "Про те, що гріє ізсередини в душі.\n" +
                "\n" +
                "Не треба мовчки...\n" +
                "Бо, хто любить до безміри,\n" +
                "Не потребує ні сонетів, ні віршів.\n" +
                "\n" +
                "Лиш ті слова, навіки заповітні.\n" +
                "І те, від чого яскравіша навкруги.\n" +
                "\n" +
                "Кажіть, що любите.\n" +
                "Адже думок наших не видно\n" +
                "Для тих, хто справді серцю дорогий\n" +
                "Не пошкодуйте, не змовчіть,\n" +
                "Бо не пробачать\n" +
                "На небі те,\n" +
                "Що на землі в нас не збулось.\n" +
                "\n" +
                "Адже слова у нас в житті\n" +
                "Багато значать.\n" +
                "Просто в цю мить\n" +
                "Скажіть, що любите когось…");
    }
    public void shareContent(View view) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "Кажіть, що любите\n" +"\n"+
                "Кажіть, що любите.\n" +
                "І не мовчіть про щире.\n" +
                "Про те, що гріє ізсередини в душі.\n" +
                "\n" +
                "Не треба мовчки...\n" +
                "Бо, хто любить до безміри,\n" +
                "Не потребує ні сонетів, ні віршів.\n" +
                "\n" +
                "Лиш ті слова, навіки заповітні.\n" +
                "І те, від чого яскравіша навкруги.\n" +
                "\n" +
                "Кажіть, що любите.\n" +
                "Адже думок наших не видно\n" +
                "Для тих, хто справді серцю дорогий\n" +
                "Не пошкодуйте, не змовчіть,\n" +
                "Бо не пробачать\n" +
                "На небі те,\n" +
                "Що на землі в нас не збулось.\n" +
                "\n" +
                "Адже слова у нас в житті\n" +
                "Багато значать.\n" +
                "Просто в цю мить\n" +
                "Скажіть, що любите когось…" + "\n" +
                "Прочитати усю збірку віршів 'Лише до безтями' від Марини Кузьменко можна ось тут: https://play.google.com/store/apps/details?id=marynakuzmenko.love_poems " +
                "\n" + "\n Ще більше проектів Літературної Агенції живуть за адресою: http://agency.meri.kiev.ua :)" );
        sendIntent.setType("text/plain");

        startActivity(Intent.createChooser(sendIntent, getResources().getText(R.string.send_to)));
    }
}
