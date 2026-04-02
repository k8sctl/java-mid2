package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

// Integer, Object 같은 동물과 전혀 관계 없는 타입을 타입 인자로 전달할 수 있다.
// 그러나 현재 Animal이나 그 자식을 타입 인자로 제한해야 한다.
public class AnimalHospitalMainV2 {

    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> objectHospital = new AnimalHospitalV2<>();
    }
}
