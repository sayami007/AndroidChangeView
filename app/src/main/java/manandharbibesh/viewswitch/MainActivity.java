package manandharbibesh.viewswitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ViewSwitcher switcher = (ViewSwitcher) findViewById(R.id.my_switcher);
        final TextView myTV = (TextView) switcher.findViewById(R.id.clickable_text_view);
        final EditText myET = (EditText) switcher.findViewById(R.id.hidden_edit_view);
        final Button change = (Button) findViewById(R.id.change);
        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switcher.showNext();
                myTV.setText(myET.getText().toString());
                myET.setText(myTV.getText().toString());
            }
        });
    }


}
