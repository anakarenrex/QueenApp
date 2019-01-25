package android.itesm.edu.queen;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class RandomTitle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_title);
    }

    public void done(View view){
        Intent intentT = new Intent();
        String value = titleSongs[new Random().nextInt(titleSongs.length)];
        ((TextView)findViewById(R.id.textViewTitle)).setText(value);
        intentT.putExtra("Random Song Title", value);
        setResult(Activity.RESULT_OK, intentT);
        finish();
    }

    private String[] titleSongs = {"Bohemian Rhapsody", "Another One Bites The Dust", "We Will Rock You", "Don't Stop Me Now", "Somebody To Love", "Love Of My Life", "I Want To Break Free", "Killer Queen", "Crazy Little Thing Called Love", "Under Pressure", "Who Wants to Live Forever", "Fat Bottomed Girls"};

}