class Magic {
    public void gunakanMagic() {
        System.out.println("Menggunakan Magic dasar!");
    }

    public void gunakanMAgic(String namaSkill) {
        System.out.println("Menggunakan Magic: " + namaMagic);
    }

    public void gunakanMagic(String namaMagic, int level) {
        System.out.println("Menggunakan Magic: " + namaMagic + " level " + level);
    }

    public static void main(String[] args) {
        Magic s = new Magic();
        s.gunakanMagic();
        s.gunakanMagic("Magic Explansion");
        s.gunakanMagic("Demonic Blast", 3000);
    }
}
