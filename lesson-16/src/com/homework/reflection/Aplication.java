package com.homework.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class Aplication {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		
		Class<House> hs = House.class; 
		
		String nameClass = hs.getName();
		System.out.println("Name of class : " + nameClass);
		System.out.println();
		String simpleName = hs.getSimpleName();
		System.out.println("Simple name of class : "+ simpleName);
		System.out.println();
		int modifier = hs.getModifiers();
		String modifierT = Modifier.toString(modifier);
		System.out.println("Class modififer :"+ modifierT +" int= " + modifier);
		System.out.println();
		System.out.println("Is public : " + Modifier.isPublic(modifier));
		System.out.println("Is final : " + Modifier.isFinal(modifier));
		System.out.println("Is protected : " + Modifier.isProtected(modifier));
		System.out.println();
		Package pk = hs.getPackage();
		System.out.println("Class package : "+ pk);
		System.out.println();
		
		Constructor<House>[] houseConstructor = (Constructor<House>[]) hs.getConstructors();
		for(int i =0; i < houseConstructor.length; i ++ ) {
			Constructor<House> constructor = houseConstructor[i];
		}
		
		Constructor<House> constructor = houseConstructor[0];
		
		Class<?>[] parameters = constructor.getParameterTypes();
		for(int i =0; i < parameters.length; i++) {
			Class<?> class2 = parameters[i];
		}
		
		Constructor<House> constructorSingel = hs.getConstructor(parameters);
		System.out.println("Constructor : "+ constructorSingel);
		House newInstans =  constructorSingel.newInstance("White", 34, "DeepWood");
		System.out.println("House "+ newInstans);
		
		
		
	}

}
