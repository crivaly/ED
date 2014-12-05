package org.institutoserpis.ed;

public class Vector {

	public static void main(String[] args) {
		//int index=0;
		//int [] v= new int[5];
		
		int [] v= new int []{5,3,1,9,45};
		int [] w= new int []{33,34,10};
		
		System.out.println("v2[0]="+ v[0]);
		
		
		show(v);
		show(w);
		
		int menor= min(v);
		System.out.println("el menor es= "+ menor);
		int index= indexOf(v,9);
		System.out.println("la posición de 9 es: "+index);
	}
	
	public static void show(int[] v) {
		for (int index=0; index < v.length; index++)
			System.out.println("valor= "+v[index]);
	}

//min   (en los apuntes)    (devuelve el valor)
	
	public static int min(int[]vector){   //public(se puede utilizar fuera de la clase) static(existe sin necesidad de crear ningún objeto, y sólo existe una parte estática. a éste se le puede llamar sin haber instanciado ningún objeto)
		int minValue= vector[0]; // para recorrer de izquiera a derecha desde el primero
		for (int index=1; index < vector.length; index++)     //empiezo desde el 1 porque el 0 ya lo hemos visto enl a línea anterior
			if(vector[index] < minValue)
				minValue=vector[index];
		return minValue;
	}
	
	
// index of.       array valor indexOf y si no está = -1  (devuelve posición, no el valor)
	
	public static int indexOf (int [] v, int value){
//		int index=0;
//		while (index < v.length && v[index] != value)
//		// while (v[index] != value && index < v.length) // exception!!! : ArrayIndexOutBoundsException
//			index++;
//		if (index == v.length)
//			return -1;
//		return index;
		
		for (int index=0; index<v.length; index++)   //no es un recorrido, es una búsqueda,, porque si se cumple el "if" deja de buscar
			if (v[index]==value)
				return index;
		return -1;
	}

	
	
	
	
	
	
	
}
