package com.example.markspc.rmo;

import android.support.v4.app.Fragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Marks PC on 08/12/2017.
 */

public class ClockOutFragment  extends Fragment implements View.OnClickListener{

    private SharedPreferences pref;

    private ImageView img_rmo_clockout;
    private TextView txt_clockout;
    private CalendarView calendarView3;
    private Button btn_clockout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_clockout,container,false);
        initViews(view);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        pref = getActivity().getPreferences(0);

        txt_clockout.setText("Hi "+pref.getString(Constants.NAME,"")+"please click on the button at the bottom to clock out.");


    }

    private void initViews(View view ){

        img_rmo_clockout = view.findViewById(R.id.img_rmo_clockout);
        txt_clockout = view.findViewById(R.id.txt_clockout);
        calendarView3 = view.findViewById(R.id.calendarView3);
        btn_clockout = view.findViewById(R.id.btn_clockout);
        btn_clockout.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

    }
}
