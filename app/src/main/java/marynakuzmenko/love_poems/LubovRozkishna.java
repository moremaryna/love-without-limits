package marynakuzmenko.love_poems;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LubovRozkishna extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lubov_rozkishna);

        Intent intent = getIntent();
        TextView textView = (TextView) findViewById(R.id.lubov_rozkishna_text);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/PT_Sans-Web-Regular.ttf");
        textView.setTypeface(typeface);
        textView.setText("Любов розкішна,\n" +
                "Коли щиро люблять двоє\n" +
                "Із смаком стиглих вишень\n" +
                "І любові\n" +
                "Не треба вглиб закопаних скарбів.\n" +
                "Якби лиш погляд\n" +
                "Очі люблячі зустрів…\n" +
                "\n" +
                "Коли є хтось \n" +
                "Насправді незбагненний,\n" +
                "Любов є всеосяжна і натхненна:\n" +
                "У сотнях муз.\n" +
                "У фразах і зворотах.\n" +
                "Якби лиш руки\n" +
                "Огорнув коханий дотик…\n" +
                "\n" +
                "Єдиний вимір щастя у житті.\n" +
                "І не достойні всі запаси золоті\n" +
                "Того, що робить бідного багатим…\n" +
                "І вносить в сірі будні колір свята.\n" +
                "\n" +
                "Адже воістину так є:\n" +
                "Любов свята\n" +
                "В далеких далях\n" +
                "І невіданих світах\n" +
                "Шукає кожен…\n" +
                "І радіє, хто знайшов\n" +
                "Любові сяйво\n" +
                "І невидимий покров.");
    }


    public void shareContent(View view) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "Любов розкішна\n" +"\n"+
                "Любов розкішна,\n" +
                "Коли щиро люблять двоє\n" +
                "Із смаком стиглих вишень\n" +
                "І любові\n" +
                "Не треба вглиб закопаних скарбів.\n" +
                "Якби лиш погляд\n" +
                "Очі люблячі зустрів…\n" +
                "\n" +
                "Коли є хтось \n" +
                        "Насправді незбагненний,\n" +
                "Любов є всеосяжна і натхненна:\n" +
                "У сотнях муз.\n" +
                "У фразах і зворотах.\n" +
                "Якби лиш руки\n" +
                "Огорнув коханий дотик…\n" +
                "\n" +
                "Єдиний вимір щастя у житті.\n" +
                "І не достойні всі запаси золоті\n" +
                "Того, що робить бідного багатим…\n" +
                "І вносить в сірі будні колір свята.\n" +
                "\n" +
                "Адже воістину так є:\n" +
                "Любов свята\n" +
                "В далеких далях\n" +
                        "І невіданих світах\n" +
                "Шукає кожен…\n" +
                "І радіє, хто знайшов\n" +
                "Любові сяйво\n" +
                        "І невидимий покров." + "\n" +
                "Прочитати усю збірку віршів 'Лише до безтями' від Марини Кузьменко можна ось тут: https://play.google.com/store/apps/details?id=marynakuzmenko.love_poems " +
                "\n" + "\n Ще більше проектів Літературної Агенції живуть за адресою: http://agency.meri.kiev.ua :)" );
        sendIntent.setType("text/plain");

        startActivity(Intent.createChooser(sendIntent, getResources().getText(R.string.send_to)));
    }
}
