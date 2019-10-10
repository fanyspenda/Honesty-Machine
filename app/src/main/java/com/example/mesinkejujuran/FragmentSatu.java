package com.example.mesinkejujuran;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentSatu extends Fragment {

    View view1;
    EditText et1;
    TextView tv1;
    Button btn1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        view1 = inflater.inflate(R.layout.activity_fragment_satu, container, false);
        btn1 = view1.findViewById(R.id.button1);
        et1 = view1.findViewById(R.id.editText1);
        tv1 = view1.findViewById(R.id.textView1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String [] text = et1.getText().toString().split(",");
                boolean checker = true;
                for (int i=text.length-1; i>=0; i--){
                    if (text[i].equals("bohong")){
                        checker=false;
                    }else {
                        checker=true;
                    }

                    if (!checker){
                        if (text[i].equals("bohong")){
                            text[i]="jujur";
                        }else if (text[i].equals("jujur")){
                            text[i]="bohong";
                        }
                    }
                }

                tv1.setText(text[0]);
            }
        });

        return view1;
    }
}
