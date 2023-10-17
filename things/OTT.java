package com.xworkz.september.things;

public class OTT {
	public static void watch() {
		System.out.println("To watch movies in OTT:");
	}
	public static void watch(String movies) {
		System.out.println("To watch movies in OTT: "+movies);
	}
	public static void watch(String movies,String language) {
		System.out.println("To watch movies in OTT: "+movies+"  "+language);
	}
	public static void watch(String movies,float rating) {
		System.out.println("To watch movies in OTT: "+movies+"  "+rating);
	}
	public static void watch(String movies,String language,float rating) {
		System.out.println("To watch movies in OTT: "+movies+"  "+language+ "  "+rating);
	}
	public static void watch(String movies, float rating ,String platform) {
		System.out.println("To watch movies in OTT: "+movies+"  "+rating+"  "+platform);
	}
	public static void watch(String movies,int numberOfLanguages,float rating) {
		System.out.println("To watch movies in OTT: "+movies+ " "+numberOfLanguages+"  "+rating);
	}
	public static void watch(int numberOfLanguages,String movies,float rating) {
		System.out.println("To watch movies in OTT: "+numberOfLanguages+"  "+movies+"  "+rating);
	}
	public static void watch(String typeOfShows,float rating,int numberOfLanguages,String movies) {
		System.out.println("To watch movies in OTT "+typeOfShows+"  "+rating+"  "+numberOfLanguages+"  "+movies);
	}
	public static void watch(float rating,String typeOfShows,int numberOfLanguages,String movies) {
		System.out.println("To watch movies in OTT "+rating+"  "+typeOfShows+"  "+numberOfLanguages+"  "+movies);
	}
	public static void watch(String platform,float rating,int numberOfLanguages) {
		System.out.println("To watch movies in OTT:"+platform+"  "+rating+"  "+numberOfLanguages);
	}
	public static void watch(int numberOfLanguages,String platform) {
		System.out.println("To watch movies in OTT:"+numberOfLanguages+"  "+platform);
	}
	public static void watch(String movies,int numberOfLanguages,float rating,String platform) {
		System.out.println("To watch movies in OTT:"+movies+"  "+numberOfLanguages+"  "+rating+"  "+platform);
	}
	public static void watch(String platform,String typeOfShows,float rating,String movies) {
		System.out.println("To watch movies in OTT:"+platform+"  "+typeOfShows+"  "+rating+"  "+movies);
	}
	public static void watch(float rating,String movie,String typeOfShows,String platform) {
		System.out.println("To watch movies in OTT:"+rating+"  "+movie+"  "+typeOfShows+"  "+platform);
	}
	public static void watch(float rating,String movie,String typeOfShows,String platform,int numberOfLanguages) {
		System.out.println("To watch movies in OTT:"+rating+"  "+movie+"  "+typeOfShows+"  "+platform+"  "+numberOfLanguages);
	}
	
	
	//updateprofile
	
	public static void updateProfile() {
		System.out.println("To update a profile:");
	}
	public static void updateProfile(String name) {
		System.out.println("To update a profile:"+name);
	}
	public static void updateProfile(String name,boolean profilephoto) {
		System.out.println("To update a profile:"+name+"  "+profilephoto);
	}
	public static void updateProfile(boolean profilephoto,String name,String about) {
		System.out.println("To update a profile:"+profilephoto+"  "+name+"  "+about);
	}
	public static void updateProfile(boolean profilephoto,String name) {
		System.out.println("To update a profile:"+profilephoto+"  "+name);
	}
	
	//channel
	
	public static void channel() {
		System.out.println("To know the channel details:");
	}
	public static void channel(String name) {
		System.out.println("To know the channel details:"+name);
	}
	public static void channel(int number) {
		System.out.println("To know the channel details:"+number);
	}
	public static void channel(String name,int number) {
		System.out.println("To know the channel details:"+name+"  "+number);
	}
	public static void channel(String language,String name) {
		System.out.println("To know the channel details:"+language+"  "+name);
	}
	public static void channel(String name,String language,int number) {
		System.out.println("To know the channel details:"+name+"  "+language+"  "+number);
	}
	public static void channel(String typeOfChannel,String name,String language,int number) {
		System.out.println("To know the channel details:"+typeOfChannel+"  "+name+"  "+language+"  "+number);
	}
	public static void channel(int number,String typeOfChannel,String name,String language) {
		System.out.println("To know the channel details:"+number+"  "+typeOfChannel+"  "+name+"  "+language);
	}
	public static void channel(String typeOfChannel,int number,String name,String language) {
		System.out.println("To know the channel details:"+typeOfChannel+"  "+number+"  "+name+"  "+language);
	}
	
