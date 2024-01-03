package com.example.homework_22;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    float robotPrice = 35_000;
    float amount = 1_700;
    float account = 700;
    float percentBank = 9;

    private TextView countOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countOut = findViewById(R.id.countOut);

        countOut.setText(countMonth(percentBank, amount, robotPrice, account) + " месяцев");
    }

    public int countMonth(float percentBankYear, float amount, float robot, float accumulation) {
        float percentBankMonth = percentBankYear / 12;
        float total = accumulation;
        int count = 0;

        while (total < robot) {
            count++;
            total = total + ((total * percentBankMonth) / 100) + amount;
            System.out.println(total);
        }

        return count;
    }
}
