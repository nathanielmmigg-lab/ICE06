package time;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void testMainGood() {
	    int main = Time.getTotalSeconds("00:00:00");
	    assertTrue(main == 0);
	}

	@Test
	void testMainBad() {
	    assertThrows(StringIndexOutOfBoundsException.class, () -> {
	        Time.getTotalSeconds(":01:00");
	    });
	}

	@Test
	void testMainBoundary() {
	    int main = Time.getTotalSeconds("23:59:59");
	    assertTrue(main == 86399);
	}
	
	

	@Test
	void testGetTotalSecondsGood() {
		int seconds = Time.getTotalSeconds("05:05:05");
	}
	
	@Test
	public void testGetTotalSecondsBad() {
		assertThrows(StringIndexOutOfBoundsException.class, ()-> {Time.getTotalSeconds("10:00");});
	}

	@Test
	void testGetTotalSecondsBoundry() {
		int seconds = Time.getTotalSeconds("23:59:59");
	}
	
	
	
	
	@Test
	void testGetTotalMinutesGood() {
	    int minutes = Time.getTotalMinutes("00:05:00");
	    assertTrue(minutes == 5);
	}

	@Test
	void testGetTotalMinutesBad() {
	    assertThrows(StringIndexOutOfBoundsException.class, () -> {
	        Time.getTotalMinutes("00:10");
	    });
	}

	@Test
	void testGetTotalMinutesBoundry() {
	    int minutes = Time.getTotalMinutes("23:59:59");
	    assertTrue(minutes == 1439);
	}
	
	

	@Test
	void testGetTotalHoursGood() {
	    int totalHours = Time.getTotalHours("07:12:30");
	    assertTrue(totalHours == 7);
	}

	@Test
	void testGetTotalHoursBad() {
	    assertThrows(StringIndexOutOfBoundsException.class, () -> {
	        Time.getTotalHours("07:12");
	    });
	}

	@Test
	void testGetTotalHoursBoundary() {
	    int totalHours = Time.getTotalHours("23:59:59");
	    assertTrue(totalHours == 23);
	}
	
	
	

	@Test
	void testGetMillisecondsGood() {
	    int milliseconds = Time.getMilliseconds("00:02:05");
	    assertTrue(milliseconds == 125000);
	}

	@Test
	void testGetMillisecondsBad() {
	    assertThrows(StringIndexOutOfBoundsException.class, () -> {
	        Time.getMilliseconds("00:02");
	    });
	}

	@Test
	void testGetMillisecondsBoundary() {
	    int milliseconds = Time.getMilliseconds("00:59:59");
	    assertTrue(milliseconds == 3599000);
	}
	
	
	@Test
	void testObjectGood() {
	    int seconds = Time.getTotalSeconds("02:14:30");
	}

	@Test
	void testObjectBad() {
	    assertThrows(StringIndexOutOfBoundsException.class, () -> {
	        Time.getTotalSeconds("02:14");
	    });
	}

	@Test
	void testObjectBoundary() {
	    int seconds = Time.getTotalSeconds("23:59:59");
	}

	@Test
	void testGetClassGood() {
	    int seconds = Time.getTotalSeconds("08:22:15");
	}

	@Test
	void testGetClassBad() {
	    assertThrows(StringIndexOutOfBoundsException.class, () -> {
	        Time.getTotalSeconds("08:22");
	    });
	}

	@Test
	void testGetClassBoundary() {
	    int seconds = Time.getTotalSeconds("23:58:59");
	}

	@Test
	void testHashCodeGood() {
	    int seconds = Time.getTotalSeconds("11:35:20");
	    assertTrue(seconds == 41720);
	}

	@Test
	void testHashCodeBad() {
	    assertThrows(StringIndexOutOfBoundsException.class, () -> {
	        Time.getTotalSeconds("11:35");
	    });
	}

	@Test
	void testHashCodeBoundary() {
	    int seconds = Time.getTotalSeconds("23:57:59");
	}

	@Test
	void testEqualsGood() {
	    int seconds = Time.getTotalSeconds("03:45:10");
	    assertTrue(seconds == 13510);
	}

	@Test
	void testEqualsBad() {
	    assertThrows(StringIndexOutOfBoundsException.class, () -> {
	        Time.getTotalSeconds("03:45");
	    });
	}

	@Test
	void testEqualsBoundary() {
	    int seconds = Time.getTotalSeconds("23:56:59");
	}

	@Test
	void testCloneGood() {
	    int seconds = Time.getTotalSeconds("06:25:40");
	    assertTrue(seconds == 23140);
	}

	@Test
	void testCloneBad() {
	    assertThrows(StringIndexOutOfBoundsException.class, () -> {
	        Time.getTotalSeconds("06:25");
	    });
	}

	@Test
	void testCloneBoundary() {
	    int seconds = Time.getTotalSeconds("23:55:59");
	}

	@Test
	void testToStringGood() {
	    int seconds = Time.getTotalSeconds("09:40:25");
	    assertTrue(seconds == 34825);
	}

	@Test
	void testToStringBad() {
	    assertThrows(StringIndexOutOfBoundsException.class, () -> {
	        Time.getTotalSeconds("09:40");
	    });
	}

	@Test
	void testToStringBoundary() {
	    int seconds = Time.getTotalSeconds("23:54:59");
	}

	@Test
	void testNotifyGood() {
	    int seconds = Time.getTotalSeconds("01:50:35");
	    assertTrue(seconds == 6635);
	}

	@Test
	void testNotifyBad() {
	    assertThrows(StringIndexOutOfBoundsException.class, () -> {
	        Time.getTotalSeconds("01:50");
	    });
	}

	@Test
	void testNotifyBoundary() {
	    int seconds = Time.getTotalSeconds("23:53:59");
	}

	@Test
	void testNotifyAllGood() {
	    int seconds = Time.getTotalSeconds("12:20:45");
	    assertTrue(seconds == 44445);
	}

	@Test
	void testNotifyAllBad() {
	    assertThrows(StringIndexOutOfBoundsException.class, () -> {
	        Time.getTotalSeconds("12:20");
	    });
	}

	@Test
	void testNotifyAllBoundary() {
	    int seconds = Time.getTotalSeconds("23:52:59");
	}

	@Test
	void testWaitGood() {
	    int seconds = Time.getTotalSeconds("04:15:30");
	    assertTrue(seconds == 15330);
	}

	@Test
	void testWaitBad() {
	    assertThrows(StringIndexOutOfBoundsException.class, () -> {
	        Time.getTotalSeconds("04:15");
	    });
	}

	@Test
	void testWaitBoundary() {
	    int seconds = Time.getTotalSeconds("23:51:59");
	}

	@Test
	void testWaitLongGood() {
	    int seconds = Time.getTotalSeconds("07:30:20");
	}

	@Test
	void testWaitLongBad() {
	    assertThrows(StringIndexOutOfBoundsException.class, () -> {
	        Time.getTotalSeconds("07:30");
	    });
	}

	@Test
	void testWaitLongBoundary() {
	    int seconds = Time.getTotalSeconds("23:50:59");
	}

	@Test
	void testWaitLongIntGood() {
	    int seconds = Time.getTotalSeconds("10:10:10");
	    assertTrue(seconds == 36610);
	}

	@Test
	void testWaitLongIntBad() {
	    assertThrows(StringIndexOutOfBoundsException.class, () -> {
	        Time.getTotalSeconds("10:10");
	    });
	}

	@Test
	void testWaitLongIntBoundary() {
	    int seconds = Time.getTotalSeconds("23:49:59");
	}

	@Test
	void testFinalizeGood() {
	    int seconds = Time.getTotalSeconds("13:05:15");
	    assertTrue(seconds == 47115);
	}

	@Test
	void testFinalizeBad() {
	    assertThrows(StringIndexOutOfBoundsException.class, () -> {
	        Time.getTotalSeconds("13:05");
	    });
	}

	@Test
	void testFinalizeBoundary() {
	    int seconds = Time.getTotalSeconds("23:48:59");
	}
	


}
