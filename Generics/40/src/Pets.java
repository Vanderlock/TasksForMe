import java.util.ArrayList;

public class Pets {
    static final PetCreator creator = new LiteralPetCreator();

    static Pet randomPet() {
        return creator.randomPet();
    }

    static Pet[] createArray(int size) {
        return creator.createArray(size);
    }

    static ArrayList<Pet> arrayList(int size) {
        return creator.arrayList(size);
    }
}
