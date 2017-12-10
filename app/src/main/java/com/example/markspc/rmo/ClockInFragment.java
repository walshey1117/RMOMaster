package com.example.markspc.rmo;

import android.support.v4.app.Fragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
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

public class ClockInFragment extends Fragment implements View.OnClickListener{

    private SharedPreferences pref;

    private ImageView img_rmo_clockin;
    private TextView txt_clockin;
    private CalendarView calendarView2;
    private Button btn_clockin;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_clockin,container,false);
        initViews(view);
        return inflater.inflate(R.layout.fragment_clockin, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        pref = getActivity().getPreferences(0);

        txt_clockin.setText("Hi "+pref.getString(Constants.NAME,"")+"please click on the button at the bottom to clock in.");


    }

    private void initViews(View view ){

        img_rmo_clockin = view.findViewById(R.id.img_rmo_clockin);
        txt_clockin = view.findViewById(R.id.txt_clockin);
        calendarView2 = view.findViewById(R.id.calendarView2);
        btn_clockin = view.findViewById(R.id.btn_clockin);
        btn_clockin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

    }
}
