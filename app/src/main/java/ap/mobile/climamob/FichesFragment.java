package ap.mobile.climamob;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FichesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FichesFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FichesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FichesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FichesFragment newInstance(String param1, String param2) {
        FichesFragment fragment = new FichesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fiches, container, false);
    }

    @Override
    public void onViewCreated (View view, Bundle savedInstanceState)
    {
        Button buttonToList = (Button) view.findViewById(R.id.buttonToList);
        buttonToList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.w("ClimaMob", "vue liste");
                Toast.makeText(getActivity(), "vue liste", Toast.LENGTH_SHORT).show();
                NavDirections action = FichesFragmentDirections.actionFichesFragmentToListeFragment();
                Navigation.findNavController(view).navigate(action);
            }
        });
    }




}