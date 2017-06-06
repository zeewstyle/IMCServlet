<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="../css\estilo.css">
    
    
	<title>Calculo de IMC</title>
  </head>
 
  <body>
    
<div class="col-md-7">
    <div class="modal-content">
      <form name="formulario">
        <h2 class="form-signin-heading">Calculo de IMC com Servlet</h2>
        
        <fieldset class="form-group">
        <form method="GET">

        <div class="Peso">
        <label for="peso" class="sr-only" >Peso(Kg): </label>
        <input type="text" name="peso" class="form-control" placeholder="Em kg, ex: 98" required autofocus/>
        </div>

        <div class="Altura">
        <label for="altura" class="sr-only">Altura(M): </label>
        <input type="text"  name="altura" class="form-control" placeholder="Em metros, ex: 1.90" required/>
        </div>
        
        <br>
        <button class="btn btn-sm btn-primary">Calcular</button>
        <p>
  
        </fieldset>

      </form>
      
       </div>
  
  </body>
   
</html>



<div class="alert alert-success" role="alert" >O calculo de imc apontou o seguinte quadro: ${condicao}</div>
<div class="alert alert-success" role="alert" >O IMC é : ${calculaImc}</div> 
   
  </body>
  
</html>
