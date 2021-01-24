package com.example.fitnesscapstone.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.fitnesscapstone.Activities.DoctorhospitalActivity;
import com.example.fitnesscapstone.Adapters.DocRecyclerAdapter;
import com.example.fitnesscapstone.R;
import com.example.fitnesscapstone.dataModels.doc_data;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HosFrag extends Fragment implements DoctorhospitalActivity.sendDataListenerB {


    public HosFrag() {
        // Required empty public constructor
    }

    RecyclerView hosfrag_recycler;

    ArrayList<doc_data>hosD=new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v= inflater.inflate(R.layout.fragment_hos, container, false);
        ((DoctorhospitalActivity)getActivity()).setSenddataListener_setterB(this);

        hosfrag_recycler=(RecyclerView)v.findViewById(R.id.hosfrag_recycler);
        hosfrag_recycler.setLayoutManager(new LinearLayoutManager(getContext()));
        sendHosData();

       return v;
    }

    @Override
    public void sendSearchDB(String s) {
       // Toast.makeText(getContext(), ""+s, Toast.LENGTH_SHORT).show();

        filterList(s);
    }


    public void sendHosData(){
        hosD.clear();

        hosD.add(new doc_data("Gee Bee Hospital & Maternity Home","Address: C/o gee bee hospital & maternity home, Phagwara, Banga Road, Phagwara - 144401","phone : +91 1824223991 , +91 9872423990",""));
        hosD.add(new doc_data("Ashirwad Hospital A Multi Speciality Hospital","Address: Green Park, Palahi Road, Phagwara HO, Phagwara - 144401","phone : +91 1824228294, +91 9463534394",""));
        hosD.add(new doc_data("Anoop Hospital","Address: Hargobind Nagar, Guru Hargobind Nagar, Phagwara - 144401, Near Maharashtra Bank","phone: +91 9815592969",""));
        hosD.add(new doc_data("Narula Hospital","Address: Nakodar Road, Phagwara Ho, Phagwara - 144401","phone : +91 965335800","Services: Bone Tumor Treatment Treatment For Bone Fracture"));

        hosD.add(new doc_data("Guru Teg Bahadur Hospital","Address: Chahal Nagar, Plahi Road, Phagwara - 144401","phone no: +91 9814218954",""));
        hosD.add(new doc_data("Kb Bavasir Hospital & Harsh Herbal Healing","Address: Mast Nagar, Phagwara, Hadiabad, Phagwara - 144402 ","phone no: +91 9855446663",""));
        hosD.add(new doc_data("Mohan Singh Hospital","Address: Guru Hargobind Nagar, Phagwara - 144401, Hargobind Ngr","phone no: +91 1824261973",""));
        hosD.add(new doc_data("Sanjivni Hospital","Address:G T Road, Phagwara Ho, Phagwara - 144401","phone no:+91 1814362987",""));
        hosD.add(new doc_data("Dr. Mohan's Skin & Hair Centre","Address: 337, Guru Hargobind Nagar, Guru Hargobind Nagar, Phagwara - 144401, Opposite SBI Bank ","phone : +91 9888035555","Services :X-ray Services Hair Transplant Surgery Treatment For Hair Loss"));
        hosD.add(new doc_data("The Kerala Ayurveda Healthcare Centre","Address : Near Windsor Palace, GT road, Phagwara HO, Phagwara - 144401, Near vindsor palace","phone no: +91 9152490222","Services: Treatment For Hair Loss Hair Spa Wellness Body Scrub Aromatherapy Body Massage Face Massage Foot Massage Skin Treatment Beauty Enhancement Skin Tag Treatment Weight Loss Program Panchakarma Treatment"));

        hosD.add(new doc_data("Gandhi Hospital Pvt Ltd","Address: Guru Hargobind Nagar, Phagwara - 144401, Near Patel Ngr","phone no: +91 18244267214",""));
        hosD.add(new doc_data("Mitra Eye Hospital","Address: Near Gandhi Hospital, Guru Hargobind Nagar, Phagwara - 144401, Guru Gobind Ngr, New Patel Ngr","phone no: +91 9815547745",""));
        hosD.add(new doc_data("Virk Hospital","Address: 192-93, Guru Hargobind Nagar, Phagwara - 144401, Near Bus Stand","phone no: +91 7837700002",""));
        hosD.add(new doc_data("Parhar Hospital","Address : 371, Guru Hargobind Nagar, Phagwara - 144401, Guru Hargobind Nagar","phone no: +91 18244260066",""));
        hosD.add(new doc_data("Arora Hospital & Maternity Home","Address : 17, Purewal Nagar, Sahibzada Ajit Singh Nagar, Khalwara Road, Phagwara Sharki, Phagwara - 144401","phone no: +91 9814147811",""));
        hosD.add(new doc_data("Jasvir Hospital Maternity Home and IVF Centre","Address: 739, Hargobind Nagar, Guru Hargobind Nagar, Phagwara - 144401","phone no: +91 9876120017",""));
        hosD.add(new doc_data("Dr Puneet Galhotra Hospital","Address: Hargobind Singh Nagar, Guru Hargobind Nagar, Phagwara - 144401","phone no: +91 9779271310",""));

        hosD.add(new doc_data("Oxford Hospitals Pvt Ltd","Address : 305, Lajpat Nagar, Jalandhar - 144001, Near Nakodar Chowk","",""));
        hosD.add(new doc_data("Chawla Nursing Home & Maternity Hospital","Address: 9, Lajpat Nagar, Link Road, Jalandhar City, Jalandhar - 144001 ","Phone no.: +91 9152542287",""));
        hosD.add(new doc_data("Aanand Hospital","Address: Santokh Pura, Lamba Pind Road, Jalandhar City, Jalandhar - 144001, Opposite Petrol Pump","phone no.: +91 9814544149 , 1815082887",""));
        hosD.add(new doc_data("Aggarwal Liver And Gut Superspeciality Hospital","Address: 275, Jp Nagar, Jalandhar - 144002, Near Bsnl Exchange","phone no.: +91 9152572088",""));
        hosD.add(new doc_data("Orthonova Joint & Trauma Hospital Pvt Ltd","Address : Nakodar Road, Jalandhar City, Jalandhar - 144001, Near Nari Niketan","phone no. : +91 9152568667",""));
        hosD.add(new doc_data("Bhargava Advanced Gyne Surgery Cancer Center","Address: Building No - 212, New Jwahar Nagar, Jalandhar City, Jalandhar - 144001, Near Chunmun Mall , Guru Gobind Singh Stadium","phone no.: +91 9152494582",""));
        hosD.add(new doc_data("BBC Heart Care Pruthi Hospital","Address: 301, Lajpat Nagar, Jalandhar - 144001, Near Guru Nanak Mission Chowk ","phone no.: +91 9152287665, 1812222211","Services:  Heart Conditions, Chest Pain Treatment, Clinical Cardiology"));
        hosD.add(new doc_data("Anand Hospital And Nursing Home","Address : 421, Mall Road, Model Town, Jalandhar - 144003","phone no. : +91 9152673564","Services : Allergy Treatment Throat Cancer Allergy Testing Ear Micro Surgery Grommet Insertion Speech Impairment Surgery for Snoring Cochlear Implantation"));
        hosD.add(new doc_data("Sahi Dental Clinic","Address : Krishan Murari Market, Jalandhar City, Jalandhar - 144001, Opposite New Grain Market","phone no.: +91 8360790959",""));
        hosD.add(new doc_data("Gandhi Hospital","Address : Mahavir Marg, Adarsh Nagar, Jalandhar - 144001, Near Chick Chick Chowk","phone no. : +91 9152767463",""));
        hosD.add(new doc_data("KGM Bone Hospital","Address : 25 Gurjaipal Nagar, Cool Road, Jalandhar City, Jalandhar - 144001, Near Cool Road","phone no: +91 9152673597",""));
        hosD.add(new doc_data("India Kidney Hospital","Address: 7, Link Road, Lajpat Nagar, Jalandhar - 144001, Near Amardass Chowk ","phone no.: +91 9152831589",""));
        hosD.add(new doc_data(" Capitol Hospital","Address : Jalandhar Pathnkot Road, Pathankot Chowk, Jalandhar - 144012, Near National Highway 44,Near Reru ","phone no.: +91 9152148830",""));
        hosD.add(new doc_data("Jaswant Hospital","Address : Jalandhar City, Jalandhar - 144001, Near Football Chowk","phone no: +91 9152631638",""));
        hosD.add(new doc_data("Aastha Hospital","Address: 14, Jalandhar City, Jalandhar - 144001, Sri Guru Ravidas Nagar, Guru Ravidass Chowk","phone no.: +91 9814060816 , 1812273400",""));
        hosD.add(new doc_data("Metro Hospital","Address : Hoshiarpur Road, Jalandhar City, Jalandhar - 144001, Near Electricity Board, Santokh Pura","phone no.: +919876094864, 1812640088",""));
        hosD.add(new doc_data("Armaan Hospital","Address: 188, Adarsh Nagar, Jalandhar City, Jalandhar - 144001, Near Football Chowk","phone no.: +91 7889192535 , 1815002000",""));
        hosD.add(new doc_data("Gee BEE Hospital & Maternity Home","Address: Bhanga Road, Phagwara - 144401","phone no:+91 9152475763",""));
        hosD.add(new doc_data("Dr. Rozan's Dencare & Multi Speciality Hospital","Address: Hadiabad, Nakodar Road, Phagwara - 144401, Near Petrol Pump","phone no: +91 8284008601, +91 9914818601",""));


        DocRecyclerAdapter adapter=new DocRecyclerAdapter(hosD);
        hosfrag_recycler.setAdapter(adapter);
    }


    public void filterList(String s){
        ArrayList<doc_data> temphosD=new ArrayList<>();
        for(doc_data d: hosD){
            if(d.getName().toLowerCase().contains(s.toLowerCase()) || d.getAddress().toLowerCase().contains(s.toLowerCase()) || d.getService().toLowerCase().contains(s.toLowerCase())){
                temphosD.add(d);
            }
        }

        Log.d("hossearch data", "filterList: "+temphosD.toString());

        DocRecyclerAdapter adapter=new DocRecyclerAdapter(temphosD);
        hosfrag_recycler.setAdapter(adapter);



    }
}
