package com.example.gajanan.presidentsofindia;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spnPresidents;

    public String[] arrPresidents={
            "Select Any President Name",
            "Dr.Rajendra Prasad",
            "Dr.Sarvepalli Radhakrishnan",
            "Dr.Zakir Husain",
            "Shri Varahagiri Venkata Giri",
            "Dr.Fakhruddin Ali Ahmed",
            "Shri Neelam Sanjiva Reddy",
            "Giani Zail Singh",
            "Shri R Venkataraman",
            "Dr.Shankar Dayal Sharma",
            "Shri K.R.Narayanan",
            "Dr. A.P.J.Abdul Kalam",
            "Smt Pratibha DeviSingh Patil",
            "Shri Pranab Mukherjee",
            "Shri Ram Nath Kovind"
    };

    String President;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnPresidents=(Spinner)findViewById(R.id.spn_presidents);


        //ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,arrPresidents);
        //adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        //ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, R.layout.spinner_item,arrPresidents);

        // Initializing an ArrayAdapter
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, R.layout.spinner_item,arrPresidents){

            @Override
            public boolean isEnabled(int position) {

                if(position==0){
                    // Disable the first item from Spinner
                    // First item will be use for hint
                    return false;

                }
                else {
                    return true;
                }

            }

            @Override
            public View getDropDownView(int position, View convertView, ViewGroup parent) {

                View view=super.getDropDownView(position,convertView,parent);
                TextView textView=(TextView)view;
                if (position==0){
                    textView.setTextColor(Color.GRAY);
                }
                else {
                    textView.setTextColor(Color.BLUE);
                }
                return view;
            }

        };

        //adapter.setDropDownViewResource(R.layout.spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);

        spnPresidents.setAdapter(adapter);



        spnPresidents.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                /*
                int index=parent.getSelectedItemPosition();
                Toast.makeText(MainActivity.this,"You have Selected : "+arrPresidents[index], Toast.LENGTH_SHORT).show();
                */

                Fragment fragment;

                President=(String)spnPresidents.getSelectedItem();
                //Toast.makeText(MainActivity.this, "hi.."+President, Toast.LENGTH_SHORT).show();

                /*
                if (President.equals("Dr. Rajendra Prasad")){
                    Toast.makeText(MainActivity.this, "Hi..", Toast.LENGTH_SHORT).show();
                }
                */




                if (President.equals("Dr.Rajendra Prasad")){
                    //Toast.makeText(MainActivity.this, "Bye...", Toast.LENGTH_SHORT).show();

                    fragment=new Fragment_RajendraPrasad();
                    FragmentManager fm=getFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.frg_President,fragment);
                    ft.commit();

                }
                else if (President.equals("Dr.Sarvepalli Radhakrishnan")){
                    //Toast.makeText(MainActivity.this, "Bye...", Toast.LENGTH_SHORT).show();

                    fragment=new Fragment_SarvepalliRadhakrishnan();
                    FragmentManager fm=getFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.frg_President,fragment);
                    ft.commit();

                }
                else if (President.equals("Dr.Zakir Husain")){
                    //Toast.makeText(MainActivity.this, "Bye...", Toast.LENGTH_SHORT).show();

                    fragment=new Fragment_ZakirHussain();
                    FragmentManager fm=getFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.frg_President,fragment);
                    ft.commit();

                }
                else if (President.equals("Shri Varahagiri Venkata Giri")){
                    //Toast.makeText(MainActivity.this, "Bye...", Toast.LENGTH_SHORT).show();

                    fragment=new Fragment_VarahagiriVenkataGiri();
                    FragmentManager fm=getFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.frg_President,fragment);
                    ft.commit();

                }
                else if (President.equals("Dr.Fakhruddin Ali Ahmed")){
                    //Toast.makeText(MainActivity.this, "Bye...", Toast.LENGTH_SHORT).show();

                    fragment=new Fragment_FakhruddinAliAhmed();
                    FragmentManager fm=getFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.frg_President,fragment);
                    ft.commit();

                }
                else if (President.equals("Shri Neelam Sanjiva Reddy")){
                    //Toast.makeText(MainActivity.this, "Bye...", Toast.LENGTH_SHORT).show();

                    fragment=new Fragment_NeelamSanjivaReddy();
                    FragmentManager fm=getFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.frg_President,fragment);
                    ft.commit();

                }
                else if (President.equals("Giani Zail Singh")){
                    //Toast.makeText(MainActivity.this, "Bye...", Toast.LENGTH_SHORT).show();

                    fragment=new Fragment_GianiZailSingh();
                    FragmentManager fm=getFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.frg_President,fragment);
                    ft.commit();

                }
                else if (President.equals("Shri R Venkataraman")){
                    //Toast.makeText(MainActivity.this, "Bye...", Toast.LENGTH_SHORT).show();

                    fragment=new Fragment_RVenkatraman();
                    FragmentManager fm=getFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.frg_President,fragment);
                    ft.commit();

                }
                else if (President.equals("Dr.Shankar Dayal Sharma")){
                    //Toast.makeText(MainActivity.this, "Bye...", Toast.LENGTH_SHORT).show();

                    fragment=new Fragment_ShankarDayalSharma();
                    FragmentManager fm=getFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.frg_President,fragment);
                    ft.commit();

                }
                else if (President.equals("Shri K.R.Narayanan")){
                    //Toast.makeText(MainActivity.this, "Bye...", Toast.LENGTH_SHORT).show();

                    fragment=new Fragment_KRNarayanan();
                    FragmentManager fm=getFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.frg_President,fragment);
                    ft.commit();

                }
                else if (President.equals("Dr. A.P.J.Abdul Kalam")){
                    //Toast.makeText(MainActivity.this, "Bye...", Toast.LENGTH_SHORT).show();

                    fragment=new Fragment_APJAbdulKalam();
                    FragmentManager fm=getFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.frg_President,fragment);
                    ft.commit();

                }
                else if (President.equals("Smt Pratibha DeviSingh Patil")){
                    //Toast.makeText(MainActivity.this, "Bye...", Toast.LENGTH_SHORT).show();

                    fragment=new Fragment_PratibhaDeviSinghPatil();
                    FragmentManager fm=getFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.frg_President,fragment);
                    ft.commit();

                }
                else if (President.equals("Shri Pranab Mukherjee")){
                    //Toast.makeText(MainActivity.this, "Bye...", Toast.LENGTH_SHORT).show();

                    fragment=new Fragment_PranabMukherjee();
                    FragmentManager fm=getFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.frg_President,fragment);
                    ft.commit();

                }
                else if (President.equals("Shri Ram Nath Kovind")){
                    //Toast.makeText(MainActivity.this, "Bye...", Toast.LENGTH_SHORT).show();

                    fragment=new Fragment_RamNathKovind();
                    FragmentManager fm=getFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.frg_President,fragment);
                    ft.commit();

                }
                else{
                    fragment=new BlankFragment();
                    FragmentManager fm=getFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.frg_President,fragment);
                    ft.commit();
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }
        });

    }



}
