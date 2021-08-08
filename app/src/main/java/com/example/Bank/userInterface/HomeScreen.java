package com.example.Bank.userInterface;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.Bank.R;

public class HomeScreen extends AppCompatActivity {

//    Animation anim;
//    ImageView bankLogo;
//    TextView tvBankTitle;
    Button btnAllUsers, btnAllTransactions;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAllUsers = findViewById(R.id.B_User);
        btnAllTransactions = findViewById(R.id.B_T);

        btnAllUsers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreen.this,UsersList.class);
                startActivity(intent);
            }
        });

        btnAllTransactions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreen.this,TransactionHistory.class);
                startActivity(intent);
            }
        });
    }

   public void showAllUsers(View view) {
        Intent intent = new Intent(this, UsersList.class);
        startActivity(intent);
    }

    public void showAllTransactions(View view) {
        Intent intent = new Intent(this, TransactionHistory.class);
        startActivity(intent);
    }
}