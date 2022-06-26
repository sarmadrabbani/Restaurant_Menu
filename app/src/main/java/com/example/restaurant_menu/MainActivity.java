package com.example.restaurant_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox pizza,coffe,burger,tea,sandwitch,frenchfrices;
    Button buttonOrder;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonClick();
    }
    public void addListenerOnButtonClick(){
        //Getting instance of CheckBoxes and Button from the activty_main.xml file
        pizza=(CheckBox)findViewById(R.id.checkBox);
        coffe=(CheckBox)findViewById(R.id.checkBox2);
        burger=(CheckBox)findViewById(R.id.checkBox3);
        tea=(CheckBox)findViewById(R.id.checkBox4);
        sandwitch=(CheckBox)findViewById(R.id.checkBox5);
        frenchfrices=(CheckBox)findViewById(R.id.checkBox6);
        buttonOrder=(Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);

        //Applying the Listener on the Button click
        buttonOrder.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                int totalamount=0;
                StringBuilder result=new StringBuilder();
                result.append("Selected Items:");
                if(pizza.isChecked()){
                    result.append("\nPizza 100Rs");
                    totalamount+=100;
                }
                if(coffe.isChecked()){
                    result.append("\nCoffe 50Rs");
                    totalamount+=50;
                }
                if(burger.isChecked()){
                    result.append("\nBurger 120Rs");
                    totalamount+=120;
                }
                if(tea.isChecked()){
                    result.append("\nTea 20Rs");
                    totalamount+=20;
                }
                if(sandwitch.isChecked()){
                    result.append("\nSandwitch 150Rs");
                    totalamount+=150;
                }
                if(frenchfrices.isChecked()){
                    result.append("\nFrench Fries 140Rs");
                    totalamount+=140;
                }
                result.append("\nTotal: "+totalamount+"Rs");
                //Displaying the message on the toast
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
               // openOrderSucessfull();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOrderSucessfull();
            }
        });
    }
    public void openOrderSucessfull() {
        Intent intent = new Intent(this ,OrderSucessfull.class);
        startActivity(intent);
    }
}