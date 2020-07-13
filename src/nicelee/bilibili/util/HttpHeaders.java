package nicelee.bilibili.util;

import java.util.*;

public class HttpHeaders {
	HashMap<String, String> headerMap = new HashMap<String, String>();
	private static HashMap<String, String> userInfoHeaderMap = null;
	private static HashMap<String, String> loginAuthHeaderMap = null;
	private static HashMap<String, String> loginAuthVaHeaderMap = null;
	private static HashMap<String, String> mobileHeaderMap = null;

	final static String UA_PC_Sogo = "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36 SE 2.X MetaSr 1.0";
	final static String UA_PC_Firefox = "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:65.0) Gecko/20100101 Firefox/65.0";
	final static String UA_Android = "Mozilla/5.0 (Linux; Android 5.0; SM-G900P Build/LRX21T) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Mobile Safari/537.36";
	final static String UA_ForAppOnly = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.119 Safari/537.36";

	public void setHeader(String key, String value) {
		headerMap.put(key, value);
	}

	public String getHeader(String key) {
		return headerMap.get(key);
	}

	public HashMap<String, String> getHeaders() {
		return headerMap;
	}

	/**
	 * 该Header配置用于用户信息/登录状态获取
	 */
	public HashMap<String, String> getBiliUserInfoHeaders() {
		if (userInfoHeaderMap == null) {
			userInfoHeaderMap = new HashMap<String, String>();
			userInfoHeaderMap.put("Accept", "application/json, text/plain, */*");
			userInfoHeaderMap.put("Accept-Encoding", "gzip, deflate, sdch, br");
			userInfoHeaderMap.put("Accept-Language", "zh-CN,zh;q=0.8");
			userInfoHeaderMap.put("Connection", "keep-alive");
			userInfoHeaderMap.put("Origin", "https://message.bilibili.com");
			userInfoHeaderMap.put("Host", "api.bilibili.com");
			userInfoHeaderMap.put("Referer", "https://message.bilibili.com/pages/nav/index_new_pc_sync");
			userInfoHeaderMap.put("User-Agent", UA_PC_Sogo);
		}
		return userInfoHeaderMap;
	}

	/**
	 * 该Header配置用于登录AuthKey获取
	 */

	public HashMap<String, String> getBiliLoginAuthHeaders() {
		if (loginAuthHeaderMap == null) {
			loginAuthHeaderMap = new HashMap<String, String>();
			loginAuthHeaderMap.put("Accept", "application/json, text/javascript, */*; q=0.01");
			loginAuthHeaderMap.put("Accept-Encoding", "gzip, deflate, sdch, br");
			loginAuthHeaderMap.put("Accept-Language", "zh-CN,zh;q=0.8");
			loginAuthHeaderMap.put("Connection", "keep-alive");
			loginAuthHeaderMap.put("Host", "passport.bilibili.com");
			loginAuthHeaderMap.put("Referer", "https://passport.bilibili.com/login");
			loginAuthHeaderMap.put("X-Requested-With", "XMLHttpRequest");
			loginAuthHeaderMap.put("User-Agent", UA_PC_Sogo);
		}
		return loginAuthHeaderMap;
	}

	/**
	 * 该Header配置用于登录AuthKey验证
	 */
	public HashMap<String, String> getBiliLoginAuthVaHeaders() {
		if (loginAuthVaHeaderMap == null) {
			loginAuthVaHeaderMap = new HashMap<String, String>();
			loginAuthVaHeaderMap.put("Accept", "application/json, text/javascript, */*; q=0.01");
			loginAuthVaHeaderMap.put("Accept-Encoding", "gzip, deflate, br");
			loginAuthVaHeaderMap.put("Accept-Language", "zh-CN,zh;q=0.8");
			loginAuthVaHeaderMap.put("Connection", "keep-alive");
			loginAuthVaHeaderMap.put("Host", "passport.bilibili.com");
			loginAuthVaHeaderMap.put("Origin", "https://passport.bilibili.com");
			loginAuthVaHeaderMap.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
			loginAuthVaHeaderMap.put("Referer", "https://passport.bilibili.com/login");
			loginAuthVaHeaderMap.put("X-Requested-With", "XMLHttpRequest");
			loginAuthVaHeaderMap.put("User-Agent", UA_PC_Sogo);
		}
		return loginAuthVaHeaderMap;
	}

