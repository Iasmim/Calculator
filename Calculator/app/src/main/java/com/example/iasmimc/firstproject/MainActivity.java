package com.example.iasmimc.firstproject;

        import android.app.Activity;
        import android.content.DialogInterface;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;


        import java.util.ArrayList;
        import java.util.List;

public class MainActivity extends Activity {

    public static final String texto = "";
    public static  double result = 0;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView t = (TextView) findViewById(R.id.texto);
        final Button n1 = (Button) findViewById(R.id.n1);
        final Button n2 = (Button) findViewById(R.id.n2);
        final Button n3 = (Button) findViewById(R.id.n3);
        final Button n4 = (Button) findViewById(R.id.n4);
        final Button n5 = (Button) findViewById(R.id.n5);
        final Button n6 = (Button) findViewById(R.id.n6);
        final Button n7 = (Button) findViewById(R.id.n7);
        final Button n8 = (Button) findViewById(R.id.n8);
        final Button n9 = (Button) findViewById(R.id.n9);
        final Button n0 = (Button) findViewById(R.id.n0);
        final Button div = (Button) findViewById(R.id.div);
        final Button mult = (Button) findViewById(R.id.mult);
        final Button sum = (Button) findViewById(R.id.plus);
        final Button minus = (Button) findViewById(R.id.minus);

        final Button point = (Button) findViewById(R.id.point);
        final Button enter = (Button) findViewById(R.id.enter);

        final Button clean = (Button) findViewById(R.id.clean);
        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String f = t.getText().toString();

                t.setText(f + n0.getText().toString());
            }
        });
        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String f = t.getText().toString();

                t.setText(f + n1.getText().toString());
            }
        });
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String f = t.getText().toString();

                t.setText(f + n2.getText().toString());
            }
        });
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String f = t.getText().toString();

                t.setText(f + n3.getText().toString());
            }
        });
        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String f = t.getText().toString();

                t.setText(f + n4.getText().toString());
            }
        });
        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String f = t.getText().toString();

                t.setText(f + n5.getText().toString());
            }
        });
        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String f = t.getText().toString();

                t.setText(f + n6.getText().toString());
            }
        });
        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String f = t.getText().toString();

                t.setText(f + n7.getText().toString());
            }
        });
        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String f = t.getText().toString();

                t.setText(f + n8.getText().toString());
            }
        });
        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String f = t.getText().toString();

                t.setText(f + n9.getText().toString());
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String f = t.getText().toString();

                t.setText(f + " " + div.getText().toString() + " ");
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String f = t.getText().toString();

                t.setText(f + " " + mult.getText().toString() + " ");
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String f = t.getText().toString();

                t.setText(f + " " + minus.getText().toString() + " ");
            }
        });
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String f = t.getText().toString();

                t.setText(f + " " + sum.getText().toString() + " ");
            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String f = t.getText().toString();

                t.setText(f + point.getText().toString());
            }
        });

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String f = t.getText().toString();
                String[] vls = f.split(" ");
                t.setText(Resolve(vls));

            }
        });
        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.setText(null);

            }
        });
    }


    public static String Resolve(String[] vls) {

        try {
            result = Double.parseDouble(vls[0].toString());
            int count = 0;
            while (count < vls.length -1)
            {

                     if(vls[count + 1].equals("/"))
                         result /= Double.parseDouble(vls[count+2].toString());
                    if(vls[count + 1].equals("x"))
                        result *= Double.parseDouble(vls[count+2].toString());
                    if(vls[count + 1].equals("+"))
                        result += Double.parseDouble(vls[count+2].toString());
                    if(vls[count + 1].equals("-"))
                        result -= Double.parseDouble(vls[count+2].toString());
                    count = count+2;

            }

            return ""+ result + "";
        } catch (Exception ex) {
            return "Error";
        }

    }
}
