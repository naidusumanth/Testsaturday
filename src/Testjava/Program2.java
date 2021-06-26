package Testjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program2 {
public static void main(String []args)
{
	 Stream<Integer> stream = Stream.of(6,7,8,1,6,2,1);

	 
	  Object[] Arr1 = stream.toArray();
	  System.out.println("Arr1 length " + Arr1.length);

	
	  Stream<Integer> streamCOllect = Stream.of(6,7,8,1,2);

	  List<Integer> list = streamCOllect.collect(Collectors.toList());
	 

	
	  Stream<Integer> count1 = Stream.of(6,7,8,1,2);
	  Long count = count1.count();
	  System.out.println("count :: " + count);

	  
	  Stream<Integer> Reduce = Stream.of(6,7,8,1,2);
	  Optional<Integer> sum = Reduce.reduce((value1, value2) -> value1 + value2);
	  System.out.println("numbers using reduce  : " + sum.get());

	 
	  Stream<Integer> streamForEach = Stream.of(6,7,8,1,2).parallel();
	

	  List<Integer> num = new ArrayList<>();
	  streamForEach.forEach(value -> num.add(value));
	  System.out.println("num : " + num);

	
	  Stream<Integer> streamForEachOrdered = Stream.of(6,7,8,2,1).parallel();
	  
	  streamForEachOrdered.forEachOrdered(value -> System.out.println(value));

	  Stream<Integer> streamForEachOrderedList = Stream.of(6,7,8,1,2).parallel();
	  List<Integer> numlist1 = new ArrayList<>();
	  streamForEachOrderedList.forEachOrdered(value -> numlist1.add(value));
	  System.out.println("numlist1 : " + numlist1);

	 
	 
	  Stream<Integer> streamAnymatch = Stream.of(6,7,8,1,2).parallel();
	  Predicate<Integer> anymatch = value -> value > 7 ;
	  boolean isAnymatch = streamAnymatch.anyMatch(anymatch);
	  System.out.println("anymatch data : " + isAnymatch);
	  
	  Stream<Integer> streamAllmatch = Stream.of(6,7,8,2,1).parallel();
	  Predicate<Integer> allmatch = value -> value > 8;
	  boolean isAllmatch = streamAllmatch.allMatch(allmatch);
	  System.out.println("allmatch data  : " + isAllmatch);

	  // Stream noneMatch() Method Example
	  Stream<Integer> streamNoneMatch = Stream.of(6,7,8,2,1).parallel();
	  Predicate<Integer> nonematch = value -> value > 7;
	  boolean isNoneMatch = streamNoneMatch.noneMatch(nonematch);
	  System.out.println("noneMatch data  : " + isNoneMatch);

	 

	 }
	
}

