//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.techelevator.projects.dao;

import com.techelevator.projects.model.Timesheet;
import java.time.LocalDate;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JdbcTimesheetDaoTests extends BaseDaoTests {
    private static final Timesheet TIMESHEET_1 = new Timesheet(1, 1, 1, LocalDate.parse("2021-01-01"), 1.0, true, "Timesheet 1");
    private static final Timesheet TIMESHEET_2 = new Timesheet(2, 1, 1, LocalDate.parse("2021-01-02"), 1.5, true, "Timesheet 2");
    private static final Timesheet TIMESHEET_3 = new Timesheet(3, 2, 1, LocalDate.parse("2021-01-01"), 0.25, true, "Timesheet 3");
    private static final Timesheet TIMESHEET_4 = new Timesheet(4, 2, 2, LocalDate.parse("2021-02-01"), 2.0, false, "Timesheet 4");
    private JdbcTimesheetDao sut;
    private Timesheet testTimeSheet;

    public JdbcTimesheetDaoTests() {
    }

    @Before
    public void setup() {
        this.sut = new JdbcTimesheetDao(this.dataSource);
        this.testTimeSheet = new Timesheet(6, 1, 1, LocalDate.now(), 3.25, true, "TestTimesheet 1");
    }

    @Test
    public void getTimesheet_returns_correct_timesheet_for_id() {
        Timesheet timesheet = this.sut.getTimesheet(1);
        this.assertTimesheetsMatch("getTimesheet returned incorrect id", TIMESHEET_1, timesheet);
        timesheet = this.sut.getTimesheet(2);
        this.assertTimesheetsMatch("getTimesheet returned incorrect id", TIMESHEET_2, timesheet);
        timesheet = this.sut.getTimesheet(3);
        this.assertTimesheetsMatch("getTimesheet returned incorrect id", TIMESHEET_3, timesheet);
        timesheet = this.sut.getTimesheet(4);
        this.assertTimesheetsMatch("getTimesheet returned incorrect id", TIMESHEET_4, timesheet);
    }

    @Test
    public void getTimesheet_returns_null_when_id_not_found() {
        Timesheet timesheet = this.sut.getTimesheet(99);
        Assert.assertNull("message here", timesheet);
    }

    @Test
    public void getTimesheetsByEmployeeId_returns_list_of_all_timesheets_for_employee() {
        List<Timesheet> timesheets = this.sut.getTimesheetsByEmployeeId(1);
        Assert.assertEquals(2L, (long)timesheets.size());
        this.assertTimesheetsMatch("Timesheets don't match", TIMESHEET_1, (Timesheet)timesheets.get(0));
        this.assertTimesheetsMatch("Timesheets don't match", TIMESHEET_2, (Timesheet)timesheets.get(1));
        timesheets = this.sut.getTimesheetsByEmployeeId(2);
        Assert.assertEquals(2L, (long)timesheets.size());
        this.assertTimesheetsMatch("Timesheets don't match", TIMESHEET_4, (Timesheet)timesheets.get(1));
        this.assertTimesheetsMatch("Timesheets don't match", TIMESHEET_3, (Timesheet)timesheets.get(0));
    }

    @Test
    public void getTimesheetsByProjectId_returns_list_of_all_timesheets_for_project() {
        List<Timesheet> timesheets = this.sut.getTimesheetsByProjectId(1);
        Assert.assertEquals(3L, (long)timesheets.size());
        this.assertTimesheetsMatch("Timesheets don't match", TIMESHEET_1, (Timesheet)timesheets.get(0));
        this.assertTimesheetsMatch("Timesheets don't match", TIMESHEET_3, (Timesheet)timesheets.get(2));
        this.assertTimesheetsMatch("Timesheets don't match", TIMESHEET_2, (Timesheet)timesheets.get(1));
        timesheets = this.sut.getTimesheetsByProjectId(2);
        Assert.assertEquals(1L, (long)timesheets.size());
        this.assertTimesheetsMatch("Timesheets don't match", TIMESHEET_4, (Timesheet)timesheets.get(0));
    }

    @Test
    public void createTimesheet_returns_timesheet_with_id_and_expected_values() {
        Timesheet createdTimesheet = this.sut.createTimesheet(this.testTimeSheet);
        Integer newId = createdTimesheet.getTimesheetId();
        Assert.assertTrue(newId > 0);
        this.testTimeSheet.setTimesheetId(newId);
        this.assertTimesheetsMatch("Timesheets don't match", this.testTimeSheet, createdTimesheet);
    }

    @Test
    public void created_timesheet_has_expected_values_when_retrieved() {
        Timesheet createdTimesheets = this.sut.createTimesheet(this.testTimeSheet);
        Integer newId = createdTimesheets.getTimesheetId();
        Timesheet retrievedTimesheet = this.sut.getTimesheet(newId);
        this.assertTimesheetsMatch("My Message", createdTimesheets, retrievedTimesheet);
    }

    @Test
    public void updated_timesheet_has_expected_values_when_retrieved() {
        Timesheet timesheetToUpdate = this.sut.getTimesheet(1);
        timesheetToUpdate.setEmployeeId(2);
        timesheetToUpdate.setProjectId(2);
        timesheetToUpdate.setDateWorked(LocalDate.now());
        timesheetToUpdate.setHoursWorked(3.5);
        timesheetToUpdate.setBillable(false);
        timesheetToUpdate.setDescription("Timesheet 5");
        this.sut.updateTimesheet(timesheetToUpdate);
        Timesheet retrieveTimesheet = this.sut.getTimesheet(1);
        this.assertTimesheetsMatch("they match", timesheetToUpdate, retrieveTimesheet);
    }

    @Test
    public void deleted_timesheet_cant_be_retrieved() {
        this.sut.deleteTimesheet(1);
        Timesheet retrieveTimesheet = this.sut.getTimesheet(1);
        Assert.assertNull(retrieveTimesheet);
    }

    @Test
    public void getBillableHours_returns_correct_total() {
        Timesheet timesheet = this.sut.getTimesheet(1);
        Double billableHours = timesheet.getHoursWorked();
        Assert.assertTrue("message here", billableHours == 1.0);
    }

    private void assertTimesheetsMatch(String message, Timesheet expected, Timesheet actual) {
        Assert.assertEquals(message, (long)expected.getTimesheetId(), (long)actual.getTimesheetId());
        Assert.assertEquals(message, (long)expected.getEmployeeId(), (long)actual.getEmployeeId());
        Assert.assertEquals(message, (long)expected.getProjectId(), (long)actual.getProjectId());
        Assert.assertEquals(message, expected.getDateWorked(), actual.getDateWorked());
        Assert.assertEquals(message, expected.getHoursWorked(), actual.getHoursWorked(), 0.001);
        Assert.assertEquals(message, expected.isBillable(), actual.isBillable());
        Assert.assertEquals(message, expected.getDescription(), actual.getDescription());
    }
}
