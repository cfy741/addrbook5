package org.example.util;

import java.io.InputStream;
import java.util.Properties;

/**
 * <b>系统常量类</b>
 * @author Arthur
 * @version 2.0.0
 * @since 1.0.0
 */
public class constantUtil {
	private static Properties props = new Properties();

	static {
		try {
			InputStream in = constantUtil.class.getClassLoader().getResourceAsStream("addrbook.properties");
			props.load(in);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * <b>分页信息：默认当前页码</b>
	 */
	public static final Integer PAGE_NUM = Integer.parseInt(props.getProperty("page.num"));

	/**
	 * <b>分页信息：默认每页显示数量</b>
	 */
	public static final Integer PAGE_SIZE = Integer.parseInt(props.getProperty("page.size"));
}
