package c.example.a42homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void oncheckBoxClicked(View view) { boolean checked = ((CheckBox) view).isChecked();
        // Check which radio button was clicked.
        switch (view.getId()) {
            case R.id.chocolate_box :
            case R.id.cherries_box:
                if (checked)
                    // Same day service
                    showToast(getString(R.string.cherries_chkbox));
                break;
            case R.id.sprinkie_box :
                if (checked)
                    // Next day delivery
                    showToast(getString(R.string.sprinkles_chkbox));
                break;
            case R.id.nuts_box:
                if (checked)
                    // Pick up
                    showToast(getString(R.string.crushed_nuts_chkbox));
                break;
            // Pick up
            case R.id.orio_box:
                if (checked)
                    // Pick up
                    showToast(getString(R.string.orio_cookie_crumbles_chkbox));
                break;
            default:
                // Do nothing.
                break;
        }
    }


    public void showToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }


}