package de.unistuttgart.dsass2018.ex01.p2;

/**
 * A simple list interface
 * @param <T> The type of list element
 */
public interface ISpeedList<T> {

	/**
	 * Returns the current number of elements in the list
	 * 
	 * @return Current number of elements in the list
	 */
	public int size();

	/**
	 * Inserts an element at the beginning of the list
	 * 
	 * @param item Item to be inserted
	 */
	public void prepend(T t);

	/**
	 * Returns the element at the specified position in the list
	 * 
	 * @param pos The position of the element in the list starting from 0
	 * 
	 * @return The specified element in the list
	 * 
	 * @throws IndexOutOfBoundsException If the requested element is out of
	 * range
	 */
	public T getElementAt(int pos);

	/**
	 * Returns the next 8th element of the specified element in the list
	 * 
	 * @param pos The position of the specified element in the list starting
	 * from 0
	 * 
	 * @return The next 8th element of the specified element
	 * 
	 * @throws IndexOutOfBoundsException If the requested element is out of
	 * range
	 */
	public T getNext8thElementOf(int pos);

}
