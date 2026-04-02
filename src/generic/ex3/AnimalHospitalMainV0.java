package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

// 코드 재사용성 관점: 개 병원과 고양이 병원은 중복이 많아 재사용성이 떨어진다.
// 타입 안정성 관점: 타입 안정성이 명확하게 지켜진다.
public class AnimalHospitalMainV0 {

    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        // 문제1: 개 병원에 고양이 전달
        // dogHospital.set(cat); // 다른 타입을 입력하면 컴파일 에러 발생

        // 문제2: 개 타입 반환
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
