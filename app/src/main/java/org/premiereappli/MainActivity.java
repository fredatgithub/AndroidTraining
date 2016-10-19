package org.premiereappli;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // init
        Button b1 = (Button)findViewById(R.id.button);
        final TextView tv1 = (TextView)findViewById(R.id.textView);
        final TextView tv2 = (TextView)findViewById(R.id.edit1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText("Hello World");
                Log.v("log", "coucou");
                Toast.makeText(MainActivity.this, "coucou", Toast.LENGTH_LONG).show();

                // 1. Appeler une URL web
                //String url = "http://www.ltm.fr";
                //Intent intent = new Intent( Intent.ACTION_VIEW, Uri.parse( url ) );
                //startActivity(intent);

                //String u = "geo:48.892684,2.237703";
                //Intent intent2 = new Intent( Intent.ACTION_VIEW, Uri.parse(u) );
                //startActivity(intent2);

                //Intent i1 = new Intent(MainActivity.this, Main2Activity.class);
                //i1.putExtra("key1", "bonjour MainActivity2 from MainAcitivity1");
                //startActivity(i1);

                Intent i1 = new Intent( MainActivity.this, Main2Activity.class );
                i1.putExtra(EXTRA_MESSAGE, tv2.getText().toString());
                startActivityForResult(i1, 0);

            }
        });
    }

    public final static String EXTRA_MESSAGE =  "message à passer";

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("log", "OnDestroy()");
    }
}
