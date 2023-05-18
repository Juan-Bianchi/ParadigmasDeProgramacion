import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {
	

	public static void main(String[] args) {
		
		Set<Integer> conjunto = new HashSet<>();
		conjunto.add(10);
		conjunto.add(40);
		conjunto.add(10);
		conjunto.remove(40);
		conjunto.clear();
		System.out.println(conjunto);
		
		List<Integer> listaArray = new ArrayList<Integer>();
		System.out.println("¿Está vacío?: " + (listaArray.isEmpty()? "vacío": "no vacío"));
		listaArray.add(5);
		listaArray.add(6);
		listaArray.add(7);
		System.out.println(listaArray);
		
		List<Integer> listaLinked = new ArrayList<Integer>();
		listaLinked.add(1);
		listaLinked.add(10);
		listaLinked.add(3);
		System.out.println(listaLinked);
		listaLinked.remove(1);
		System.out.println(listaLinked);
		System.out.println("Posición del elemento 3: " + listaLinked.indexOf(3));
		System.out.println("Elemento en la posición 1: " + listaLinked.get(1));
		listaLinked.add(33);
		listaLinked.remove(Integer.valueOf(33));
		System.out.println(listaLinked);
		listaLinked.add(1,34);
		System.out.println(listaLinked);
		System.out.println("¿Está vacío?: " + (listaLinked.isEmpty()? "vacío": "no vacío"));
		
		for (Integer numero : listaLinked) {
			numero +=3;
			System.out.println(numero);
		}
		
		HashMap<String,Integer> mapa=new HashMap<String,Integer>();
		mapa.put("Carlos", 3);
		mapa.put("Roberto", 4);
		mapa.put("Hernesto", 7);
		mapa.put("Jorge", 1);
		mapa.put("Ricardo", 9);
		System.out.println(mapa);
		System.out.println(mapa.get("Carlos"));
		System.out.println(mapa.getOrDefault("Carlo", -1));
		mapa.remove("Hernesto");
		System.out.println(mapa);
		
		for (String nombre : mapa.keySet()) {
			System.out.println(nombre + ": " + mapa.get(nombre));
		}
		
		Iterator<String> iterator = mapa.keySet().iterator();
		
		while(iterator.hasNext()) {
			String nombre = iterator.next();
			System.out.println(nombre + ": " + mapa.get(nombre));
		}
		
		for (Map.Entry<String, Integer> entrada: mapa.entrySet()) {	
		  // Cada entrada del entrySet contiene un par clave-valor del map
		  System.out.println(entrada);
		}
	}

}
