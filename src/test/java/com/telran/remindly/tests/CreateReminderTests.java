package com.telran.remindly.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateReminderTests extends TestBase{

    @Test
    public void addReminderWithDefaultDataTest() {
        int quantityBeforeAdd;
        int quantityAfterAdd;
        quantityBeforeAdd = app.getMainScreen().getTotalReminders();
        app.getReminder().tapOnAddButton();
        app.getReminder().fillReminderName("Test",10);
        app.getReminder().saveReminder();
        app.getReminder().pause(1000);
        quantityAfterAdd = app.getMainScreen().getTotalReminders();
        Assert.assertEquals(quantityAfterAdd,quantityBeforeAdd + 1);
    }

    @Test
    public void addReminderWithRandomSwipeTest() {

        app.getReminder().tapOnAddButton();
        app.getReminder().fillReminderName("Test",10);
        app.getReminder().tapOnData();
        app.getReminder().pause(2000);
        app.getReminder().swipeDown();
        app.getReminder().selectDay(9);
        app.getReminder().tapOnOk();
        app.getReminder().saveReminder();
    }


}
