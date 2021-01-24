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
public class docFrag extends Fragment implements DoctorhospitalActivity.sendDataListener{


    public docFrag() {
        // Required empty public constructor
    }

    RecyclerView docfrag_recycler;

    ArrayList<doc_data> docD=new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_doc, container, false);
        ((DoctorhospitalActivity)getActivity()).setSenddataListener_setter(this);

        docfrag_recycler=(RecyclerView)v.findViewById(R.id.docfrag_recycler);
        docfrag_recycler.setLayoutManager(new LinearLayoutManager(getContext()));

         setDocData();
        return v;
    }

    @Override
    public void sendSearchD(String s) {
       // Toast.makeText(getContext(), ""+s, Toast.LENGTH_SHORT).show();

        filterDoc(s);
    }


   public void setDocData(){
        docD.clear();

        docD.add(new doc_data("Dr. Puneet Singh Perhar","Plot No- 403 L, C/O Jagdeep Singh Perhar Hospital, Model Town, Jalandhar - 144003, Behind Punjab and Sind Bank"
        ,"+91 9152615465","Neuro Physiotherapy, Bone Tumor Treatment, Viral Fever Treatment, Dengue Fever Treatment, Immunisation/Vaccination, Treatment For Bone Fracture Musculoskeletal Injury, Physiotherapy, Specialty Diagnostics in Tuberculosis, treatment for neurological conditions"));


        docD.add(new doc_data("Dr. Dhawan","Nb 5 Sudh, Tanda Rd, Jalandhar City, jalandhar - 144001, Nr Subhash Dharam Kanda","phone no: +91 9152921075","Services : Skin care , pimple treatment"));

        docD.add(new doc_data("Dr. Vipan Kumar Child Specialist","Noormahal Road, Nakoder, Jalandhar - 144040, Front Kanni Center","phone no.: +91 9780534413, +91 9915236707","Services: child therapy"));
        docD.add(new doc_data("Dr. Rishi Kumar Arya","Address : 206, Lajpat Nagar, Jalandhar - 144001, L R Nagar","phone no: 1812221265,1812224400","Services: Viral Fever Treatment Dengue Fever Treatment Immunisation/Vaccination"));
        docD.add(new doc_data("Dr. Sandeep Goel","Address : Goel Hospital, Mahavir Marg, Jalandhar City, Jalandhar - 144001, Patel Chowk","phone no: +91 9815348800","Services :  Neurology, Preventive Medicine"));
        docD.add(new doc_data(" Dr. Kamal Health Care Clinic","Adress: Hargobind Singh Nagar, Guru Hargobind Nagar, Phagwara - 144401","phone no.:+91 7696939916",""));

        docD.add(new doc_data("Malhotra Homoeopathic Clinic","Adress: Mohalla Prempura, Main Road, Guru Hargobind Nagar, Phagwara - 144401, Near Easy Day","phone no: +91 9872464463","Services :Liver Disease Treatment skin disorders treatment Thyroid Disorder Treatment"));
        docD.add(new doc_data("Kaushal Clinic","Addresss: Mansa Devi Nagar, Phagwara, Hadiabad, Phagwara - 144402","phone no:+91 9888063043",""));
        docD.add(new doc_data("Dr. Mohan's Skin & Hair Centre","Address: 337, Guru Hargobind Nagar, Guru Hargobind Nagar, Phagwara - 144401, Opposite SBI Bank","phone no: +91 9888035555, +91 9417030042","Services: X-ray Services Hair Transplant Surgery Treatment For Hair Loss"));
        docD.add(new doc_data("Nagpal Skin Clinic","Address: Shubhash Nagar, Phagwara Ho, Phagwara - 144401","phone no.: +91 1824267579",""));
        docD.add(new doc_data("Ohri Clinic","Adress: Vpo, Chachoki, Grand Trunk Road, Phagwara - 144401","phone no.: +91 9779282834",""));
        docD.add(new doc_data("Dr. Charan Singh Dental & Homeo Clinic","Address: Steme No 3, Hoshiarpur Road, Phagwara HO, Phagwara - 144401, Near Inder Scan Ning Centre","phone no: +91 9915515559",""));


        docD.add(new doc_data("Dr. Kamal Gupta","Address: Kamal Hospital, Jalandhar City, Jalandhar - 144001, Opposite Doaba College","phone no.: +91 9417042042","Services: Viral Fever Treatment Dengue Fever Treatment Immunisation/Vaccination"));
        docD.add(new doc_data("\n" +
                "17.Dr. Gurbeer Singh Gill","Address : Oxford Hospital, 305, Lajpat Nagar, Jalandhar - 144001, Nr. Nakodar chonk","phone no.: +91 9152326812","\n" +
                "Services: Diabetology Spine and Pain Specialist Thyroid Disease in Children Cardiology Pulmonology Arthroplasty consultation\n"));
        docD.add(new doc_data("Mitra Eye Hospital","Address: Near Gandhi Hospital, Guru Hargobind Nagar, Phagwara - 144401, Guru Gobind Ngr, New Patel Ngr","phone no: +91 9815549945",""));
        docD.add(new doc_data("Care N Cure Dental Clinic","Address: 786, Hargobind Nagar, Guru Hargobind Nagar, Phagwara - 144401, Near Sbi Bank","phone no:+91 9855244054",""));


        docD.add(new doc_data("Dr. Chander Bowry","address: C/o Chander Bowry, 72, Jalandhar City, Jalandhar - 144001","phone no.: 1812242604","Services : Viral Fever Treatment Dengue Fever Treatment Immunisation/Vaccination"));
        docD.add(new doc_data("Dr. Varun Gupta","address: Gujral Nagar, Jalandhar","phone no: +91 9814088652 ","Services:Liver Disease Treatment\n" +
                "Inflammatory Bowel Disease (IBD) Treatment\n" +
                "Peptic / Gastric Ulcer Treatment\n" +
                "Gall Bladder (Biliary) Stone Treatment\n" +
                "Hemorrhoids Treatment\n" +
                "Gastritis Treatment\n" +
                "Irritable Bowel Syndrome ( IBS ) Treatment\n" +
                "Hepatitis C Treatment\n" +
                "Acute Pancreatitis Treatment"));
        docD.add(new doc_data("Dr. Tarun Sehgal","Adress : Jalandhar","phone no: 1812294499","Services: Diabetologist\n" +
                "Sonologist"));
        docD.add(new doc_data("Dr. Kamal Gupta","Address: Kamal Hospital, Jalandhar City, Jalandhar - 144001, Opposite Doaba College","phone no.: 1812292828, 9888922551","Services:  Viral Fever Treatment Dengue Fever Treatment Immunisation/Vaccination"));
        docD.add(new doc_data("Dr. Sandeep Juneja","Address: Metro Hospital, Sanktokpura, Hoshiarpur Road, Jalandhar - 144004","phone no: +91 9876094864","Services: Viral Fever Treatment Dengue Fever Treatment Immunisation/Vaccination"));

        docD.add(new doc_data("Dr. Gurbeer Singh Gill","Address : Oxford Hospital, 305, Lajpat Nagar, Jalandhar - 144001, Nr. Nakodar chonk","phone no: +91 9152326812","Services: Diabetology Spine and Pain Specialist Thyroid Disease in Children Cardiology Pulmonology Arthroplasty consultation immunization spine surgery Fistula Surgery Asthma Treatment Child Specialist Lipid Management Thyroid Swelling Thyroid Specialist Paediatrics - Ortho Preventive Medicine Laparoscopic Surgery Consultant Laproscopy Hemorrhoids Treatment Paediatric Healthcare Viral Fever Treatment Endocrinology Children Functional Orthopedics Skin Disease Treatment Typhoid Fever Treatment Gigantism and Acromegaly General Pediatric Surgery"));
        docD.add(new doc_data("Dr. Surjit Singh Mahi","address : C/o Surjit Singh Mahi, Patel Hospital, Civil Lines, Jalandhar - 144001","phone no: +91 9872728111","Services: Viral Fever Treatment Dengue Fever Treatment Immunisation/Vaccination"));
        docD.add(new doc_data("Dr. Neeraj Mahajan","address : 13 Rama Dental Clinic, Adarsh Nagar, Jalandhar - 144001","phone no.: 1812200647","Services: Viral Fever Treatment Dengue Fever Treatment Immunisation/Vaccination"));
        docD.add(new doc_data("Dr. H.S Maan","address : 201, Maan Scanning Center, Gujral Nagar, Jalandhar City, Jalandhar - 144001, Jalandhar","phone no.: +91 9814088623","Services: Viral Fever Treatment Dengue Fever Treatment Immunisation/Vaccination"));

       docD.add(new doc_data("Dr. B S Panesar","Bhai Jeta Ji Market, Shop 9 Gtb Market, Jalandhar - 144003, Near Prithvi Planet","phone no: +91 9915077868","Services : Coccydynia Diabetology Complicated Diabetes Rheumatism Treatment Hypothyroidism treatment Thyroid Disease Management Thyroid Disorder Treatment Knee care Rheumatology Cold Treatment Thyroid Doctor Thyroid Nodule Family Medicine Fever Treatment General Illness Allergy Treatment Thyroid Treatment Diabetes Treatment Diabetic Foot Care Diabetic Treatment Juvenile arthritis Orthopedic Surgery Thyroid Specialist"));

       DocRecyclerAdapter recyclerAdapter=new DocRecyclerAdapter(docD);
       docfrag_recycler.setAdapter(recyclerAdapter);


   }


   public void  filterDoc(String s){
       ArrayList<doc_data> temphosD=new ArrayList<>();
       for(doc_data d: docD){
           if(d.getName().toLowerCase().contains(s.toLowerCase()) || d.getAddress().toLowerCase().contains(s.toLowerCase()) || d.getService().toLowerCase().contains(s.toLowerCase())){
               temphosD.add(d);
           }
       }

       Log.d("hossearch data", "filterList: "+temphosD.toString());

       DocRecyclerAdapter adapter=new DocRecyclerAdapter(temphosD);
      docfrag_recycler.setAdapter(adapter);
   }
}
