package kr.co.sist.libs.utils;

import java.util.Properties;

public class DepartmentUtil {
	public static String getDepartment(char code) {
		Properties deptInfo = new Properties();
		deptInfo.setProperty("A", "영업부");
		deptInfo.setProperty("B", "업무부");
		deptInfo.setProperty("C", "홍보부");
		deptInfo.setProperty("D", "인사부");
		deptInfo.setProperty("E", "경리부");
		deptInfo.setProperty("F", "판촉부");
		deptInfo.setProperty("G", "총무부");
		String key = String.valueOf(code);
		return deptInfo.getProperty(key);    //'A' --> "A" --> "영업부"
	}
}
