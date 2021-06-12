package aula2;

import java.util.Scanner;

public class CalculoMedia {

	public static void main(String[] args) {
		
		//Criar um sistema de calculo de salario liquido, onde
		//vai ser inserido o salario bruto e ele mostre todos os outros dados de impostos e descontos
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seu Salario Bruto:  ");
		Double salarioBruto = scan.nextDouble();
		System.out.println("Salario Bruto: "+ salarioBruto);
		//1
		if(salarioBruto<=1100){
			
			double inss = (salarioBruto * 0.075);
			double bc = (salarioBruto - inss);
			System.out.println("Inss:  " + inss);
			System.out.println("Base Calculo:  " + bc);
			
		
			if(bc>=0 && bc<=1903){
				
				double aliquota = 1;
				double deducao = 0;
				double irpf = 0;
				double salarioLiquido = bc-irpf;
				
				System.out.println("IRPF :  " + irpf);	
				System.out.println("Salario Liquido :  " + salarioLiquido);
				}
			
			else if(bc>=1904 && bc<= 2826){
				
				double aliquota = 0.075;
				double deducao = 143;
				double irpf = (bc*aliquota)-deducao;
				double salarioLiquido = bc-irpf;
				
				System.out.println("IRPF :  " + irpf);	
				System.out.println("Salario Liquido :  " + salarioLiquido);
				}
			
			else if(bc>=2827 && bc<= 3751){
				
				double aliquota = 0.15;
				double deducao = 355;
				double irpf = (bc*aliquota)-deducao;
				double salarioLiquido = bc-irpf;
				
				System.out.println("IRPF :  " + irpf);	
				System.out.println("Salario Liquido :  " + salarioLiquido);
				}
			
			else if(bc>=3752 && bc<= 4665){
				
				double aliquota = 0.22500;
				double deducao = 636;
				double irpf = (bc*aliquota)-deducao;
				double salarioLiquido = bc-irpf;
				
				System.out.println("IRPF :  " + irpf);	
				System.out.println("Salario Liquido :  " + salarioLiquido);
				}
			
			else {
				
				double aliquota = 0.22500;
				double deducao = 636;
				double irpf = (bc*aliquota)-deducao;
				double salarioLiquido = bc-irpf;
				
				System.out.println("IRPF :  " + irpf);	
				System.out.println("Salario Liquido :  " + salarioLiquido);
				}
		}
		
		else if(salarioBruto>=1101 && salarioBruto<=2203){
					
			double inss = (salarioBruto * 0.09);
			double bc = (salarioBruto - inss);
			System.out.println("Inss:  " + inss);
			System.out.println("Base Calculo:  " + bc);
			
			if(bc>=0 && bc<=1903){
				
				double aliquota = 1;
				double deducao = 0;
				double irpf = 0;
				double salarioLiquido = bc-irpf;
				
				System.out.println("IRPF :  " + irpf);	
				System.out.println("Salario Liquido :  " + salarioLiquido);
				}
			
			else if(bc>=1904 && bc<= 2826){
				
				double aliquota = 0.075;
				double deducao = 143;
				double irpf = (bc*aliquota)-deducao;
				double salarioLiquido = bc-irpf;
				
				System.out.println("IRPF :  " + irpf);	
				System.out.println("Salario Liquido :  " + salarioLiquido);
				}
			
			else if(bc>=2827 && bc<= 3751){
				
				double aliquota = 0.15;
				double deducao = 355;
				double irpf = (bc*aliquota)-deducao;
				double salarioLiquido = bc-irpf;
				
				System.out.println("IRPF :  " + irpf);	
				System.out.println("Salario Liquido :  " + salarioLiquido);
				}
			
			else if(bc>=3752 && bc<= 4665){
				
				double aliquota = 0.22500;
				double deducao = 636;
				double irpf = (bc*aliquota)-deducao;
				double salarioLiquido = bc-irpf;
				
				System.out.println("IRPF :  " + irpf);	
				System.out.println("Salario Liquido :  " + salarioLiquido);
				}
			
			else {
				
				double aliquota = 0.22500;
				double deducao = 636;
				double irpf = (bc*aliquota)-deducao;
				double salarioLiquido = bc-irpf;
				
				System.out.println("IRPF :  " + irpf);	
				System.out.println("Salario Liquido :  " + salarioLiquido);
				}
		}
		
		else if(salarioBruto>=2204 && salarioBruto<=3305){
			
			double inss = (salarioBruto * 0.12);
			double bc = (salarioBruto - inss);
			System.out.println("Inss:  " + inss);
			System.out.println("Base Calculo:  " + bc);	
			
			if(bc>=0 && bc<=1903){
				
				double aliquota = 1;
				double deducao = 0;
				double irpf = 0;
				double salarioLiquido = bc-irpf;
				
				System.out.println("IRPF :  " + irpf);	
				System.out.println("Salario Liquido :  " + salarioLiquido);
				}
			
			else if(bc>=1904 && bc<= 2826){
				
				double aliquota = 0.075;
				double deducao = 143;
				double irpf = (bc*aliquota)-deducao;
				double salarioLiquido = bc-irpf;
				
				System.out.println("IRPF :  " + irpf);	
				System.out.println("Salario Liquido :  " + salarioLiquido);
				}
			
			else if(bc>=2827 && bc<= 3751){
				
				double aliquota = 0.15;
				double deducao = 355;
				double irpf = (bc*aliquota)-deducao;
				double salarioLiquido = bc-irpf;
				
				System.out.println("IRPF :  " + irpf);	
				System.out.println("Salario Liquido :  " + salarioLiquido);
				}
			
			else if(bc>=3752 && bc<= 4665){
				
				double aliquota = 0.22500;
				double deducao = 636;
				double irpf = (bc*aliquota)-deducao;
				double salarioLiquido = bc-irpf;
				
				System.out.println("IRPF :  " + irpf);	
				System.out.println("Salario Liquido :  " + salarioLiquido);
				}
			
			else {
				
				double aliquota = 0.22500;
				double deducao = 636;
				double irpf = (bc*aliquota)-deducao;
				double salarioLiquido = bc-irpf;
				
				System.out.println("IRPF :  " + irpf);	
				System.out.println("Salario Liquido :  " + salarioLiquido);
				}
		}
		
		else if(salarioBruto>=3306 && salarioBruto<=6433){
			
			double inss = (salarioBruto * 0.14);
			double bc = (salarioBruto - inss);
			System.out.println("Inss:  " + inss);
			System.out.println("Base Calculo:  " + bc);	
		
			if(bc>=0 && bc<=1903){
				
				double aliquota = 1;
				double deducao = 0;
				double irpf = 0;
				double salarioLiquido = bc-irpf;
				
				System.out.println("IRPF :  " + irpf);	
				System.out.println("Salario Liquido :  " + salarioLiquido);
				}
			
			else if(bc>=1904 && bc<= 2826){
				
				double aliquota = 0.075;
				double deducao = 143;
				double irpf = (bc*aliquota)-deducao;
				double salarioLiquido = bc-irpf;
				
				System.out.println("IRPF :  " + irpf);	
				System.out.println("Salario Liquido :  " + salarioLiquido);
				}
			
			else if(bc>=2827 && bc<= 3751){
				
				double aliquota = 0.15;
				double deducao = 355;
				double irpf = (bc*aliquota)-deducao;
				double salarioLiquido = bc-irpf;
				
				System.out.println("IRPF :  " + irpf);	
				System.out.println("Salario Liquido :  " + salarioLiquido);
				}
			
			else if(bc>=3752 && bc<= 4665){
				
				double aliquota = 0.22500;
				double deducao = 636;
				double irpf = (bc*aliquota)-deducao;
				double salarioLiquido = bc-irpf;
				
				System.out.println("IRPF :  " + irpf);	
				System.out.println("Salario Liquido :  " + salarioLiquido);
				}
			
			else {
				
				double aliquota = 0.22500;
				double deducao = 636;
				double irpf = (bc*aliquota)-deducao;
				double salarioLiquido = bc-irpf;
				
				System.out.println("IRPF :  " + irpf);	
				System.out.println("Salario Liquido :  " + salarioLiquido);
				}
					
		}
		
		else {
					
			double inss = 900;
			double bc = (salarioBruto - inss);
			System.out.println("Inss:  " + inss);
			System.out.println("Base Calculo:  " + bc);	
			
			if(bc>=0 && bc<=1903){
				
				double aliquota = 1;
				double deducao = 0;
				double irpf = 0;
				double salarioLiquido = bc-irpf;
				
				System.out.println("IRPF :  " + irpf);	
				System.out.println("Salario Liquido :  " + salarioLiquido);
				}
			
			else if(bc>=1904 && bc<= 2826){
				
				double aliquota = 0.075;
				double deducao = 143;
				double irpf = (bc*aliquota)-deducao;
				double salarioLiquido = bc-irpf;
				
				System.out.println("IRPF :  " + irpf);	
				System.out.println("Salario Liquido :  " + salarioLiquido);
				}
			
			else if(bc>=2827 && bc<= 3751){
				
				double aliquota = 0.15;
				double deducao = 355;
				double irpf = (bc*aliquota)-deducao;
				double salarioLiquido = bc-irpf;
				
				System.out.println("IRPF :  " + irpf);	
				System.out.println("Salario Liquido :  " + salarioLiquido);
				}
			
			else if(bc>=3752 && bc<= 4665){
				
				double aliquota = 0.22500;
				double deducao = 636;
				double irpf = (bc*aliquota)-deducao;
				double salarioLiquido = bc-irpf;
				
				System.out.println("IRPF :  " + irpf);	
				System.out.println("Salario Liquido :  " + salarioLiquido);
				}
			
			else {
				
				double aliquota = 0.22500;
				double deducao = 636;
				double irpf = (bc*aliquota)-deducao;
				double salarioLiquido = bc-irpf;
				
				System.out.println("IRPF :  " + irpf);	
				System.out.println("Salario Liquido :  " + salarioLiquido);
				}
							
			}
		
		
		
	}
			
		
}