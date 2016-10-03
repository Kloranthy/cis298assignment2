package edu.kvcc.cis298.cis298assignment2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;

public class ConverterActivity
	extends AppCompatActivity
{
	// constants
	private static final String TAG = "ConverterActivity";
	private static final String KEY_TEMPERATURE = "temperature";
	private static final String KEY_FROM = "from";
	private static final String KEY_TO = "to";

	// variables
	private Button btnConvert;

	// overridden methods
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		Log.d(TAG, "onCreate(Bundle) called");
		setContentView(R.layout.activity_converter);

		btnConvert = (Button) findViewById(R.id.btn_convert);
	}

	@Override
	protected void onResume()
	{
		super.onResume();
		Log.d(TAG, "onResume() called");
	}

	@Override
	protected void onPause()
	{
		super.onPause();
		Log.d(TAG, "onPause() called");
	}

	@Override
	protected void onStop()
	{
		super.onStop();
		Log.d(TAG, "onStop() called");
	}

	@Override
	protected void onDestroy()
	{
		super.onDestroy();
		Log.d(TAG, "onDestroy() called");
	}

	@Override
	protected void onSaveInstanceState(Bundle savedInstanceState)
	{
		super.onSaveInstanceState(savedInstanceState);
		Log.i(TAG, "onSaveInstanceState(Bundle) called");
		//savedInstanceState.put
	}
}
