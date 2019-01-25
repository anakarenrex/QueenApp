package android.itesm.edu.queen;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    private Button random;
    private Button randomT;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        random = (Button) findViewById(R.id.random);
        randomT = (Button) findViewById(R.id.randomTitle);
        textView = (TextView) findViewById(R.id.textViewSong);
    }

    private void goSong(String file){
        Intent intent = new Intent(this,SongActivity.class);
        intent.putExtra("file",file);
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 500 && resultCode == RESULT_OK){
            random.setText(data.getStringExtra("random"));
        }else{
            textView.setText(data.getStringExtra("Random Song Title"));
        }

    }

    public void sing(View view){
        String file = "";
        switch(view.getId()){
            case R.id.bohemian:
                file = "bohemian";
                goSong(file);
                break;
            case R.id.dont:
                file = "dont";
                goSong(file);
                break;
            case R.id.bites:
                file = "bitesTheDust";
                goSong(file);
                break;
            case R.id.breakFree:
                file = "breakFree";
                goSong(file);
                break;
            case R.id.loveLife:
                file = "loveOfMyLife";
                goSong(file);
                break;
            case R.id.rockyou:
                file = "rockYou";
                goSong(file);
                break;
            case R.id.somebody:
                file = "somebodyToLove";
                goSong(file);
                break;
            case R.id.randomTitle:
                Intent intentT = new Intent(this, RandomTitle.class);
                startActivityForResult(intentT,400);
                break;
            case R.id.random:
                Intent intent = new Intent(this, RandomActivity.class);
                startActivityForResult(intent, 500);
                break;
            case R.id.site:
                Uri page = Uri.parse("http://www.android.com");
                Intent web = new Intent(Intent.ACTION_VIEW, page);
                startActivity(web);
                break;

        }


    }
}
