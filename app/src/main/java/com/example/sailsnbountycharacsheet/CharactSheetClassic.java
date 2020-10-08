package com.example.sailsnbountycharacsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class CharactSheetClassic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caract_sheet_classic);

        Button btnOk = findViewById(R.id.btnOk);
        final EditText txtHpHead = findViewById(R.id.txtHpHead);
        final EditText txtHpArms = findViewById(R.id.txtHpArms);
        final EditText txtHpLegs = findViewById(R.id.txtHpLegs);
        final EditText txtHpBody = findViewById(R.id.txtHpBody);
        final ImageView imgHead = findViewById(R.id.imageHpHead);
        final ImageView imgArms = findViewById(R.id.imageHpArms);
        final ImageView imgLegs = findViewById(R.id.imageHpLegs);
        final ImageView imgBody = findViewById(R.id.imageHpBody);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strHpHead = txtHpHead.getText().toString();
                String strHpArms = txtHpArms.getText().toString();
                String strHpLegs = txtHpLegs.getText().toString();
                String strHpBody = txtHpBody.getText().toString();

                //rendre image visible
                imgHead.setVisibility(View.VISIBLE);
                imgArms.setVisibility(View.VISIBLE);
                imgLegs.setVisibility(View.VISIBLE);
                imgBody.setVisibility(View.VISIBLE);

                switch (strHpHead) {
                    case "0":
                        imgHead.setVisibility(View.INVISIBLE);
                        break;
                    case "1":
                        imgHead.setImageDrawable(getResources().getDrawable(R.drawable.pvcl1));
                        break;
                    case "2":
                        imgHead.setImageDrawable(getResources().getDrawable(R.drawable.pvcl2));
                        break;
                    case "3":
                        imgHead.setImageDrawable(getResources().getDrawable(R.drawable.pvcl3));
                        break;
                    case "4":
                        imgHead.setImageDrawable(getResources().getDrawable(R.drawable.pvcl4));
                        break;
                    case "5":
                        imgHead.setImageDrawable(getResources().getDrawable(R.drawable.pvcl5));
                        break;
                    case "6":
                        imgHead.setImageDrawable(getResources().getDrawable(R.drawable.pvcl6));
                        break;
                    case "7":
                        imgHead.setImageDrawable(getResources().getDrawable(R.drawable.pvcl7));
                        break;
                    case "8":
                        imgHead.setImageDrawable(getResources().getDrawable(R.drawable.pvcl8));
                        break;
                    case "9":
                        imgHead.setImageDrawable(getResources().getDrawable(R.drawable.pvcl9));
                        break;
                    case "10":
                        imgHead.setImageDrawable(getResources().getDrawable(R.drawable.pvcl10));
                        break;
                    case "11":
                        imgHead.setImageDrawable(getResources().getDrawable(R.drawable.pvcl11));
                        break;
                    case "12":
                        imgHead.setImageDrawable(getResources().getDrawable(R.drawable.pvcl12));
                        break;
                    case "13":
                        imgHead.setImageDrawable(getResources().getDrawable(R.drawable.pvcl13));
                        break;
                    case "14":
                        imgHead.setImageDrawable(getResources().getDrawable(R.drawable.pvcl14));
                        break;
                    case "15":
                        imgHead.setImageDrawable(getResources().getDrawable(R.drawable.pvcl15));
                        break;
                    case "16":
                        imgHead.setImageDrawable(getResources().getDrawable(R.drawable.pvcl16));
                        break;
                    case "17":
                        imgHead.setImageDrawable(getResources().getDrawable(R.drawable.pvcl17));
                        break;
                    default:
                        imgHead.setVisibility(View.VISIBLE);
                }
                switch (strHpArms) {
                    case "0":
                        imgArms.setVisibility(View.INVISIBLE);
                        break;
                    case "1":
                        imgArms.setImageDrawable(getResources().getDrawable(R.drawable.pvcl1));
                        break;
                    case "2":
                        imgArms.setImageDrawable(getResources().getDrawable(R.drawable.pvcl2));
                        break;
                    case "3":
                        imgArms.setImageDrawable(getResources().getDrawable(R.drawable.pvcl3));
                        break;
                    case "4":
                        imgArms.setImageDrawable(getResources().getDrawable(R.drawable.pvcl4));
                        break;
                    case "5":
                        imgArms.setImageDrawable(getResources().getDrawable(R.drawable.pvcl5));
                        break;
                    case "6":
                        imgArms.setImageDrawable(getResources().getDrawable(R.drawable.pvcl6));
                        break;
                    case "7":
                        imgArms.setImageDrawable(getResources().getDrawable(R.drawable.pvcl7));
                        break;
                    case "8":
                        imgArms.setImageDrawable(getResources().getDrawable(R.drawable.pvcl8));
                        break;
                    case "9":
                        imgArms.setImageDrawable(getResources().getDrawable(R.drawable.pvcl9));
                        break;
                    case "10":
                        imgArms.setImageDrawable(getResources().getDrawable(R.drawable.pvcl10));
                        break;
                    case "11":
                        imgArms.setImageDrawable(getResources().getDrawable(R.drawable.pvcl11));
                        break;
                    case "12":
                        imgArms.setImageDrawable(getResources().getDrawable(R.drawable.pvcl12));
                        break;
                    case "13":
                        imgArms.setImageDrawable(getResources().getDrawable(R.drawable.pvcl13));
                        break;
                    case "14":
                        imgArms.setImageDrawable(getResources().getDrawable(R.drawable.pvcl14));
                        break;
                    case "15":
                        imgArms.setImageDrawable(getResources().getDrawable(R.drawable.pvcl15));
                        break;
                    case "16":
                        imgArms.setImageDrawable(getResources().getDrawable(R.drawable.pvcl16));
                        break;
                    case "17":
                        imgArms.setImageDrawable(getResources().getDrawable(R.drawable.pvcl17));
                        break;
                    default:
                        imgArms.setVisibility(View.VISIBLE);
                }
                switch (strHpLegs) {
                    case "0":
                        imgLegs.setVisibility(View.INVISIBLE);
                        break;
                    case "1":
                        imgLegs.setImageDrawable(getResources().getDrawable(R.drawable.pvcl1));
                        break;
                    case "2":
                        imgLegs.setImageDrawable(getResources().getDrawable(R.drawable.pvcl2));
                        break;
                    case "3":
                        imgLegs.setImageDrawable(getResources().getDrawable(R.drawable.pvcl3));
                        break;
                    case "4":
                        imgLegs.setImageDrawable(getResources().getDrawable(R.drawable.pvcl4));
                        break;
                    case "5":
                        imgLegs.setImageDrawable(getResources().getDrawable(R.drawable.pvcl5));
                        break;
                    case "6":
                        imgLegs.setImageDrawable(getResources().getDrawable(R.drawable.pvcl6));
                        break;
                    case "7":
                        imgLegs.setImageDrawable(getResources().getDrawable(R.drawable.pvcl7));
                        break;
                    case "8":
                        imgLegs.setImageDrawable(getResources().getDrawable(R.drawable.pvcl8));
                        break;
                    case "9":
                        imgLegs.setImageDrawable(getResources().getDrawable(R.drawable.pvcl9));
                        break;
                    case "10":
                        imgLegs.setImageDrawable(getResources().getDrawable(R.drawable.pvcl10));
                        break;
                    case "11":
                        imgLegs.setImageDrawable(getResources().getDrawable(R.drawable.pvcl11));
                        break;
                    case "12":
                        imgLegs.setImageDrawable(getResources().getDrawable(R.drawable.pvcl12));
                        break;
                    case "13":
                        imgLegs.setImageDrawable(getResources().getDrawable(R.drawable.pvcl13));
                        break;
                    case "14":
                        imgLegs.setImageDrawable(getResources().getDrawable(R.drawable.pvcl14));
                        break;
                    case "15":
                        imgLegs.setImageDrawable(getResources().getDrawable(R.drawable.pvcl15));
                        break;
                    case "16":
                        imgLegs.setImageDrawable(getResources().getDrawable(R.drawable.pvcl16));
                        break;
                    case "17":
                        imgLegs.setImageDrawable(getResources().getDrawable(R.drawable.pvcl17));
                        break;
                    default:
                        imgLegs.setVisibility(View.VISIBLE);
                }
                switch (strHpBody) {
                    case "0":
                        imgBody.setVisibility(View.INVISIBLE);
                        break;
                    case "1":
                        imgBody.setImageDrawable(getResources().getDrawable(R.drawable.pvcl1));
                        break;
                    case "2":
                        imgBody.setImageDrawable(getResources().getDrawable(R.drawable.pvcl2));
                        break;
                    case "3":
                        imgBody.setImageDrawable(getResources().getDrawable(R.drawable.pvcl3));
                        break;
                    case "4":
                        imgBody.setImageDrawable(getResources().getDrawable(R.drawable.pvcl4));
                        break;
                    case "5":
                        imgBody.setImageDrawable(getResources().getDrawable(R.drawable.pvcl5));
                        break;
                    case "6":
                        imgBody.setImageDrawable(getResources().getDrawable(R.drawable.pvcl6));
                        break;
                    case "7":
                        imgBody.setImageDrawable(getResources().getDrawable(R.drawable.pvcl7));
                        break;
                    case "8":
                        imgBody.setImageDrawable(getResources().getDrawable(R.drawable.pvcl8));
                        break;
                    case "9":
                        imgBody.setImageDrawable(getResources().getDrawable(R.drawable.pvcl9));
                        break;
                    case "10":
                        imgBody.setImageDrawable(getResources().getDrawable(R.drawable.pvcl10));
                        break;
                    case "11":
                        imgBody.setImageDrawable(getResources().getDrawable(R.drawable.pvcl11));
                        break;
                    case "12":
                        imgBody.setImageDrawable(getResources().getDrawable(R.drawable.pvcl12));
                        break;
                    case "13":
                        imgBody.setImageDrawable(getResources().getDrawable(R.drawable.pvcl13));
                        break;
                    case "14":
                        imgBody.setImageDrawable(getResources().getDrawable(R.drawable.pvcl14));
                        break;
                    case "15":
                        imgBody.setImageDrawable(getResources().getDrawable(R.drawable.pvcl15));
                        break;
                    case "16":
                        imgBody.setImageDrawable(getResources().getDrawable(R.drawable.pvcl16));
                        break;
                    case "17":
                        imgBody.setImageDrawable(getResources().getDrawable(R.drawable.pvcl17));
                        break;
                    default:
                        imgBody.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
