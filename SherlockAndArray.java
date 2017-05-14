import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockAndArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        boolean flag = false;
        int num = in.nextInt();
        ArrayElement e[] = new ArrayElement[num];
        for (int i=0;i<num;i++){
        	int size = in.nextInt();
        	e[i] = new ArrayElement(size);
        	e[i].num = size;
        	e[i].acceptElements();
        }
        
        for  (int i=0;i<num;i++){
        	if ( e[i].num == 1)
        		System.out.println("YES");
        	else{
        		for (int j=0;j<e[i].num;j++){
        			flag = false;
        			/*System.out.println(e[i].sumStart(j));
        			System.out.println(e[i].sumLast(j));*/
        			if (e[i].sumStart(j)==e[i].sumLast(j)){
        				System.out.println("YES");
        				flag=true;
        				break;
        			}
        		}
        		if (!flag){
        			System.out.println("NO");
        		}
        	}
        }
        
        
    }
}

class ArrayElement {
	int num;
	int array[];
	ArrayElement(int n){
	this.array = new int[n]; 
	}
	void acceptElements(){
		Scanner in = new Scanner(System.in);
		for (int i=0;i<this.num;i++){
			this.array[i] = in.nextInt();
		}
	}
	int sumStart(int index){
		int sum = 0;
		for (int i =0;i<index;i++)
			sum += this.array[i];
		return sum;
	}
	int sumLast(int index){
		int sum = 0;
		for (int i = index+1;i<num;i++)
			sum += this.array[i];
		return sum;
	}
}