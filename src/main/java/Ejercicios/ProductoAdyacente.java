package Ejercicios;

public class ProductoAdyacente {
	
	public static int adjacentElementsProduct(int[] inputArray) {
		int productomayor = -2000, i;
		
		for(i=0; i < inputArray.length-1;i++)
			if(productomayor < inputArray[i] * inputArray[i+1])
				productomayor = inputArray[i] * inputArray[i+1];
		
		return productomayor;
	}
	
	public static void main(String[] args) {
		int [] tabla = {3, 6, -2, -5, 7, 3};
		System.out.println(adjacentElementsProduct(tabla));
		int [] tabla2 = {6, 6, -2, -5, 7, 3};
		System.out.println(adjacentElementsProduct(tabla2));
	}
}
