package com.example.springbootdemo;

import com.example.springbootdemo.model.Persion;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);

     /*   List<Persion> persionList = new ArrayList<>();
        persionList.add(new Persion("Prasun",23000));
        persionList.add(new Persion("Kabir",25000));
        persionList.add(new Persion("Sabbir",10000));
        persionList.add(new Persion("Kamal",30000));

       persionList.stream()
               .map(e -> e.getName().toUpperCase(Locale.ROOT))
               .forEach(System.out::println);
*/
        Function<Integer, Integer> twoTimes = x -> 2*x;
        Function<Integer,Integer> minusOne = x -> x - 1;
        Function<Integer, Integer> compus = twoTimes.apply()

    }


}
