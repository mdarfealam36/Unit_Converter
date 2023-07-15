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

public class WeightActivity extends AppCompatActivity {

    CardView cv_fromUnit, cv_toUnit, cv_convert;
    RelativeLayout mCLayout;
    String fromUnit = "Tonne";
    String toUnit = "Kilogram";
    TextView tv_fromUnit, tv_toUnit;
    EditText et_fromUnit, et_toUnit;
    final String[] values = new String[]{
            "Tonne",
            "Kilogram",
            "Gram",
            "Milligram",
            "Microgram",
            "Pound"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

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
                            et_toUnit.setText(TonneToKilogram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(TonneToGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(TonneToMilligram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(TonneToMicrogram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(TonneToPound(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[1])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(KilogramToTonne(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(KilogramToGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(KilogramToMilligram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(KilogramToMicrogram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(KilogramToPound(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[2])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(GramToTonne(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(GramToKilogram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(GramToMilligram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(GramToMicrogram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(GramToPound(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[3])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(MilligramToTonne(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(MilligramToKilogram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(MilligramToGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(MilligramToMicrogram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(MilligramToPound(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[4])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(MicrogramToTonne(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(MicrogramToKilogram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(MicrogramToGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(MicrogramToMilligram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(MicrogramToPound(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[5])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(PoundToTonne(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(PoundToKilogram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(PoundToGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(PoundToMilligram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(PoundToMicrogram(Double.parseDouble(tempInput)));
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

                final AlertDialog.Builder builder = new AlertDialog.Builder(WeightActivity.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Tonne",
                        "Kilogram",
                        "Gram",
                        "Milligram",
                        "Microgram",
                        "Pound"
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

                final AlertDialog.Builder builder = new AlertDialog.Builder(WeightActivity.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Tonne",
                        "Kilogram",
                        "Gram",
                        "Milligram",
                        "Microgram",
                        "Pound"

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

    //Tonne
    private String TonneToGram(double tonne) {
        double Gram = tonne * 1e+6;
        return String.valueOf(Gram);
    }

    private String TonneToMilligram(double tonne) {
        double Milligram = tonne * 1e+9;
        return String.valueOf(Milligram);
    }

    private String TonneToMicrogram(double tonne) {
        double Microgram = tonne * 1e+12;
        return String.valueOf(Microgram);
    }

    private String TonneToPound(double tonne) {
        double Pound = tonne * 2205;
        return String.valueOf(Pound);
    }

    private String TonneToKilogram(double tonne) {
        double kilogram = tonne * 1000;
        return String.valueOf(kilogram);
    }

    //Kilogram
    private String KilogramToGram(double Kilogram) {
        double Gram =Kilogram * 1000;
        return String.valueOf(Gram);
    }

    private String KilogramToMilligram(double Kilogram) {
        double Milligram = Kilogram *1e+6;
        return String.valueOf(Milligram);
    }

    private String KilogramToMicrogram(double Kilogram) {
        double Microgram = Kilogram* 1e+9;
        return String.valueOf(Microgram);
    }

    private String KilogramToPound(double Kilogram) {
        double Pound =Kilogram * 2.205;
        return String.valueOf(Pound);
    }

    private String KilogramToTonne(double Kilogram) {
        double tonne = Kilogram /1000;
        return String.valueOf(tonne);
    }

    //Gram
    private String GramToMilligram(double Gram) {
        double Milligram = Gram * 1000;
        return String.valueOf(Milligram);
    }

    private String GramToMicrogram(double Gram) {
        double Microgram = Gram  * 1e+6;
        return String.valueOf(Microgram);
    }

    private String GramToPound(double Gram) {
        double Pound = Gram/453.6;
        return String.valueOf(Pound);
    }

    private String GramToTonne(double Gram) {
        double tonne = Gram /1e+6;
        return String.valueOf(tonne);
    }

    private String GramToKilogram(double Gram) {
        double Kilogram = Gram /1000;
        return String.valueOf(Kilogram);
    }

    //Milligram
    private String MilligramToMicrogram(double Milligram) {
        double Microgram = Milligram * 1000;
        return String.valueOf(Microgram);
    }

    private String MilligramToPound(double Milligram) {
        double Pound = Milligram/453600;
        return String.valueOf(Pound);
    }

    private String MilligramToTonne(double Milligram) {
        double tonne = Milligram /1e+9;
        return String.valueOf(tonne);
    }

    private String MilligramToKilogram(double Milligram) {
        double Kilogram = Milligram /1e+6;
        return String.valueOf(Kilogram);
    }

    private String MilligramToGram(double Milligram) {
        double Gram = Milligram /1000;
        return String.valueOf(Gram);
    }

    //Microgram
    private String MicrogramToPound(double Microgram) {
        double Pound =Microgram/ 4.536e+8;
        return String.valueOf(Pound);
    }

    private String MicrogramToTonne(double Microgram) {
        double tonne = Microgram /1e+12;
        return String.valueOf(tonne);
    }

    private String MicrogramToKilogram(double Microgram) {
        double Kilogram = Microgram /1e+9;
        return String.valueOf(Kilogram);
    }

    private String MicrogramToGram(double Microgram) {
        double Gram = Microgram /1e+6;
        return String.valueOf(Gram);
    }

    private String MicrogramToMilligram(double Microgram) {
        double Milligram = Microgram /1000;
        return String.valueOf(Milligram);
    }

    //Pound
    private String PoundToTonne(double Pound) {
        double tonne =Pound /2205;
        return String.valueOf(tonne);
    }

    private String PoundToKilogram(double Pound) {
        double Kilogram =Pound /2.205;
        return String.valueOf(Kilogram);
    }

    private String PoundToGram(double Pound) {
        double Gram =Pound *453.6;
        return String.valueOf(Gram);
    }

    private String PoundToMilligram(double Pound) {
        double Milligram =Pound *453600;
        return String.valueOf(Milligram);
    }

    private String PoundToMicrogram(double Pound) {
        double Microgram = Pound * 4.536e+8;
        return String.valueOf(Microgram);
    }

}