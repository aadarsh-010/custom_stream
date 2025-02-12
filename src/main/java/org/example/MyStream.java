package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;


public class MyStream<T> {
    private final List<T> data;
    private final List<Predicate<T>> filters = new ArrayList<>();
    private final List<Function<T, T>> mappers = new ArrayList<>();
    private Comparator<T> comparator;

    private MyStream(List<T> data) {
        this.data = data;
    }


    public static <T> MyStream<T> of(List<T> data) {
        return new MyStream<>(data);
    }


    public MyStream<T> filter(Predicate<T> predicate) {
        filters.add(predicate);
        return this;
    }


    public MyStream<T> map(Function<T, T> mapper) {
        mappers.add(mapper);
        return this;
    }

    public MyStream<T> sorted(Comparator<T> comparator){
        this.comparator = comparator;
        return this;
    }

    public MyStream<T> distinct() {
        List<T> distinctList = new ArrayList<>();
        Set<T> seen = new HashSet<>();

        for (T element : data) {
            if (seen.add(element)) {
                distinctList.add(element);
            }
        }
        return new MyStream<T>(distinctList);
    }




    public void forEach(Consumer<T> action) {

        ArrayList<T> finallist = new ArrayList<>();
        for (T element : data) {
            boolean passesAllFilters = filters.stream().allMatch(filter -> filter.test(element));
            if (passesAllFilters) {
                T mappedElement = element;
                for (Function<T, T> mapper : mappers) {
                    mappedElement = mapper.apply(mappedElement);
                }
                finallist.add(mappedElement);
            }
        }

        if(comparator!=null)Collections.sort(finallist, comparator);

        for (T element : finallist){
            action.accept(element);
        }

    }
}
