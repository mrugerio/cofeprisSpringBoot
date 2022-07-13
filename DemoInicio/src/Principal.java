
public class Principal {

	public static void main(String[] args) {
		
		String s = new String("Hola"); //Objeto	Inmutable	
		s.concat(" Mundo");
		System.out.println(s); //Hola
		
		StringBuilder sb = new StringBuilder("Hello"); //Objeto
		sb.append(" World");
		System.out.println(sb); //Hello World
		
		sb = null;
		
		int i = 10; //Primitivo
		i = i + 5;
		System.out.println(i); //5
		
		
		String s1 = "Otro Hola";
		String s2 = "Otro Hola"; //1
		String s3 = new String("Otro Hola"); //2
		
		System.out.println(s1==s2); //true
		System.out.println(s1==s3); //false
		System.out.println("*************");
		
		String name = "Paco";
		name = name + "Perez";
		
		
		
		
		StringBuilder nombre = new StringBuilder("Patrobas");
		
		for (int x = 0; x<100; x++ ) {
			nombre = nombre.append(x);
			System.out.println(x);
		}
		
		
	}

}
