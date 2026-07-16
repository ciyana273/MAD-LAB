package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {
    float mvalveone,mvaluetwo;
    boolean add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edt1 = findViewById(R.id.edt1);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);

        Button btn20 = findViewById(R.id.btn20);
        Button btn21 = findViewById(R.id.btn21);
        Button btn11 = findViewById(R.id.btn11);
        Button btn12 = findViewById(R.id.btn12);
        Button btn13 = findViewById(R.id.btn13);
        Button btn14 = findViewById(R.id.btn14);
        Button btn55 = findViewById(R.id.btn55);
        Button btn66 = findViewById(R.id.btn66);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"1");

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"2");

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"3");

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"4");

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"5");

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"6");

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"7");

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"8");

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"9");

            }
        });
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"0");

            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edt1 == null) {
                    edt1.setText("");
                } else {
                    mvalveone =
                            Float.parseFloat((edt1.getText() + " "));
                    add = true;
                    edt1.setText(null);
                }
            }
            {
                btn12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (edt1 == null){
                        edt1.setText("");
                    } else {
                        mvalveone =
                                Float.parseFloat((edt1.getText()+" "));
                        sub=true;
                        edt1.setText(null);

                    }
                }
                    {
                        btn13.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                if (edt1 == null){
                                    edt1.setText("");
                                } else {
                                    mvalveone=Float.parseFloat((edt1.getText()+" "));
                                    div=true;
                                    edt1.setText(null);
                                }

                            }
                        });

                        {
                            btn14.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (edt1 ==null){
                                        edt1.setText("");

                                    } else {
                                        mvalveone=Float.parseFloat((edt1.getText()+ ""));
                                        mul=true;
                                        edt1.setText(null);
                                    }


                                }

                            });
                            btn55.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {

                                    mvaluetwo = Float.parseFloat(edt1.getText().toString());

                                    if (add) {
                                        edt1.setText(String.valueOf(mvalveone + mvaluetwo));
                                        add = false;
                                    }

                                    if (sub) {
                                        edt1.setText(String.valueOf(mvalveone - mvaluetwo));
                                        sub = false;
                                    }

                                    if (mul) {
                                        edt1.setText(String.valueOf(mvalveone * mvaluetwo));
                                        mul = false;
                                    }

                                    if (div) {
                                        edt1.setText(String.valueOf(mvalveone / mvaluetwo));
                                        div = false;
                                    }
                                }
                            });
                             btn21.setOnClickListener(
                                     new View.OnClickListener() {
                                         @Override
                                         public void onClick(View view) {
                                             edt1.setText("");

                                         }
                                     }
                             );

                        }
                    }
            });}





        });

    }









}
