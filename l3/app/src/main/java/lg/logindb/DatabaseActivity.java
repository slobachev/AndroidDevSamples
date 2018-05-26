package lg.logindb;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by Augustus on 5/19/2018.
 */

public class DatabaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.database_main);

        SQLiteDatabase db = getBaseContext().openOrCreateDatabase("app1.db", MODE_PRIVATE, null);

        Cursor query = db.rawQuery("SELECT * FROM passwords;", null);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText("You haven't added data yet");
        if(query.moveToFirst()) {
            textView2.setText("");
            do {
                String name = query.getString(0);
                textView2.append("Password: " + name + "\n");
            }
            while (query.moveToNext());
        }
        query.close();
        db.close();
    }
}
