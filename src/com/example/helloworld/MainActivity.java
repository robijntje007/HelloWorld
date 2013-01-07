package com.example.helloworld;

import org.json.JSONException;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        final Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//setNewText("tesmlkjqs");
				
					TestJSON();
			
			}
		});
    }

    
   public void setNewText(String tekst){
	   int vari = 7;
	   int varia = 8;
	   int resultaat = vari * varia;
	   String strResultaat = new String(); 
	   strResultaat = Integer.toString( resultaat);
	   
	   
	   TextView tv = new TextView(this);
	   tv.setText(strResultaat);
	   setContentView(tv);
   }
   
}
