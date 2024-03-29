<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class PersonasModel extends CI_Model {
	public $table = 'personas';
    public $table_id = 'persona_id';
	public $table_user = 'usuarios';
	public function __construct(){
        $this->load->database();
    }

	public function getPersonaByEmail($email){
		$this->db->where('email', $email);
		$registros = $this->db->get('personas')->result();

		if (sizeof($registros)!=0) {
			return $registros[0];
		}else{
			return null;
		}
	}

	function insert($datas){
        $this->db->insert($this->table, $datas);
        return $this->db->insert_id();

    }

	function findAll(){
        $this->db->select();
        $this->db->from($this->table);

        $query = $this->db->get();
        return $query->result();
    }
	
	function insertUser($usuarios){
		$this->db->insert($this->table_user, $usuarios);
        return $this->db->insert_id();
	}

	function eliminar($cedula){
		$this->db->where('cedula',$cedula);
		$this->db->delete($this->table);
		return true;
	}

}
