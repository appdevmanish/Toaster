package com.manishmundra.toaster;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Button successBtn,errorBtn,infoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        successBtn=(Button)findViewById(R.id.success_button);
        errorBtn=(Button)findViewById(R.id.error_button);
        infoButton=(Button)findViewById(R.id.info_button);

        successBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toaster.showSuccessToast(MainActivity.this,"Success Toast");
            }
        });

        errorBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toaster.showErrorToast(MainActivity.this,"Error Toast");
            }
        });

        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toaster.showInfoToast(MainActivity.this,"Info Toast");
            }
        });

    }
}
