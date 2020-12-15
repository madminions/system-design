package com.example.design.booking;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

public class MeetingScheduler {

	ArrayList<Meeting> schedule;

	public MeetingScheduler() {
		schedule = new ArrayList<>();
	}

	public boolean bookMeeting(Meeting m) {

		int index = Collections.binarySearch(schedule, m);
		if (index >= 0) {
			return false;
		}

		schedule.add(-index - 1, m);
		System.out.println(schedule);
		System.out.println(index);

		return true;
	}

	public static void main(String[] args) {
		MeetingScheduler ms = new MeetingScheduler();
		System.out.println(ms.bookMeeting(
				new Meeting(LocalDateTime.parse("2020-12-15T10:00:00"), LocalDateTime.parse("2020-12-15T11:00:00"))));
		System.out.println(ms.bookMeeting(
				new Meeting(LocalDateTime.parse("2020-12-15T11:00:00"), LocalDateTime.parse("2020-12-15T12:00:00"))));
		System.out.println(ms.bookMeeting(
				new Meeting(LocalDateTime.parse("2020-12-15T11:30:00"), LocalDateTime.parse("2020-12-15T11:40:00"))));
	}
}
