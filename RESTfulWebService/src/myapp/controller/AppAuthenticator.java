package myapp.controller;

import java.nio.charset.StandardCharsets;
import java.util.Base64;



public class AppAuthenticator {
	 public static boolean isGetProductUser(String authString){
		 String[] authParts = authString.split("\\s+");
	        String authInfo = authParts[1];
	        byte[] decodedAuth = Base64.getDecoder().decode(authInfo);
	        System.out.println(new String(decodedAuth, StandardCharsets.UTF_8));
	        String decodedString=new String(decodedAuth, StandardCharsets.UTF_8);
	        String[] userNameAndPassword = decodedString.split(":");
	        System.out.println(userNameAndPassword);
	        if(userNameAndPassword[0].equals(AppConstants.PRODUCTUSER1)
	        		&& (userNameAndPassword[1].equals(AppConstants.PRODUCTPWD1))){
	        	return true;
	        }
	        return false;
	 }
	 
	 public static boolean isGetConfigUser(String authString){
		 String[] authParts = authString.split("\\s+");
	        String authInfo = authParts[1];
	        byte[] decodedAuth = Base64.getDecoder().decode(authInfo);
	        System.out.println(new String(decodedAuth, StandardCharsets.UTF_8));
	        String decodedString=new String(decodedAuth, StandardCharsets.UTF_8);
	        String[] userNameAndPassword = decodedString.split(":");
	        System.out.println(userNameAndPassword);
	        if(userNameAndPassword[0].equals(AppConstants.CONFIGUSER1)
	        		&& (userNameAndPassword[1].equals(AppConstants.CONFIGPWD1))){
	        	return true;
	        }
	        return false;
	 }
}
