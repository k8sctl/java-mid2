package generic.ex3;

import generic.animal.Animal;

// 상위 타입으로 중복을 제거
public class AnimalHospitalV3<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
         System.out.println("동물 이름: " + animal.getName());
         System.out.println("동물 크기: " + animal.getSize());
         animal.sound();
    }

    public T bigger(T target) {
         return animal.getSize() > target.getSize() ? animal : target; // 3항 연산자
    }
}
