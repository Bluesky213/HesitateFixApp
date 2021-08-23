package com.example.bluesky.HesitateFix;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText1;
    EditText editText2;
    EditText editText3;
    EditText editText4;
    EditText editText5;
    EditText editText6;
    EditText editText7;
    EditText editText8;

    TextView textView;
    Button button;
    Handler handler=new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=(EditText)findViewById(R.id.editText1);
        editText2=(EditText)findViewById(R.id.editText2);
        editText3=(EditText)findViewById(R.id.editText3);
        editText4=(EditText)findViewById(R.id.editText4);
        editText5=(EditText)findViewById(R.id.editText5);
        editText6=(EditText)findViewById(R.id.editText6);
        editText7=(EditText)findViewById(R.id.editText7);
        editText8=(EditText)findViewById(R.id.editText8);
        textView =(TextView)findViewById(R.id.textView);
        button = (Button) findViewById(R.id.Button1);

        //首先设置editText不可见
        editText1.setVisibility(View.INVISIBLE);
        editText2.setVisibility(View.INVISIBLE);
        editText3.setVisibility(View.INVISIBLE);
        editText4.setVisibility(View.INVISIBLE);
        editText5.setVisibility(View.INVISIBLE);
        editText6.setVisibility(View.INVISIBLE);
        editText7.setVisibility(View.INVISIBLE);
        editText8.setVisibility(View.INVISIBLE);
        hideBottomUIMenu();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onWindowFocusChanged(true);
                textView.setTextColor(getResources().getColor(R.color.greyText));
                String text1= String.valueOf(editText1.getText());
                String text2= String.valueOf(editText2.getText());
                String text3= String.valueOf(editText3.getText());
                String text4= String.valueOf(editText4.getText());
                String text5= String.valueOf(editText5.getText());
                String text6= String.valueOf(editText6.getText());
                String text7= String.valueOf(editText7.getText());
                String text8= String.valueOf(editText8.getText());
                if (text1.equals(""))
                {
                        handler.post(new Runnable() {
                        int time=0;
                            @Override
                            public void run() {
                                //handler.postDelayed(this,2000);
                                int number;
                                number = (int) (Math.random() * 100);//使用随机数时要用括号把整个获得随机数的部分括起来
                                if (number < 55)
                                {
                                    textView.setText("Yes");
                                }
                                else
                                {
                                    textView.setText("No");
                                }
                                time++;
                                if(time<20)
                                {
                                    handler.postDelayed(this, 50);//this相当于再次调用自身的递归
                                }
                                if(time==20)
                                {
                                    if(textView.getText()=="Yes")
                                    {
                                        textView.setTextColor(getResources().getColor(R.color.blueYes));
                                        Toast.makeText(MainActivity.this, "Just do it!", Toast.LENGTH_SHORT).show();
                                    }
                                    else
                                    {
                                        Toast.makeText(MainActivity.this, "Just relax^_^", Toast.LENGTH_SHORT).show();
                                        textView.setTextColor(getResources().getColor(R.color.redNo));
                                    }
                                }
                            }
                        });
                }
                else
                {
                    int random=0;
                    if(text3.equals(""))
                    {
                        random=(int)(Math.random()*2)+1;
                        switch (random)
                        {
                            case 1:textView.setText(text1);break;
                            case 2:textView.setText(text2);break;
                        }
                    }
                    if (!text3.equals("")&&text4.equals(""))
                    {
                        random=(int)(Math.random()*3)+1;
                        switch (random)
                        {
                            case 1:textView.setText(text1);break;
                            case 2:textView.setText(text2);break;
                            case 3:textView.setText(text3);break;
                        }
                    }
                    if (!text4.equals("")&&text5.equals(""))
                    {
                        random=(int)(Math.random()*4)+1;
                        switch (random)
                        {
                            case 1:textView.setText(text1);break;
                            case 2:textView.setText(text2);break;
                            case 3:textView.setText(text3);break;
                            case 4:textView.setText(text4);break;
                        }
                    }
                    if (!text5.equals("")&&text6.equals(""))
                    {
                        random=(int)(Math.random()*5)+1;
                        switch (random)
                        {
                            case 1:textView.setText(text1);break;
                            case 2:textView.setText(text2);break;
                            case 3:textView.setText(text3);break;
                            case 4:textView.setText(text4);break;
                            case 5:textView.setText(text5);break;
                        }
                    }
                    if (!text6.equals("")&&text7.equals(""))
                    {
                        random=(int)(Math.random()*6)+1;
                        switch (random)
                        {
                            case 1:textView.setText(text1);break;
                            case 2:textView.setText(text2);break;
                            case 3:textView.setText(text3);break;
                            case 4:textView.setText(text4);break;
                            case 5:textView.setText(text5);break;
                            case 6:textView.setText(text6);break;
                        }
                    }
                    if (!text7.equals("")&&text8.equals(""))
                    {
                        random=(int)(Math.random()*7)+1;
                        switch (random)
                        {
                            case 1:textView.setText(text1);break;
                            case 2:textView.setText(text2);break;
                            case 3:textView.setText(text3);break;
                            case 4:textView.setText(text4);break;
                            case 5:textView.setText(text5);break;
                            case 6:textView.setText(text6);break;
                            case 7:textView.setText(text7);break;
                        }
                    }
                    if (!text8.equals("")) {
                        random = (int) (Math.random() * 8) + 1;
                        switch (random) {
                            case 1:textView.setText(text1);break;
                            case 2:textView.setText(text2);break;
                            case 3:textView.setText(text3);break;
                            case 4:textView.setText(text4);break;
                            case 5:textView.setText(text5);break;
                            case 6:textView.setText(text6);break;
                            case 7:textView.setText(text7);break;
                            case 8:textView.setText(text8);break;
                        }
                    }
                    //System.out.println("The random is:"+random);
                    Toast.makeText(MainActivity.this,"Good Luck!",Toast.LENGTH_SHORT).show();
                }
            }
        });
        button.setOnLongClickListener(new View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                onWindowFocusChanged(true);
                //textView.setText("");
                editText1.setVisibility(View.VISIBLE);
                editText2.setVisibility(View.VISIBLE);
                editText3.setVisibility(View.VISIBLE);
                editText4.setVisibility(View.VISIBLE);
                editText5.setVisibility(View.VISIBLE);
                editText6.setVisibility(View.VISIBLE);
                editText7.setVisibility(View.VISIBLE);
                editText8.setVisibility(View.VISIBLE);
                return true;
            }
        });
    }
    protected void hideBottomUIMenu() {
        //隐藏虚拟按键，并且全屏
        if (Build.VERSION.SDK_INT > 11 && Build.VERSION.SDK_INT < 19) { // lower api
            View v = this.getWindow().getDecorView();
            v.setSystemUiVisibility(View.GONE);
        } else if (Build.VERSION.SDK_INT >= 19) {
            //for new api versions.
            View decorView = getWindow().getDecorView();
            int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY | View.SYSTEM_UI_FLAG_FULLSCREEN;
            decorView.setSystemUiVisibility(uiOptions);
        }
    }
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if( hasFocus ) {
            hideBottomUIMenu();
        }
    }

}
