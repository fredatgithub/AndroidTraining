package org.premiereappli;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static org.premiereappli.MainActivity.EXTRA_MESSAGE;

public class Main2Activity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // init
        //Intent ri = getIntent();
        //String s = ri.getStringExtra("key1");
        //Toast.makeText(this, s, Toast.LENGTH_SHORT).show();

        // intent
        final Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        final TextView tv1 = (TextView)findViewById( R.id.resultat );
        tv1.setText( message );

        Button b_retour =(Button)findViewById(R.id.bouton_retour);
        b_retour.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent();
                i2.putExtra(MainActivity.EXTRA_MESSAGE, "valeur de retour");
                Main2Activity.this.setResult(1, i2);
                Main2Activity.this.finish();
            }
        });
    }
}
