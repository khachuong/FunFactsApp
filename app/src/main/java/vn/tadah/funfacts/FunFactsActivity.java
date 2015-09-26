package vn.tadah.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final FactBook factBook = new FactBook();
        final BackgroundColors backgroundColors = new BackgroundColors();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare View variables
        final TextView factLabel =  (TextView) findViewById(R.id.factTextView);
        final Button showFactButton =  (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.relativeLayout);
        View.OnClickListener listener =  new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                factLabel.setText(factBook.getFact());
                int color = backgroundColors.getColor();
                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);



            }
        };
        showFactButton.setOnClickListener(listener);
        Toast showToast = Toast.makeText(this, "Hello World", Toast.LENGTH_LONG);
        showToast.show();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fun_facts, menu);
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
}
