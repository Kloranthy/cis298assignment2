package edu.kvcc.cis298.cis298assignment2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

// todo: onCreate bundle
public class ConverterActivity
	extends AppCompatActivity
{
	// constants
	private static final String TAG                       = "ConverterActivity";
	private static final String KEY_ORIGINAL_TEMPERATURE  = "original_temperature";
	private static final String KEY_CONVERTED_TEMPERATURE = "converted_temperature";
	private static final String KEY_FROM                  = "from";
	private static final String KEY_TO                    = "to";

	// variables
	private TextView tvResult, tvFormula;
	private EditText   etTemperature;
	private Button     btnConvert;
	private RadioGroup rgSource, rgTarget;
	private RadioButton rbSourceCelsius, rbSourceFahrenheit, rbSourceKelvin, rbSourceRankine,
		rbTargetCelsius, rbTargetFahrenheit, rbTargetKelvin, rbTargetRankine;
	private double originalTemperature, convertedTemperature;
	private int sourceFormat, targetFormat;

	// overridden methods
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		Log.d(TAG, "onCreate(Bundle) called");
		setContentView(R.layout.activity_converter);

		// todo: get values from the bundle and use to initialize

		etTemperature = (EditText) findViewById(R.id.et_temperature);

		rgSource = (RadioGroup) findViewById(R.id.rg_source);
		rbSourceCelsius = (RadioButton) findViewById(R.id.rb_source_celsius);
		rbSourceFahrenheit = (RadioButton) findViewById(R.id.rb_source_fahrenheit);
		rbSourceKelvin = (RadioButton) findViewById(R.id.rb_source_kelvin);
		rbSourceRankine = (RadioButton) findViewById(R.id.rb_source_rankine);

		rgTarget = (RadioGroup) findViewById(R.id.rg_target);
		rbTargetCelsius = (RadioButton) findViewById(R.id.rb_target_celsius);
		rbTargetFahrenheit = (RadioButton) findViewById(R.id.rb_target_fahrenheit);
		rbTargetKelvin = (RadioButton) findViewById(R.id.rb_target_kelvin);
		rbTargetRankine = (RadioButton) findViewById(R.id.rb_target_rankine);

		btnConvert = (Button) findViewById(R.id.btn_convert);

		tvResult = (TextView) findViewById(R.id.tv_result);
		tvFormula = (TextView) findViewById(R.id.tv_formula);

		etTemperature.addTextChangedListener(new TextWatcher()
		{
			@Override
			public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
			{
			}

			@Override
			public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
			{
				try
				{
					double temp = Double.parseDouble(charSequence.toString());
					originalTemperature = temp;
				}
				catch (Exception e)
				{
					Log.d(TAG, "wrong arg type");
				}

			}

			@Override
			public void afterTextChanged(Editable editable)
			{
			}
		});

		btnConvert.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				convertedTemperature =
					Temperature.convertTemperature(originalTemperature, getSelectedSourceFormat(),
															 getSelectedTargetFormat()
															);
				tvResult.setText(convertedTemperature + " degrees ");
			}
		});
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
		savedInstanceState.putDouble(KEY_ORIGINAL_TEMPERATURE, originalTemperature);
		savedInstanceState.putDouble(KEY_CONVERTED_TEMPERATURE, convertedTemperature);
		savedInstanceState.putInt(KEY_FROM, sourceFormat);
		savedInstanceState.putInt(KEY_TO, targetFormat);
	}

	private int getSelectedSourceFormat()
	{
		switch (rgSource.getCheckedRadioButtonId())
		{

			case R.id.rb_source_celsius:
				sourceFormat = Temperature.CELSIUS;
				break;
			case R.id.rb_source_fahrenheit:
				sourceFormat = Temperature.FAHRENHEIT;
				break;
			case R.id.rb_source_kelvin:
				sourceFormat = Temperature.KELVIN;
				break;
			case R.id.rb_source_rankine:
				sourceFormat = Temperature.RANKINE;
				break;
			default: // shouldn't happen
				sourceFormat = Temperature.CELSIUS;
		}
		return sourceFormat;

	}

	private int getSelectedTargetFormat()
	{
		switch (rgTarget.getCheckedRadioButtonId())
		{
			case R.id.rb_target_celsius:
				targetFormat = Temperature.CELSIUS;
				break;
			case R.id.rb_target_fahrenheit:
				targetFormat = Temperature.FAHRENHEIT;
				break;
			case R.id.rb_target_kelvin:
				targetFormat = Temperature.KELVIN;
				break;
			case R.id.rb_target_rankine:
				targetFormat = Temperature.RANKINE;
				break;
			default: // shouldn't happen
				targetFormat = Temperature.CELSIUS;
		}
		return targetFormat;
	}
}
