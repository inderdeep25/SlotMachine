package com.game2011.inderdeep.khanna.slotmachine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class GameActivity extends AppCompatActivity {

    SlotMachine slotMachine;

    ImageView imageViews[] = new ImageView[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        slotMachine = new SlotMachine(1000);

        imageViews[0] = findViewById(R.id.imageView1);
        imageViews[1] = findViewById(R.id.imageView2);
        imageViews[2] = findViewById(R.id.imageView3);

    }

    public void onSpinButtonClicked(View view)
    {
        int[] randomArrayOfIcons = slotMachine.getRandomDrawableIcons();

        int count = 0 ;
        for (int iconId : randomArrayOfIcons)
        {
            imageViews[count].setImageResource(iconId);
            count++;
        }
    }
}
