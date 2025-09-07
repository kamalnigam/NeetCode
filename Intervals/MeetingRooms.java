package Intervals;

import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

class Interval {
    int start;
    int end;
    public Interval() { start = 0; end = 0; }
    public Interval(int s, int e) { start = s; end = e; }
}

public class MeetingRooms {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if (intervals == null || intervals.size() == 0) return true;
        Collections.sort(intervals, Comparator.comparingInt(a -> a.start));
        for (int i = 1; i < intervals.size(); i++) {
            if (intervals.get(i).start < intervals.get(i-1).end) {
                return false;
            }
        }
        return true;
    }

    // Example test
    public static void main(String[] args) {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(0, 30));
        intervals.add(new Interval(5, 10));
        intervals.add(new Interval(15, 20));
        MeetingRooms mr = new MeetingRooms();
        System.out.println(mr.canAttendMeetings(intervals)); // Output: false

        List<Interval> intervals2 = new ArrayList<>();
        intervals2.add(new Interval(5, 8));
        intervals2.add(new Interval(9, 15));
        System.out.println(mr.canAttendMeetings(intervals2)); // Output: true
    }
}
