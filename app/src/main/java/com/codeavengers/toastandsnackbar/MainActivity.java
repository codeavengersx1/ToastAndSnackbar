package com.codeavengers.toastandsnackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity
{
    private Button btnShowToast, btnShowSnackbar;
    private View currentScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        * Init the Buttons
        * */
        btnShowToast = findViewById(R.id.btnShowToast);
        btnShowSnackbar = findViewById(R.id.btnShowSnackbar);

        /*
        * Find out the ID of current Activity or Screen
        * */
        currentScreen = findViewById(android.R.id.content);

        /*
        * How to find out the Context for Current Activity? #ForHosh
        *
        * ClassName.this
        * */
        Context firstWay = this;
        Context secondWayFav = MainActivity.this;

        /*
        * Click Listener on Button
        * */
        btnShowToast.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                /*
                * Show a Toast #Janmabhar
                * */
                Toast.makeText(MainActivity.this, "Me ahe Toast. Asa disto me.", Toast.LENGTH_LONG).show();
            }
        });

        btnShowSnackbar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                /*
                * Show a Snackbar #JanmabharButCustomizable
                * */
                Snackbar.make(currentScreen, "Hi I am Snackbar. Asa disto me", Snackbar.LENGTH_LONG).show();
            }
        });
    }
}
