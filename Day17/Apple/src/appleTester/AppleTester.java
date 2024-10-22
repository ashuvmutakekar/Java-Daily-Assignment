package appleTester;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import apple.Apple;

public class AppleTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Apple> appleList = new ArrayList<>();
        Map<String, List<Apple>> map = new HashMap<>();
        int ch;

        do {
            System.out.println("------Menu------");
            System.out.println("0. Add Apple");
            System.out.println("1. Display Apples");
            System.out.println("2. Partition apples by color (Green and Red)");
            System.out.println("3. Sort apples by color and weight");
            System.out.println("4. Convert the list of apples to a set");
            System.out.println("Enter your choice:");
            ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 0: {
                    System.out.println("Enter SID:");
                    String sid = sc.nextLine();
                    System.out.println("Enter color:");
                    String color = sc.nextLine();
                    System.out.println("Enter taste:");
                    String taste = sc.nextLine();
                    System.out.println("Enter weight:");
                    Integer weight = sc.nextInt();
                    appleList.add(new Apple(sid, color, taste, weight));
                    System.out.println("Added");
                    break;
                }
                case 1: {
                    appleList.forEach(System.out::println);
                    break;
                }
                case 2: {
                    Map<Boolean, List<Apple>> partitioned = appleList.stream()
                        .collect(Collectors.partitioningBy(apple -> "green".equalsIgnoreCase(apple.getColor())));
                    
                    System.out.println("Green Apples: " + partitioned.get(true));
                    System.out.println("Other Apples: " + partitioned.get(false));
                    break;
                }
                case 3: {
                    List<Apple> sortedApples = appleList.stream()
                        .sorted(
                            Comparator.comparing(Apple::getColor)
                                      .thenComparing(Apple::getWeight))
                        .collect(Collectors.toList());

                    System.out.println("Sorted Apples: " + sortedApples);
                    break;
                }
                case 4: {
                    Set<Apple> appleSet = appleList.stream()
                        .collect(Collectors.toSet());

                    System.out.println("Set of Apples: " + appleSet);
                    break;
                }
            }
        } while (ch < 5);

        sc.close();
    }
}
