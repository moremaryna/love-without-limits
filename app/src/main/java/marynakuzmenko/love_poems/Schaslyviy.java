package marynakuzmenko.love_poems;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Schaslyviy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schaslyviy);

        Intent intent = getIntent();
        TextView textView = (TextView) findViewById(R.id.schaslyviy_text);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/PT_Sans-Web-Regular.ttf");
        textView.setTypeface(typeface);
        textView.setText("Я знаю,\n" +
                "Ти щаслива відучора\n" +
                "Від світла\n" +
                "Подарованого ним.\n" +
                "\n" +
                "Ти чуєш?\n" +
                "Твої ангели говорять,\n" +
                "Що не страшна тобі тепер\n" +
                "Морозність зим.\n" +
                "Що ти сміятимешся\n" +
                "Поглядом весняним\n" +
                "Над хуртовинами.\n" +
                "\n" +
                "І вітер майже вщух...\n" +
                "Ти чуєш?\n" +
                "Вони кажуть\n" +
                "Ти - кохана\n" +
                "Навіть у заспівах\n" +
                "Холодних завірюх.\n" +
                "\n" +
                "Бо ти окрилена\n" +
                "І зіткана зі світла.\n" +
                "Він променів тобі\n" +
                "Не шкодував\n" +
                "Я бачу:\n" +
                "Відучора ти розквітла\n" +
                "Заграла в кольорах яскравих барв.\n" +
                "\n" +
                "І твої ангели\n" +
                "Також усе це знають.\n" +
                "Адже кохання -\n" +
                "То від них тобі дари.\n" +
                "\n" +
                "Тож бережи\n" +
                "Себе і своє сяйво\n" +
                "Які б не дули\n" +
                "У житті вітри.");

    }
    public void shareContent(View view) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "Щасливій відучора\n" +"\n"+
                "Я знаю,\n" +
                "Ти щаслива відучора\n" +
                "Від світла\n" +
                "Подарованого ним.\n" +
                "\n" +
                "Ти чуєш?\n" +
                "Твої ангели говорять,\n" +
                "Що не страшна тобі тепер\n" +
                "Морозність зим.\n" +
                "Що ти сміятимешся\n" +
                "Поглядом весняним\n" +
                "Над хуртовинами.\n" +
                "\n" +
                "І вітер майже вщух...\n" +
                "Ти чуєш?\n" +
                "Вони кажуть\n" +
                "Ти - кохана\n" +
                "Навіть у заспівах\n" +
                "Холодних завірюх.\n" +
                "\n" +
                "Бо ти окрилена\n" +
                "І зіткана зі світла.\n" +
                "Він променів тобі\n" +
                "Не шкодував\n" +
                "Я бачу:\n" +
                "Відучора ти розквітла\n" +
                "Заграла в кольорах\n" +
                "Яскравих барв.\n" +
                "\n" +
                "І твої ангели\n" +
                "Також усе це знають.\n" +
                "Адже кохання -\n" +
                "То від них тобі дари.\n" +
                "\n" +
                "Тож бережи\n" +
                "Себе і своє сяйво\n" +
                "Які б не дули\n" +
                "У житті вітри." + "\n" +
                "Прочитати усю збірку віршів 'Лише до безтями' від Марини Кузьменко можна ось тут: https://play.google.com/store/apps/details?id=marynakuzmenko.love_poems " +
                "\n" + "\n Ще більше проектів Літературної Агенції живуть за адресою: http://agency.meri.kiev.ua :)" );
        sendIntent.setType("text/plain");

        startActivity(Intent.createChooser(sendIntent, getResources().getText(R.string.send_to)));
    }
}
