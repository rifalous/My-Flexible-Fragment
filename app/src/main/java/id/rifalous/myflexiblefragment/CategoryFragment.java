package id.rifalous.myflexiblefragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryFragment extends Fragment implements View.OnClickListener {

    public CategoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button btnDetailCategory = view.findViewById(R.id.btn_detail_category);
        btnDetailCategory.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_category) {
            FragmentManager mFragmentManager = getFragmentManager();
            if (mFragmentManager != null) {
                CategoryFragment mCategoryFragment = new CategoryFragment();
                FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
                mFragmentTransaction.replace(R.id.frame_container, mCategoryFragment, CategoryFragment.class.getSimpleName());
                mFragmentTransaction.addToBackStack(null);
                mFragmentTransaction.commit();
            }
        }
    }
}
