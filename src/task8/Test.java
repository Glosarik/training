package task8;

import static task8.Constants.*;

public class Test {

    public void test() {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        System.out.println(TEST_ONE);
        for (int i = ZERO; i < TWELVE; i++) {
            myArrayList.add(i);
        }
        forRes(myArrayList);

        System.out.println(NEW_LINE + TEST_TWO_ONE + myArrayList.isEmpty() + SIZE + myArrayList.size());

        System.out.println(TEST_THREE + myArrayList.contains(NINE));
        myArrayList.remove(NINE);
        forRes(myArrayList);

        System.out.println(TEST_FOUR);
        MyArrayList<Integer> newArrayList = new MyArrayList<>(SEVEN);
        for (int i = myArrayList.size(); i < myArrayList.size() + newArrayList.getLength(); i++) {
            newArrayList.add(i + ONE);
        }
        forRes(newArrayList);

        System.out.println(TEST_FIVE);
        MyArrayList<Integer> newArrayListThree = new MyArrayList<>(myArrayList);
        newArrayListThree.addAll(newArrayList);
        forRes(newArrayListThree);

        System.out.println(TEST_SIX);
        newArrayListThree.set(THREE, newArrayListThree.get(SEVEN));
        forRes(newArrayListThree);
    }

    public void forRes(MyArrayList<Integer> myArrayList) {
        StringBuilder sb = new StringBuilder();
        for (Integer integer : myArrayList) {
            sb.append(integer).append(" ");
        }
        System.out.println(sb.append(SIZE).append(myArrayList.size()));
    }
}
