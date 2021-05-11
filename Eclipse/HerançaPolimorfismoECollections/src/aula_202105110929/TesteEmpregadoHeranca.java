package aula_202105110929;

public class TesteEmpregadoHeranca {

	public static void main(String[] args) {
		
		EmpregadoHeranca ellen = new EmpregadoHeranca("Ellen","Rua Marola,99","555555555555",47483749,15,1234,5500,15);
		ellen.imprimirInfo();
		ellen.calcularSalario();
	}

}
