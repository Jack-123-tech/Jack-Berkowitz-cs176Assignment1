
public class Arrylist2 {
	private static double[] numbers;
	public static void main(String[] args) {

		
		
		
	 numbers = new double[] {1,4,9,16,10,7,4,9,11,5};
	System.out.print( numbers[2]+",");
	System.out.print(numbers[4]+",");
	System.out.print(numbers[6]+",");
	System.out.print(numbers[8]);
	 System.out.println("");
	
	
	
	System.out.print("Even numbers:");
	for(int k=0;k<numbers.length ;k++){
		if (numbers[k]%2==0) {
        System.out.print(numbers[k]+",");
		}
    }
	
	System.out.println("");
	System.out.print("Odd Numbers:");
	for (int i=0; i<numbers.length; i++) {
        if(numbers[i]%2 != 0) {
           System.out.print(+numbers[i]);
           
		}
        
	
        
        
	 }
	 System.out.println("");
	System.out.println(" In reverse order:");
    System.out.print( numbers[9]+",");
    System.out.print( numbers[8]+",");
    System.out.print( numbers[7]+",");
    System.out.print( numbers[6]+",");
    System.out.print( numbers[5]+",");
    System.out.print( numbers[4]+",");
    System.out.print( numbers[3]+",");
    System.out.print( numbers[2]+",");
    System.out.print( numbers[1]+",");
    System.out.print( numbers[0]);
		    
    System.out.println("");
    System.out.println("the first,fifth, and last elements of the array ");
    System.out.print(numbers[0]+"," );
    System.out.print(numbers[5]+",");
    System.out.print(numbers[9]);
    
    System.out.println("");
    System.out.println ("The largest and smallest in the array");
    System.out.print(numbers[0]+",");
    System.out.print(numbers[9]);
    System.out.println("");
    double sum=0;
    
for(int i =0; i < numbers.length; i++){
        
        if((i % 2) != 1){
            sum += numbers[i];
        }else{
            sum -= numbers[i];
        }
    }
		System.out.println("This is the alternating Sum:"+sum);
}}



