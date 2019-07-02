package com.example.calculators2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button division;
    private Button multiplication;
    private Button addition;
    private Button subtaction;
    private Button decimal;
    private Button zero;
    private Button percentage;
    private Button delete;
    private Button equal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ButtonAddition=(Button)findViewById(R.id.bt_addition_id);
ButtonAddition.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Button ButtonOne =(Button)findViewById(R.id.bt_one_id);
        Button ButtonTwo=(Button)findViewById(R.id.bt_two_id);
        Button ButtonThree=(Button)findViewById(R.id.bt_three_id);
        Button ButtonFour=(Button)findViewById(R.id.bt_four_id);
        Button ButtonFive=(Button)findViewById(R.id.bt_five_id);
        Button ButtonSix=(Button)findViewById(R.id.bt_six_id);
        Button ButtonSeven=(Button)findViewById((R.id.bt_seven_id));
        Button ButtonEight=(Button)findViewById(R.id.bt_eight_id);
        Button ButtonNine=(Button)findViewById(R.id.bt_nine_id);
        Button ButtonZero=(Button)findViewById(R.id.bt_zero_id);


    }
});


       /**
        Button ButtonOne =(Button)findViewById(R.id.bt_one_id);
        Button ButtonTwo=(Button)findViewById(R.id.bt_two_id);
        Button ButtonThree=(Button)findViewById(R.id.bt_three_id);
        Button ButtonFour=(Button)findViewById(R.id.bt_four_id);
        Button ButtonFive=(Button)findViewById(R.id.bt_five_id);
        Button ButtonSix=(Button)findViewById(R.id.bt_six_id);
        Button ButtonSeven=(Button)findViewById((R.id.bt_seven_id));
        Button ButtonEight=(Button)findViewById(R.id.bt_eight_id);
        Button ButtonNine=(Button)findViewById(R.id.bt_nine_id);
        Button ButtonDivision=(Button)findViewById(R.id.bt_division_id);
        Button ButtonMultiplicatio=(Button)findViewById(R.id.bt_multiplication_id);
        Button ButtonAddition=(Button)findViewById(R.id.bt_addition_id);
        Button ButtonSubtraction=(Button)findViewById(R.id.bt_subtraction_id);
        Button ButtonDecimal=(Button)findViewById(R.id.bt_decimal_id);
        Button ButtonZero=(Button)findViewById(R.id.bt_zero_id);
        Button ButtonPercentage=(Button)findViewById(R.id.bt_percentage_id);
        Button ButtonDelete=(Button)findViewById(R.id.bt_delete_id);
        Button ButtonEqual=(Button)findViewById(R.id.bt_equal_id);
        **/


    }
}
