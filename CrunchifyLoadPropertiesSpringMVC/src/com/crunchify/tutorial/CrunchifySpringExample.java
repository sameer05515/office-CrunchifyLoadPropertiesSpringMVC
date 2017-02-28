package com.crunchify.tutorial;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
 
/**
 * 
 * @author Crunchify.com
 */
 
@Component("crunchifySpringExample")
@Scope("singleton")
public class CrunchifySpringExample {
 
    private static boolean springExample;
    private static String springTutorial;
    private static String url;
    private static boolean premendraStartStudySpring;
 
    @Autowired
    public CrunchifySpringExample(@Value("${CRUNCHIFY_URL}") String url, @Value("${SPRING_TUTORIAL}") String springTutorial,
            @Value("${IS_THIS_SPRING_EXAMPLE}") boolean springExample, 
            @Value("${PREMENDRA_START_STUDY_SPRING}") boolean premendraStartStudySpring) {
        CrunchifySpringExample.springExample = springExample;
        CrunchifySpringExample.springTutorial = springTutorial;
        CrunchifySpringExample.url = url;
        CrunchifySpringExample.premendraStartStudySpring = premendraStartStudySpring;
 
    }
 
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        try {
            ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] { "spring-bean.xml" });
        } catch (Throwable e) {
            System.out.println(e);
        }
 
        while(true){
        	try {
				System.out.println("\nLoading Properties from Config File during application startup: \n\nSPRING_TUTORIAL: " + springTutorial);
				System.out.println("IS_THIS_SPRING_EXAMPLE: " + springExample);
				System.out.println("CRUNCHIFY_URL: " + url);
				System.out.println("PREMENDRA_START_STUDY_SPRING: " + premendraStartStudySpring);
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
        }
    }
 
}