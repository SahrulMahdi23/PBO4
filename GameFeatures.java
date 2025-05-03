class KarakterGame {
    public void tampilkanKarakter() {
        System.out.println("Karakter Npc");
    }

    public void gunakanSkill(String namaSkill) {
        System.out.println("Karakter menggunakan skill: " + namaSkill);
    }
}

class Assasin extends KarakterGame {
    @Override
    public void tampilkanKarakter() {
        System.out.println("Karakter: Assasin");
    }

    public void gunakanSkill(String namaSkill, boolean critical) {
        if (critical) {
            System.out.println("Assasin menggunakan " + namaSkill + " dengan serangan critical!");
        } else {
            System.out.println("Assasin menggunakan " + namaSkill);
        }
    }
}

public class GameFeatures {
    public static void main(String[] args) {
        KarakterGame k = new KarakterGame();
        k.tampilkanKarakter();
        k.gunakanSkill("Punch");

        Ninja n = new Ninja();
        n.tampilkanKarakter();
        n.gunakanSkill("Shadow Slash");
        n.gunakanSkill("Shadow Slash", true);
    }
}
