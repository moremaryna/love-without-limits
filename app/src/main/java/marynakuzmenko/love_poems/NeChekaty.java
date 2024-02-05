package marynakuzmenko.love_poems;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class NeChekaty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ne_chekaty);

        Intent intent = getIntent();
        TextView textView = (TextView) findViewById(R.id.ne_chekaty_text);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/PT_Sans-Web-Regular.ttf");
        textView.setTypeface(typeface);
        textView.setText("Я не можу тебе не чекати.\n" +
                "І мені ти хоч вір, хоч не вір.\n" +
                "Та реальність моя безпорадна.\n" +
                "Як мисливцями загнаний звір.\n" +
                "\n" +
                "Що тобою щокраплі радіє.\n" +
                "І без тебе клітинно вмира.\n" +
                "Я з тобою в душі молодію,\n" +
                "А без тебе як вічність стара.\n" +
                "\n" +
                "Я пригадую спогади.\n" +
                "Тішусь.\n" +
                "І кидаюсь під потяги мрій.\n" +
                "А тоді плачу строфами віршів\n" +
                "По поверхні безмежно прямій.\n" +
                "\n" +
                "І чекаю.\n" +
                "Ходжу і чекаю,\n" +
                "Щоб почути як шепче замок,\n" +
                "Що пройшов ти.\n" +
                "Крізь темінь безкраю.\n" +
                "Визволяти мене від думок…");
    }


    public void shareContent(View view) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "Не чекати\n" +"\n"+
                "Я не можу тебе не чекати.\n" +
                "І мені ти хоч вір, хоч не вір.\n" +
                "Та реальність моя безпорадна.\n" +
                "Як мисливцями загнаний звір.\n" +
                "\n" +
                "Що тобою щокраплі радіє.\n" +
                "І без тебе клітинно вмира.\n" +
                "Я з тобою в душі молодію,\n" +
                "А без тебе як вічність стара.\n" +
                "\n" +
                "Я пригадую спогади.\n" +
                "Тішусь.\n" +
                "І кидаюсь під потяги мрій.\n" +
                "А тоді плачу строфами віршів\n" +
                "По поверхні безмежно прямій.\n" +
                "\n" +
                "І чекаю.\n" +
                "Ходжу і чекаю,\n" +
                "Щоб почути як шепче замок,\n" +
                "Що пройшов ти.\n" +
                "Крізь темінь безкраю.\n" +
                "Визволяти мене від думок…" + "\n" +
                "Прочитати усю збірку віршів 'Лише до безтями' від Марини Кузьменко можна ось тут: https://play.google.com/store/apps/details?id=marynakuzmenko.love_poems " +
                "\n" + "\n Ще більше проектів Літературної Агенції живуть за адресою: http://agency.meri.kiev.ua :)" );
        sendIntent.setType("text/plain");

        startActivity(Intent.createChooser(sendIntent, getResources().getText(R.string.send_to)));
    }
}
