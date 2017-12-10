package com.example.markspc.rmo;

import android.support.v4.app.Fragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by Marks PC on 08/12/2017.
 */

public class LocationsFragment  extends Fragment implements View.OnClickListener, AdapterView.OnItemSelectedListener{

    private SharedPreferences pref;

    private ImageView img_rmo_locations;
    private TextView txt_locations;
    private Spinner spinner_ennis,spinner_limerick,spinner_shannon;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_locations,container,false);
        initViews(view);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        pref = getActivity().getPreferences(0);

        txt_locations.setText("Hi "+pref.getString(Constants.NAME,"")+"please click on the button at the bottom to clock in.");


    }

    private void initViews(View view ){

        img_rmo_locations = view.findViewById(R.id.img_rmo_locations);
        txt_locations = view.findViewById(R.id.txt_locations);

        spinner_ennis = view.findViewById(R.id.spinner_ennis);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.spinner_ennis_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner_ennis.setAdapter(adapter);


        spinner_limerick = view.findViewById(R.id.spinner_limerick);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this.getActivity(), R.array.spinner_ennis_array, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_ennis.setAdapter(adapter2);


        spinner_shannon = view.findViewById(R.id.spinner_shannon);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this.getActivity(), R.array.spinner_ennis_array, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_ennis.setAdapter(adapter3);


    }

    @Override
    public void onClick(View v) {

    }

    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }
}

