<?php
 $dataHeader['titulo']="Ver Usuarios";
 $dataSide['session']=$session;
  $this->load->view('layouts/header',$dataHeader, FALSE);
  $this->load->view('layouts/sidebar',$dataSide, FALSE);
 
?>
      

      <!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
  <div class="col-12 m-0 p-3 " >
    <h1 class="text-primary text-center mb-5">FORMULARIO PARA CREAR USUARIO</h1>
    <div class="container">
      <?php echo form_open(''); ?>

      <div class="form-group">
        <?php 
          echo form_label('Documento', 'documento');
          $datas = [
            'name'  => 'documento',
            'value' => '',
            'class' => 'form-control input-lg',
          ];
              


          echo form_input($datas);
        ?>
      </div>

      <div class="form-group">
          
          <?php 
              echo form_label('Nombre', 'nombre');
              $datas = [
                  'name'      => 'nombre',
                  'value'     => '',
                  'class' => 'form-control input-lg',
              ];
              echo form_input($datas);
          ?>
      </div>
      
      <div class="form-group">
          <?php 
              echo form_label('Apellido', 'apellido');
              $datas = [
                  'name'  => 'apellido',
                  'value' => '',
                  'class' => 'form-control input-lg',
              ];

              echo form_input($datas);
          ?>
      </div>
      
      <div class="form-group">
          <?php 
              echo form_label('Correo', 'correo');
              $datas = [
                  'name'  => 'correo',
                  'type'  => 'email',
                  'value' => '',
                  'class' => 'form-control input-lg',
              ];

              echo form_input($datas);
          ?>
      </div>
      
      <div class="form-group">
          <?php 
              echo form_label('Telefono', 'telefono');
              $datas = [
                  'name'      => 'telefono',
                  'value'     => '',
                  'class' => 'form-control input-lg',
              ];
              echo form_input($datas);
          ?>
      </div>

      <div class="form-group">
          <?php 
              echo form_label('Direccion', 'direccion');
              $datas = [
                  'name'  => 'direccion',
                  'value' => '',
                  'class' => 'form-control input-lg',
              ];

              echo form_input($datas);
          ?>
      </div>
    
      <div class="form-group">
          <?php 
              echo form_label('Foto', 'foto');
              $datas = [
                  'name'  => 'foto',
                  'value' => 'defaul.png',
                  'class' => 'form-control input-lg ',
                  'readonly'=> 'true'
              ];

              echo form_input($datas);
          ?>
      </div>

      <div class="form-group">
          <?php 
              echo form_label('Usuario', 'usuario');
              $data = [
                  'name'      => 'usuario',
                  'value'     => '',
                  'class' => 'form-control input-lg',
              ];
              echo form_input($data);
          ?>
      </div>

      <div class="form-group">
          <?php 
              echo form_label('Constraseña', 'contraseña');
              $data = [
                  'name'      => 'contrasenia',
                  'type'      => 'password',
                  'value'     => '',
                  'class'     => 'form-control input-lg',
              ];
              echo form_input($data);
          ?>
      </div>

      <div class="form-group mt-3">
          <?php 
          ?>

            <div class="mr-2">
          <?php
              echo form_label('Tipo', 'tipo');
              ?>
              </div> 
              <?php
              $data = [
                  'ADMIN'  => 'ADMIN',
                  'VENDEDOR'  => 'VENDEDOR',
                  
                  
              ];
              echo form_dropdown('shirts', $data, 'large');
          ?>
      </div>

      <div class="form-group">
          <?php 
              echo form_label('Estado', 'estado');
              $data = [
                  'name'  => 'estado',
                  'value' => 'ACTIVO',
                  'class' => 'form-control input-lg ',
                  'readonly'=> 'true'
              ];

              echo form_input($data);
          ?>
      </div>
      
      
      <?php echo form_submit('mysubmit', 'Enviar', "class='btn btn-primary mt-4' ");?>

      <?php echo form_close(); ?>
    </div>    
  </div>
</div>

<?php  $this->load->view('layouts/footer',$dataHeader, FALSE);  ?>
      
      