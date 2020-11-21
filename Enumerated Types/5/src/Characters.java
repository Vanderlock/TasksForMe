import java.util.*;

public enum Characters {
    VOWEL('a', 'e', 'i', 'o', 'u'){
        @Override
        public String toString() {
            return "vowel";
        }
    },
    SOMETIMES_A_VOWEL('y', 'w'){
        @Override
        public String toString() {
            return "sometimes a vowel";
        }
    },
    CONSONANT{
        @Override
        public String toString() {
            return "consonant";
        }
    };
    private final HashSet<Character> chars = new HashSet<>();
    Characters(Character... chars) {
        if(chars != null) {
            this.chars.addAll(Arrays.asList(chars));
        }
    }
    public static Characters getCategory(Character c) {
        if(VOWEL.chars.contains(c)) {
            return VOWEL;
        }
        if(SOMETIMES_A_VOWEL.chars.contains(c)) {
            return SOMETIMES_A_VOWEL;
        }else {
            return CONSONANT;
        }

    }
    

}
