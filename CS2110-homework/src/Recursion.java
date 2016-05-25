//uses Turtle and World

public class Recursion {
	
	private static final float DRAWING_DETAIL = 2.5F;

	public static String reverseString(String str) {
		if (str.length() < 1) {
			return str;
		}
		
		return reverseString(str.substring(1)) + str.charAt(0);
	}

	public static int countWays(int steps) {
		if (steps == 1) {
			return 1;
		}
		
		if (steps == 2) {
			return 2;
		}
		
		return countWays(steps - 1) + countWays(steps - 2);
	}

	public static int ackermann(int m, int n) {
		if (m == 0) {
			return n + 1;
		}
		
		if (m > 0 && n == 0) {
			return ackermann(m - 1, 1);
		}
		
		if (m > 0 && n > 0) {
			return ackermann(m - 1, ackermann(m, n - 1));
		}
		
		return -1;
	}

	public static void snowflake(Turtle t, int level, double length) {
		if (level == 0) {
			t.forward(length);
			return;
		}
		
		kochSnowflake(t, level, length / DRAWING_DETAIL);
		t.right(120);
		kochSnowflake(t, level, length / DRAWING_DETAIL);
		t.right(120);
		kochSnowflake(t, level, length / DRAWING_DETAIL);
	}
	
	public static void kochSnowflake(Turtle t, int level, double length) {
		if (level == 0) {
			t.forward(length);
			return;
		}
		
		kochSnowflake(t, level - 1, length / DRAWING_DETAIL);
		t.left(60);
		kochSnowflake(t, level - 1, length / DRAWING_DETAIL);
		t.right(120);
		kochSnowflake(t, level - 1, length / DRAWING_DETAIL);
		t.left(60);
		kochSnowflake(t, level - 1, length / DRAWING_DETAIL);
	}

	public static void dragon(Turtle t, int level, double size) {
		if (level == 0) {
			t.forward(size);
			return;
		}
		
		dragon(t, level - 1, size / DRAWING_DETAIL);
		t.right(90);
		dragonFractal(t, level - 1, size / DRAWING_DETAIL);
	}
	
	public static void dragonFractal(Turtle t, int level, double size) {
		if (level == 0) {
			t.forward(size);
			return;
		}
		
		dragon(t, level - 1, size / DRAWING_DETAIL);
		t.left(90);
		dragonFractal(t, level - 1, size / DRAWING_DETAIL);
	}
	
}
