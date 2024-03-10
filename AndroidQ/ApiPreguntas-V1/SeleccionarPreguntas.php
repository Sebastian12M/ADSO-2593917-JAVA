<?php 
	include 'Conexion.php';
    if (!empty($_POST["id_cuestionario"]) || !empty($_GET["id_cuestionario"]))  {
        $id_cuestionario = (!empty($_POST["id_cuestionario"])) ? $_POST["id_cuestionario"] : $_GET["id_cuestionario"];
        
        $booleano = true;
        
        do {
            // Seleccionar una pregunta aleatoria
            $id_pregunta = $base_de_datos->prepare("SELECT id FROM preguntas ORDER BY RAND() LIMIT 1");
            $id_pregunta->execute();
            $id_pregunta_resultado = $id_pregunta->fetch(PDO::FETCH_ASSOC);
            $id_pregunta_id = $id_pregunta_resultado['id'];

            // Verificar si la pregunta ya ha sido respondida en el cuestionario
            $verificar = $base_de_datos->prepare("SELECT id_pregunta FROM respuestas WHERE id_pregunta = :id_pregunta AND id_cuestionario = :id_cuestionario");
            $verificar->bindParam(':id_pregunta', $id_pregunta_id);
            $verificar->bindParam(':id_cuestionario', $id_cuestionario);
            $verificar->execute();
            
            // Si la pregunta no ha sido respondida, obtener sus datos
            if (!$verificar->fetch(PDO::FETCH_ASSOC)) {
                $consulta = $base_de_datos->prepare("SELECT id, descripcion, id_correcta, url_imagen FROM preguntas WHERE id = :id_pregunta_id");
                $consulta->bindParam(':id_pregunta_id', $id_pregunta_id);
                $consulta->execute();
        
                $datos = $consulta->fetchAll(PDO::FETCH_ASSOC);
        
                foreach ($datos as &$pregunta) {
                    $consulta_opciones = $base_de_datos->prepare("SELECT descripcion, id FROM opciones WHERE id_pregunta = :id_pregunta");
                    $consulta_opciones->bindParam(":id_pregunta", $pregunta['id']);
                    $consulta_opciones->execute();
                    $pregunta['opciones'] = $consulta_opciones->fetchAll(PDO::FETCH_ASSOC);
                }
                
                $booleano = false;
            }
        } while ($booleano);
        

        if ($datos) {
            $respuesta = [
                "status"=> true,
                "message" => "PREGUNTA##FOUND",
                "pregunta" => $datos[0]
            ];
            echo json_encode($respuesta);
        } else {
            $respuesta = [
                "status"=> false,
                "message" => "PREGUNTA##NOT##FOUND"
            ];
            echo json_encode($respuesta);
        }
    } else {
        $respuesta= [
            "status"=>false,
            "message"=>"ERROR##DATA"
        ];
        echo json_encode($respuesta);
    }
?>
