package marynakuzmenko.love_poems;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Akrovirsh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akrovirsh);


        Intent intent = getIntent();
        TextView textView = (TextView) findViewById(R.id.akrovirsh_text);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/PT_Sans-Web-Regular.ttf");
        textView.setTypeface(typeface);
        textView.setText("Ласкава, всеосяжна, гарна\n" +
                "Юнацько-дивна і безхмарна\n" +
                "Близька, тілесна і відкрита\n" +
                "Оспівана... Талановита\n" +
                "Вражаюча, стрімка, крилата\n" +
                "Легкодоступна і завзята,\n" +
                "Юна, закохано-глибока\n" +
                "Безмежна, вільна, ясноока\n" +
                "Осмислена, складна, корисна,\n" +
                "Велика, підсвідома... Різна.");
    }
    public void shareContent(View view) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "Акровірш про Л.\n" +"\n"+
                "Ласкава, всеосяжна, гарна\n" +
                "Юнацько-дивна і безхмарна\n" +
                "Близька, тілесна і відкрита\n" +
                "Оспівана... Талановита\n" +
                "Вражаюча, стрімка, крилата\n" +
                "Легкодоступна і завзята,\n" +
                "Юна, закохано-глибока\n" +
                "Безмежна, вільна, ясноока\n" +
                "Осмислена, складна, корисна,\n" +
                "Велика, підсвідома... Різна." + "\n" +
                "Прочитати усю збірку віршів 'Лише до безтями' від Марини Кузьменко можна ось тут: https://play.google.com/store/apps/details?id=marynakuzmenko.love_poems " +
                "\n" + "\n Ще більше проектів Літературної Агенції живуть за адресою: http://agency.meri.kiev.ua :)" );
        sendIntent.setType("text/plain");

        startActivity(Intent.createChooser(sendIntent, getResources().getText(R.string.send_to)));
    }
}
