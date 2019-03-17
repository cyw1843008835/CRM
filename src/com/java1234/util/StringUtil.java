package com.java1234.util;

/*
* @author chenyanwei
* @date 17 Mar 2019 11:30:20
* @version 1.0
*/

public class StringUtil {
	/**
	 * 判断是否为空
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) {
		if (str == null || "".equals(str.trim())) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 判断不为空
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty(String str) {
		if (str != null && !"".equals(str.trim())) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 格式化模糊查询
	 * 
	 * @param str
	 * @return
	 */
	public static String formatLike(String str) {
		if (isNotEmpty(str)) {
			return "%" + str + "%";
		} else {
			return null;
		}
	}
}