	/**
	 * 该Header配置用于app版权视频下载
	 */
	static List<String> biliAppDownHeadersList = new ArrayList<>();

	static {
		biliAppDownHeadersList.add("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36 SE 2.X MetaSr 1.0");
		biliAppDownHeadersList.add("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/39.0.2171.95 Safari/537.36 OPR/26.0.1656.60");
		biliAppDownHeadersList.add("Opera/8.0 (Windows NT 5.1; U; en)");
		biliAppDownHeadersList.add("Mozilla/5.0 (Windows NT 5.1; U; en; rv:1.8.1) Gecko/20061208 Firefox/2.0.0 Opera 9.50");
		biliAppDownHeadersList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; en) Opera 9.50");
		biliAppDownHeadersList.add("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:34.0) Gecko/20100101 Firefox/34.0");
		biliAppDownHeadersList.add("Mozilla/5.0 (X11; U; Linux x86_64; zh-CN; rv:1.9.2.10) Gecko/20100922 Ubuntu/10.10 (maverick) Firefox/3.6.10");
		biliAppDownHeadersList.add("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/534.57.2 (KHTML, like Gecko) Version/5.1.7 Safari/534.57.2");
		biliAppDownHeadersList.add("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/39.0.2171.71 Safari/537.36");
		biliAppDownHeadersList.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.64 Safari/537.11");
		biliAppDownHeadersList.add("Mozilla/5.0 (Windows; U; Windows NT 6.1; en-US) AppleWebKit/534.16 (KHTML, like Gecko) Chrome/10.0.648.133 Safari/534.16");
		biliAppDownHeadersList.add("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/30.0.1599.101 Safari/537.36");
		biliAppDownHeadersList.add("Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko");
		biliAppDownHeadersList.add("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/536.11 (KHTML, like Gecko) Chrome/20.0.1132.11 TaoBrowser/2.0 Safari/536.11");
		biliAppDownHeadersList.add("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.1 (KHTML, like Gecko) Chrome/21.0.1180.71 Safari/537.1 LBBROWSER");
		biliAppDownHeadersList.add("Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 6.1; WOW64; Trident/5.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; .NET4.0C; .NET4.0E; LBBROWSER) ");
		biliAppDownHeadersList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; QQDownload 732; .NET4.0C; .NET4.0E; LBBROWSER)");
		biliAppDownHeadersList.add("Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 6.1; WOW64; Trident/5.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; .NET4.0C; .NET4.0E; QQBrowser/7.0.3698.400)");
		biliAppDownHeadersList.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; QQDownload 732; .NET4.0C; .NET4.0E)");
		biliAppDownHeadersList.add("Mozilla/5.0 (Windows NT 5.1) AppleWebKit/535.11 (KHTML, like Gecko) Chrome/17.0.963.84 Safari/535.11 SE 2.X MetaSr 1.0");
		biliAppDownHeadersList.add("Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; Trident/4.0; SV1; QQDownload 732; .NET4.0C; .NET4.0E; SE 2.X MetaSr 1.0)");
		biliAppDownHeadersList.add("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Maxthon/4.4.3.4000 Chrome/30.0.1599.101 Safari/537.36");
		biliAppDownHeadersList.add("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/38.0.2125.122 UBrowser/4.0.3214.0 Safari/537.36");
	}
	public static HashMap<String, String> getBiliAppDownHeaders() {
		Random rd = new Random();
		int index = rd.nextInt(23);
		HashMap<String, String> appHeaderMap = new HashMap<>();
		appHeaderMap.put("User-Agent", biliAppDownHeadersList.get(index));
		return appHeaderMap;
	}

	/**
	 * 该Header配置用于FLV视频下载
	 */
	public HashMap<String, String> getBiliWwwFLVHeaders(String avId) {
		headerMap.put("X-Requested-With", "ShockwaveFlash/28.0.0.137");
		headerMap.put("Referer", "https://www.bilibili.com/video/" + avId);// need addavId
		headerMap.put("User-Agent", UA_PC_Sogo);
		return headerMap;
	}

	/**
	 * 该Header配置用于M4s视频下载
	 */
	public HashMap<String, String> getBiliWwwM4sHeaders(String avId) {
		headerMap.remove("X-Requested-With");
		headerMap.put("Referer", "https://www.bilibili.com/video/" + avId);// need addavId
		headerMap.put("User-Agent", UA_PC_Sogo);
		return headerMap;
	}

	/**
	 * 该Header配置用于api 信息查询
	 * avId/bvId
	 */
	public HashMap<String, String> getBiliJsonAPIHeaders(String avId) {
		headerMap.put("Accept", "*/*");
		headerMap.put("Accept-Encoding", "gzip, deflate, sdch, br");
		headerMap.put("Accept-Language", "zh-CN,zh;q=0.8");
		headerMap.put("Connection", "keep-alive");
		headerMap.put("Host", "api.bilibili.com");
		headerMap.put("Referer", "https://www.bilibili.com/video/" + avId);// need addavId
		headerMap.put("User-Agent", UA_PC_Sogo);
		headerMap.put("X-Requested-With", "ShockwaveFlash/28.0.0.137");
		return headerMap;
	}

	/**
	 * 该Header配置用于api 信息查询(版权限制，只能在app上看的那种)
	 */
	public HashMap<String, String> getBiliAppJsonAPIHeaders() {
		headerMap.put("Accept", "*/*");
		headerMap.put("Accept-Encoding", "gzip, deflate, sdch, br");
		headerMap.put("Accept-Language", "zh-CN,zh;q=0.8");
		headerMap.put("Connection", "keep-alive");
		headerMap.put("Host", "app.bilibili.com");
		headerMap.put("Referer", "https://app.bilibili.com");
		headerMap.put("User-Agent",
				"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.119 Safari/537.36");
		headerMap.put("X-Requested-With", "ShockwaveFlash/28.0.0.137");
		return headerMap;
	}

	/**
	 * 该Header配置用于移动端视频下载/网页访问
	 */
	public HashMap<String, String> getBiliMHeaders() {
		if (mobileHeaderMap == null) {
			mobileHeaderMap = new HashMap<String, String>();
			mobileHeaderMap.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
			mobileHeaderMap.put("Accept-Encoding", "gzip, deflate, sdch, br");
			mobileHeaderMap.put("Accept-Language", "zh-CN,zh;q=0.8");
			mobileHeaderMap.put("Connection", "keep-alive");
			mobileHeaderMap.put("Cache-Control", "max-age=0");
			mobileHeaderMap.put("Host", "m.bilibili.com");
			mobileHeaderMap.put("User-Agent", UA_ForAppOnly);
		}
		return mobileHeaderMap;
	}

	/**
	 * 该Header配置用于获取个人的所有收藏夹
	 */
	public HashMap<String, String> getAllFavListHeaders(long personId) {
		headerMap = new HashMap<String, String>();
		headerMap.put("Accept", "application/json, text/plain, */*");
		headerMap.put("Accept-Encoding", "gzip, deflate, br");
		headerMap.put("Accept-Language", "zh-CN,zh;q=0.8");
		headerMap.put("Connection", "keep-alive");
		headerMap.put("Host", "api.bilibili.com");
		headerMap.put("Origin", "https://space.bilibili.com");
		headerMap.put("Referer", String.format("https://space.bilibili.com/%d/favlist", personId));
		headerMap.put("User-Agent", UA_PC_Sogo);
		return headerMap;
	}

	/**
	 * 该Header配置用于获取收藏夹信息
	 */
	public HashMap<String, String> getFavListHeaders(String personId, String favID) {
		headerMap = new HashMap<String, String>();
		headerMap.put("Accept", "application/json, text/plain, */*");
		headerMap.put("Accept-Encoding", "gzip, deflate, sdch, br");
		headerMap.put("Accept-Language", "zh-CN,zh;q=0.8");
		headerMap.put("Cache-Control", "no-cache");
		headerMap.put("Pragma", "no-cache");
		headerMap.put("Connection", "keep-alive");
		headerMap.put("Host", "api.bilibili.com");
		headerMap.put("Origin", "https://space.bilibili.com");
		headerMap.put("Referer",
				String.format("https://space.bilibili.com/%s/favlist?fid=%s&ftype=create", personId, favID));
		headerMap.put("User-Agent", UA_PC_Sogo);
		return headerMap;
	}

	/**
	 * 该Header配置用于获取收藏夹信息
	 */
	public HashMap<String, String> getFavListHeaders(String favID) {
		headerMap = new HashMap<String, String>();
		headerMap.put("Accept", "application/json, text/plain, */*");
		headerMap.put("Accept-Encoding", "gzip, deflate, sdch, br");
		headerMap.put("Accept-Language", "zh-CN,zh;q=0.8");
		headerMap.put("Cache-Control", "no-cache");
		headerMap.put("Pragma", "no-cache");
		headerMap.put("Connection", "keep-alive");
		headerMap.put("Host", "api.bilibili.com");
		headerMap.put("Origin", "https://www.bilibili.com");
		headerMap.put("Referer", String.format("https://www.bilibili.com/medialist/detail/ml%s?type=2", favID));
		headerMap.put("User-Agent", UA_PC_Sogo);
		return headerMap;
	}

	/**
	 * 该Header配置用于通用弹幕
	 */
	public HashMap<String, String> getDanmuHeaders() {
		headerMap = new HashMap<String, String>();
		headerMap.put("Accept", "text/html,application/xhtml+xm…ml;q=0.9,image/webp,*/*;q=0.8");
		headerMap.put("Accept-Encoding", "gzip, sdch, br");
		headerMap.put("Accept-Language", "zh-CN,zh;q=0.8");
		headerMap.put("Cache-Control", "no-cache");
		headerMap.put("Connection", "keep-alive");
		headerMap.put("Host", "api.bilibili.com");
		headerMap.put("User-Agent", UA_PC_Sogo);
		return headerMap;
	}

	/**
	 * 该Header配置用于通用PC端页面访问
	 */
	public HashMap<String, String> getCommonHeaders(String host) {
		headerMap = new HashMap<String, String>();
		headerMap.put("Accept", "text/html,application/xhtml+xm…ml;q=0.9,image/webp,*/*;q=0.8");
		headerMap.put("Accept-Encoding", "gzip, deflate, sdch, br");
		headerMap.put("Accept-Language", "zh-CN,zh;q=0.8");
		headerMap.put("Cache-Control", "max-age=0");
		headerMap.put("Connection", "keep-alive");
		headerMap.put("Host", host);
		headerMap.put("User-Agent", UA_PC_Sogo);
		return headerMap;
	}

	/**
	 * 该Header配置用于通用PC端页面访问
	 */
	public HashMap<String, String> getCommonHeaders() {
		headerMap = new HashMap<String, String>();
		headerMap.put("Accept", "text/html,application/xhtml+xm…ml;q=0.9,image/webp,*/*;q=0.8");
		headerMap.put("Accept-Encoding", "gzip, deflate, sdch, br");
		headerMap.put("Accept-Language", "zh-CN,zh;q=0.8");
		headerMap.put("Cache-Control", "max-age=0");
		headerMap.put("Connection", "keep-alive");
		headerMap.put("User-Agent", UA_PC_Sogo);
		return headerMap;
	}

}
