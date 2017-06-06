package mvc;

import java.io.IOException;
import static java.lang.System.out;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/mvc/calculo-imc")
public class ImcControler extends HttpServlet {
	
	@Override
	protected void doGet(
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String alturaStr = request.getParameter("altura");
		float altura = 0;
		float peso = 0;
		float imc = 0;
		
		//Retirando virgula e substituindo por ponto para evitar exceptions no momento de converter o valor (parseFloat).
		if(alturaStr != null){
			
			if(alturaStr.contains(",")){
				alturaStr = alturaStr.replace(",", ".");
			}
			
			altura = Float.parseFloat(alturaStr);
		}
		
        String pesoStr = request.getParameter("peso");
		if(pesoStr != null){
			peso = Float.parseFloat(pesoStr);
		}
		
		String imcStr = request.getParameter("imc");
        if(imcStr != null){
        	imc = Float.parseFloat(imcStr);
        }
        
        String condicaoStr = request.getParameter("condicao");
        condicaoStr = condicaoStr == null ? "0" : condicaoStr;
        String condicao = condicaoStr;

        ImcModel imcModel = new ImcModel();
                
		Float valorImc = imcModel.calculaImc(altura, peso);
        String condicaoImc = imcModel.resultadoImc(valorImc);
                
		if (peso < 0 || altura < 0 || valorImc == 0){
			condicaoImc = "IMC invalido!";
            valorImc = null;   
            
        }else if (peso == 0 && altura == 0){
				condicaoImc = "O IMC nao foi calculado!";
				valorImc = null;
				
		}else if (peso > 0 || altura > 0){
                    out.println(condicaoImc);
                    out.println(valorImc);
        }
		
		request.setAttribute("calculaImc", valorImc);
                request.setAttribute("condicao", condicaoImc);  
                
		request.getRequestDispatcher("IMCServlet.jsp").
			forward(request, response);
                
               	}
	
}
