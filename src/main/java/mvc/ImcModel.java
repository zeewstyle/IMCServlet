package mvc;

import static java.lang.System.out;

public class ImcModel {

   
	
	private float altura;
        private float peso;
        private float imc;

	public ImcModel() {}
     
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
 
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

  
    public boolean inicioAltura() {      
        return altura ==0;
    }
    
    public boolean inicioPeso() {      
        return peso ==0;
    }
    
	public Float calculaImc(float altura, float peso) {          
            Float imc = peso/ (altura*altura);
            return imc;  
    }
	
    public String resultadoImc (float imc){ 
    	String resultado = "";
    	            
        if(imc < 18.5)  { 
        	resultado = "Abaixo do peso";   
        }
        else  if(imc >= 18.5 && imc < 25) {  
        	resultado = "Peso normal";         
        }  
        else  if(imc >= 25 && imc < 30)  {  
        	resultado = "Acima do peso";         
        }  
        else  if(imc >= 30)  {  
        	resultado = "Obesidade";  
        }
        
        return resultado;    
        
    }
               
}