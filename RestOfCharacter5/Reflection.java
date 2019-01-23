package RestOfCharacter5;

import java.lang.reflect.*;
import java.util.Scanner;

public class Reflection {

	public static void main(String[] args) {
		String name;
		if (args.length > 0)
			name = args[0];
		else {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter class name (e.g. java.util.Date): ");
			name = in.next();
		}
		
		try {
			Class cl = Class.forName(name);
			Class supercl = cl.getSuperclass();
			
			String modifies = Modifier.toString(cl.getModifiers());
			if (modifies.length() > 0)
				System.out.print(modifies + " ");
			System.out.print("class" + cl.getName());
			if (supercl != null && supercl != Object.class)
				System.out.print(" extends " + supercl.getName());
			System.out.println("{");
			
			printConstructors(cl);
			System.out.println();
			printMethods(cl);
			System.out.println();
			printFields(cl);
			System.out.println("}");
		}
			
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.exit(0);
	}

	
	public static void printConstructors(Class cl) {
		Constructor[] constructors = cl.getConstructors();
		
		for (Constructor c : constructors) {
			String name = c.getName();
			System.out.print("	");
			String modifiers = Modifier.toString(c.getModifiers());
			
			if (modifiers.length() > 0) {
				System.out.print(modifiers + " ");
			}
			System.out.print(name +"(");
			Class[] paramTypes = c.getParameterTypes();
			for (int i = 0; i < paramTypes.length; i++) {
				if (i > 0)
					System.out.print(", ");
				System.out.print(paramTypes[i].getName());
			}
			System.out.println(");");
		}
	}
	
	public static void printMethods(Class cl) {
		Method[] methods = cl.getMethods();
		
		for (Method m : methods) {
			Class retType = m.getReturnType();
			String modifies = Modifier.toString(m.getModifiers());
			String name = m.getName();
			Class[] paraTypes = m.getParameterTypes();
			
			System.out.print("	");
			if (modifies.length() > 0)
				System.out.print(modifies + " ");
			System.out.print(retType.getName() + " " + name + "(");
			for (int i = 0; i < paraTypes.length; i++) {
				if (i > 0)
					System.out.print(" ");
				System.out.print(paraTypes[i].getName());
			}
			System.out.println(");");
		}
	}
	
	public static void printFields(Class cl) {
		Field[] fields = cl.getDeclaredFields();
		
		for (Field f : fields) {
			Class type = f.getType();
			String name = f.getName();
			String modifies = Modifier.toString(f.getModifiers());
			
			System.out.print("	");
			if (modifies.length() > 0)
				System.out.print(modifies + " ");
			System.out.println(type.getName() + " " + name + ";");
		}
	}
}



