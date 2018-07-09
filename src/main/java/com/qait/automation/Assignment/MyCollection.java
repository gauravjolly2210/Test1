package com.qait.automation.Assignment;
public class MyCollection implements DynamicArray {
	// Uncomment commented section

	/**
	 * You can declare local/global variables as per your requirement
	 */
	@SuppressWarnings("unused")
	private String[] numArray;
	int count=0;
	
	public MyCollection(int arraySize){
		numArray = new String[arraySize];
		
	}
	int i=0;
	public int search(String searchingNum) {
		int flag=0;
		int pos=-1;
		for(i=0;i<numArray.length;i++) {
			System.out.println(numArray[i]);
			if(searchingNum == (numArray[i])) {
				System.out.println("element found at position"+i);
				pos=i;
				flag=1;
				break;
			}
		}
		
		if(flag==1)
			{return pos;}
		
		return -1;
		
	}

	public boolean add(String numberToAdd) {
		int size=numArray.length;
		int status=0;
		
			count++;
			if(i==0) {
			numArray[i]=numberToAdd;
			i++;
			}
			else {
				for(int j=0;j<size;j++) {
					if(numberToAdd.equals(numArray[j])) {
						status=1;
					}
				}
				numArray[i]=numberToAdd;
				i++;
			}
			
		
		if(numArray.length>0 || status==1)
			return true;
		else
			return false;
	}

	public void doubleCapacity() {
		String[] double_array = new String[numArray.length*2];
		for(int i=0;i<numArray.length;i++) {
			double_array[i] = numArray[i];
		}
		numArray = double_array;

	}

	public boolean remove(String numberToRemove) {
		
		int flag=0;
		for(int i=0;i<count+1;i++) {
			if(numberToRemove==numArray[i]) {
				for(int j=i;j<count+1;j++) {
					numArray[j]=numArray[j+1];
				}
				flag=1;
				break;
			}
		}
		if(flag==1)
			return true;
		else
			return false;
	}

	public int getCount() {
		int length=numArray.length;
		if(numArray.length>0)
		return length;
		else
		return 0;
	}

	public String[] rotate(int n) {
		

		String[] dummy_array =new String[n];
		for(int i=0;i<n;i++) {
			dummy_array[i]=numArray[i];
		}
		int size=numArray.length;
		for(int i=n;i<size;i++) {
			numArray[i-n]=numArray[i];
		}
		for(int i=0;i<n;i++) {
			numArray[size-n+i]=dummy_array[i];
		}
		return null;
	}
	
	public String toString( ) {
		String array="{";
		
		for(int i=0;i<count;i++) {
			array=array+numArray[i]+",";
		}
		if(array.charAt(array.length()-1)==',') {
			array=array.substring(0, array.length()-1);
		}
		array=array+"}";
		return array;
	}
	

}
