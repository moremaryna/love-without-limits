package marynakuzmenko.love_poems;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ProPlatonichne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro_platonichne);

        Intent intent = getIntent();
        TextView textView = (TextView) findViewById(R.id.proplatonichne_text);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/PT_Sans-Web-Regular.ttf");
        textView.setTypeface(typeface);
        textView.setText("Твоя нетиповість\n" +
                "Мене провокує на роздуми.\n" +
                "Я хочу зректися їх. Годі.\n" +
                "Мій світе, спинись.\n" +
                "\n" +
                "Ти вмієш писати красивими довгими прозами.\n" +
                "І, може, ми навіть були\n" +
                "Одним цілим колись.\n" +
                "\n" +
                "В житті у минулому.\n" +
                "Може, були ми обвінчані.\n" +
                "Бо надто ти мій.\n" +
                "Тільки вголос мене не читай.\n" +
                "\n" +
                "Ти ж знаєш, що нам\n" +
                "Не потрібні словесні освідчення.\n" +
                "Краще заваримо чай.\n" +
                "\n" +
                "На двох,\n" +
                "Щоб у присмаку\n" +
                "Нам дуже цінної міцності\n" +
                "Ми знов у розмовах\n" +
                "Безмежились в просторах тем.\n" +
                "\n" +
                "Загладивши гострі кути\n" +
                "Наших все-таки різностей.\n" +
                "Поглядами навзаєм.\n" );
    }



    public void shareContent(View view) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "Про платонічне\n" +"\n"+
                "Твоя нетиповість\n" +
                        "Мене провокує на роздуми.\n" +
                "Я хочу зректися їх. Годі.\n" +
                "Мій світе, спинись.\n" +
                "\n" +
                "Ти вмієш писати красивими довгими прозами.\n" +
                "І, може, ми навіть були\n" +
                "Одним цілим колись.\n" +
                "\n" +
                "В житті у минулому.\n" +
                "Може, були ми обвінчані.\n" +
                "Бо надто ти мій.\n" +
                "Тільки вголос мене не читай.\n" +
                "\n" +
                "Ти ж знаєш, що нам\n" +
                "Не потрібні словесні освідчення.\n" +
                "Краще заваримо чай.\n" +
                "\n" +
                "На двох,\n" +
                "Щоб у присмаку\n" +
                "Нам дуже цінної міцності\n" +
                "Ми знов у розмовах\n" +
                "Безмежились в просторах тем.\n" +
                "\n" +
                "Загладивши гострі кути\n" +
                "Наших все-таки різностей.\n" +
                "Поглядами навзаєм.\n" + "\n" +
                "Прочитати усю збірку віршів 'Лише до безтями' від Марини Кузьменко можна ось тут: https://play.google.com/store/apps/details?id=marynakuzmenko.love_poems " +
                "\n" + "\n Ще більше проектів Літературної Агенції живуть за адресою: http://agency.meri.kiev.ua :)" );
        sendIntent.setType("text/plain");

        startActivity(Intent.createChooser(sendIntent, getResources().getText(R.string.send_to)));
    }
}
