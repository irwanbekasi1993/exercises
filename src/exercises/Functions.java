package exercises;

import java.util.function.Function;

public class Functions {
    public static void main(String[] args) {
        //first class function
        int[] intArr= {1,2,3,4,5};
        SquareMaker sqMkr = item -> item*item;
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(sqMkr.square(intArr[i]));
        }

        //highOrderFunction
        Function<Integer,Integer> square = t->t*t;

        for (int i = 0; i < intArr.length; i++) {
            print(square,intArr[i]);
        }
        
        Function<Integer,Integer> cube = t->t*t*t;
        for (int i = 0; i < intArr.length; i++) {
            print(cube,intArr[i]);
        }


    }

    static <T,R> void print(Function<T,R> function, T t){
        System.out.println(function.apply(t));
    }

    interface SquareMaker{
        int square(int item);
    }
}
