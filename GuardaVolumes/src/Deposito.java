import java.util.ArrayList;

public class Deposito {
		
		private ArrayList<Armario> armarioDeVolumes;
		private Armario numero;
		private static int volumesUtilizados;
		
	
		public boolean isChecaArmario(){
			if(Deposito.volumesUtilizados >= 100){
				System.out.println("Todos os armários estão ocupados!");
				return false;
			}else {
				return true;
			}			
		}
		
		public boolean adiciona(int numero){
			isChecaArmario();
			if(numero <= 0 || numero > 100){
				return false;
			} else {
				ArrayList<Armario> armario = new ArrayList<Armario>();
				System.out.println("Item armazenado no armário " + this.numero + "!");
				Deposito.volumesUtilizados++;
				return true;
			}
		}
}
