package com.mobilprogramlama.hafta6_proje2;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user,pass;
    Button login,cancel;
    Context context=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user=(EditText) findViewById(R.id.editTextText);
        pass=(EditText) findViewById(R.id.editTextText2);
        login=(Button) findViewById(R.id.button);
        cancel=(Button) findViewById(R.id.button2);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(user.getText().toString().equalsIgnoreCase("admin")&&pass.getText().toString().equals("1234"))
                {
                    Toast.makeText(context,"Giriş Başarılı",Toast.LENGTH_LONG).show();
                } else
                {
                    Toast.makeText(context,"Kullanıcı adı yada şifre hatalı",Toast.LENGTH_LONG).show();
                }
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user.setText("");
                pass.setText("");
            }
        });
    }
}