package lg.logindb;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
        private Button b;
        EditText etname,etemail,etpassword;
        TextView tv;

        @Override
        public void onClick(View v) {
            etpassword=(EditText)findViewById(R.id.editText);
            tv.setText("Your Input: \n"+etpassword.getText().toString()+"\nEnd.");
            SQLiteDatabase db = getBaseContext().openOrCreateDatabase("app1.db", MODE_PRIVATE, null);
            db.execSQL("INSERT INTO passwords VALUES (" + etpassword.getText().toString() + ");");
            db.close();
        }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SQLiteDatabase db = getBaseContext().openOrCreateDatabase("app1.db", MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS passwords (name TEXT)");
        db.close();

        b=(Button)findViewById(R.id.button);
        tv=(TextView)findViewById(R.id.textView);

        b.setOnClickListener(this);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DatabaseActivity.class);
                startActivity(intent);
            }
        });
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
}
