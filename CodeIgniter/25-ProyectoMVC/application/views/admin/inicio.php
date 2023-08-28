<?php
 $dataHeader['titulo']="Ver Usuarios";
 $dataSide['session']=$session;
  $this->load->view('layouts/header',$dataHeader, FALSE);
  $this->load->view('layouts/sidebar',$dataSide, FALSE);
 
?>
      <!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper">
        <div class="col-12 m-0 p-3">
          <h1 class="text-primary text-center">INICIO DEL ADMIN</h1>
        </div>
      </div>

<?php  $this->load->view('layouts/footer',$dataHeader, FALSE);  ?>
      
      
      
      
