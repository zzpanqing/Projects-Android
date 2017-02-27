package com.qing.little_secretary.littlesecretary.reminds;

import android.support.annotation.NonNull;

import com.qing.little_secretary.littlesecretary.BasePresenter;
import com.qing.little_secretary.littlesecretary.BaseView;
import com.qing.little_secretary.littlesecretary.data.Remind;

/**
 * Created by qing on 20/02/17.
 * This specifies the contract between the view and the presenter.
 */

public class RemindsContract {
    interface View extends BaseView<Presenter> {
        void showAllReminds();
    }

    interface Presenter extends BasePresenter {
        void openCalenda();
        void openRemindDetail(@NonNull Remind remind);
        void deleteRemind(Remind remind);
        void enableRemind(Remind remind, boolean enable);
    }
}
