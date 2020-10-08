package com.example.sailsnbountycharacsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;


public class CharactSheetSF extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOk = findViewById(R.id.btnOk);
        final EditText txtTete = findViewById(R.id.editTextTete);
        final EditText txtBras = findViewById(R.id.editTextBras);
        final EditText txtJambes = findViewById(R.id.editTextJambes);
        final EditText txtCorps = findViewById(R.id.editTextCorps);
        final ImageView imgHpHead = findViewById(R.id.imageHpHead);
        final ImageView imgHpArms = findViewById(R.id.imageHpArms);
        final ImageView imgHpLegs = findViewById(R.id.imageHpLegs);
        final ImageView imgHpBody = findViewById(R.id.imageHpBody);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strHpTete = txtTete.getText().toString();
                String strHpBras = txtBras.getText().toString();
                String strHpJambes = txtJambes.getText().toString();
                String strHpCorps = txtCorps.getText().toString();

                //Passe tout les imgView à visible
                imgHpHead.setVisibility(View.VISIBLE);
                imgHpArms.setVisibility(View.VISIBLE);
                imgHpLegs.setVisibility(View.VISIBLE);
                imgHpBody.setVisibility(View.VISIBLE);

                //SwitchSurla valeur de strHpTete
                switch (strHpTete) {
                    case "0":
                        imgHpHead.setVisibility(View.INVISIBLE);
                        break;
                    case "1":
                        imgHpHead.setImageDrawable(getResources().getDrawable(R.drawable.pvsf1));
                        break;
                    case "2":
                        imgHpHead.setImageDrawable(getResources().getDrawable(R.drawable.pvsf2));
                        break;
                    case "3":
                        imgHpHead.setImageDrawable(getResources().getDrawable(R.drawable.pvsf3));
                        break;
                    case "4":
                        imgHpHead.setImageDrawable(getResources().getDrawable(R.drawable.pvsf4));
                        break;
                    case "5":
                        imgHpHead.setImageDrawable(getResources().getDrawable(R.drawable.pvsf5));
                        break;
                    case "6":
                        imgHpHead.setImageDrawable(getResources().getDrawable(R.drawable.pvsf6));
                        break;
                    case "7":
                        imgHpHead.setImageDrawable(getResources().getDrawable(R.drawable.pvsf7));
                        break;
                    case "8":
                        imgHpHead.setImageDrawable(getResources().getDrawable(R.drawable.pvsf8));
                        break;
                    case "9":
                        imgHpHead.setImageDrawable(getResources().getDrawable(R.drawable.pvsf9));
                        break;
                    case "10":
                        imgHpHead.setImageDrawable(getResources().getDrawable(R.drawable.pvsf10));
                        break;
                    case "11":
                        imgHpHead.setImageDrawable(getResources().getDrawable(R.drawable.pvsf11));
                        break;
                    case "12":
                        imgHpHead.setImageDrawable(getResources().getDrawable(R.drawable.pvsf12));
                        break;
                    case "13":
                        imgHpHead.setImageDrawable(getResources().getDrawable(R.drawable.pvsf13));
                        break;
                    case "14":
                        imgHpHead.setImageDrawable(getResources().getDrawable(R.drawable.pvsf14));
                        break;
                    case "15":
                        imgHpHead.setImageDrawable(getResources().getDrawable(R.drawable.pvsf15));
                        break;
                    case "16":
                        imgHpHead.setImageDrawable(getResources().getDrawable(R.drawable.pvsf16));
                        break;
                    case "17":
                        imgHpHead.setImageDrawable(getResources().getDrawable(R.drawable.pvsf17));
                        break;
                    default:
                        imgHpHead.setVisibility(View.INVISIBLE);
                }

                //SwitchSurla valeur de strBras
                switch (strHpBras) {
                    case "0":
                        imgHpArms.setVisibility(View.INVISIBLE);
                        break;
                    case "1":
                        imgHpArms.setImageDrawable(getResources().getDrawable(R.drawable.pvsf1));
                        break;
                    case "2":
                        imgHpArms.setImageDrawable(getResources().getDrawable(R.drawable.pvsf2));
                        break;
                    case "3":
                        imgHpArms.setImageDrawable(getResources().getDrawable(R.drawable.pvsf3));
                        break;
                    case "4":
                        imgHpArms.setImageDrawable(getResources().getDrawable(R.drawable.pvsf4));
                        break;
                    case "5":
                        imgHpArms.setImageDrawable(getResources().getDrawable(R.drawable.pvsf5));
                        break;
                    case "6":
                        imgHpArms.setImageDrawable(getResources().getDrawable(R.drawable.pvsf6));
                        break;
                    case "7":
                        imgHpArms.setImageDrawable(getResources().getDrawable(R.drawable.pvsf7));
                        break;
                    case "8":
                        imgHpArms.setImageDrawable(getResources().getDrawable(R.drawable.pvsf8));
                        break;
                    case "9":
                        imgHpArms.setImageDrawable(getResources().getDrawable(R.drawable.pvsf9));
                        break;
                    case "10":
                        imgHpArms.setImageDrawable(getResources().getDrawable(R.drawable.pvsf10));
                        break;
                    case "11":
                        imgHpArms.setImageDrawable(getResources().getDrawable(R.drawable.pvsf11));
                        break;
                    case "12":
                        imgHpArms.setImageDrawable(getResources().getDrawable(R.drawable.pvsf12));
                        break;
                    case "13":
                        imgHpArms.setImageDrawable(getResources().getDrawable(R.drawable.pvsf13));
                        break;
                    case "14":
                        imgHpArms.setImageDrawable(getResources().getDrawable(R.drawable.pvsf14));
                        break;
                    case "15":
                        imgHpArms.setImageDrawable(getResources().getDrawable(R.drawable.pvsf15));
                        break;
                    case "16":
                        imgHpArms.setImageDrawable(getResources().getDrawable(R.drawable.pvsf16));
                        break;
                    case "17":
                        imgHpArms.setImageDrawable(getResources().getDrawable(R.drawable.pvsf17));
                        break;
                    default:
                        imgHpArms.setVisibility(View.INVISIBLE);
                }

                //switch sur strJambes
                switch (strHpJambes) {
                    case "0":
                        imgHpLegs.setVisibility(View.INVISIBLE);
                        break;
                    case "1":
                        imgHpLegs.setImageDrawable(getResources().getDrawable(R.drawable.pvsf1));
                        break;
                    case "2":
                        imgHpLegs.setImageDrawable(getResources().getDrawable(R.drawable.pvsf2));
                        break;
                    case "3":
                        imgHpLegs.setImageDrawable(getResources().getDrawable(R.drawable.pvsf3));
                        break;
                    case "4":
                        imgHpLegs.setImageDrawable(getResources().getDrawable(R.drawable.pvsf4));
                        break;
                    case "5":
                        imgHpLegs.setImageDrawable(getResources().getDrawable(R.drawable.pvsf5));
                        break;
                    case "6":
                        imgHpLegs.setImageDrawable(getResources().getDrawable(R.drawable.pvsf6));
                        break;
                    case "7":
                        imgHpLegs.setImageDrawable(getResources().getDrawable(R.drawable.pvsf7));
                        break;
                    case "8":
                        imgHpLegs.setImageDrawable(getResources().getDrawable(R.drawable.pvsf8));
                        break;
                    case "9":
                        imgHpLegs.setImageDrawable(getResources().getDrawable(R.drawable.pvsf9));
                        break;
                    case "10":
                        imgHpLegs.setImageDrawable(getResources().getDrawable(R.drawable.pvsf10));
                        break;
                    case "11":
                        imgHpLegs.setImageDrawable(getResources().getDrawable(R.drawable.pvsf11));
                        break;
                    case "12":
                        imgHpLegs.setImageDrawable(getResources().getDrawable(R.drawable.pvsf12));
                        break;
                    case "13":
                        imgHpLegs.setImageDrawable(getResources().getDrawable(R.drawable.pvsf13));
                        break;
                    case "14":
                        imgHpLegs.setImageDrawable(getResources().getDrawable(R.drawable.pvsf14));
                        break;
                    case "15":
                        imgHpLegs.setImageDrawable(getResources().getDrawable(R.drawable.pvsf15));
                        break;
                    case "16":
                        imgHpLegs.setImageDrawable(getResources().getDrawable(R.drawable.pvsf16));
                        break;
                    case "17":
                        imgHpLegs.setImageDrawable(getResources().getDrawable(R.drawable.pvsf17));
                        break;
                    default:
                        imgHpLegs.setVisibility(View.INVISIBLE);
                }

                //Switch sur srtCorps de imgHpBody
                switch (strHpCorps) {
                    case "0":
                        imgHpBody.setVisibility(View.INVISIBLE);
                        break;
                    case "1":
                        imgHpBody.setImageDrawable(getResources().getDrawable(R.drawable.pvsf1));
                        break;
                    case "2":
                        imgHpBody.setImageDrawable(getResources().getDrawable(R.drawable.pvsf2));
                        break;
                    case "3":
                        imgHpBody.setImageDrawable(getResources().getDrawable(R.drawable.pvsf3));
                        break;
                    case "4":
                        imgHpBody.setImageDrawable(getResources().getDrawable(R.drawable.pvsf4));
                        break;
                    case "5":
                        imgHpBody.setImageDrawable(getResources().getDrawable(R.drawable.pvsf5));
                        break;
                    case "6":
                        imgHpBody.setImageDrawable(getResources().getDrawable(R.drawable.pvsf6));
                        break;
                    case "7":
                        imgHpBody.setImageDrawable(getResources().getDrawable(R.drawable.pvsf7));
                        break;
                    case "8":
                        imgHpBody.setImageDrawable(getResources().getDrawable(R.drawable.pvsf8));
                        break;
                    case "9":
                        imgHpBody.setImageDrawable(getResources().getDrawable(R.drawable.pvsf9));
                        break;
                    case "10":
                        imgHpBody.setImageDrawable(getResources().getDrawable(R.drawable.pvsf10));
                        break;
                    case "11":
                        imgHpBody.setImageDrawable(getResources().getDrawable(R.drawable.pvsf11));
                        break;
                    case "12":
                        imgHpBody.setImageDrawable(getResources().getDrawable(R.drawable.pvsf12));
                        break;
                    case "13":
                        imgHpBody.setImageDrawable(getResources().getDrawable(R.drawable.pvsf13));
                        break;
                    case "14":
                        imgHpBody.setImageDrawable(getResources().getDrawable(R.drawable.pvsf14));
                        break;
                    case "15":
                        imgHpBody.setImageDrawable(getResources().getDrawable(R.drawable.pvsf15));
                        break;
                    case "16":
                        imgHpBody.setImageDrawable(getResources().getDrawable(R.drawable.pvsf16));
                        break;
                    case "17":
                        imgHpBody.setImageDrawable(getResources().getDrawable(R.drawable.pvsf17));
                        break;
                    default:
                        imgHpBody.setVisibility(View.INVISIBLE);
                }
            }
        });
    }


}

