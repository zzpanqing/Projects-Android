package com.qing.little_secretary.littlesecretary.data;

import android.support.annotation.NonNull;

import java.util.List;

/**
 * Created by qing on 21/02/17.
 */

public interface SharedCalendarsDataSource {

    interface LoadCalenderCallback {
        void onTasksLoaded(List<SharedCalendar> calendars);
        void onDataNotAvailable();
    }

    void getSharedCalendars(@NonNull LoadCalenderCallback callback);
}
