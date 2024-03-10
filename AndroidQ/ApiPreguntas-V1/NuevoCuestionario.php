<?php 
	include 'Conexion.php';
    if (!empty($_POST["id_usuarios"]) || !empty($_GET["id_usuarios"]))  {
    $id_usuarios = (!empty($_POST["id_usuarios"]))? $_POST["id_usuarios"] : $_GET["id_usuarios"] ;
    
    $consulta = $base_de_datos->prepare("INSERT INTO cuestionarios (id_usuario, cant_preguntas, cant_ok, cant_error, fecha_inicio, fecha_fin) VALUES (:id, 0, 0, 0, NOW(), NULL)");

    $consulta->bindParam(":id",$id_usuarios);
    $consulta->execute();
   

    $datos = $consulta->fetchAll(PDO::FETCH_ASSOC);
    $datos= mb_convert_encoding($datos, "UTF-8", "iso-8859-1");    
    // Codifica los datos en UTF-8, para que se puedan convertir a Json sin problema (Ñ y tildes)
    

   
    if($consulta){
            $ultimo_id = $base_de_datos->lastInsertId();
            $respuesta=[
                "status"=> true,
                "message" => "QUESTIONNAIRE##FOUND",
                "id" => $ultimo_id
            ];
            echo json_encode($respuesta);
        }else{
            $respuesta=[
                "status"=> false,
                "message" => "QUESTIONNAIRE#NOT##FOUND"
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

