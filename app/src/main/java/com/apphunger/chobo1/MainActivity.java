package com.apphunger.chobo1;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText loginEdit;
    EditText pwdEdit;

    String loginStr = "chicken";
    String pwdStr = "apps";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.loginBtn);
        loginEdit = (EditText)findViewById(R.id.loginEdit);
        pwdEdit = (EditText)findViewById(R.id.pwdEdit);


        btn.setOnClickListener(l);



    }
    View.OnClickListener l = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if(v.getId()==R.id.loginBtn) {

                if (loginStr.equals(loginEdit.getText().toString())&&
                        pwdStr.equals(pwdEdit.getText().toString())){
                    Toast.makeText(v.getContext(), "로그인 되었습니다" , Toast.LENGTH_SHORT).show();


                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);

                    startActivity(intent);
                    finish();
                }
                //Toast.makeText(v.getContext(), "ID:"+loginEdit.getText().toString(), Toast.LENGTH_SHORT).show();
                //Toast.makeText(v.getContext(), "PWD:"+pwdEdit.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        }
    };



}
