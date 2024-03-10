<?php 
	include 'Conexion.php';
    if (!empty($_POST["id_cuestionario"]) || !empty($_GET["id_cuestionario"]) && !empty($_POST["id_pregunta"]) || !empty($_GET["id_pregunta"]) && !empty($_POST["respuesta"]) || !empty($_GET["respuesta"]) && !empty($_POST["estado"]) || !empty($_GET["estado"]))  {
    $id_cuestionario = (!empty($_POST["id_cuestionario"]))? $_POST["id_cuestionario"] : $_GET["id_cuestionario"] ;
    $id_pregunta = (!empty($_POST["id_pregunta"]))? $_POST["id_pregunta"] : $_GET["id_pregunta"] ;
    $respuesta = (!empty($_POST["respuesta"]))? $_POST["respuesta"] : $_GET["respuesta"] ;
    $estado = (!empty($_POST["estado"]))? $_POST["estado"] : $_GET["estado"] ;
    
    $consulta = $base_de_datos->prepare("INSERT INTO respuestas (id_cuestionario, id_pregunta, respuesta, estado, fecha) VALUES (:id, :pregunta, :respuesta, :estado, NOW())");

    $consulta->bindParam(":id",$id_cuestionario);
    $consulta->bindParam(":pregunta",$id_pregunta);
    $consulta->bindParam(":respuesta",$respuesta);
    $consulta->bindParam(":estado",$estado);
    $consulta->execute();
   

    $datos = $consulta->fetchAll(PDO::FETCH_ASSOC);
    $datos= mb_convert_encoding($datos, "UTF-8", "iso-8859-1");    
    // Codifica los datos en UTF-8, para que se puedan convertir a Json sin problema (Ñ y tildes)
    
    if($estado=="OK"){
        $actualizar = $base_de_datos->prepare("UPDATE cuestionarios SET cant_preguntas=cant_preguntas+1, cant_ok=cant_ok+1 WHERE id=:id ");

        $actualizar->bindParam(":id",$id_cuestionario);
        
    }else if($estado=="ERROR"){
        $actualizar = $base_de_datos->prepare("UPDATE cuestionarios SET cant_preguntas=cant_preguntas+1, cant_error=cant_error+1 WHERE id=:id");

        $actualizar->bindParam(":id",$id_cuestionario);
        
    }

    $actualizar->execute();
        
    

   
    if($datos){
            $respuesta=[
                "status"=> true,
                "message" => "RESPUESTA##FOUND",
                "preguntas" => $datos,
                
            ];
            echo json_encode($respuesta);
        }else{
            $respuesta=[
                "status"=> false,
                "message" => "RESPUESTA##NOT##FOUND"
            ];
            echo json_encode($respuesta);
        }
    
    }else{
        $respuesta= [
            "status"=>false,
            "message"=>"ERROR##DATA"
        ];
        
    }
?>
