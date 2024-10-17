package com.mehmett.java15_x.constant;

public class RestApis {
	private static final String VERSION = "/v1";
	private static final String API = "/api";
	private static final String DEVOLOPER = "/dev";
	private static final String TEST = "/test";
	private static final String PROD = "/prod";
	
	private static final String ROOT = VERSION + DEVOLOPER;
	
	public static final String USER =ROOT+  "/user";
	public static final String MESSAGE =ROOT+  "/message";
	public static final String FOLLOW =ROOT+  "/follow";
	
	
	public static final String FINDALL = "/find-all";
	public static final String FINDBYID = "/find-by-id";
	public static final String ADDUSER = "/add-user";
	public static final String ADDALLUSER = "/add-all-user";
	public static final String GETADDALLUSERFEMALE = "/get-all-users-f";
	public static final String LOGIN = "/login";
	public static final String CREATEUSER = "/create-user";
	public static final String REGISTER = "/register";
	public static final String SEARCHUSERBYID = "/search-user-id";
	
	public static final String GETMYFOLLOWING = "/get-my-following";
	public static final String ADDFOLLOW = "/add-follow";
	
}