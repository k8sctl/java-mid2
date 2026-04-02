package generic.ex3;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

// 코드 재사용성 관점: 다형성을 통해 AnimalHospitalV1 하나로 Dog 타입과 Cat 타입 모두 처리한다.
// 타입 안정성 관점:
// - 개 병원에 고양이를 전달하는 문제가 발생한다.
// - Animal 타입을 반환하기 때문에 다운 캐스팅을 해야 한다.
// - 실수로 고양이를 입력했는데, 개를 반환하는 상황이라면 캐스팅 예외가 발생한다.
public class AnimalHospitalMainV1 {

    public static void main(String[] args) {
        AnimalHospitalV1 animalHospital = new AnimalHospitalV1();

        Animal dog = new Dog("멍멍이1", 100);
        Animal cat = new Cat("냐옹이1", 300);

        // 개 병원
        animalHospital.set(dog);
        animalHospital.checkup();

        // 고양이 병원
        animalHospital.set(cat);
        animalHospital.checkup();

        // 문제1: 개 병원에 고양이 전달
        animalHospital.set(cat); // Animal 타입으로 전달 받기 때문에 Cat과 Dog 타입 매개변수 체크에 실패한다. 즉, 컴파일 오류가 발생하지 않는다.

        // 문제2: 개 타입 반환
        animalHospital.set(dog);
        Dog biggerAnimal = (Dog) animalHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerAnimal = " + biggerAnimal);
    }
}
