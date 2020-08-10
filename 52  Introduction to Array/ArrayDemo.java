public class ArrayDemo {
    public static void main(String[] args){
        System.out.println("");
        int[] number = new int[5], number2 = new int[15];
        number[0] = 10;
        number[1] = 20;
        number[2] = 30;
        number[3] = 40;
        number[4] = 50;
        int sum = number[0]+number[1]+number[2]+number[3]+number[4];
        int len = number.length;
        System.out.println(number[0]);
        System.out.println("The Array size is "+len);
        System.out.println("The Array summation is "+sum);
    }

	public static void main(final String[] args) {
	
	     final int[][] number = new int[4][5];
	    int k =0;
	    
	    for(int i=0;i<4;i++){
	        for(int j=0;j<5;j++){
	            number[i][j] = k;
	            k++;
	        }
	    }
	
	    for(int i=0;i<4;i++){
	        for(int j=0;j<5;j++){
	            System.out.print(" "+number[i][j]);
	        }
	        System.out.println();
	    }
	
	    
	}
}
