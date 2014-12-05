package pouteam.com.example.pouteam;

import android.support.v7.app.ActionBarActivity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SubmitForm extends ActionBarActivity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_submit_form);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		

		Button submitInfo = (Button)findViewById(R.id.submitInfo);
		final EditText Vacc = (EditText) findViewById(R.id.Vacc);
		final EditText Morts = (EditText) findViewById(R.id.Morts);
		final EditText Infect = (EditText) findViewById(R.id.Infect);
		submitInfo.setOnClickListener(new View.OnClickListener() {	
			@Override
			 public void onClick(View v) {
             //envoyer les donnees vers le serveur apres avoir recup les valeurs des fields
				Log.d("EditText", Vacc.getText().toString());
	            String TextInVacc = Vacc.getText().toString();
	            Log.d("EditText", Morts.getText().toString());
	            String TextInMorts = Morts.getText().toString();
	            Log.d("EditText", Infect.getText().toString());
	            String TextInInfect = Infect.getText().toString();
            }
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.submit_form, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
