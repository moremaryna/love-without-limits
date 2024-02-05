package marynakuzmenko.love_poems;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class YaTebe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ya_tebe);

        Intent intent = getIntent();
        TextView textView = (TextView) findViewById(R.id.yatebe_text);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/PT_Sans-Web-Regular.ttf");
        textView.setTypeface(typeface);
        textView.setText("Я писала ці слова на водограях,\n" +
                "Віддавала все хмільній воді.\n" +
                "І отам, де небо чисте і безкрає,\n" +
                "Я писала хмарами тобі.\n" +
                "\n" +
                "Я піском в пустелі, в буревії,\n" +
                "А вночі під золотом зірок\n" +
                "Не утрималась. Окрилено в надії\n" +
                "Написала свій простий рядок...\n" +
                "\n" +
                "Так, я грала музикою в нотах\n" +
                "І спалахувала в сотнях різних гам.\n" +
                "Ми стояли поряд і навпроти.\n" +
                "І, не давши волю всім словам,\n" +
                "\n" +
                "Я у погляді з-під вій\n" +
                "Вугільно чорних\n" +
                "Мовчки світ до ніг тобі стелю.\n" +
                "А собі я залишу бездонне море,\n" +
                "Щоб сказати: «Я тебе люблю…»");
    }

    public void shareContent(View view) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "Я тебе\n" +"\n"+
                "Я писала ці слова на водограях,\n" +
                "Віддавала все хмільній воді.\n" +
                "І отам, де небо чисте і безкрає,\n" +
                "Я писала хмарами тобі.\n" +
                "\n" +
                "Я піском в пустелі, в буревії,\n" +
                "А вночі під золотом зірок\n" +
                "Не утрималась. Окрилено в надії\n" +
                "Написала свій простий рядок...\n" +
                "\n" +
                "Так, я грала музикою в нотах\n" +
                "І спалахувала в сотнях різних гам.\n" +
                "Ми стояли поряд і навпроти.\n" +
                "І, не давши волю всім словам,\n" +
                "\n" +
                "Я у погляді з-під вій\n" +
                "Вугільно чорних\n" +
                "Мовчки світ до ніг тобі стелю.\n" +
                "А собі я залишу бездонне море,\n" +
                "Щоб сказати: «Я тебе люблю…»" + "\n" +
                "Прочитати усю збірку віршів 'Лише до безтями' від Марини Кузьменко можна ось тут: https://play.google.com/store/apps/details?id=marynakuzmenko.love_poems " +
                "\n" + "\n Ще більше проектів Літературної Агенції живуть за адресою: http://agency.meri.kiev.ua :)"  );
        sendIntent.setType("text/plain");

        startActivity(Intent.createChooser(sendIntent, getResources().getText(R.string.send_to)));
    }

}
