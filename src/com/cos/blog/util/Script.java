package com.cos.blog.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

public class Script {
	public static void back(HttpServletResponse resp,String msg) throws IOException {
		PrintWriter out=resp.getWriter();
		out.println("<script>");
		out.println("alert(`"+msg+"`);");
		out.println("history.back();");
		out.println("</script>");
		out.flush();
	}

}