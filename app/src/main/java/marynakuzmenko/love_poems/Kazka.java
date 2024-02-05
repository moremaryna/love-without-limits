package marynakuzmenko.love_poems;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.description;
import static android.R.id.message;

public class Kazka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kazka);

        Intent intent = getIntent();
        TextView textView = (TextView) findViewById(R.id.kazkazhittya_text);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/PT_Sans-Web-Regular.ttf");
        textView.setTypeface(typeface);
        textView.setText("...А вранці Її вже чекала кава.\n" +
                "І прохолоду вранішніх годин\n" +
                "Розвіяв поцілунок.\n" +
                "Так ласкаво\n" +
                "Умів Її будити тільки Він.\n" +
                "\n" +
                "...Вона була помітна всім відразу,\n" +
                "Хоча і не красуня. Але втім\n" +
                "Красу робили не якісь прикраси,\n" +
                "А щастя, подароване лиш Ним...\n" +
                "\n" +
                "...Та й Він - на перший погляд\n" +
                "Все буденно:\n" +
                "В житті нестача часу, ніжних слів,\n" +
                "Але ж в Його очах була натхненна\n" +
                "Її любов. Він з Нею разом жив.\n" +
                "\n" +
                "...Ну а Вона жила лиш для одного\n" +
                "На це не вимагалося причин,\n" +
                "Адже Вона була в житті у Нього.\n" +
                "Ну, а у Неї у житті був Він.\n");
    }


    public void shareContent(View view) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "Казка життя\n" +"\n"+
                "...А вранці Її вже чекала кава.\n" +
                "І прохолоду вранішніх годин\n" +
                "Розвіяв поцілунок.\n" +
                "Так ласкаво\n" +
                "Умів Її будити тільки Він.\n" +
                "\n" +
                "...Вона була помітна всім відразу,\n" +
                "Хоча і не красуня. Але втім\n" +
                "Красу робили не якісь прикраси,\n" +
                "А щастя, подароване лиш Ним...\n" +
                "\n" +
                "...Та й Він - на перший погляд\n" +
                "Все буденно:\n" +
                "В житті нестача часу, ніжних слів,\n" +
                "Але ж в Його очах була натхненна\n" +
                "Її любов. Він з Нею разом жив.\n" +
                "\n" +
                "...Ну а Вона жила лиш для одного\n" +
                "На це не вимагалося причин,\n" +
                "Адже Вона була в житті у Нього.\n" +
                "Ну, а у Неї у житті був Він.\n" + "\n" +
                "Прочитати усю збірку віршів 'Лише до безтями' від Марини Кузьменко можна ось тут: https://play.google.com/store/apps/details?id=marynakuzmenko.love_poems " +
                "\n" + "\n Ще більше проектів Літературної Агенції живуть за адресою: http://agency.meri.kiev.ua :)" );
        sendIntent.setType("text/plain");

        startActivity(Intent.createChooser(sendIntent, getResources().getText(R.string.send_to)));
    }
}
