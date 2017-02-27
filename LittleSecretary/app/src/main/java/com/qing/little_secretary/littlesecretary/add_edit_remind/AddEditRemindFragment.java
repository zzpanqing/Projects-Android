package com.qing.little_secretary.littlesecretary.add_edit_remind;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qing.little_secretary.littlesecretary.R;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by qing on 21/02/17.
 */
public class AddEditRemindFragment extends Fragment
implements AddEditRemindContract.View{

    private AddEditRemindContract.Presenter mPresenter;

    public static AddEditRemindFragment newInstance() {
        return new AddEditRemindFragment();
    }

    public AddEditRemindFragment() {

    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.start();
    }

    @Override
    public void setPresenter(
           @NonNull AddEditRemindContract.Presenter presenter) {
        mPresenter = checkNotNull(presenter);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View root = inflater.inflate(
                R.layout.frag_add_edit_remind,
                container,
                false);
        return root;
    }
}
