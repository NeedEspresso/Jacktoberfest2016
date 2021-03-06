/**
 * Implementación de lista simplemente enlazada.
 * @author Jordi
 *
 */
public class ListaPR {
	PullRequest first;
	
	public ListaPR() {
		first = new PullRequest(null);
	}
	
	public void insertarPR(String t) {
		PullRequest newNode = new PullRequest(t);
		if(isEmpty()) {
			first.next = newNode;
		}
		else {
			PullRequest aux = first;
			while(aux.next != null) {
				aux = aux.next;
			}
			aux.next = newNode;
		}
	}
	
	public int getSize() {
		int i = 0;
		PullRequest aux = first;
		while(aux.next != null) {
			aux = aux.next;
			i++;
		}
		return i;
	}
	
	public boolean isEmpty() {
		if(first.next == null) {
			return true;
		}
		return false;
	}
	
	public PullRequest getFirst() {
		return first.next;
	}
	
	public void listPRs() {
		PullRequest aux = first;
		while(aux.next != null) {
			aux = aux.next;
			System.out.println(aux.titulo);
		}
	}
	
	public void deletePR(String title) {
		
	}
	
	public void searchPR(String title) {
		
	}
}
