package com.qing.little_secretary.littlesecretary.add_edit_remind;

import com.qing.little_secretary.littlesecretary.BasePresenter;
import com.qing.little_secretary.littlesecretary.BaseView;
import com.qing.little_secretary.littlesecretary.data.DoWhat;
import com.qing.little_secretary.littlesecretary.data.RepeatMode;

import java.sql.Time;

/**
 * Created by qing on 21/02/17.
 */

public class AddEditRemindContract {
    interface View extends BaseView<Presenter> {
    }

    interface Presenter extends BasePresenter {
        void setWho(int conditionId, int index);
        void setHourBegin(int conditionId, Time begin);
        void setHourEnd(int conditionId, Time end);
        void setRepeatMode(int conditionId, RepeatMode repeatMode);
        void setDoWhat(DoWhat doWhat);

        void addCondition();
        void saveRemind();
        void deleteRemind();
        void enableRemind(boolean enable);
    }
}
