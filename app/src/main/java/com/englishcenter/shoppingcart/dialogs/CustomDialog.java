package com.englishcenter.shoppingcart.dialogs;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

import com.englishcenter.shoppingcart.R;
import com.englishcenter.shoppingcart.callbacks.OptionDialogCallback;

import javax.inject.Inject;

/**
 * Created by jb on 03/09/2016.
 */
public class CustomDialog {

    private OptionDialogCallback optionDialogCallback;

    @Inject
    public CustomDialog() {}

    /**
     * Provide basic dialog
     * @param context
     * @param title
     * @param message
     */
    public void showBasicDialog(Context context, String title, String message) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title);
        builder.setCancelable(false);
        builder.setMessage(message);

        builder.setPositiveButton(context.getString(R.string.button_ok), (dialog, which) -> {
            dialog.dismiss();
        });

        builder.show();
    }

    /**
     * Provide option dialog
     * @param title
     * @param message
     */
    public void showOptionDialog(Context context, String title, String message,
                                 String buttonPositiveTitle, String buttonNegativeTitles) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title);
        builder.setCancelable(false);
        builder.setMessage(message);

        builder.setPositiveButton(buttonPositiveTitle, (dialog, which) -> {
            optionDialogCallback.positiveButtonClick();
            dialog.dismiss();
        });

        builder.setNegativeButton(buttonNegativeTitles, (dialog, which) -> {
            optionDialogCallback.negativeButtonClick();
            dialog.dismiss();
        });

        builder.show();
    }

    public void setOptionDialogCallback(OptionDialogCallback optionDialogCallback) {
        this.optionDialogCallback = optionDialogCallback;
    }
}
