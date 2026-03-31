package generic.ex1;

public class RowTypeMain {

    public static void main(String[] args) {
        // GenericBox integerBox = new GenericBox(); // 아래 코드와 같다. RowType(원시 타입)
        GenericBox<Object> integerBox = new GenericBox<>(); // 권장
        integerBox.set(10);
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);
    }
}