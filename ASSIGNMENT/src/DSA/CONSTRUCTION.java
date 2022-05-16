package DSA;
import java.util.*;

public class CONSTRUCTION {

	 public Integer floors;
	    public Integer[] floorSize;
	    public void orderCalculator(Integer[] floorSize) {
	        System.out.println("The order of construction is as follows");
	        Integer[] sotredSize = floorSize.clone();
	        Arrays.sort(sotredSize, Collections.reverseOrder());
	        Stack<Integer> myStack = new Stack <>();
	        int j = 0;
	        for (int i = 0; i < floorSize.length; i++) {
	            if (floorSize[i] == sotredSize[j]) {
	                if (i == floorSize.length - 1){
	                    j = i;
	                }
	                else{
	                    j = i + 1;
	                }
	                System.out.println("Day: " + (i + 1));
	                if (myStack != null) {
	                    System.out.print(floorSize[i] + " ");
	                    while (!myStack.isEmpty()) {
	                        int val = myStack.pop();
	                        if (val >= sotredSize[j]) {
	                            System.out.print(val + " ");
	                        }
	                        else {
	                            myStack.push(val);
	                            j -= myStack.size();
	                            break;
	                        }
	                    }
	                    System.out.println("");
	                }
	                else {
	                    System.out.println(floorSize[i]);
	                }
	            }
	            else {
	                System.out.println("Day: " + (i + 1));
	                myStack.push(floorSize[i]);
	            }
	        }
	    }
	    public void getIData() {
	        System.out.println("enter the total no of floors in the building");
	        Scanner sc = new Scanner(System.in);
	        floors = sc.nextInt();
	        floorSize = new Integer[floors];
	        for (int i = 1; i <= floors; i++) {
	            System.out.println("enter the floor size given on day : " + i);
	            floorSize[i - 1] = sc.nextInt();
	        }
	    }
	}