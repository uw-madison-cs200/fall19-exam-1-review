  
/**
 * Random
 *
 * @author Jack & Bobbi
 */

import java.util.Random;
import java.util.Scanner;

public class RandomExamples {

    public static void main(String[] args) {
	Random randGen = new Random();
	Random randGenWithSeed = new Random(125);

	System.out.println();
	example2(randGen, randGenWithSeed);
	System.out.println();

	//bounded random generator formula:
	//randGen.nextInt(max-min+1) + min;

	example1(randGen, 0);
	example1(randGen, 1);
	example1(randGen, 2);
	example1(randGen, 3);
	
    }

    public static void example1(Random randGen, int flag){

	//Generate numbers in a range
	
	if(flag == 0){
	    int[] generatedNumbers = new int[1000]; // don't worry about this
	    for(int i = 0; i<1000; i++){
		generatedNumbers[i] = randGen.nextInt(10);
	    }
	    System.out.println("randGen.nextInt(10)");
	    System.out.println("Max: " + max(generatedNumbers));
	    System.out.println("Min: " + min(generatedNumbers));
	    System.out.println("Avg: " + avg(generatedNumbers) + "\n");
	}

	if(flag == 1){
	    int [] generatedNumbers = new int[1000]; // don't worry about this
	    for(int i = 0; i<1000; i++){
		generatedNumbers[i] = randGen.nextInt(10) + 3;
	    }
	    System.out.println("randGen.nextInt(10) + 3");
	    System.out.println("Max: " + max(generatedNumbers));
	    System.out.println("Min: " + min(generatedNumbers));
	    System.out.println("Avg: " + avg(generatedNumbers) + "\n");
	}

	if(flag == 2){
	    int [] generatedNumbers = new int[1000]; // don't worry about this
	    for(int i = 0; i<1000; i++){
		generatedNumbers[i] = randGen.nextInt(5);
	    }
	    System.out.println("randGen.nextInt(-5)");
	    System.out.println("Max: " + max(generatedNumbers));
	    System.out.println("Min: " + min(generatedNumbers));
	    System.out.println("Avg: " + avg(generatedNumbers) + "\n");
	}

	if(flag == 3){
	    int [] generatedNumbers = new int[1000]; // don't worry about this
	    for(int i = 0; i<1000; i++){
		generatedNumbers[i] = randGen.nextInt(5) - 10;
	    }
	    System.out.println("randGen.nextInt(5) - 10");
	    System.out.println("Max: " + max(generatedNumbers));
	    System.out.println("Min: " + min(generatedNumbers));
	    System.out.println("Avg: " + avg(generatedNumbers) + "\n");
	}
	
    }

    public static void example2(Random unseededRand, Random seededRand1){
	System.out.print("No seed:\t");
	for (int i = 0; i < 10; i++){
	    System.out.print(unseededRand.nextInt(10) + " ");
	}
	System.out.println();

	System.out.print("With Seed:\t");
	for (int i = 0; i < 10; i++){
	    System.out.print(seededRand1.nextInt(10) + " ");
	}
	System.out.println();
	
    }
    

    //helper methods
    public static int min(int[] arr){
	int min = Integer.MAX_VALUE;
	for(int i = 0; i < arr.length; i++){
	    if(arr[i] < min) min = arr[i];
	}
	return min;
    }
    
    public static int max(int[] arr){
	int max = Integer.MIN_VALUE;
	for(int i = 0; i < arr.length; i++){
	    if(arr[i] > max) max = arr[i];
	}
	return max;
    }
    
    public static double avg(int[] arr){
	int sum = 0;
	for(int i = 0; i < arr.length; i++){
	    sum += arr[i];
	}
	return sum/(1.0*arr.length);
    }
}