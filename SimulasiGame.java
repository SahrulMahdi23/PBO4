//Sahrul Mahdi Muhammad
//20230040137 – Polimorfisme (Overriding)
class Karakter {
    public void menyerang() {
        System.out.println("Karakter menyerang dengan kedua tangan kosong!");
    }
}

class Penyihir extends Karakter {
    @Override
    public void menyerang() {
        System.out.println("Witch menyerang dengan magic power!");
    }
}

class Prajurit extends Karakter {
    @Override
    public void menyeerang() {
        System.out.println("Warior menyerang dengan pedang dan perisai!");
    }
}

class Pemanah extends Karakter {
    @Override
    public void menyeerang() {
        System.out.println("Archer menyerang dengan panah dan busur panah!");
    }
}

public class SimulasiGame {
    public static void main(String[] args) {
        Karakter[] karakter = {
                new Witch(),
                new Warior(),
                new Archer()
        };

        for (Karakter k : karakter) {
            k.serang();
        }
    }
}
