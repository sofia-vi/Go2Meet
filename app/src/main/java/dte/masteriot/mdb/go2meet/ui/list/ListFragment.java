package dte.masteriot.mdb.go2meet.ui.list;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import dte.masteriot.mdb.go2meet.Dataset;
import dte.masteriot.mdb.go2meet.R;
import dte.masteriot.mdb.go2meet.databinding.FragmentListBinding;

public class ListFragment extends Fragment{

    private FragmentListBinding binding;
    public static final Dataset dataset = new Dataset();
    private RecyclerView recyclerView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_list, container, false);
        recyclerView = v.findViewById(R.id.recyclerView);
        MyAdapter recyclerViewAdapter = new MyAdapter(dataset);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return v;
    }
    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        //I don't write this code in the onCreate function because the activity context may be null
        // when if the fragment wasn't attached yet
        //I don't really know if we should or not call this function everytime we attach the fragment
        //Declare a LinearLayout as the layout manager of the recyclerView
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}