package mmuhamadamirzaidi.dialogbox;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DialogBox extends AppCompatActivity {

    Dialog epicDialog;
    Button positiveDialogBtn, negativeDialogBtn, btnPositive, btnNegative;
    TextView titleTv, messageTv;
    ImageView close_dialog_box_positive, close_dialog_box_negative;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_box);

        epicDialog = new Dialog(this);

        positiveDialogBtn = (Button) findViewById(R.id.positiveDialogBtn);
        negativeDialogBtn = (Button) findViewById(R.id.negativeDialogBtn);

        positiveDialogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowPositiveDialog();
            }
        });

        negativeDialogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowNegativeDialog();
            }
        });
    }

    public void ShowPositiveDialog(){
        epicDialog.setContentView(R.layout.dialog_box_positive);
        close_dialog_box_positive = (ImageView) epicDialog.findViewById(R.id.close_dialog_box_positive);
        btnPositive = (Button) epicDialog.findViewById(R.id.btnPositive);
        titleTv = (TextView) epicDialog.findViewById(R.id.titleTv);
        messageTv = (TextView) epicDialog.findViewById(R.id.messageTv);

        close_dialog_box_positive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                epicDialog.dismiss();
            }
        });

        btnPositive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                epicDialog.dismiss();
            }
        });

        epicDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        epicDialog.show();
    }

    public void ShowNegativeDialog(){
        epicDialog.setContentView(R.layout.dialog_box_negative);
        close_dialog_box_negative = (ImageView) epicDialog.findViewById(R.id.close_dialog_box_negative);
        btnNegative = (Button) epicDialog.findViewById(R.id.btnNegative);
        titleTv = (TextView) epicDialog.findViewById(R.id.titleTv);
        messageTv = (TextView) epicDialog.findViewById(R.id.messageTv);

        close_dialog_box_negative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                epicDialog.dismiss();
            }
        });

        btnNegative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                epicDialog.dismiss();
            }
        });

        epicDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        epicDialog.show();
    }
}
