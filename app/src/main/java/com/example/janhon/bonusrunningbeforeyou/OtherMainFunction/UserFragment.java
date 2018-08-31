package com.example.janhon.bonusrunningbeforeyou.OtherMainFunction;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.janhon.bonusrunningbeforeyou.R;

import java.util.zip.Inflater;

public class UserFragment extends Fragment {
    private Toolbar mtoolbar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.btSubmit);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, //container傳入
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user, container, false);
        //inflater 載入器,載入layout.fragment_user
        handleViews(view);
        setHasOptionsMenu(true);

        return view;
    }

    private void handleViews(View view) {
        mtoolbar = (Toolbar) view.findViewById(R.id.user_toolbar) ;
        mtoolbar.inflateMenu(R.menu.user_memu);
    }


    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        menu.clear();
        // Add the new menu items
        inflater.inflate(R.menu.user_memu, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.logout:
                System.out.println(R.string.logout);
                return true;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }


}
