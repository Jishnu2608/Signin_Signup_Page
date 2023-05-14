package com.example.assignmentstartuppage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.button2);
        btn2=findViewById(R.id.button3);
        btn3=findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager
                        fragmentManager=getSupportFragmentManager();
                FragmentTransaction
                        fragmentTransaction=fragmentManager.beginTransaction();
                BlankFragment blankFragment=new BlankFragment();

                fragmentTransaction.add(R.id.framelayout,blankFragment,null);
                fragmentTransaction.commit();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new
                        Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });

    }
}