	//language
	public static void language() {
		System.out.println("To know the languages:");
	}
	public static void language(String language) {
		System.out.println("To know the languages:"+language);
	}
	public static void language(String language,int numlanguage) {
		System.out.println("To know the languages:"+language+"  "+numlanguage);
	}
	public static void language(int numlanguage , String language) {
		System.out.println("To know the languages:"+numlanguage+"  "+language);
	}
	public static void language(int numlanguage,String language,int ratingLanguage) {
		System.out.println("To know the languages:"+numlanguage+"  "+language+"  "+ratingLanguage);
	}
	public static void language(int numlanguage,int ratingLanguage,String language) {
		System.out.println("To know the languages:"+numlanguage+"  "+ratingLanguage+"  "+language);
	}
	public static void language(int numlanguage,int ratingLanguage,String language,float proficiency) {
		System.out.println("To know the languages:"+numlanguage+"  "+ratingLanguage+"  "+language+"  "+proficiency);
	}
	public static void language(int numlanguage,float proficiency,int ratingLanguage,String language) {
		System.out.println("To know the languages:"+numlanguage+"  "+proficiency+"  "+ratingLanguage+"  "+language);
	}
	public static void language(float proficiency, int numlanguage,int ratingLanguage,String language) {
		System.out.println("To know the languages:"+proficiency+"  "+numlanguage+"  "+ratingLanguage+"  "+language);
	}
	public static void language(int numlanguage,int ratingLanguage,float proficiency,String language) {
		System.out.println("To know the languages:"+numlanguage+"  "+ratingLanguage+"  "+proficiency+"  "+language);
	}
	public static void language(int numlanguage,int ratingLanguage,float proficiency,String language,boolean knowLang) {
		System.out.println("To know the languages:"+numlanguage+"  "+ratingLanguage+"  "+proficiency+"  "+language+" "+knowLang);
	}
	public static void language(boolean knowLang,int numlanguage,int ratingLanguage,float proficiency,String language) {
		System.out.println("To know the languages:"+knowLang+"  "+numlanguage+"  "+ratingLanguage+"  "+proficiency+"  "+language);
	}
	public static void language(int numlanguage,boolean knowLang,int ratingLanguage,float proficiency,String language) {
		System.out.println("To know the languages:"+numlanguage+"  "+knowLang+"  "+ratingLanguage+"  "+proficiency+"  "+language);
	}
	public static void language(int numlanguage,int ratingLanguage,boolean knowLang,float proficiency,String language) {
		System.out.println("To know the languages:"+numlanguage+"  "+ratingLanguage+"  "+knowLang+"  "+proficiency+"  "+language);
	}
	public static void language(int numlanguage,int ratingLanguage,float proficiency,boolean knowLang,String language) {
		System.out.println("To know the languages:"+numlanguage+"  "+ratingLanguage+"  "+proficiency+"  "+knowLang+"  "+language);
	}
	public static void language(int numlanguage,int ratingLanguage,boolean knowLang,String language,float proficiency) {
		System.out.println("To know the languages:"+numlanguage+"  "+ratingLanguage+" " +knowLang+"  "+language+"  "+proficiency);
	}
	public static void language(float proficiency,int numlanguage,int ratingLanguage,boolean knowLang,String language) {
		System.out.println("To know the languages:"+proficiency+"  "+numlanguage+"  "+ratingLanguage+" " +knowLang+"  "+language);
	}
	public static void language(int numlanguage,float proficiency,int ratingLanguage,boolean knowLang,String language) {
		System.out.println("To know the languages:"+numlanguage+"  "+proficiency+"  "+ratingLanguage+" " +knowLang+"  "+language);
	}
	public static void language(int numlanguage,boolean knowLang,float proficiency,int ratingLanguage,String language) {
		System.out.println("To know the languages:"+numlanguage+"  "+knowLang+"  "+proficiency+"  "+ratingLanguage+"  "+language);
	}
	
	
	
	
	
	
    
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
