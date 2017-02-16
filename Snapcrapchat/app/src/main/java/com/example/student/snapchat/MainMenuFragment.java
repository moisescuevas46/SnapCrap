package com.example.student.snapchat;


import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainMenuFragment extends Fragment {


    public MainMenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_menu, container, false);

String[] loginMenuItems = {"Register", "Log in"};


        String[] menuItems = {"CAMERA",
                                "HAGAS OTRO COSAS!",
                                "OTRO MAS!"};

        ListView listView = (ListView) view.findViewById(R.id.mainMenu);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
            getActivity(),
            android.R.layout.simple_list_item_1,
            menuItems
        );
        listView.setAdapter(listViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Intent intent =new Intent(getActivity(), CameraActivity.class);
                    startActivity(intent);
                }else if (position == 1){
                    Toast.makeText(getActivity(), "You clicked the second item", Toast.LENGTH_SHORT).show();
                }else if (position == 2){
                    Toast.makeText(getActivity(), "You clicked the third item", Toast.LENGTH_SHORT).show();
                }
            }
        });
        // Inflate the layout for this fragment
        return view;
    }


}










































////////////////////////////////////////////////////
///                                              ///
///   |||                                   |||  ///
///                                              ///
///            |||||||||||||||||\\\              ///
///           ////|||||||||||||\||\\             ///
///          ||||               \|||             ///
///          ||||               ||||             ///
///          ||||               ||||             ///
///                             ||||             ///
///                             ||||             ///
///                             ////             ///
///                    //||||||////              ///
///                   /||||||||///               ///
///                   ||||                       ///
///                   ||||                       ///
///                   ||||                       ///
///                   ||||                       ///
///                                              ///
///                                              ///
///                   ||||                       ///
///                   ||||                       ///
///   |||                                   |||  ///
///                                              ///
////////////////////////////////////////////////////




     /////////////  ///   ///     //////  /////////////
///      ///      ///    ///    //          ///
///    ///      ///    ///    /////       ///
//   ///      ///   ///          //      ///
/////      /////////      //////        ///

///////  //////
//    // //  //
//    // //  //
///////  //////

 //////////  //////////     ||
      //        //          ||
     //        //           ||
    //        //            ||
/////////   //              ()
