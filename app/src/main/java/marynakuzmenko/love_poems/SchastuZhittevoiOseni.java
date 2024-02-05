package marynakuzmenko.love_poems;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SchastuZhittevoiOseni extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schastu_zhittevoi_oseni);
        Intent intent = getIntent();
        TextView textView = (TextView) findViewById(R.id.schastu_text);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/PT_Sans-Web-Regular.ttf");
        textView.setTypeface(typeface);
        textView.setText("І попливли роки,\n" +
                "Як листя по воді.\n" +
                "Життя пройшло\n" +
                "У невловимій круговерті.\n" +
                "\n" +
                "Ось тут ми вчора ще:\n" +
                "Наївні й молоді,\n" +
                "А вже сьогодні\n" +
                "По-осінньому відверті.\n" +
                "\n" +
                "І може не тебе\n" +
                "Обрала б я.\n" +
                "Та погляд твій\n" +
                "І рідний, і глибокий.\n" +
                "Сказав, що вимір твого щастя\n" +
                "Це - сім'я:\n" +
                "Я переконувалась в тому\n" +
                "Рік за роком.\n" +
                "\n" +
                "Волосся кольору каштанів\n" +
                "В одну мить\n" +
                "Покрив легкий\n" +
                "Напівпрозорий іній:\n" +
                "То холоди,\n" +
                "То вітер налетить...\n" +
                "Я рятувалася\n" +
                "Теплом твоїх обіймів.\n" +
                "\n" +
                "Невпинний час.\n" +
                "Він і глядач,\n" +
                "І всім суддя...\n" +
                "Нас огорнули вже тумани\n" +
                "Зовсім сиві.\n" +
                "Замерехтіло фотокартками життя\n" +
                "А ми відверті.\n" +
                "Й по-осінньому щасливі.\n");
    }

    public void shareContent(View view) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "Щастю життєвої осені\n" +"\n"+
                "І попливли роки,\n" +
                "Як листя по воді.\n" +
                "Життя пройшло\n" +
                "У невловимій круговерті.\n" +
                "\n" +
                "Ось тут ми вчора ще:\n" +
                "Наївні й молоді,\n" +
                "А вже сьогодні\n" +
                "По-осінньому відверті.\n" +
                "\n" +
                "І може не тебе\n" +
                "Обрала б я.\n" +
                "Та погляд твій\n" +
                "І рідний, і глибокий.\n" +
                "Сказав, що вимір твого щастя\n" +
                "Це - сім'я:\n" +
                "Я переконувалась в тому\n" +
                "Рік за роком.\n" +
                "\n" +
                "Волосся кольору каштанів\n" +
                "В одну мить\n" +
                "Покрив легкий\n" +
                "Напівпрозорий іній:\n" +
                "То холоди,\n" +
                "То вітер налетить...\n" +
                "Я рятувалася\n" +
                "Теплом твоїх обіймів.\n" +
                "\n" +
                "Невпинний час.\n" +
                "Він і глядач,\n" +
                "І всім суддя...\n" +
                "Нас огорнули вже тумани\n" +
                "Зовсім сиві.\n" +
                "Замерехтіло фотокартками життя\n" +
                "А ми відверті.\n" +
                "Й по-осінньому щасливі.\n" + "\n" +
                "Прочитати усю збірку віршів 'Лише до безтями' від Марини Кузьменко можна ось тут: https://play.google.com/store/apps/details?id=marynakuzmenko.love_poems " +
                "\n" + "\n Ще більше проектів Літературної Агенції живуть за адресою: http://agency.meri.kiev.ua :)" );
        sendIntent.setType("text/plain");

        startActivity(Intent.createChooser(sendIntent, getResources().getText(R.string.send_to)));
    }
}