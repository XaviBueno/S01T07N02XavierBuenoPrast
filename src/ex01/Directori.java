package ex01;
import java.lang.annotation.*;

	
	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.METHOD)
	 public @interface Directori{
	    public	String directori(); //inclou el nom del'arxiu
	    
	}
	

