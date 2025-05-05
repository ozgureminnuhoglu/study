package test04;

public class Gridpath {
    private final int row = 0;
    private final int col = 0;
    private int[][] grid;

    public Gridpath(int[][] grid) {
        this.grid = grid;
    }

    public static void main(String[] args) {
        int[][] location = {
                {12, 3, 4, 13, 5},
                {11, 21, 2, 14, 16},
                {7, 8, 9, 15, 6},
                {10, 17, 20, 19, 1},
                {18, 22, 30, 25, 6}
        };
        //1. deneme:
        int target = location[0][0];
        int te = location[0][1];
        int ts = location[1][0];
        int r0;
        int c0;
        if (te < ts) {
            r0 = 0;
            c0 = 1;
        } else {
            r0 = 1;
            c0 = 0;
        }
        System.out.println("(r,c) = " + r0 + "," + c0);

        // 2. deneme
        // yukarıda target hücresinin r,c değerlerini hard-code etmiştik
        // şimdi onları parametrik (jenerik) hale getirelim
        // yani onları değişken yapalım
        int tr2 = 0;
        int tc2 = 0;
        int target2 = location[tr2][tc2];
        // sağ tarafa gidince: satır numarası aynı kalır
        // kolon numarası bir artar
        int te2 = location[tr2][tc2+1];
        // aşağı gidince: satır numarası bir artar
        // kolon numarası aynı kalır
        int ts2 = location[tr2+1][tc2];
        int r2;
        int c2;
        if (te2 < ts2) {
            r2 = tr2;
            c2 = tc2+1;
        } else {
            r2 = tr2+1;
            c2 = tc2;
        }
        System.out.println("(r,c) = " + r2 + "," + c2);

        // yukarıdaki 2. denemede ilk denemeyi parametrik hale getirdik
        // şimdi aynı kodu farklı bir örnek girdi için deneyelim
        // 3. deneme
        int tr3 = 1;
        int tc3 = 3;
        int target3 = location[tr3][tc3];
        // sağ tarafa gidince: satır numarası aynı kalır
        // kolon numarası bir artar
        int te3 = location[tr3][tc3+1];
        // aşağı gidince: satır numarası bir artar
        // kolon numarası aynı kalır
        int ts3 = location[tr3+1][tc3];
        int r3;
        int c3;
        if (te3 < ts3) {
            r3 = tr3;
            c3 = tc3+1;
        } else {
            r3 = tr3+1;
            c3 = tc3;
        }
        System.out.println("(r,c) = " + r3 + "," + c3);

        // yukarıda kodun doğru çalıştığını test ettik ve gördük
        // şimdi bunu bir fonksiyon içine koyacağız: getNextLoc
        // getNextLoc(int row, int col) {
        // burada row, yukarıdaki tr değişkenine denk gelir
        // col: yukarıdaki tc değişkenine denk gelir
        // yukarıdaki location değişkeni, class'taki grid değişkenine denk gelir
        // grid'i initialize etmeliyiz
        // bunun için önce Gridpath constructor'ını oluşturalım
        // constructor içinde grid değişkenini initialize edelim
        // o zaman Gridpath constructor methodu, argüman olarak ne almalı?
        // int[][] almalı
        Gridpath gp = new Gridpath(location);
        // şimdilik getNextLoc Location yerine String dönsün
        // önce bu şekilde doğru çalıştığından emin olalım
        // sonra Location döndürme problemini çözeriz
        String result1 = gp.getNextLoc1(0, 0);
        System.out.println("result1 = " + result1);
        String result2 = gp.getNextLoc1(1, 3);
        System.out.println("result2 = " + result2);
        // çıktı:
        // result1 = 0,1
        // result2 = 2,3
        // şu ana kadar kodumuz düzgün çalışıyor
        // tek bir problem kaldı:
        // getNextLoc() fonksiyonu String değil, Location döndürmeli
        // onu yapalım
        // mevcut fonksiyonu bozmayalım
        // yeni fonksiyon yazalım
        // yeni isim vermemiz gerekiyor
        // dolayısıyla mevcut fonksiyonun ismini değiştirelim

        // yeni getNextLoc methodunu kullanarak yukarıdaki örnekleri tekrar run edelim
        Location loc1 = gp.getNextLoc(0, 0);
        System.out.println("loc1 = " + loc1.getRow() + "," + loc1.getCol());
        Location loc2 = gp.getNextLoc(1, 3);
        System.out.println("loc2 = " + loc2.getRow() + "," + loc2.getCol());
        // niye loc1.getRow() yazdık doğrudan loc1.theRow yazmak yerine?
        // çünkü theRow atributu private olarak tanımlanmış
        // yani theRow atributuna başka bir class'tan erişemezsin
    }

    public Location getNextLoc(int row, int col) {
        int target3 = grid[row][col];
        // sağ tarafa gidince: satır numarası aynı kalır
        // kolon numarası bir artar
        int te3 = grid[row][col+1];
        // aşağı gidince: satır numarası bir artar
        // kolon numarası aynı kalır
        int ts3 = grid[row+1][col];
        int r3;
        int c3;
        if (te3 < ts3) {
            r3 = row;
            c3 = col+1;
        } else {
            r3 = row+1;
            c3 = col;
        }
        // burada String değil Location objesi döndürmeliyiz
        Location result = new Location(r3, c3);
        // Location class ne işe yaradı?
        // Normalde bir önceki getNextLoc1 methodu ne dönüyordu?
        // r3 ve c3
        // String
        // Burada artık String değil, Location objesi dönüyoruz
        // tek fark o
        // ama bunu Stringe çevirebiliriz
        return result;
    }
    public String getNextLoc1(int row, int col) {
        int target3 = grid[row][col];
        // sağ tarafa gidince: satır numarası aynı kalır
        // kolon numarası bir artar
        int te3 = grid[row][col+1];
        // aşağı gidince: satır numarası bir artar
        // kolon numarası aynı kalır
        int ts3 = grid[row+1][col];
        int r3;
        int c3;
        if (te3 < ts3) {
            r3 = row;
            c3 = col+1;
        } else {
            r3 = row+1;
            c3 = col;
        }
        return "" + r3 + "," + c3;
    }


}
