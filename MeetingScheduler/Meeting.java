package com.example.design.booking;

import java.time.LocalDateTime;

public class Meeting implements Comparable<Meeting> {

	private LocalDateTime start;
	private LocalDateTime end;

	@Override
	public int compareTo(Meeting o) {
		if (end.compareTo(o.start) <= 0)
			return -1;
		else if (start.compareTo(o.end) >= 0)
			return 1;
		return 0;
	}

	public Meeting(LocalDateTime start, LocalDateTime end) {
		super();
		this.start = start;
		this.end = end;
	}

	@Override
	public String toString() {
		return start.toString() + " " + end.toString();
	}

}
