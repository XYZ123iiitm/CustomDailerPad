package chat.example.sachin.customdailerpad;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MyActivity extends AppCompatActivity implements View.OnClickListener{

    String s="";
    EditText editText_dialpad;
    TextView text_q,text_w,text_e,text_r,text_t,text_y,text_u,text_i,text_o,text_p,text_a,text_s1,text_d1,text_f,text_g,text_h,
            text_j,text_k,text_l,text_z,text_x,text_c,text_v,text_b,text_n,text_m,text_space,text_at_rate,text_dot;
    ImageButton b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.keyboard);
        editText_dialpad=(EditText)findViewById(R.id.editText_dialpad);
        b1 = (ImageButton) findViewById(R.id.ButtonDelete1);

        text_q=(TextView)findViewById(R.id.text_q);
        text_w=(TextView)findViewById(R.id.text_w);
        text_e=(TextView)findViewById(R.id.text_e);
        text_r=(TextView)findViewById(R.id.text_r);
        text_t=(TextView)findViewById(R.id.text_t);
        text_y=(TextView)findViewById(R.id.text_y);
        text_u=(TextView)findViewById(R.id.text_u);
        text_i=(TextView)findViewById(R.id.text_i);
        text_o=(TextView)findViewById(R.id.text_o);
        text_p=(TextView)findViewById(R.id.text_p);
        text_a=(TextView)findViewById(R.id.text_a);
        text_s1=(TextView)findViewById(R.id.text_s1);
        text_d1=(TextView)findViewById(R.id.text_d1);
        text_f=(TextView)findViewById(R.id.text_f);
        text_g=(TextView)findViewById(R.id.text_g);
        text_h=(TextView)findViewById(R.id.text_h);
        text_j=(TextView)findViewById(R.id.text_j);
        text_k=(TextView)findViewById(R.id.text_k);
        text_l=(TextView)findViewById(R.id.text_l);
        text_z=(TextView)findViewById(R.id.text_z);
        text_x=(TextView)findViewById(R.id.text_x);
        text_c=(TextView)findViewById(R.id.text_c);
        text_v=(TextView)findViewById(R.id.text_v);
        text_b=(TextView)findViewById(R.id.text_b);
        text_n=(TextView)findViewById(R.id.text_n);
        text_m=(TextView)findViewById(R.id.text_m);
        text_at_rate=(TextView)findViewById(R.id.text_at_rate);
        text_dot=(TextView)findViewById(R.id.text_dot);
        text_space=(TextView)findViewById(R.id.text_space);
        text_q.setOnClickListener(this);
        text_w.setOnClickListener(this);
        text_e.setOnClickListener(this);
        text_r.setOnClickListener(this);
        text_t.setOnClickListener(this);
        text_y.setOnClickListener(this);
        text_u.setOnClickListener(this);
        text_i.setOnClickListener(this);
        text_o.setOnClickListener(this);
        text_p.setOnClickListener(this);
        text_a.setOnClickListener(this);
        text_s1.setOnClickListener(this);
        text_d1.setOnClickListener(this);
        text_f.setOnClickListener(this);
        text_g.setOnClickListener(this);
        text_h.setOnClickListener(this);
        text_j.setOnClickListener(this);
        text_k.setOnClickListener(this);
        text_l.setOnClickListener(this);
        text_z.setOnClickListener(this);
        text_x.setOnClickListener(this);
        text_c.setOnClickListener(this);
        text_v.setOnClickListener(this);
        text_b.setOnClickListener(this);
        text_n.setOnClickListener(this);
        text_m.setOnClickListener(this);
        text_at_rate.setOnClickListener(this);
        text_dot.setOnClickListener(this);
        text_space.setOnClickListener(this);


        b1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                while (s.length() >= 1) {
                    for (int i = 0; i < 1000000; i++) {

                    }
                    s = s.substring(0, s.length() - 1);
                    editText_dialpad.setText(s);

                }
                return true;
            }

        });
    }


    @Override
    public void onClick(View v) {

        String s1=" ";
        try{
            s1=editText_dialpad.getText().toString();
        }catch (Exception e){
            s1=" ";
        }

        TextView t=(TextView)v;
        String s2=t.getText().toString();

        editText_dialpad.setText(s1+s2);

    }

    public void buttoncancel(View v)
    {
        try{
            s=editText_dialpad.getText().toString();
        }catch (Exception e){
            s=" ";
        }
        if(s.length()>=1)
            s=s.substring(0,s.length()-1);
        editText_dialpad.setText(s);
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
