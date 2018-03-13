package com.game2011.inderdeep.khanna.slotmachine;

import android.content.Context;

import java.util.Random;

/**
 * Created by singh on 2018-03-13.
 */

public class SlotMachine
{

    private static int arrayOfSlotDrawableIds[] =
    {
        R.drawable.icon1,
        R.drawable.icon2,
        R.drawable.icon3,
        R.drawable.icon4,
        R.drawable.icon5
    };

    private int[] arrayOfRandomIcons = new int[3];

    private int score;

    public SlotMachine()
    {
        score = 900;
    }

    public SlotMachine(int defaultScore)
    {
        score = defaultScore;
    }

    public int[] getRandomDrawableIcons ()
    {

        Random randomGenerator = new Random();

        for(int count = 0 ; count < 3 ; count++)
        {
            int index = randomGenerator.nextInt(5);
            arrayOfRandomIcons[count] = arrayOfSlotDrawableIds[index];
        }

        return arrayOfRandomIcons;
    }

    public boolean didUserWin()
    {
        boolean result = true;

        int firstId = arrayOfRandomIcons[0];
        for(int count = 0 ; count < 3 ; count ++)
        {
            if(arrayOfRandomIcons[count] != firstId)
            {
                result = false;
            }
        }

        return result;
    }

    public boolean didUserWinJackpot()
    {
        boolean result = true;

        int dollarIconID = arrayOfSlotDrawableIds[4];
        for(int count = 0 ; count < 3 ; count ++)
        {
            if(arrayOfRandomIcons[count] != dollarIconID)
            {
                result = false;
            }
        }

        return result;
    }
}
