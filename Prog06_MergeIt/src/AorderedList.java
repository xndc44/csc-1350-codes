import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class AorderedList {
	private ArrayList<String> one;
	private ArrayList<String> two;
	
	public ArrayList<String> firstinput(Scanner a) {
		while (a.hasNextLine()) {
            String[] elements = a.nextLine().split(",");
            if (elements[0].equals("A")) {
            	Movie newMovie = new Movie(elements[1], Integer.parseInt(elements[2]), elements[3], Integer.parseInt(elements[4]));
            }
            else if (elements[0].equals("D")) {
            	ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));
            	list.removeAll(Arrays.asList("D"));
            	array = list.toArray(array);
            	
            }
		}//while
		return one;
	}
	
	public ArrayList<String> secondinput(Scanner b) {
		return two;
	}


	    final int arraySize = 20;   

	    private Comparable[] ListStore;          
	    private int listSize;          
	    private int numObjects;        

	    private int curr;
	    
	    
	    public AorderedList() {
	        numObjects = 0;
	        listSize = arraySize;
	        ListStore = new Comparable[arraySize];
	    }//orderedlist

	    public void add(Comparable newObject) {

	        if (numObjects >= listSize) {
	            ListStore = Arrays.copyOf(ListStore, ListStore.length + arraySize);
	        }//if

	        if (isEmpty())
	        {
	            ListStore[0] = newObject;
	        }//if
	        else {
	            for (int i = 0; i < numObjects + 1; i++) {
	                if (ListStore[i] == null) {
	                    ListStore[i] = newObject;
	                }//if
	                else {
	                    int result = ListStore[i].compareTo(newObject);
	                    if (result > 0) {
	                        Comparable nextObject = newObject;
	                        for (int j = i; j <= numObjects; j++) {
	                            Comparable tmp = ListStore[j];
	                            ListStore[j] = nextObject;
	                            nextObject = tmp;
	                        }
	                        break;
	                    }//if
	                }//else
	            }//for
	        }//else


	        numObjects++;
	    }

	    public String toString() {
	        StringBuilder stringBuilder = new StringBuilder();

	        if (numObjects > 0) {
	            for (int i = 1; i < numObjects; i++) {
	                stringBuilder.append(String.format("[%s]%n", ListStore[i].toString()));
	            }//for
	        }//if

	        return stringBuilder.toString();
	    }//toString

	    public int size() {
	        return numObjects;
	    }//size

	   
	    public Comparable get(int index) {
	        return ListStore[index];
	    }//get

	   
	    public boolean isEmpty() {
	        return numObjects == 0;
	    }//isEmpty

	    
	    public void remove(int index) {
	        for (int i = index; i <= numObjects; i++) {
	            ListStore[i] = ListStore[i + 1];
	        }//for
	        numObjects--;
	    }//remove

	   
	    public void reset() { 
	    	curr = 0; 
	    }//reset

	    
	    public Comparable next() {
	        Comparable item = ListStore[curr + 1];
	        curr++;
	        return item;
	    }//comparable

	   
	    public boolean hasNext() { 
	    	return ListStore[curr + 1] != null; }

	   
	    public void remove() {
	        reset();
	        while(hasNext()) {
	            next();
	        }//while
	        ListStore[curr] = null;
	        reset();
	    }//remove
	}
