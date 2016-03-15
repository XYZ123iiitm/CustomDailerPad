package chat.example.sachin.customdailerpad;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends Activity {

    String s="";
    EditText e1;
    ImageButton b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (ImageButton) findViewById(R.id.ButtonDelete1);
        e1=(EditText)findViewById(R.id.editText_dialpad);
        b1.setOnLongClickListener(new View.OnLongClickListener ()
        {
            @Override
            public boolean onLongClick(View v)
            {
                while(s.length()>=1) {
                    for(int i=0;i<1000000;i++)
                    {

                    }
                    s = s.substring(0, s.length() - 1);
                    e1.setText(s);

                }return true;
            }

        });
    }
    public void onClick(View v)
    {

        Intent i =new Intent(this,MyActivity.class);
        startActivity(i);
    }
    public void button0(View v) {
        int a = 0;
        s = s + "" + a;
        e1.setText(s);
    }

    public void button1(View v) {
        int a = 1;
        s = s + "" + a;
        e1.setText(s);
    }

    public void button2(View v)
    {
        int a=2;
        s=s+""+a;
        e1.setText(s);
    }
    public void button3(View v)
    {
        int a=3;
        s=s+""+a;
        e1.setText(s);
    }
    public void button4(View v)
    {
        int a=4;
        s=s+""+a;
        e1.setText(s);
    }
    public void button5(View v)
    {
        int a=5;
        s=s+""+a;
        e1.setText(s);
    }
    public void button6(View v)
    {
        int a=6;
        s=s+""+a;
        e1.setText(s);
    }
    public void button7(View v)
    {
        int a=7;
        s=s+""+a;
        e1.setText(s);
    }
    public void button8(View v)
    {
        int a=8;
        s=s+""+a;
        e1.setText(s);
    }
    public void button9(View v)
    {
        int a=9;
        s=s+""+a;
        e1.setText(s);
    }
    public void button10(View v)
    {
        char a='*';
        s=s+""+a;
        e1.setText(s);
    }
    public void button11(View v)
    {
        char a='#';
        s=s+""+a;
        e1.setText(s);
    }
    public void buttoncancel(View v)
    {
        if(s.length()>=1)
            s=s.substring(0,s.length()-1);
        e1.setText(s);
    }
    public void buttoncall(View v)
    {
        try {
            Intent i = new Intent(Intent.ACTION_CALL);
            Uri data1 = Uri.parse("tel:" + s);
            i.setData(data1);

            startActivity(i);
        }
        catch (Exception e ){
            e.printStackTrace();
        }

    }

}