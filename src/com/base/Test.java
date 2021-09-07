package com.base;

public class Test {

	private static final String MONDAY = "MONDAY";
	private static final String TUESDAY = "TUESDAY";
	private static final String THURSDAY = "THURSDAY";
	private static final String WEDNESDAY = "WEDNESDAY";
	private static final String SATURDAY = "SATURDAY";
	private static final String FRIDAY = "FRIDAY";
	private static final String SUNDAY = "SUNDAY";

	private Object doMethod(String json) {
		// 判断参数
		if (null == json && json.length() == 0) {
			return null;
		}
		//
		doAMethod();
		doAMethod();
		// 验证
		try {
			
		} catch (Exception e) {

		}
		
		if(!istrue()) {
			//
			return null;
		}
		return null;
	}

	private boolean istrue() {
		// TODO Auto-generated method stub
		return false;
	}

	private void doing(String json) {
		// 判断参数
		if (null == json && json.length() == 0) {
			return   ;
		}
		//
		try {

		} catch (Exception e) {

		}
	}

	private void doAMethod() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		String day = "SUNDAY";
		@SuppressWarnings("preview")
		int numLetters = switch (day) {
		case MONDAY, FRIDAY, SUNDAY -> 6;
		case TUESDAY -> 7;
		case THURSDAY, SATURDAY -> 8;
		case WEDNESDAY -> 9;
		default -> throw new IllegalArgumentException("Unexpected value: " + day);
		};
		System.out.println(numLetters);
	}

}
