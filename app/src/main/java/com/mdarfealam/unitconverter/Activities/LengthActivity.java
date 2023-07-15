package com.mdarfealam.unitconverter.Activities;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.mdarfealam.unitconverter.R;

import java.util.Arrays;

/**
 * Created by - Android Rider.
 * Website - www.androidrider.com
 * Youtube - Android Rider
 */


public class LengthActivity extends AppCompatActivity {

    CardView cv_fromUnit, cv_toUnit, cv_convert;
    RelativeLayout mCLayout;
    String fromUnit = "Kilometer";
    String toUnit = "Meter";
    TextView tv_fromUnit, tv_toUnit;
    EditText et_fromUnit, et_toUnit;
    final String[] values = new String[]{
            "Kilometer",
            "Meter",
            "Centimeter",
            "Mile",
            "Foot",
            "Inch"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        cv_fromUnit = findViewById(R.id.fromUnit);
        cv_toUnit = findViewById(R.id.toUnit);
        cv_convert = findViewById(R.id.cv_convert);

        mCLayout = findViewById(R.id.temp_relativeLayout);

        tv_fromUnit = findViewById(R.id.tv_fromUnit);
        tv_toUnit = findViewById(R.id.tv_toUnit);

        tv_fromUnit.setText(values[0]);
        tv_toUnit.setText(values[0]);

        et_fromUnit = findViewById(R.id.et_fromUnit);
        et_toUnit = findViewById(R.id.et_toUnit);

        cv_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempInput = et_fromUnit.getText().toString();
                if (tempInput.equals("") || tempInput == null) {
                    et_fromUnit.setError("Please enter some value");
                } else {
                    if (tv_fromUnit.getText().toString().equals(values[0])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(KilometerToMeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(KilometerToCentimeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(KilometerToMile(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(KilometerToFoot(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(KilometerToInch(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[1])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(MeterToKilometer(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(MeterToCentimeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(MeterToMile(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(MeterToFoot(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(MeterToInch(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[2])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(CentimeterToKilometer(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(CentimeterToMeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(CentimeterToMile(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(CentimeterToFoot(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(CentimeterToInch(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[3])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(MileToKilometer(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(MileToMeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(MileToCentimeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(MileToFoot(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(MileToInch(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[4])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(FootToKilometer(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(FootToMeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(FootToCentimeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(FootToMile(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(FootToInch(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[5])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(InchToKilometer(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(InchToMeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(InchToCentimeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(InchToMile(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(InchToFoot(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(tempInput);
                        }
                    }
                }
            }
        });

        cv_toUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(LengthActivity.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Kilometer",
                        "Meter",
                        "Centimeter",
                        "Mile",
                        "Foot",
                        "Inch"
                };

                builder.setSingleChoiceItems(
                        flowers, // Items list
                        -1, // Index of checked item (-1 = no selection)
                        new DialogInterface.OnClickListener() // Item click listener
                        {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
// Get the alert dialog selected item's text
                                String selectedItem = Arrays.asList(flowers).get(i);
                                toUnit = selectedItem;
                                tv_toUnit.setText(toUnit);

                            }
                        });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
// Just dismiss the alert dialog after selection
// Or do something now
                        dialogInterface.dismiss();
                    }
                });

                AlertDialog dialog = builder.create();

// Finally, display the alert dialog
                dialog.show();

            }
        });

        cv_fromUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(LengthActivity.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Kilometer",
                        "Meter",
                        "Centimeter",
                        "Mile",
                        "Foot",
                        "Inch"

                };

                builder.setSingleChoiceItems(
                        flowers, // Items list
                        -1, // Index of checked item (-1 = no selection)
                        new DialogInterface.OnClickListener() // Item click listener
                        {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {


// Get the alert dialog selected item's text
                                String selectedItem = Arrays.asList(flowers).get(i);
                                fromUnit = selectedItem;
                                tv_fromUnit.setText(fromUnit);

                            }
                        });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
// Just dismiss the alert dialog after selection
// Or do something now
                        dialogInterface.dismiss();
                    }
                });

                AlertDialog dialog = builder.create();

// Finally, display the alert dialog
                dialog.show();

            }
        });

    }

    //Kilometer
    private String KilometerToCentimeter(double Kilometer) {
        double Centimeter = Kilometer * 100000;
        return String.valueOf(Centimeter);
    }

    private String KilometerToMile(double Kilometer) {
        double Mile = Kilometer /1.609;
        return String.valueOf(Mile);
    }

    private String KilometerToFoot(double Kilometer) {
        double Foot = Kilometer * 3281;
        return String.valueOf(Foot);
    }

    private String KilometerToInch(double Kilometer) {
        double Inch = Kilometer * 39370;
        return String.valueOf(Inch);
    }

    private String KilometerToMeter(double Kilometer) {
        double Meter = Kilometer * 1000;
        return String.valueOf(Meter);
    }

    //Meter
    private String MeterToCentimeter(double Meter) {
        double Centimeter =Meter * 100;
        return String.valueOf(Centimeter);
    }

    private String MeterToMile(double Meter) {
        double Mile = Meter /1609;
        return String.valueOf(Mile);
    }

    private String MeterToFoot(double Meter) {
        double Foot = Meter* 3.281;
        return String.valueOf(Foot);
    }

    private String MeterToInch(double Meter) {
        double Inch =Meter * 39.37;
        return String.valueOf(Inch);
    }

    private String MeterToKilometer(double Meter) {
        double Kilometer = Meter /1000;
        return String.valueOf(Kilometer);
    }

    //Centimeter
    private String CentimeterToMile(double Centimeter) {
        double Mile = Centimeter / 160900;
        return String.valueOf(Mile);
    }

    private String CentimeterToFoot(double Centimeter) {
        double Foot = Centimeter  /30.48;
        return String.valueOf(Foot);
    }

    private String CentimeterToInch(double Centimeter) {
        double Inch = Centimeter/2.54;
        return String.valueOf(Inch);
    }

    private String CentimeterToKilometer(double Centimeter) {
        double Kilometer = Centimeter /100000;
        return String.valueOf(Kilometer);
    }

    private String CentimeterToMeter(double Centimeter) {
        double Meter = Centimeter /100;
        return String.valueOf(Meter);
    }

    //Mile
    private String MileToFoot(double Mile) {
        double Foot = Mile * 5280;
        return String.valueOf(Foot);
    }

    private String MileToInch(double Mile) {
        double Inch = Mile*63360;
        return String.valueOf(Inch);
    }

    private String MileToKilometer(double Mile) {
        double Kilometer = Mile *1.609;
        return String.valueOf(Kilometer);
    }

    private String MileToMeter(double Mile) {
        double Meter = Mile *1609;
        return String.valueOf(Meter);
    }

    private String MileToCentimeter(double Mile) {
        double Centimeter = Mile *160900;
        return String.valueOf(Centimeter);
    }

    //Foot
    private String FootToInch(double Foot) {
        double Inch =Foot*12;
        return String.valueOf(Inch);
    }

    private String FootToKilometer(double Foot) {
        double Kilometer = Foot / 3281;
        return String.valueOf(Kilometer);
    }

    private String FootToMeter(double Foot) {
        double Meter = Foot /3.281;
        return String.valueOf(Meter);
    }

    private String FootToCentimeter(double Foot) {
        double Centimeter = Foot *30.48;
        return String.valueOf(Centimeter);
    }

    private String FootToMile(double Foot) {
        double Mile = Foot /5280;
        return String.valueOf(Mile);
    }

    //Inch
    private String InchToKilometer(double Inch) {
        double Kilometer =Inch /39370;
        return String.valueOf(Kilometer);
    }

    private String InchToMeter(double Inch) {
        double Meter =Inch /39.37;
        return String.valueOf(Meter);
    }

    private String InchToCentimeter(double Inch) {
        double Centimeter =Inch *2.54;
        return String.valueOf(Centimeter);
    }

    private String InchToMile(double Inch) {
        double Mile =Inch /63360;
        return String.valueOf(Mile);
    }

    private String InchToFoot(double Inch) {
        double Foot = Inch * 12;
        return String.valueOf(Foot);
    }

}