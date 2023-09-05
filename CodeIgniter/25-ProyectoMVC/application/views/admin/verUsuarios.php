<?php
 $dataHeader['titulo']="Ver Usuarios";
 $dataSide['session']=$session;
  $this->load->view('layouts/header',$dataHeader, FALSE);
  $this->load->view('layouts/sidebar',$dataSide, FALSE);
 
?>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <div class="col-12 m-0 p-3">
        <h1 class="text-primary text-center">TABLA CON LISTA DE USUARIOS</h1>
      <table class="table">
        <thead>
          <tr>
            <th scope="col">Cedula</th>
            <th scope="col">Nombre</th>
            <th scope="col">Apellido</th>
            <th scope="col">Telefono</th>
            <th></th>
            <th></th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <?php   foreach ($personas as $key => $persona) { ?>
              
                <tr>
                    <th scope="row"><?php echo $persona->cedula ?></th>
                    <td><?php echo $persona->nombres  ?></td>
                    <td><?php echo $persona->apellidos  ?></td>
                    <td><?php echo $persona->telefono  ?></td>
                    <td > <a href=""><button class="btn btn-success">Modificar</button></a></td>
                    <td><a href="<?= base_url('index.php/admin/Inicio/delete/') . $persona->cedula ?>"><button class="btn btn-danger">Eliminar</button></a></td>
                </tr>
            


              <?php
            }
            ?>
            
          </tr>
        </tbody>
      </table>
    </div>
  </div>
<?php  $this->load->view('layouts/footer',$dataHeader, FALSE);  ?>
      
      