package android.itesm.edu.queen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class SongActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        textView = (TextView) findViewById(R.id.song);

        String string = getIntent().getStringExtra("file");
        String file = "";
        switch (string) {
            case "bohemian":
                file = getFile("bohemian.txt");
                break;
            case "dont":
                file = getFile("dont.txt");
                break;
            case "bitesTheDust":
                file = getFile("bitesTheDust.txt");
                break;
            case "breakFree":
                file = getFile("breakFree.txt");
                break;
            case "loveOfMyLife":
                file = getFile("loveOfMyLife.txt");
                break;
            case "rockYou":
                file = getFile("rockYou.txt");
                break;
            case "somebodyToLove":
                file = getFile("somebodyToLove.txt");
                break;
        }
        textView.setText(file);

    }

    private String getFile(String assetf){
        String file = "";
        try {
            InputStream is = getAssets().open(assetf);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            file = new String(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

}
