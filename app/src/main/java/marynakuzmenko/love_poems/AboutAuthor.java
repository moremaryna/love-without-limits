package marynakuzmenko.love_poems;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class AboutAuthor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_author);


        Intent intent = getIntent();
        TextView textView = (TextView) findViewById(R.id.proavtorku_text);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/PT_Sans-Web-Regular.ttf");
        textView.setTypeface(typeface);
        textView.setText("Нарешті знайшлося місце для прози ;)");
    }


    public void sendMessage(View view) {
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"literary.agency.mk@gmail.com"});
        i.putExtra(Intent.EXTRA_SUBJECT, "Щодо мобільного додатку хочу сказати таке");
        i.putExtra(Intent.EXTRA_TEXT   , "Привіт ;)");
        try {
            startActivity(Intent.createChooser(i, "Надіслати електронного листа"));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(AboutAuthor.this, "Шкода, але у вас немає жодного додатка для відправки електронних листів :(.", Toast.LENGTH_SHORT).show();
        }
    }

    public void goWww (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.agency.meri.kiev.ua"));
        startActivity(browserIntent);
    }
}
