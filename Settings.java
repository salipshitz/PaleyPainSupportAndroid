package com.saar.developer.starfishsupport;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

public class Settings {
    private boolean isLengthening = false;

    public void setLengthening(boolean b) {
        isLengthening = b;
    }

    public void lengtheningAlert(Context c) {
        AlertDialog.Builder alert = new AlertDialog.Builder(c);
        alert.setMessage("Are you lengthening?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        new Settings().setLengthening(true);
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                })
                .create();
        alert.show();
    }
}
