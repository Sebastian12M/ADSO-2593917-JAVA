<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class Inicio extends CI_Controller {
	
	public function __construct(){
		parent::__construct();
		$this->load->helper('form');
        $this->load->model('PersonasModel');
        $this->load->database();
		$validacion = $this->session->has_userdata("session-mvc");
		if ($validacion) {
			$session = $this->session->userdata("session-mvc");
			if ($session['tipo']=="ADMIN" && $session['estado']=="ACTIVO") {
				return false;
			}else{
				redirect('Login/cerrarSession','refresh');
				die();
			}
		}else{
			redirect('Login/cerrarSession','refresh');
		}
	}

	public function index(){
		$data['session'] = $this->session->userdata("session-mvc");
		$this->load->view('admin/inicio', $data);
	}

	public function listado()
	{
		$vdata["personas"] = $this->PersonasModel->findAll();

		$this->load->view('verUsarios', $vdata);
	}

	public function openCreateUser(){
		
		$data['session'] = $this->session->userdata("session-mvc");
		$this->load->view('admin/crearUsuario', $data);
		

        

    if ($this->input->server("REQUEST_METHOD") == "POST") {
        $datas["cedula"] = $this->input->post("documento");
        $datas["nombres"] = $this->input->post("nombre");
        $datas["apellidos"] = $this->input->post("apellido");
        $datas["email"] = $this->input->post("correo");
        $datas["telefono"] = $this->input->post("telefono");
        $datas["direccion"] = $this->input->post("direccion");
        $datas["foto"] = $this->input->post("foto");

		$usuarios["cedula"]=$this->input->post("documento");
		$usuarios["email"]=$this->input->post("correo");
		$contraseña=$this->input->post("contrasenia");
		$usuarios["password"]=md5($contraseña);
		$usuarios["tipo"]=$this->input->post("shirts");
		$usuarios["estado"]=$this->input->post("estado");
		

        $this->PersonasModel->insert($datas);
		$this->PersonasModel->insertUser($usuarios);
    }

    
	}

	

	public function listUsers(){
		
		$data['session'] = $this->session->userdata("session-mvc");
		$data["personas"] = $this->PersonasModel->findAll();

		
		$this->load->view('admin/verUsuarios', $data);
	}

	function delete ($cedula){
		$resultado['valor']=$this->PersonasModel->eliminar($cedula);
		if($resultado['valor']){
		
			redirect('admin/inicio','refresh');
		}
		
	}
}

/* End of file Inicio.php */
/* Location: ./application/controllers/admin/Inicio.php */