/**
 * En esta clase se pueden hacer pruebas sobre el correcto funcionamiento de las dem�s clases.
 * @author Jordi Castell�
 *
 */

public class Test {

	public static void main(String[] args) {
		// Bloque de ejemplo de prueba:
		Usuario paco = new Usuario("Paco", 40);
		System.out.println(paco.getTotalRequests());
		paco.doPullRequest("Update Readme");
		paco.doPullRequest("A�ade funci�n");
		System.out.println(paco.hasShirt());
		paco.doPullRequest("Fix errors");
		paco.doPullRequest("Add javadoc");
		System.out.println(paco.getTotalRequests());
		System.out.println(paco.hasShirt());
		paco.listPullRequests();
	}

}
