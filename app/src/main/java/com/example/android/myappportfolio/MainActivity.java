package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyAppPortfolioActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Called when the user touches a button
     */
    public void sendMessage(View view) {
        // First we fidn the button clicked
        Button clickedButton = (Button) findViewById(view.getId());
        // We extract the button text
        String buttonText = clickedButton.getText().toString();
        // Extra: To enhaced readability, we add the word app
        // at the end of the button text
        String[] temp = buttonText.split(" ");
        if (!temp[temp.length - 1].equals("app")) {
            buttonText += " app";
        }
        String forecast = getString(R.string.toast_launch_app)
                        + " "
                        + buttonText.toUpperCase();
        Toast.makeText(getApplicationContext(), forecast, Toast.LENGTH_SHORT).show();
    }
}
