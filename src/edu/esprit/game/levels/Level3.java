package edu.esprit.game.levels;

import edu.esprit.game.models.Employee;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import edu.esprit.game.utils.Data;
import static jdk.nashorn.internal.objects.NativeArray.map;

public class Level3 {
	public static void main(String[] args) {
	List<Employee> employees = Data.employees();
		

	/* TO DO 1: Retourner une chaine de caract�re qui contient tous les noms des employ�s */	
	String names = employees.stream()./* TO DO 1  hint(reduce)*/;
						
	/* TO DO 2: Retourner une chaine de caract�re qui contient tous les noms des employ�s en majuscule separ�s par # */	
	String namesMajSplit = employees.stream()./* TO DO 2 */;

	/* TO DO 3: Retourner une set d'employ�s*/
	Set<Employee> emps = employees.stream()./* TO DO 3 */;

	/* TO DO 4: Retourner une TreeSet d'employ�s (tri par nom) */
	TreeSet<Employee> emps2 = employees.stream()./* TO DO 4 */

	/* TO DO 5: Retourner une Map qui regroupe les employ�s par salaire */
	Map<Integer, List<Employee>> map = employees.stream()./* TO DO 5 */
			
	/* TO DO 6: Retourner une Map qui regroupe les nom des employ�s par salaire */
	Map<Integer, String> mm = employees.stream()./*TO DO 6*/

	/* TO DO 7: Retourner le  min, max,average, sum,count des salaires */
	String s = employees.stream()./* TO DO 7 */
				

	}
}
