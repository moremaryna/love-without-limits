package marynakuzmenko.love_poems;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;


public class YakbyTyZnav extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yakby_ty_znav);


                    Intent intent = getIntent();
                    TextView textView = (TextView) findViewById(R.id.yakbytyznav_text);
                    Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/PT_Sans-Web-Regular.ttf");
                    textView.setTypeface(typeface);
                    textView.setText("Якби ти знав\n" +
                            "Як мріється під вечір\n" +
                            "Під сині стіни.\n" +
                            "І вітри з віконних рам,\n" +
                            "Коли раптово\n" +
                            "І, як завжди, недоречно\n" +
                            "Ліхтар розігрує\n" +
                            "Переді мною сцени драм.\n" +
                            "\n" +
                            "Якби ти знав\n" +
                            "Про несказанну ніжність,\n" +
                            "Яка за мене більша у стократ.\n" +
                            "Я загубилась поміж довгих тижнів\n" +
                            "І у системі\n" +
                            "Знаних всім координат…\n" +
                            "\n" +
                            "Якби ти знав\n" +
                            "Скільки в житті моєму\n" +
                            "З тобою є пов’язаних подій.\n" +
                            "\n" +
                            "Якби ти знав…\n" +
                            "Ти б точно не дозволив\n" +
                            "Бути в цю мить\n" +
                            "Між стін і рам\n" +
                            "Одній.\n");

    }
    public void shareContent(View view) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "Якби ти знав\n" +"\n"+
                "Якби ти знав\n" +
                "Як мріється під вечір\n" +
                "Під сині стіни.\n" +
                "І вітри з віконних рам,\n" +
                "Коли раптово\n" +
                "І, як завжди, недоречно\n" +
                "Ліхтар розігрує\n" +
                "Переді мною сцени драм.\n" +
                "\n" +
                "Якби ти знав\n" +
                "Про несказанну ніжність,\n" +
                "Яка за мене більша у стократ.\n" +
                "Я загубилась поміж довгих тижнів\n" +
                "І у системі\n" +
                "Знаних всім координат…\n" +
                "\n" +
                "Якби ти знав\n" +
                "Скільки в житті моєму\n" +
                "З тобою є пов’язаних подій.\n" +
                "\n" +
                "Якби ти знав…\n" +
                "Ти б точно не дозволив\n" +
                "Бути в цю мить\n" +
                "Між стін і рам\n" +
                "Одній.\n" + "\n" +
                "Прочитати усю збірку віршів 'Лише до безтями' від Марини Кузьменко можна ось тут: https://play.google.com/store/apps/details?id=marynakuzmenko.love_poems " +
                "\n" + "\n Ще більше проектів Літературної Агенції живуть за адресою: http://agency.meri.kiev.ua :)" );
        sendIntent.setType("text/plain");

        startActivity(Intent.createChooser(sendIntent, getResources().getText(R.string.send_to)));
    }

        }

