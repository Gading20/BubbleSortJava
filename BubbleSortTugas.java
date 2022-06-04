public class BubbleSortTugas {
    private String[] Nama;

    public BubbleSortTugas(){
    }
    public String[] getNama(){
        return Nama;
    }
    public void setNama(String[] Nama) {
        this.Nama = Nama;
    }

    public void SortData(){
        for (int i=0;i<this.Nama.length;i++) {
            for (int G=i+1;G<this.Nama.length;i++) {
                if (this.Nama[G].compareToIgnoreCase(this.Nama[G])<0) {
                    String oke = this.Nama[G];
                    this.Nama[G] = this.Nama[G];
                    this.Nama[G] = oke;
                }
            }
        }
    }
    public void PrintData() {
        for (String datanama:this.Nama){
            System.out.println(datanama+" ");
        }
    }

    public static void main(String[] args) {
        String[] KoncoStress = {"naufal","halim","beki(Tersakiti)","yesa","tiara","gita","aul"};
        BubbleSortTugas Tertata = new BubbleSortTugas();
        Tertata.setNama(KoncoStress);
        Tertata.SortData();
        Tertata.getNama();
        Tertata.PrintData();
    }
}