class Main{
	public static void main(String[] args) {
		Jugador[] jugadores = new Jugador[11];

		Jugador j1 = new Jugador("CR7", 2000000, 0);
		System.out.println(j1.getNombre());
		jugadores[0] = j1;

		Jugador j2 = new Jugador("Carlos", 3000000, 60);
		System.out.println(j2.getNombre());
		jugadores[1] = j2;

		Jugador j3 = new Jugador("Julio", 5000000, 40);
		System.out.println(j3.getNombre());
		jugadores[2] = j3;

		Jugador j4 = new Jugador("Lopez", 1000000, 40);
		System.out.println(j4.getNombre());
		jugadores[3] = j4;

		Jugador j5 = new Jugador("Maldonado", 7000000, 40);
		System.out.println(j5.getNombre());
		jugadores[4] = j5;

		Jugador j6 = new Jugador("Javier", 4000000, 70);
		System.out.println(j6.getNombre());
		jugadores[5] = j6;

		Jugador j7 = new Jugador("Randy", 6000000, 10);
		System.out.println(j7.getNombre());
		jugadores[6] = j7;

		Jugador j8 = new Jugador("Cadima", 2000000, 90);
		System.out.println(j8.getNombre());
		jugadores[7] = j8;

		Jugador j9 = new Jugador("Marquez", 5000000, 50);
		System.out.println(j9.getNombre());
		jugadores[8] = j9;

		Jugador j10 = new Jugador("Alejandro", 8000000, 70);
		System.out.println(j10.getNombre());
		jugadores[9] = j10;

		Arquero a1 = new Arquero("Dursich", 200000, 200, 100);
		System.out.println(a1.getNombre());
		jugadores[10] = a1;

		System.out.println("El jugador con mas goles es " + goleador(jugadores));
		System.out.println("El jugador CR7 participa? " + participa("CR7", jugadores));
	}	
	private static String goleador(Jugador[] jug){
		Jugador j = jug[0];

		for(int i=0; i<jug.length; i++){
			if(j.getNumGoles() < jug[i].getNumGoles()){
				j = jug[i];
			}
		}
		return j.getNombre();
	}

	private static boolean participa(String nom, Jugador[] jug){
		boolean x = false;

		for(int i=0; i<jug.length; i++){
            if(nom.equals(jug[i].getNombre())){
                x = true;
            }
        }
        return x;
	}
	
}