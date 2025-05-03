//Sahrul Mahdi Muhammad
//20230040137 – Polimorfisme (Overriding)
class Karakter {
    public void menyerang() {
        System.out.println("Karakter menyerang dengan tangan kosong!");
    }
}

class Penyihir extends Karakter {
    @Override
    public void menyerang() {
        System.out.println("Penyihir menyerang dengan magic power!");
    }
}

class Prajurit extends Karakter {
    @Override
    public void menyeerang() {
        System.out.println("Prajurit menyerang dengan pedang dan perisai!");
    }
}

class Pemanah extends Karakter {
    @Override
    public void menyeerang() {
        System.out.println("Pemanah menyerang dengan panah dan busur panah!");
    }
}

public class SimulasiGame {
    public static void main(String[] args) {
        Karakter[] karakter = {
                new Penyihir(),
                new Prajurit(),
                new Pemanah()
        };

        for (Karakter k : karakter) {
            k.serang();
        }
    }
}
