package com.example.pcalculadora;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void sumar(View vista){
    	EditText pv1 = (EditText)findViewById(R.id.editText1);
    	EditText pv2 = (EditText)findViewById(R.id.editText2);
    	EditText pv3 = (EditText)findViewById(R.id.editText3);
    	
    	String sv1 = pv1.getText().toString();
    	int v1 = Integer.parseInt(sv1);
    	
    	String sv2 = pv2.getText().toString();
    	int v2 = Integer.parseInt(sv2);
    	
    	int r = v1 + v2;
    	
    	pv3.setText(r+"");
    	
    }
    
    public void restar(View vista){
    	EditText pv1 = (EditText)findViewById(R.id.editText1);
    	EditText pv2 = (EditText)findViewById(R.id.editText2);
    	EditText pv3 = (EditText)findViewById(R.id.editText3);
    	String sv1 = pv1.getText().toString();
    	int v1 = Integer.parseInt(sv1);
    	
    	String sv2 = pv2.getText().toString();
    	int v2 = Integer.parseInt(sv2);
    	
    	int r = v1 - v2;
    	
    	pv3.setText(r+"");
    	
    }
    
    public void multi(View vista){
    	EditText pv1 = (EditText)findViewById(R.id.editText1);
    	EditText pv2 = (EditText)findViewById(R.id.editText2);
    	EditText pv3 = (EditText)findViewById(R.id.editText3);
    	String sv1 = pv1.getText().toString();
    	int v1 = Integer.parseInt(sv1);
    	
    	String sv2 = pv2.getText().toString();
    	int v2 = Integer.parseInt(sv2);
    	
    	int r = v1 * v2;
    	
    	pv3.setText(r+"");
    	
    }
    
    public void divir(View vista){
    	EditText pv1 = (EditText)findViewById(R.id.editText1);
    	EditText pv2 = (EditText)findViewById(R.id.editText2);
    	EditText pv3 = (EditText)findViewById(R.id.editText3);
    	String sv1 = pv1.getText().toString();
    	int v1 = Integer.parseInt(sv1);
    	
    	String sv2 = pv2.getText().toString();
    	int v2 = Integer.parseInt(sv2);
    	
    	if(v2 == 0) {
    		Toast.makeText(this, "Divisiopn porcero", Toast.LENGTH_SHORT).show();
    		
    	}
    	else{
    		int r = v1 / v2;
    		pv3.setText(r+"");
    	}
    	
    	
    	
    	
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
