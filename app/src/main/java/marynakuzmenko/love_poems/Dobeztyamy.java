package marynakuzmenko.love_poems;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Dobeztyamy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dobeztyamy);

        Intent intent = getIntent();
        TextView textView = (TextView) findViewById(R.id.dobeztyamy_text);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/PT_Sans-Web-Regular.ttf");
        textView.setTypeface(typeface);
        textView.setText("Хочеться намалювати.\n" +
                "Або хоча б розповісти.\n" +
                "Можна у межах кімнати.\n" +
                "Чи десь далеко за містом.\n" +
                "\n" +
                "Варто лише подивитись.\n" +
                "Хоч важливіше - побачить.\n" +
                "Крізь біло-лагідний ситець\n" +
                "Серце і рідне, й гаряче.\n" +
                "\n" +
                "Слухай, нам треба почути\n" +
                "Правду, заховану в тиші.\n" +
                "Хочу до болі у грудях,\n" +
                "Щоб народилися вірші.\n" +
                "\n" +
                "Або хоча би картини.\n" +
                "Бачиш, взаємність важлива\n" +
                "Ти все ще віриш у стіни?\n" +
                "Ні, їх нема.\n" +
                "Вір у диво.\n" +
                "\n" +
                "Справжність - вона непідробна.\n" +
                "І в почуттях все так само.\n" +
                "Знай, я на інше не згодна.\n" +
                "Лише до безтями...");
    }


    public void shareContent(View view) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "Лише до безтями\n" +"\n"+
                "Хочеться намалювати.\n" +
                "Або хоча б розповісти.\n" +
                "Можна у межах кімнати.\n" +
                "Чи десь далеко за містом.\n" +
                "\n" +
                "Варто лише подивитись.\n" +
                "Хоч важливіше - побачить.\n" +
                "Крізь біло-лагідний ситець\n" +
                "Серце і рідне, й гаряче.\n" +
                "\n" +
                "Слухай, нам треба почути\n" +
                "Правду, заховану в тиші.\n" +
                "Хочу до болі у грудях,\n" +
                "Щоб народилися вірші.\n" +
                "\n" +
                "Або хоча би картини.\n" +
                "Бачиш, взаємність важлива\n" +
                "Ти все ще віриш у стіни?\n" +
                "Ні, їх нема.\n" +
                "Вір у диво.\n" +
                "\n" +
                "Справжність - вона непідробна.\n" +
                "І в почуттях все так само.\n" +
                "Знай, я на інше не згодна.\n" +
                "Лише до безтями..." + "\n" +
                "Прочитати усю збірку віршів 'Лише до безтями' від Марини Кузьменко можна ось тут: https://play.google.com/store/apps/details?id=marynakuzmenko.love_poems " +
                "\n" + "\n Ще більше проектів Літературної Агенції живуть за адресою: http://agency.meri.kiev.ua :)" );
        sendIntent.setType("text/plain");

        startActivity(Intent.createChooser(sendIntent, getResources().getText(R.string.send_to)));
    }
}
