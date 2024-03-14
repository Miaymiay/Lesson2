package com.mirea.pershinadv.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class MyProgressDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage("Выполняется загрузка...")
                .setCancelable(false);

        return builder.create();
    }

    @Override
    public void onResume() {
        super.onResume();
        showToast("Выполняется загрузка");
    }

    @Override
    public void onPause() {
        super.onPause();
        showToast("Загрузка завершена");
    }
    private void showToast(String message) {
        Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
    }
}

//package com.mirea.pershinadv.dialog;
//
//        import android.app.Dialog;
//        import android.app.ProgressDialog;
//        import android.os.Bundle;
//        import android.widget.Toast;
//
//        import androidx.annotation.NonNull;
//        import androidx.fragment.app.DialogFragment;
//
//public class MyProgressDialogFragment extends DialogFragment {
//    @NonNull
//    @Override
//    public Dialog onCreateDialog(Bundle savedInstanceState) {
//        ProgressDialog progressDialog = new ProgressDialog(getActivity());
//        progressDialog.setMessage("Выполняется загрузка...");
//        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
//        return progressDialog;
//    }
//
//    @Override
//    public void onResume() {
//        super.onResume();
//        showToast("ProgressDialog отображен");
//    }
//
//    @Override
//    public void onPause() {
//        super.onPause();
//        showToast("ProgressDialog закрыт");
//    }
//
//    private void showToast(String message) {
//        Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
//    }
//}
