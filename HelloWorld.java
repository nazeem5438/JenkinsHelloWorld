public class HelloWorld{
	public static void main(String args[]){
		if(args.length > 0){
			int max = Integer.parseInt(args[0]);
			int min = Integer.parseInt(args[0]);
			System.out.println("Input Array ");
			for(String ob : args){
				System.out.print(obj);
				int no2 = Integer.parseInt(ob);
				if(max < no2){
					max = no2;
				}
				if(min > no2){
					min = no2;
				}				
			}
			
			System.out.println("The max number is " + max);
			System.out.println("The min number is " + min);
		}else{
			System.out.println("There is no number to find max in the input array");
		}
		
	}
}