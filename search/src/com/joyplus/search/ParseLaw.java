package com.joyplus.search;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.regex.*;

public class ParseLaw {
	// private static String yzys =
	// "[ed2k]+://[^\"]*|[azAz]+://[^\"]*";//����Ӱ�ӵĹ���,��ed2k��ͷ,"""��β;http��ͷ,"��β
	// private static String scys =
	// "[magnet]+:\\?[^\"]*";//ʥ��Ӱ�ӵĹ���,��magnet��ͷ,"""��β
	private static String PARSERULES = "[ed2k]+://[^\"]*|[magnet]+:\\?[^\"]*";

	public static List<String> GetUrlFromHtml(String data) {
		List<String> list = new ArrayList<String>();
		Pattern pattern = null;
		if (data == null) {
			return null;
		}
		pattern = Pattern.compile(PARSERULES);
		Matcher matcher = pattern.matcher(data);
		while (matcher.find()) {
			list.add(matcher.group());
		}
		return list;
	}
}