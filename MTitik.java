class MTitik {
    public static void main(String[] args){
		Titik titik1;
		Titik titik2;
		Titik titik3;
		
		titik1 = new Titik();
		titik1.setAbsis(1.0);
		titik1.setOrdinat(2.0);

		titik2 = new Titik();
		titik2.setAbsis(3.0);
		titik2.setOrdinat(4.0);

		titik3 = new Titik(5.0,6.0);

		System.out.println("jumlah objek titik : "+ titik1.getCounterTitik()+"\n");

		System.out.println("t1(" + titik1.getAbsis() + ", " + titik1.getOrdinat() + ")");

		System.out.println("t2(" + titik2.getAbsis() + ", " + titik2.getOrdinat() + ")");
		
		System.out.println("t3(" + titik3.getAbsis() + ", " + titik3.getOrdinat() + ")");

    }
}