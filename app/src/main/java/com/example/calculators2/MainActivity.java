package com.example.calculators2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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
    private TextView myTextView;
    private EditText result;
    float mValueOne, mValueTwo;
    boolean Addition, Subtract, Multiplication, Division;










    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button ButtonOne =(Button) findViewById(R.id.bt_one_id);
        final Button ButtonTwo=(Button)findViewById(R.id.bt_two_id);
        final Button ButtonThree=(Button)findViewById(R.id.bt_three_id);
        final Button ButtonFour=(Button)findViewById(R.id.bt_four_id);
        final Button ButtonFive=(Button)findViewById(R.id.bt_five_id);
        final Button ButtonSix=(Button)findViewById(R.id.bt_six_id);
        final Button ButtonSeven=(Button)findViewById((R.id.bt_seven_id));
        final Button ButtonEight=(Button)findViewById(R.id.bt_eight_id);
        final Button ButtonNine=(Button)findViewById(R.id.bt_nine_id);
        Button ButtonDivision=(Button)findViewById(R.id.bt_division_id);
        Button ButtonMultiplicatio=(Button)findViewById(R.id.bt_multiplication_id);
        Button ButtonAddition=(Button)findViewById(R.id.bt_addition_id);
        Button ButtonSubtraction=(Button)findViewById(R.id.bt_subtraction_id);
        Button ButtonDecimal=(Button)findViewById(R.id.bt_decimal_id);
        final Button ButtonZero=(Button)findViewById(R.id.bt_zero_id);
        Button ButtonPercentage=(Button)findViewById(R.id.bt_percentage_id);
        Button ButtonDelete=(Button)findViewById(R.id.bt_delete_id);
        Button ButtonEqual=(Button)findViewById(R.id.bt_equal_id);
        final EditText result=(EditText)findViewById(R.id.et_result_id);


        ButtonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ButtonOne.setText(ButtonOne.getText()+"1");
            }
        });

        ButtonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ButtonTwo.setText(ButtonTwo.getText()+"2");
            }
        });


        ButtonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ButtonThree.setText(ButtonThree.getText()+"3");

            }
        });

        ButtonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              ButtonFour.setText(ButtonFour.getText()+"4");

            }
        });
ButtonFive.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        ButtonFive.setText(ButtonFive.getText()+"5");
    }
});
ButtonSix.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        ButtonSix.setText(ButtonSix.getText()+"6");
    }
});
ButtonSeven.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        ButtonSeven.setText(ButtonSeven.getText()+"7");
    }
});
ButtonEight.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        ButtonEight.setText(ButtonEight.getText()+"8");
    }
});
ButtonNine.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        ButtonNine.setText(ButtonNine.getText()+"9");
    }
});

ButtonZero.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        ButtonZero.setText(ButtonZero.getText()+"0");
    }
});
ButtonAddition.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if (result == null) {
            result.setText("");
        } else {
            mValueOne = Float.parseFloat(result.getText() + "");
            Addition = true;
            result.setText(null);
        }
    }

});

        ButtonSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               mValueOne=Float.parseFloat(result.getText()+"");
               Subtract=true;

            }
        });
    }
}
