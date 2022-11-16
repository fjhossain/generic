import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import person.Student;
import sorting.Sort;

public class App {
    public static <T extends Comparable <T>> ArrayList<Student<T>> createRandomArray(int arrayLength, String typeName){
       
       Random random = new Random();
       ArrayList<Student<T>> arrayList = new ArrayList<>(arrayLength);
       for(int i = 0; i < arrayLength; i++){
        String id = String.valueOf(i);
        switch(typeName){
            case "Integer" :
            arrayList.add((Student<T>) new Student<Integer>(id, random.nextInt(100)));
            break;
            case "Float" : 
            arrayList.add((Student<T>) new Student<Float>(id, random.nextFloat(100)));
            break;
            case "Double" :
            arrayList.add((Student<T>) new Student<Double>(id, random.nextDouble(100)));
            break;
            default:
            System.out.println("Use Integer as grade data type");
            arrayList.add((Student<T>) new Student<Integer>(id, random.nextInt(100)));
        }
       }
    return arrayList;
    }
    public static <T extends Comparable<T>> void main(String[] args) throws Exception {
           Scanner scanner = new Scanner(System.in);
            while(true){
            System.out.println("Input array size");
            int arrayLength = scanner.nextInt();
            System.out.println("choose and Input grade data type");
            String typeName = scanner.next();
            ArrayList<Student<T>> arrayList = createRandomArray(arrayLength, typeName);
            System.out.println(Sort.isSorted(arrayList));
            Sort.mergeSort(arrayList);
            System.out.println(Sort.isSorted(arrayList));
             
            System.out.println("continue?");
            String yesNo = scanner.next();
            if (yesNo.equals("no")) break;

            } scanner.close();
        }
        } 
        
    

    

