package com.secured;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.println("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }


//        List<String> list = Arrays.asList("a", "bb", "ccc");
//        list.stream()
//                .map(String::length)
//                .forEach(System.out::print);

//        List<String> data = Arrays.asList("One", "Two", "Three", "Four");
//
//        data.stream()
//                .peek(System.out::println)
//                .filter(s -> s.length() > 3)
//                .count();

//        List<Integer> numbers = Arrays.asList(2, 2, 3);
//        int sum = numbers.stream().reduce(0, (a, b) -> a - b);
//
//        System.out.println(sum);
//
//        System.out.println(processNumbers(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5))));
//
//        System.out.println(sortByLengthDesc(new ArrayList<>(Arrays.asList("abcd", "abcde"))));

        System.out.println(findMax(new ArrayList<>(Arrays.asList(1,9,5))));

    }

    public static List<Integer> processNumbers(List<Integer> numbers) {
        // TODO: Use stream to filter and map

        return numbers.stream().filter(n -> n % 2 == 0).map(n -> n * 2).collect(Collectors.toList());
    }

    public static String getUpperCase(Optional<String> input) {
        // TODO: Use Optional methods
        return input
                .map(String::toUpperCase)
                .orElse("DEFAULT");
    }

    public static Map<Integer, List<String>> groupByLength(List<String> words) {
        // TODO: Use Collectors.groupingBy
        return words.stream().collect(Collectors.groupingBy(String::length));
    }

    public static String applyProcessor(String input, StringProcessor processor) {
        return processor.process(input);
    }

    public List<String> filterShortWords(List<String> input) {
        return input.stream()
                .filter(s -> s.length() >= 4)
                .collect(Collectors.toList());
    }

    public static List<String> sortByLengthDesc(List<String> input) {

        return input.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .collect(Collectors.toList());
    }

    @FunctionalInterface
    interface StringProcessor {
        String process(String input);
    }

    public static Optional<Integer> findMax(List<Integer> input) {
        return input.stream()
                .max(Integer::compare);
    }

    public List<Integer> flatten(List<List<Integer>> nestedLists) {
        return nestedLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

    public String getValueOrThrow(Optional<String> optional) throws IllegalArgumentException{
        return optional.orElseThrow(() -> new RuntimeException(""));
    }

    public int getStringLength(Optional<String> optional){
        return optional.map(String::length).orElse(-1);
    }

    public Optional<String> combineIfPresent(Optional<String> a, Optional<String> b) {
        return a.flatMap(aVal -> b.map(bVal -> aVal + bVal));
    }

    public List<String> filterUsingPredicate(List<String> input, Predicate<String> predicate){
        return input.stream().filter(predicate).collect(Collectors.toList());
    }

}