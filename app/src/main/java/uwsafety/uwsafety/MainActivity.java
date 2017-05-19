package uwsafety.uwsafety;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.*;
import android.view.*;
import android.widget.*;


public class MainActivity extends AppCompatActivity {

    private ImageButton mapsButton;
    private ImageButton homeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapsButton = (ImageButton) findViewById(R.id.mapView);

        //Assign a listener to your button
        mapsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start your second activity
                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(intent);
            }
        });

    }




}
