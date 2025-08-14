package com.secured.InterviewQuestions;

import java.util.*;

public class TimeBasedKeyValueStore {

    private static int toSeconds(String timeStr) {
        String[] parts = timeStr.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        int seconds = Integer.parseInt(parts[2]);
        return hours * 3600 + minutes * 60 + seconds;
    }

    public static List<Integer> getQueryAnswers(List<List<String>> cache_entries, List<List<String>> queries) {
        // Write your code here
        Map<String, TreeMap<Integer, Integer>> cache = new HashMap<>();

        for (List<String> entry : cache_entries) {
            int ts = toSeconds(entry.get(0));
            String key = entry.get(1);
            int value = Integer.parseInt(entry.get(2));

            cache.putIfAbsent(key, new TreeMap<>());
            cache.get(key).put(ts, value);
        }

        List<Integer> result = new ArrayList<>();

        for (List<String> query : queries) {

            String key = query.get(0);

            int ts = toSeconds(query.get(1));

            if (!cache.containsKey(key)) {
                result.add(-1);
            } else {
                Map.Entry<Integer, Integer> fr = cache.get(key).floorEntry(ts);
                if (fr == null) {
                    result.add(-1);

                } else {
                    result.add(fr.getValue());
                }
            }
        }

        return result;
    }
}
