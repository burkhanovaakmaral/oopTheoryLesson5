package series;

import group.Group;

import java.util.Arrays;

public class Series {
    private String seriesName;
    private int seriesNumber;
    private String teacherName;
    private Group[] group;

    public Series(String seriesName, int seriesNumber, String teacherName, Group[] group) {
        this.seriesName = seriesName;
        this.seriesNumber = seriesNumber;
        this.teacherName = teacherName;
        this.group = group;
    }
    public Series(){

    }



    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public int getSeriesNumber() {
        return seriesNumber;
    }

    public void setSeriesNumber(int seriesNumber) {
        this.seriesNumber = seriesNumber;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Group[] getGroup() {
        return group;
    }

    public void setGroup(Group[] group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Series " +
                "seriesName ='" + seriesName + '\'' +
                ", seriesNumber=" + seriesNumber +
                ", teacherName='" + teacherName + '\'' +
                ", group=" + Arrays.toString(group)
                 ;
    }
}
