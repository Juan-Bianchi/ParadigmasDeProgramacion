package edu.unlam.paradigmas.colecciones.ej07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

public class Cola implements Queue<Tarea>{
	
	private List<Tarea> colaTarea = new ArrayList<>();

	@Override
	public int size() {
		return colaTarea.size();
	}

	@Override
	public boolean isEmpty() {
		return colaTarea.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return colaTarea.contains(o);
	}

	@Override
	public Iterator<Tarea> iterator() {
		return colaTarea.iterator();
	}

	@Override
	public Object[] toArray() {
		return colaTarea.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return colaTarea.toArray(a);
	}

	@Override
	public boolean remove(Object o) {
		return colaTarea.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {	
		return colaTarea.contains((Tarea)c);
	}

	@Override
	public boolean addAll(Collection<? extends Tarea> c) {
		return colaTarea.addAll(c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return colaTarea.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return colaTarea.retainAll(c);
	}

	@Override
	public void clear() {
		colaTarea.clear();		
	}

	@Override
	public boolean add(Tarea e) {
		return colaTarea.add(e);
	}

	@Override
	public boolean offer(Tarea e) {
		return colaTarea.add(e);
	}

	@Override
	public Tarea remove() {
		return colaTarea.remove(0);
	}

	@Override
	public Tarea poll() {
		return colaTarea.isEmpty()? null: colaTarea.remove(0);
	}

	@Override
	public Tarea element() {
		return colaTarea.get(0);
	}

	@Override
	public Tarea peek() {	
		return colaTarea.isEmpty()? null: colaTarea.get(0);
	}

}
