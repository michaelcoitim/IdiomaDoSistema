
package idiomadosistema;

import java.util.Locale;



/**
 *
 * @author michael coitim
 */
public class IdiomaDoSistema {

    public static void main(String[] args) {
        
        Locale sis =  Locale.getDefault();
        System.out.println("O seu sistema está em");
        System.out.println(sis.getDisplayLanguage());
        
        
    }
    
}
