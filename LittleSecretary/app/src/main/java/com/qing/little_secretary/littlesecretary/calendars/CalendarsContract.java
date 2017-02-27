package com.qing.little_secretary.littlesecretary.calendars;

import com.qing.little_secretary.littlesecretary.BasePresenter;
import com.qing.little_secretary.littlesecretary.BaseView;

/**
 * Created by qing on 21/02/17.
 */

public class CalendarsContract {
    interface View extends BaseView<Presenter>{
        void showCalendersList();
    }
    interface Presenter extends BasePresenter {
        void addNewCalender();
    }
}
