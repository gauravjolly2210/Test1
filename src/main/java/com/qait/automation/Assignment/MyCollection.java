package com.qait.automation.Assignment;
public class MyCollection implements DynamicArray {
	// Uncomment commented section

	/**
	 * You can declare local/global variables as per your requirement
	 */
	@SuppressWarnings("unused")
	private String[] numArray;
	
	public MyCollection(int arraySize){
		numArray = new String[arraySize];
		
	}
	public int search(String searchingNum) {
		int size=numArray.length;
		int flag=0;
		int i=0,pos=-1;
		for(i=0;i<size;i++) {
			System.out.println(numArray[i]);
			if(searchingNum.equals(numArray[i])) {
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
		for(int i=0;i<size;i++) {
			if(i==0) {
			numArray[i]=numberToAdd;
			}
			else {
				for(int j=0;j<size;j++) {
					if(numberToAdd.equals(numArray[j])) {
						status=1;
					}
				}
				numArray[i]=numberToAdd;
			}
			
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
		int size=numArray.length;
		int flag=0;
		for(int i=0;i<size;i++) {
			System.out.println(numArray);
			if(numberToRemove.equals(numArray[i])) {
				for(int j=i;j<size;j++) {
					numArray[i]=numArray[i+1];
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

}