package com.qing.little_secretary.littlesecretary.data;

import java.sql.Time;

/**
 * Created by qing on 21/02/17.
 */
public class Remind {
    Time mBegin;
    Time mEnd;
    RepeatMode mRepeatMode; // every day, week, week end
    DoWhat mDoWhat;
}
