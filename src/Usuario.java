
public class Usuario {
	String nombre;
	ListaPR prs;
	Shirt camiseta;
	int talla;
	
	public Usuario(String n) {
		//...
		prs = new ListaPR();
		camiseta = null;
	}
	
	public boolean hasShirt(){
		//...
		return false;
	}
	
	public void doPullRequest(String titulo){
		
		if() {
			// S� tiene tama�o(prs) >= 4 -> pedirCamiseta(talla)
		}
	}
	
	public void pedirCamiseta(int talla) {
		
	}
	
	public int getTotalRequests() {
		//...
		return 0;
	}
}
