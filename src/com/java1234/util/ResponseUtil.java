package com.java1234.util;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

/*
* @author chenyanwei
* @date 17 Mar 2019 11:46:11
* @version 1.0
*/
public class ResponseUtil {

	public static void write(HttpServletResponse response, Object o) throws Exception {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println(o.toString());
		out.flush();
		out.close();
	}
}
