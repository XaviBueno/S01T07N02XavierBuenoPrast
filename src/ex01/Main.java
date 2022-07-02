package ex01;


import java.io.FileWriter;


import java.lang.reflect.Method;


import com.google.gson.Gson;


public class Main {

	public static void main(String[] args) {
		Treballador treballador=new Treballador("Pere","Gonzalez",25);
		
		serialitzaJson(treballador);
		
	}
	

	
	//EL NOM DEL DIRECTORI INCLOU EL NOM DE L'ARXIU
	
	@Directori(directori=".\\objecte.json")
	static void serialitzaJson(Object objecte) {

		Gson gson=new Gson();
		String serial= gson.toJson(objecte);
	
		try {
			Method method=Main.class.getDeclaredMethod("serialitzaJson",Object.class);
			Directori annotation=method.getAnnotation(Directori.class);
			FileWriter arxiu=new FileWriter(annotation.directori());
			arxiu.write(serial);
			arxiu.close();
			System.out.println(annotation.directori());
		}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
		
		
	}
	
	

}
