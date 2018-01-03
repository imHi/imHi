package com.example.star.imhi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view)throws Exception
    {
        //LoginVerify.singleSend(getString(R.string.apikey),"null","18020536089");
     //  LoginVerify.testSendSms("123","18020536089","【imHi聊】验证码为123456");
       //String re = LoginVerify.sendSms("0e7842b4a51f98d19c2332240c67e17d","imHi聊】验证码为123456","18020536089");
        new Thread(new LoginVerify()).start();
       //Log.e("res",re+"        result");
       Log.e("info","send send");

    }
}
